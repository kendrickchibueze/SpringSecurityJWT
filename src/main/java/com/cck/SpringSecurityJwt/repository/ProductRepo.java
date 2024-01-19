package com.cck.SpringSecurityJwt.repository;

import com.cck.SpringSecurityJwt.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
