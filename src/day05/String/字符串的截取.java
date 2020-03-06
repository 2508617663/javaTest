package day05.String;
/*
* public String substring(int index)    截取从参数位置一直到字符串末尾,返回新字符串
* public String substring(int begin , int end)  截取从begin开始,一直到end结束,中间的字符串(左闭右开,包含左边,不包含右边)
*
* */
public class 字符串的截取 {
    public static void main(String[] args) {
        String str1 = "HelloWrold";
        String str2 = str1.substring(5);

        System.out.println(str2);   //Wrold
    }
}
