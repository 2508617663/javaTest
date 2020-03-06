package day08.StringBuilder;
/*
* StringBuilder中的toString方法
* StringBuilder和String可以互相转换
* String 转换为 StringBuilder：可以使用StringBuilder的构造方法：StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
*
*
* */
public class Demo02_toString {
    public static void main(String[] args) {
        //String 转换为 StringBuilder：
        // 可以使用StringBuilder的构造方法：StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
        String s = "Hello";
        //把字符串放入StringBuilder构造方法中
        StringBuilder sb = new StringBuilder(s);
        StringBuilder a = sb.append("World");
        System.out.println(a);

        //StringBuilder转换为String：
        // 可以使用StringBuilder中的toString方法
        StringBuilder sb1 = new StringBuilder("最帅");
        System.out.println(sb1.toString());
    }
}
