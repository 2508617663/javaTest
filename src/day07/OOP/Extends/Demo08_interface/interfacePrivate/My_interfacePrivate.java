package day07.OOP.Extends.Demo08_interface.interfacePrivate;
/*
* 问题描述：
* 我们需要抽取一个共有方法，解决两个默认方法之间代码重复的问题，但是这个共有方法不应该让实现类使用，应该是私有化的
*
* 解决方案：
* 从Java9开始，接口当中允许定义私有方法
*   1，普通私有方法，解决多个默认方法之间代码重复问题
*   格式：
* private 返回值类型 方法名称（参数列表）{
*       方法体
* }
*   2，静态私有化，解决多个静态方法之间代码重复问题
*   格式：
* private static 返回值类型 方法名称（参数列表）{
*       方法体
* }
*
* */
public interface My_interfacePrivate {
    public default void MethodDefault01(){
        System.out.println("默认方法1");
//        System.out.println("AAAAAAA");  //代码重复
//        System.out.println("BBBBBBB");
        MethodDefault03();

    }
    public default void MethodDefault02(){
        System.out.println("默认方法2");
//        System.out.println("AAAAAAA");    //代码重复
//        System.out.println("BBBBBBB");
        MethodDefault03();
    }
    /*public default void MethodDefault03(){  //抽出重复的内容定义成一个新的方法， 但是这样的话所有实现类都可以访问到
                                            // 这里，这里应该只能被上面两个01 02方法调用，所以这里应该设置成私有化方法
        System.out.println("AAAAAAA");
        System.out.println("BBBBBBB");
    }*/

    private void MethodDefault03(){  //抽出重复的内容定义成一个新的方法， 但是这样的话所有实现类都可以访问到
        // 这里，这里应该只能被上面两个01 02方法调用，所以这里应该设置成私有化方法
        System.out.println("AAAAAAA");
        System.out.println("BBBBBBB");
    }


}
