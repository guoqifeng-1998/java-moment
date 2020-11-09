package main.java.com.soft2036.study.week5;

import java.util.Scanner;

/**
 * @ClassName NumberFormatException
 * @Description 数字格式化异常
 * @Author gqfeng
 * @Date 2020/11/2
 **/
public class NumberFormatException {
    public static void main(String[] args) {
        System.out.println("请输入价格：");
        Scanner scanner = new Scanner(System.in);
        //从键盘读入一串字符"123"
        String priceStr = scanner.nextLine();
        //将字符串转化成整形 123
        int price = Integer.parseInt(priceStr);
        System.out.println("price = "+price);
    }
}
