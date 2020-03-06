package day08.Calendar;

import java.util.Calendar;
import java.util.Date;

/*
* Calendar类的常用成员方法
* 1，public int get(int field):返回给日历字段的值
* 2，public void set(int field,int value):将指定字段赋值为新的值
* 3，public abstract void add(int field,int amount):根据日历的规则，为给定的日历字段添加或减去指定的时间量
* 4，public Date getTime():返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
*
* 成员方法参数：
* int field:日历的字段，可以使用Calendar类的静态成员变量获取：
* public static final int YEAR = 1;年
* public static final int MONTH = 2;月
* public static final int DATE = 5;月中的某一天
* public static final int DAY_OF_MONTH = 5;月中的某一天
* public static final int HOUR = 10;时
* public static final int MINUTE = 12;分
* public static final int SECOND = 13;秒
*
* 注意 MONTH月份采用的是西方的月份0-11月  而中国是1-12月，所以我们使用MONTH时要进行＋1
*
* */
public class CalendarDemo01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        //1，public int get(int field):返回给日历字段的值
        int i = c.get(Calendar.YEAR);   //年
        System.out.println(i);  //2020

        //2，public void set(int field,int value):将指定字段赋值为新的值
        c.set(Calendar.MARCH,9); //月
        System.out.println(c.get(Calendar.MARCH));  //9

        //3，public abstract void add(int field,int amount):根据日历的规则，为给定的日历字段添加或减去指定的时间量
        c.add(Calendar.HOUR,4);   //时
        System.out.println(c.get(Calendar.HOUR));//现在时下午4点，加上上面的4所以这里输出为8

        //4，public Date getTime():返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
        Date time = c.getTime();
        System.out.println(time);
    }
}
