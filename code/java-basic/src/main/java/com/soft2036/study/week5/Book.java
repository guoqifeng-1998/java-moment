package main.java.com.soft2036.study.week5;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Book
 * @Description TODO
 * @Author gqfeng
 * @Date 2020/11/2
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String ISBN;
    private Integer price;
    private String bookName;
}
