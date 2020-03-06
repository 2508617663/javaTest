package day08.DataClass;
/*
* java.util.Date：表示日期和时间的类
* Date表示特定的瞬间，精确到毫秒
* 毫秒：千分之一秒  1000毫秒=1秒
* 特定的瞬间：一个时间点，一刹那时间
*
* 毫秒值的作用，可以进行时间和日期进行计算
* 2099-01-03到2088-01-01中间一共有多少天
* 可以把日期转换为毫秒，计算完毕再把毫秒转换为日期
*
* 时间原点：1970年1月1日00:00:00（英国格林威治时间）
*
* 把毫秒转换为日期：
* 1天 = 24 x 60 x 60 = 86400秒 86400 x 1000 = 86400000
*
* 注意：
* 中国属于东八区，会把时间增加8个小时
* 1970年1月1日08:00:00
*
*
* */
public class Date_Test {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()); //1581945076744
    }
}
