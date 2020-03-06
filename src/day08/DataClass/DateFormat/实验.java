package day08.DataClass.DateFormat;

import java.util.Date;
/**
 * Date空参构造方法：返回系统当前时间
 * Date类getTime方法：计算原点时间距离当前时间共多少毫秒
 */
public class 实验 {
    public static void main(String[] args) {
        //Date空参构造方法：返回系统当前时间
        Date d = new Date();
        System.out.println(d);//Fri Feb 21 14:47:17 CST 2020
        //Date类getTime方法：计算原点时间距离当前时间共多少毫秒
        long time = d.getTime();
        System.out.println(time);   //1582267690429
    }
}
