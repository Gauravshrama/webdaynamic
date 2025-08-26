package com.example.webdaynamic.repositary;

import com.example.webdaynamic.Entity.Party;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddPartyRepo extends JpaRepository <Party , Long>{
}
