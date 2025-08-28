package com.example.webdaynamic.service;

import com.example.webdaynamic.Entity.Party;
import com.example.webdaynamic.repositary.AddPartyRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AddPartyService {

    @Autowired
    private AddPartyRepo addPartyRepo;

    public List<Party> addparty(List<Party> party) {
        return addPartyRepo.saveAll(party);

    }

    public Party addsingleparty(Party party) {
        return addPartyRepo.save(party);
    }

    public Party getsingleparty(Long id) {
        return addPartyRepo.findById(id).orElse(null);
    }

    public List<Party> getparty() {
        return addPartyRepo.findAll();
    }

    public Party updateparty(Long id, Party party) {
        Optional<Party> existingparty = addPartyRepo.findById(id);
        if(existingparty.isEmpty()){
            Party updateparty = existingparty.get();
            updateparty.setEmail(updateparty.getEmail());
            updateparty.setName((updateparty.getName()));
            updateparty.setType(updateparty.getType());
            updateparty.setAddress(updateparty.getAddress());
            updateparty.setId(updateparty.getId());
            updateparty.setPhonenumber(updateparty.getPhonenumber());
            updateparty.setGSTnumber(updateparty.getGSTnumber());
            return addPartyRepo.save(updateparty);
        }
        else {
            throw new RuntimeException("invalid input");
        }
    }

    public void deleteparty(Long id) {
        addPartyRepo.deleteById(id);

    }
}
