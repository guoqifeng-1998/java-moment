package main.java.com.soft2036.study.week7;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Test
 * @Description TODO
 * @Author gqfeng
 * @Date 2020/11/16
 **/
public class Test {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Tom","CoreJava");
        map.put("john","Oracle");
        map.put("Susan","Oracle");
        map.put("jerry","JDBC");
        map.put("Allen","JDBC");
        map.put("jim","Unix");
        map.put("Kevin","jsp");
        map.put("lucy","jsp");
        map.replace("Allen","JDBC");
        System.out.println("通过遍历 MAP 的 keySet。遍历Key和Value");
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+"老师教" + entry.getValue());
        }
        System.out.println("用lambda表达式遍历");
        map.forEach((Key,Value)-> System.out.println(Key +"老师交"+Value));
        System.out.println("教JDBC的老师有");
        for (Map.Entry<String , String> entry: map.entrySet()){
            if ("JDBC".equals(entry.getValue())){
                System.out.println(entry.getKey());
            }
        }

    }

}
