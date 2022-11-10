package com.example.prod.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductDTO {

    private String title;
    private String content;
    private int count;
    private int price;

    //file name and path included?
    public ProductDTO (String title, String content, int count, int price)
    {
        this.title = title;
        this.content = content;
        this.count = count;
        this.price = price;
    }

}
