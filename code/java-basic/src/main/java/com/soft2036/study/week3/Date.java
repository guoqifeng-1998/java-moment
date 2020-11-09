package main.java.com.soft2036.study.week3;
import java.text.SimpleDateFormat;
import java.util.Calendar;




/**
 * @ClassName Date
 * @Description TODO
 * @Author 郭崎锋
 * @Date 2020/10/19
 **/
public class Date {
    public static void main(String[] args) throws Exception {

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm");
        String str="2020年10月19日 15:15";
        java.util.Date dt=sdf.parse(str);
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(dt);
        rightNow.add(Calendar.YEAR,+1);  //日期加1年
        rightNow.add(Calendar.MONTH,-2);  //日期减2个月
        rightNow.add(Calendar.DATE,+2); //日期加2天
        rightNow.add(Calendar.HOUR,+2); //日期加 2小时
        java.util.Date dt1=rightNow.getTime();
        String reStr = sdf.format(dt1);
        System.out.println(reStr);

    }

}