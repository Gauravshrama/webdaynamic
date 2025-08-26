package com.example.webdaynamic.contoller;

import com.example.webdaynamic.Entity.Party;
import com.example.webdaynamic.service.AddPartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Party")
public class AddPartyContoller {

    @Autowired
    private AddPartyService addPartyService;

    @GetMapping("/{id}")
    public Party getsingleparty(@PathVariable Long id){
        return addPartyService.getsingleparty(id);
    }

    @GetMapping
    public List<Party> getparty(){
        return addPartyService.getparty();
    }


    @PostMapping
    public Party singlraddparty(@RequestBody Party party){
        return addPartyService.addsingleparty(party);
    }


    @PostMapping("/multiadd")
    public List<Party> Addparty(@RequestBody List<Party> party){
        return addPartyService.addparty(party);
    }

}
