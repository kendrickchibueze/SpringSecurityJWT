package com.cck.SpringSecurityJwt.controller;

import com.cck.SpringSecurityJwt.dto.ReqRes;
import com.cck.SpringSecurityJwt.entity.Product;
import com.cck.SpringSecurityJwt.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminUsers {

    @Autowired
    private ProductRepo productRepo;

    @GetMapping("/public/product")
    public ResponseEntity<Object> getAllProducts(){
        return ResponseEntity.ok(productRepo.findAll());
    }

    @PostMapping("/admin/saveProduct")
    public ResponseEntity<Object> signUp(@RequestBody ReqRes productRequest) {
       Product productToSave = new Product();
       productToSave.setName(productRequest.getName());
        return ResponseEntity.ok(productRepo.save(productToSave));
    }


    @GetMapping("/user/alone")
    public ResponseEntity<Object> userAlone(){
        return ResponseEntity.ok("Users alone can access this Api");
    }

    @GetMapping("/adminUser/both")
    public ResponseEntity<Object> bothAdminAndUsersApi(){
        return ResponseEntity.ok("Both Admin and Users can access this Api");
    }




}
