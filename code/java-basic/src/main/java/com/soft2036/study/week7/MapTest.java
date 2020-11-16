package main.java.com.soft2036.study.week7;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import sun.management.counter.perf.PerfByteArrayCounter;

import javax.print.DocFlavor;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @ClassName MapTest
 * @Description TODO
 * @Author gqfeng
 * @Date 2020/11/16
 **/
public class MapTest {
    public static void main(String[] args) {
        Map<String ,String> map = new HashMap<>(8);
        map.put("中国","北京");
        map.put("美国","华盛顿");
        map.put("日本","东京");
        map.put("英国","伦敦");
        System.out.println(map);
        //for 循环遍历
        for (String key:map.keySet()){
          String value = map.get(key);
            System.out.println(key + "首都为"+value);
        }
        System.out.println("通过遍历 MAP 的 keySet。遍历Key和Value");
        for (String key : map.keySet()){
            String value = map.get(key);
            System.out.println( key + "首都为：" +value);
        }
        System.out.println("iterator遍历");
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String ,String> entry =iterator.next() ;
            System.out.println(entry.getKey()+"首都为" + entry.getValue());
        }
        System.out.println("通过遍历 Map 的 Values。只能遍历Value，获取不到Key");
        for (String value :map.values()){
            System.out.println(value);
        }
        System.out.println("通过遍历 MAP 的entrySet，遍历Key 和Value，推荐使用！");
        for (Map.Entry<String , String> entry: map.entrySet()){
            System.out.println(entry.getKey()+"首都为"+entry.getValue());
        }
        System.out.println("lambda 表达式遍历，强烈推荐！！");
        map.forEach((Key,Value)-> System.out.println("key:" +Key + ",value:"+Value));


    }
}
