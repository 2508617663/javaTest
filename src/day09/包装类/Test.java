package day09.包装类;
/*
* 包装类
*   基本数据类型使用起来非常方便，但是没有对应的方法来操作这些基本数据类型的数据
*   可以使用一个类，把基本数据类型的数据装起来，在类中定义一些方法，这个类就叫做包装类，我们就可以使用包装类中的方法来操作这些基本数据类型的数据
* 基本数据类型与其对应的包装类对象之间，互相转换的过程被称为“拆箱”，“装箱”
* 装箱：基本数据类型转换为与其对应的包装类，比如：int -> integer
*   构造方法：
*       Integer(int value)  构造一个新分配的Integer对象，它表示指定的int值
*       Integer(String s)   构造一个新分配的Integer对象，它表示String参数所指示的int值
*           Integer(String s)传递的字符串必须是基本类型的字符串，否则会抛出异常  正确："100"  错误："TicketImpl"(抛异常)
*   静态方法：
*       static Integer valueOf(int i)   返回一个表示指定的int值的Integer实例
*       static Integer valueOf(String s)    返回保存指定的String的值的Integer对象
* 拆箱：包装类转换为与其对应的基本数据类型，比如：integer -> int
*   构造方法：
*       intValue() 以 int 类型返回该 Integer 的值。
*注意：
* 注意，字符串里面只能存放整数，1-999  不能放字符或者字符串：A-Z,否则会抛出异常NumberFormatException
*
* 基本数据类型          包装类(java.long包中)
* byte                  Byte
* short                 Short
* int                   integer
* long                  Long
* float                 Float
* double                Double
* boolean               Boolean
* char                  Character
*
*
* */
public class Test {
    public static void main(String[] args) {
        //装箱：基本数据类型转换为与其对应的包装类，比如：int -> integer
        //构造方法：
        int num = 10;
        Integer i1 = new Integer(num);   //方法上有一条横线，说明方法过时了
        System.out.println("i1 = " + i1);
        Integer i2 = new Integer("100");
        System.out.println("i2 = " + i2);
        //静态方法：
        Integer ia = Integer.valueOf(1);
        System.out.println("ia = " + ia);
        Integer ib = Integer.valueOf("100");
//        Integer ib = Integer.valueOf("AaBb");    //注意，字符串里面只能存放整数，1-999  不能放字符或者字符串：A-Z,否则会抛出异常NumberFormatException
        System.out.println("ib = " + ib);

        //拆箱：包装类转换为与其对应的基本数据类型，比如：integer -> int：intValue()
        //intValue() 以 int 类型返回该 Integer 的值。
        int a = i1.intValue();  //i1在上面以及被包装为一个包装类，所以这里直接调用i1的intValue()方法转换为int类型 赋值给a
        System.out.println("TicketImpl = " + a);


    }
}
