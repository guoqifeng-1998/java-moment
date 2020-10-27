package com.soft2036.study.week2;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @ClassName student
 * @Description TODO
 * @Author 郭崎锋
 * @Date 2020/10/12
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String  id;
    private  String  studentName;
    private  String gender;
    private Phone phone;
    private Book[] books;
}
