package day08.DataClass.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 计算一个人已经出生了多少天
 * 分析：
 * 1，使用scanner获取出生日期
 * 2，使用DateFormat类中的方法parse，把字符串的出生日期解析为Date格式的出生日期
 * 3，把Date格式的出生日期转换为毫秒值
 * 4，获取当前的日期，转换为毫秒值
 * 5，使用当前日期的毫秒值减去出生日期的毫秒值
 * 6，把毫秒差值转换为天
 */
public class demo02 {
    public static void main(String[] args) throws ParseException {
        //1，使用scanner获取出生日期
        Scanner s = new Scanner(System.in);
        System.out.println("请输入您的出生日期,格式：yyyy-MM-dd");
        String birth = s.next();
        //2，使用DateFormat类中的方法parse，把字符串的出生日期解析为Date格式的出生日期
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sd.parse(birth);
        //3，把Date格式的出生日期转换为毫秒值
        long birthday = date.getTime();
        //4，获取当前的日期，转换为毫秒值
        Date d = new Date();
        long totime = d.getTime();
        //5，使用当前日期的毫秒值减去出生日期的毫秒值
        long restlt = totime - birthday;
        //6，把毫秒差值转换为天
        long i = restlt / 1000 / 60 / 60 / 24;
        System.out.println("您一共出生" + i + "天" + i/365+"年");

    }
}
