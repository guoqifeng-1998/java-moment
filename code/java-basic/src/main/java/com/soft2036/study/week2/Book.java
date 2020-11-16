package main.java.com.soft2036.study.week2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @ClassName Book
 * @Description TODO
 * @Author gqfeng
 * @Date 2020/10/12
 **/

public class Book {
    private String bookName;
    private Integer bookPrice;
    private Date publishTime;

    public Book(String bookName,Integer bookPrice,Date publishTime) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.publishTime = publishTime;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Integer bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public String setPublishTime(Date publishTime) {
        SimpleDateFormat ft = new SimpleDateFormat();
        return ft.format(this.publishTime);
    }
}