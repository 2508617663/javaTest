package day08.DataClass.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/*
* 根据指定的命令显示系统当前时间
*
* */
public class demo01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (s.next().equals("现在时间")){
            Date d = new Date();
            SimpleDateFormat sd = new SimpleDateFormat("yyy年MMM月ddd日");
            String format = sd.format(d);
            System.out.println(format);
        }else{
            System.out.println("输入错误");
        }
    }
}
