package day08.SystemClass;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * java.util.lang.System类是一个系统类，（在lang包下无需导包）
 * 常用方法有：
 * public static long currentTimeMillis() :返回以毫秒为单位的当前时间（返回当前时间与原点时间之间的毫秒值），常见用法有：计算一段代码执行共用时多少毫秒
 * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length):将数组中指定的数据拷贝到另一个数组中
 * Object src：源数组
 * int srcPos：源数组中的起始位置
 * Object dest：目标数组
 * int destPos：目标数组中的起始位置
 * int length：要复制的数组元素数量
 *
 *
 */
public class SystemTest {
    public static void main(String[] args) {
        /** public static long currentTimeMillis() :返回以毫秒为单位的当前时间（返回当前时间与原点时间之间的毫秒值）*/
        System.out.println(System.currentTimeMillis()); //1582446606160
        //把获取到的毫秒值转换为时间
        Date d = new Date(1582446606160L);
        System.out.println(d);  //Sun Feb 23 16:30:06 CST 2020
        //把时间按格式打印
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        String format = s.format(d);
        System.out.println(format);


        /** public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length):将数组中指定的数据拷贝到另一个数组中*/
        int[] arr1 = {10,20,30};
        int[] arr2 = {50,60,70};
        System.arraycopy(arr1,0,arr2,1,1);//解释：把arr1中0号索引（10）复制给arr2中1号索引（60），复制长度为1，也就是只复制一个
        System.out.println(Arrays.toString(arr1));  //[10, 20, 30]==>[10, 20, 30]
        System.out.println(Arrays.toString(arr2));  //[50,60,70]==>[50, 10, 70]     //把是10复制给了60
    }
}
