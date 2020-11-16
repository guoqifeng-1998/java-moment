package main.java.com.soft2036.study.week7;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName SetTest
 * @Description TODO
 * @Author gqfeng
 * @Date 2020/11/16
 **/
public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("c");
        set.add("b");
        set.add("a");
        System.out.println(set);
        //使用for循环
        System.out.println("用for循环遍历list");
        for (String s: set){
            System.out.println(s);
        }
        //使用iterator遍历
        System.out.println("用Iterator代器遍历list");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //使用lambda遍历
        System.out.println("用lambda表达式遍历list");
        set.forEach(s-> System.out.println(s));
        System.out.println("使用方法来遍历list，终极简单版本");
        set.forEach(System.out::println);
        }

    }

