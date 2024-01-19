package com.cck.SpringSecurityJwt.repository;

import com.cck.SpringSecurityJwt.entity.OurUsers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OurUserRepo extends JpaRepository<OurUsers, Integer> {

     Optional<OurUsers> findByEmail(String email);
}
