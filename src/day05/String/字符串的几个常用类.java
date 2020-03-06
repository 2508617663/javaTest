package day05.String;
/*
* String当中与获取相关的常用方法有:
* public int length()   获取字符串当中的字符长度
* public String concat(String str)  将当前字符串和参数字符串拼接成为新的字符串
* public char charAt(int index)     获取指定索引位置的字符(索引从零开始)
* public int indexOf(String str)    查找参数字符串在本字符串当中首次出现的索引位置,如果没有则返回-1值
*
* 获取字符串长度的方法:
* */
public class 字符串的几个常用类 {
    public static void main(String[] args) {
        String str1 = "华俊文";

        char[] charArray = {'a','b','c','d','e'};
        String str2 = new String(charArray);

        //public int length()   获取字符串当中的字符长度
        System.out.println(str1.length());  //3
        System.out.println(str2.length());  //5

        //public String concat(String str)  将当前字符串和参数字符串拼接成为新的字符串
        String s = str1.concat("最帅");
        System.out.println(s);  //华俊文最帅

        //public char charAt(int index)     获取指定索引位置的字符
        System.out.println(str1.charAt(2));     //文

        //public int indexOf(String str)    查找参数字符串在本字符串当中首次出现的索引位置,如果没有则返回-1值
        System.out.println(str1.indexOf("俊"));  //1   索引为1
        System.out.println(str1.indexOf("帅"));  //-1  没有


    }
}
