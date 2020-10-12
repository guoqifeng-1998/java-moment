package com.soft2036.study.week2;

import java.util.Date;


/**
 * @ClassName Book
 * @Description TODO
 * @Author 郭崎锋
 * @Date 2020/10/12
 **/
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
public class Book {
    private String name;
    private Integer price;
    private Date publishDate;

    public Book(String name, Integer price, Date publishDate) {
        this.name = name;
        this.price = price;
        this.publishDate = publishDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}







