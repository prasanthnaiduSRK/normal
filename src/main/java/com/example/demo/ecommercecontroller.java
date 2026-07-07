package com.example.demo;

import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ecommercecontroller
{

    @Autowired
    Ecommerceservice ecommerceservice;

    @GetMapping("/Ecommerce")
    public List<Ecommerce> getProducts()
    {
        return ecommerceservice.getdata();
    }
    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request)
    {
        return (CsrfToken) request.getAttribute("_csrf");
    }
    @PostMapping("/Ecommerce")
    public Ecommerce newproduct(@RequestBody Ecommerce ecommerce)
    {
        return ecommerceservice.addproduct(ecommerce);
    }
}

