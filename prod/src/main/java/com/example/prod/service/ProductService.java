package com.example.prod.service;

import com.example.prod.domain.ImageProduct;
import com.example.prod.dto.ProductDTO;
import com.example.prod.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Service @Transactional(readOnly = true)
//java logic, business logic function 처리
public class ProductService {
    //addProduct
    //addImage
    @Autowired
    ProductRepository productRepository;

    @Transactional
    public void save(MultipartFile file, ProductDTO dto) throws Exception
    {
        String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\static\\images";

        // universally unique identifier
        UUID uuid = UUID.randomUUID();
        String fileName = uuid + "_" + file.getOriginalFilename();
        
        
        //이거 머지
        File saved = new File (filePath, fileName);
        file.transferTo(saved);


        //ProductRepository.save
    }
}
