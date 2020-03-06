package day08.DataClass;

import java.util.Date;

/*
* date类的空参数构造方法
* public Date(){}   //返回当前系统时间
*
* * long getTime()把日期转换为毫秒值（相当与system.currentTimeMillis()方法）
 * 计算原点时间与本机系统时间之间一共有多少毫秒
*
* */
public class Demo01 {
    public static void main(String[] args) {
        Method();
        Method01();
        Method02();

    }
    //Date类空参数构造方法
    public static void Method(){
        Date d = new Date();
        System.out.println(d);  //Mon Feb 17 21:13:08 CST 2020
    }

    //Date类的带参数构造方法

    public static void Method01(){
        Date d = new Date(0L); //带参数构造方法的形参是一个lang类型的  /这里传入0毫秒
        System.out.println(d); //所以这里输出为原点时间：Thu Jan 01 08:00:00 CST 1970


        //Date(long date):传递毫秒值，把毫秒值转换为Date日期
        Date a = new Date(1581945076744L);
        System.out.println(a);  //Mon Feb 17 21:11:16 CST 2020

    }
    /*
     * long getTime()把日期转换为毫秒值（相当与system.currentTimeMillis()方法）
     * 计算原点时间与本机系统时间之间一共有多少毫秒
     * */
    public static void Method02(){
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);   //1582193323315
    }
}
