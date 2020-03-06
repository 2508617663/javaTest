package day08.StringBuilder;
/*
* StringBuilder常用的构造方法以及成员方法
* 构造方法：
* StringBuilder() ：构造一个没有字符的字符串构建器，初始容量为16个字符。
 * StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
 *
* 成员方法：
* StringBuilder append​(......) 添加任意类型数据的字符串形式，并返回当前对象自身
* String toString​() 将当前StringBuilder对象转换为String对象
 * */
public class Demo01 {
    public static void main(String[] args) {
        //StringBuilder() ：构造一个其中不带字符的字符串生成器，初始容量为 16 个字符。
        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1 = " + sb1);

        //tringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容。
        StringBuilder sb2 = new StringBuilder("华俊文");
        System.out.println("sb2 = " + sb2);

        //成员方法
        //StringBuilder append​(......) 添加任意类型数据的字符串形式，并返回当前对象自身
        Method();

        //String toString​() 将当前StringBuilder对象转换为String对象
        Method02();
    }

    //StringBuilder append​(......) 添加任意类型数据的字符串形式，并返回当前对象自身
    private static void Method() {
        //创建StringBuilder对象
        StringBuilder sb = new StringBuilder();
        System.out.println("sb = " + sb);   //sb =
        //用append方法
        StringBuilder append = sb.append(123);  //插入一个int类型数据
        System.out.println("append = " + append);   //append = 123


        //使用append方法无需接收返回值
        sb.append(123);
        sb.append("华");
        sb.append(3.14);
        sb.append('a');
        System.out.println(sb); //123123华3.14a
        //链式编程：
        StringBuilder s = new StringBuilder();
        s.append("hua").append(3.14).append('中').append(true);
        System.out.println("s = " + s);

    }

    //String toString​() 将当前StringBuilder对象转换为String对象
    private static void Method02() {
    }
}
