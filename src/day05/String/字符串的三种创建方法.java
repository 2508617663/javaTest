package day05.String;
/*
* 创建字符串的常见3+1种方式
* 三种构造方法:
* public String() 创建一个空白字符串,不含有任何内容
* public String(char[] array)   根据字符数组的内容来创建对应的字符串
* public String(byte[] array)   根据字节数组的内容来创建对应的字符串
*
* */
public class 字符串的三种创建方法 {
    public static void main(String[] args) {
        //public String() 创建一个空白字符串,不含有任何内容
        String str1 = new String();     //String str1 = new String("华俊文");
        System.out.println("第一个字符串:" + str1);

        //public String(char[] array)   根据字符数组的内容来创建对应的字符串
        char[] charArray = {'a','b','c'};
        String str2 = new String(charArray);
        System.out.println("第二个字符串:" + str2);

        //public String(byte[] array)   根据字节数组的内容来创建对应的字符串
        byte[] byteArray = {'d','e','f'};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串:" + str3);

    }
}
