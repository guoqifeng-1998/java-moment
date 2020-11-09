package main.java.com.soft2036.study.week5;

/**
 * @ClassName Test2
 * @Description 数组索引越界异常
 * @Author gqfeng
 * @Date 2020/11/2
 **/
public class ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {
        int [] a = new int[]{1,2,3,4,5};
       try {
           System.out.println(a[5]);
       } catch (java.lang.ArrayIndexOutOfBoundsException e){
           System.err.println("数组索引越界");
           System.err.println("异常的原因"+ e.getCause());
           System.err.println("异常的详细信息:"+e.getMessage());
           System.err.println("异常对象e："+e.toString());
       }
    }
}
