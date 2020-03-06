package day05.String.字符串常量池;
/*
* 字符串常量池:程序当中直接写上的双引号字符串,就在常量池种   比如  String str = "华俊文";
* 字符串常量池在堆内存种
* */
public class Test {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);

        byte[]  byteArray = {'a','b','c'};
        String str4 = new String(byteArray);

        String str5 = new String("abc");

        System.out.println(str1 == str2);   //true
        System.out.println(str2 == str3);   //false
        System.out.println(str3 == str1);   //false
        System.out.println(str3 == str4);   //false
        System.out.println(str5 == str1);   //false

    }
}
