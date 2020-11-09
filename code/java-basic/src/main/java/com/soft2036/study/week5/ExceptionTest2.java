package main.java.com.soft2036.study.week5;

import java.io.*;

/**
 * @ClassName ExceptionTest2
 * @Description 编译时异常联系
 * @Author gqfeng
 * @Date 2020/11/2
 **/
public class ExceptionTest2 {
    public static void main(String[] args) throws IOException {
        //在方法调用出捕获异常
        try{
            byte[] b = readFile("D:\\app\\pictures\\1.png");
            System.out.println(b.length);
        } catch (IOException e){
            System.err.println("出现Io异常！！");
        }
        System.out.println("其他代码");
    }

    /**
     * 用throws关键字在方法签名出声明异常
     *
     * @param path:文件路径
     * @return b:字节数组
     * @throws IOException
     */
    public static byte[] readFile(String path) throws IOException{
        File file = new File(path);
        byte[] b = new byte[(int) file.length()];
        InputStream is = new FileInputStream(file);
        int result = is.read(b);
        System.out.println(result);
        is.close();
        return b;
    }
}
