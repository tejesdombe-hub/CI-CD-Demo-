package com.ci_cd.demo.CI_CD.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/product")
    public String getProduct() {
        return "Product endpoint is working!";
    }

    @GetMapping("/product/{id}")
    public String getProductById(@PathVariable String id) {
        return "Product with ID: " + id;
    }

    @GetMapping("/product/list")
    public String getProductList() {
        return "Product list endpoint is working!";
    }
}
