package main.java.com.soft2036.study.week5;

import main.java.com.soft2036.study.week3.Date;

import javax.swing.*;

/**
 * @ClassName ExceptionTest1
 * @Description 异常练习1
 * @Author gqfeng
 * @Date 2020/11/2
 **/
public class ExceptionTest1 {
    public static void main(String[] args) {
        int result = 0;
        //1.ArithmeticException 算术异常
       try {
          result = 3 / 0;
       } catch (ArithmeticException e){
           JOptionPane.showMessageDialog(null,"除数不能为0！");
         System.err.println("除数不能为0" + new Date());
           e.printStackTrace();
       }
        System.out.println(result);
    }
}
