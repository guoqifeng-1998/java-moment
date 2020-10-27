package com.soft2036.study.week3;

/**
 * @ClassName point
 * @Description TODO
 * @Author 郭崎锋
 * @Date 2020/10/19
 **/
public class point {
 private Integer x;
 private Integer y;

 public point(){
     System.out.println("点被初始化");
 }
 public point(int x, int y){
     this.x = x;
     this.y = y;
     System.out.println("带参数的点被初始化");
 }
 public void print(){
     System.out.println("横坐标:" + this.x + ",纵坐标:" + this.y);
 }
}
