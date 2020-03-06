package day08.Object.toString;
/*
* object类是所有类的父类（超类），所有类（包括数组），都实现了这个类中的方法
* ToString方法
*
* 看一个类是不是重写了toString方法只需要打印这个对象，如果出现的是地址值说明没有重写，否则反之
*
* */
public class ToString {
    public static void main(String[] args) {
        Person p = new Person("张三丰", 18);
        String s = p.toString();
        System.out.println(s);  //打印的是对象的内存地址值day08.Object.Person@49e4cb85  //重写后：张三丰18
        //其实直接打印p，也是默认调用的ToString方法
        System.out.println(p);  //day08.Object.toString.Person@49e4cb85  //重写后：张三丰18

        /*
        但是直接打印对象的地址值没有意义，所以在person中重写ToString方法
        重写后打印结果:
        张三丰18
        张三丰18
        */
    }
}
