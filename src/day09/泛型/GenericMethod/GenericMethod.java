package day09.泛型.GenericMethod;
/**
 * 定义含有泛型的方法：泛型定义在方法的修饰符和返回值类型之间
 * 格式：
 *      修饰符 <泛型> 返回值类型 方法名（参数列表（使用泛型））{
 *          //方法体
 *      }
 * 注意：
 *  含有泛型的方法，在调用方法的时候确定泛型的数据类型
 *  传递什么类型的参数，泛型就是什么类型
 *
 *
 * */
public class GenericMethod {
    public static void main(String[] args) {
        /**调用一个含有泛型的普通方法*/
        GenericMethod g = new GenericMethod(); //创建本类对象
        g.Method01(3.14);   //使用本类对象名.  调用本类方法
        //由于方法是带泛型的，所以这里调方法什么参数都可以传
        g.Method01("3.14");
        g.Method01(true);
        g.Method01(3.1415926);

        /**调用一个含有泛型的普通方法*/
        Method02(30);
        Method02(3.14);
        Method02("张三");
        Method02(true);

    }

    /**定义一个含有泛型的普通方法*/
    public <E> void Method01(E name){   //不带static关键字要new对象才能使用
        System.out.println(name);
    }
    /**定义一个含有泛型的静态方法*/
    public static <E> void Method02(E e){
        System.out.println(e);
    }


}
