package day08.StringBuilder;
/*
* StringBuilder:字符串缓冲区
*
* String类：
* 字符串是常量，它的值在创建后不能更改
* 字符串的底层是一个被final修饰的数组，不能改变，是一个常量
* private final byte[] value;
* 进行字符串相加，内存中就会存在有多个字符串，占用内存空间多，效率低下
*
* StringBuilder：
* 字符串缓冲区，可以提高效率（可以看成一个长度可以变化的字符串）
* 字符串缓冲区底层也是一个数组，但是没有被final修饰，可以改变长度
* StringBuilder默认长度为16位
* byte[] value = new byte[16];
* 如果超出了StringBuilder的默认容量，那么StringBuilder将会自动扩容
*
* */
public class StringBuilder_Test {
    public static void main(String[] args) {
        String s1 = "华";
        s1 += "俊";
        System.out.println(s1);
    }
}
