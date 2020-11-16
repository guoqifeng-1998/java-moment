package main.java.com.soft2036.study.week7;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @ClassName ListTest
 * @Description TODO
 * @Author gqfeng
 * @Date 2020/11/16
 **/
public class ListTest {
    public static void main(String[] args) {
        //创建一个list接口的实现类对象，泛型为string
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("javaScript");
        list.add("java");
        //随机取出list中的某ge元素
       for (int i =0;i<list.size();i++) {
           System.out.println(list.get(i));
       }
        System.out.println("用for 循环遍历List");
        for (String s: list){
            System.out.println(s );
        }
        System.out.println("用Iterator代器遍历list");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("用lambda表达式遍历list");
     list.forEach(s-> System.out.println(s));
        System.out.println("使用方法来遍历list，终极简单版本");
        list.forEach(System.out::println);

        }
    }


