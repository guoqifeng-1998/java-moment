package com.soft2036.study.week2;


import java.util.Date;

/**
 * @ClassName TestGroup
 * @Description TODO
 * @Author 郭崎锋
 * @Date 2020/10/12
 **/
public class TestGroup {
    public static void main(String[] args) {
        Book book1 = new Book("java基础", 77, new Date());
        Book book2 = new Book("javaScript", 88, new Date());
        Book book3 = new Book("java从入门到精通", 121, new Date());
        Book book4 = new Book("java大神养成记", 222, new Date());
        Book book5 = new Book("java宝典", 101, new Date());

        Phone phone1 = new Phone("iphonexs", 8888);
        Phone phone2 = new Phone("iphone8", 7777);
        Phone phone3 = new Phone("iphone7", 6666);
        Student student1 = new Student("1001",

                "张三",
                "男",
                phone1,
                new Book[]{book1, book2});

        Student student2 = new Student("1002",
                "里斯",
                "女",
                phone2,
                new Book[]{book1, book2, book3, book4});

        Student student3 = new Student("1003",
                "hero",
                "男",
                phone3,
                new Book[]{book5});

        System.out.println(student1.getStudentName());
        System.out.println(student2.getStudentName());
    }
}
