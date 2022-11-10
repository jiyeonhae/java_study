package com.example.prod.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.type.StringNVarcharType;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "Product")
public class ImageProduct {

    @Id
    @GeneratedValue
    private long id; //primarykey?

    private String title;
    private String content;
    private int count;
    private int price;

    @Column(name = "fileName")
    private String fileName;

    @Column(name = "filePath")
    private String filePath;
    
    //복사 생성자로 한번에 초기화
    public ImageProduct(String title, String content, int count, int price, String fileName, String filePath)
    {

    }
}
