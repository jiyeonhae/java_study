package com.example.prod.controller;

import com.example.prod.dto.ProductDTO;
import com.example.prod.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller //html 페이지와 연결?
public class ProductController {
    @Autowired
    private ProductService productService;

    //값 받아올수 없음 get
    @GetMapping("addProduct")
    public String addProduct() {return "addProduct";}

    //value가져올수있음 post
    @PostMapping("addProduct")//+++++https://antstudy.tistory.com/308 -- about Multipartfile/ https://cbw1030.tistory.com/391
    public String addImage(MultipartFile file, ProductDTO dto) throws Exception {
        productService.save(file, dto);
        return "redirect:/";}
    //why Exception?
}
