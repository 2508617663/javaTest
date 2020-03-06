package day06.Math;
/*
* java.util.Math类是数学相关的工具类,里面提供了大量的静态方法,完成与数学运算相关的操作
*
* public static double abs(double num)  获取绝对值
* public static double ceil(double num) 向上取整
* public static double floor(double num)向下取整
* public static long round(double num)  四舍五入
*
* Math.Pi   圆周率
*
* */
public class Math_Test {
    public static void main(String[] args) {
        //public static double abs(double num)  获取绝对值
        System.out.println(Math.abs(-3.14));
        //public static double ceil(double num) 向上取整
        System.out.println(Math.ceil(3.9));     //4.0
        System.out.println(Math.ceil(3.1));     //4.0

        //public static double floor(double num)向下取整
        System.out.println(Math.floor(3.14));   //3.0
        System.out.println(Math.floor(3.9));    //3.0

        //public static long round(double num)  四舍五入
        System.out.println(Math.round(3.5));     //4
        System.out.println(Math.round(3.1));     //3
        System.out.println(Math.PI);

    }
}
