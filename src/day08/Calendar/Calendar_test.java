package day08.Calendar;

import java.util.Calendar;

/*
* java.util.Calendar类：日历类
* Calendar类是一个抽象类，里面提供了很多操作日历字段的方法（YEAR、MONTH、DAY_OF_MONTH、HOUR ）
* Calendar类无法直接创建对象使用，里面有一个静态方法叫getInstance()，该方法返回了Calendar类的子类对象
* static Calendar getInstance()使用默认时区和语言环境获得一个日历
*
*
* */
public class Calendar_test {
    public static void main(String[] args) {
        //由于getInstance方法是一个静态方法，所以不用newCalendar对象也可以直接调用
        Calendar instance = Calendar.getInstance(); //多态写法
        System.out.println(instance);
    }
}
