package day09.泛型.GenericInterface;

public class GenericInterface_Run {
    public static void main(String[] args) {
        /**1，接口中含有泛型，实现类处确定泛型的类型，new对象时只能按照实现类的泛型数据类型来*/
        GenericInterface_Impl1 gim = new GenericInterface_Impl1(); //多态   左接口   右实现类
        gim.Method01(3);
//        gim.Method01("张三");//实现类中设定了泛型为Integer，所以这里只能传入Integer


        /**2，接口中含有泛型，实现类处接着定义泛型，new对象的时候再确定泛型的数据类型*/
        GenericInterface_Impl2<String> gmi2 = new GenericInterface_Impl2<String>();
            gmi2.Method01("str");
//            gmi2.Method01(123);
//            gmi2.Method01(3.14);
    }
}
