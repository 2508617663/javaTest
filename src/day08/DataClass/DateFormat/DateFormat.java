package day08.DataClass.DateFormat;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* java.text.DateFormat
* 对时间按照特定的格式进行格式化
* Format一共有三个子类：
* DateFormat：用来对日期进行按照特定格式进行格式化
* MessageFormat：用来对信息进行格式化
* NumberFormat：用来对数字进行格式化
*
* DateFormat 是日期/时间格式化子类的【抽象类】，它是一个抽象类无法直接创建对象使用，所以我们要用到它的实现类，也就是SimpleDateFormat
* SimpleDateFormat一共有两个功能：
*   1，格式化：把日期转换为文本
*   2，解  析：把文本转换为日期
* 成员方法：
* String format(Date date):按照指定的模式，把Date日期，格式化为符合模式的字符串
* Date parse(String source):把符合模式的字符串，解析为Date日期
*
* 常用的格式为（严格区分大小写）：
* y     年
* M     月
* d     日
* H     时
* m     分
* s     秒
*
* 注意：
*   模式中的字母严格区分大小写，且不能更改y就是代表年。不过用来连接的符号可以改变："yyy-MMM-ddd"可以换成："yyy年MMM月ddd"
*
*
* */
public class DateFormat {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
//        System.out.println(date);   //Thu Feb 20 18:34:51 CST 2020

        /**
         * String format(Date date):按照指定的模式，把Date日期，格式化为符合模式的字符串
         * 使用步骤：
         * 1，创建SimpleDateFormat对象，构造方法中传递指定的模式
         * 2，调用SimpleDateFormat对象中的方法format，按照构造方法中指定的模式，把Date日期格式化为符合模式的字符串（文本）
         */

        //1，创建SimpleDateFormat对象，构造方法中传递指定的模式
        SimpleDateFormat sd = new SimpleDateFormat("yyy年MM月dd日");//定义一个格式
        //2，调用SimpleDateFormat对象中的方法format，按照构造方法中指定的模式，把Date日期格式化为符合模式的字符串（文本）
        String format1 = sd.format(date);//把date时间传到format方法中按照上面定义的格式进行输出
        System.out.println(format1);//2020年02月20日

        //Date parse(String source):把符合模式的字符串，解析为Date日期
        /**
         * 使用DateFormat类中的方法format，把日期格式化为文本
         * 使用步骤：
         * 1，创建SimpleDateFormat对象，构造方法中传递指定的模式
         * 2，调用SimpleDateFormat对象中的方法parse，把符合构造方法中模式的字符串，解析为Date日期
         * 注意：
         * public Date parse(String source) throws ParseException
         * parse方法声明了一个异常叫ParseException
         * 如果字符串和构造方法的模式不一样，那么程序就会抛出异常
         */
        Date parse = sd.parse(format1);//把上面以及解析为文本后的结果传给parse方法
        System.out.println(parse);
    }



}
