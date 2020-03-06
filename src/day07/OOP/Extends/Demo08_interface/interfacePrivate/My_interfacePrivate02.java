package day07.OOP.Extends.Demo08_interface.interfacePrivate;

public interface My_interfacePrivate02 {
    public static void MethodDefault01(){
        System.out.println("默认方法1");
//        System.out.println("AAAAAAA");  //代码重复
//        System.out.println("BBBBBBB");
        MethodDefault03();

    }
    public static void MethodDefault02(){
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

    private static void MethodDefault03(){  //抽出重复的内容定义成一个新的方法， 但是这样的话所有实现类都可以访问到
        // 这里，这里应该只能被上面两个01 02方法调用，所以这里应该设置成私有化方法
        System.out.println("AAAAAAA");
        System.out.println("BBBBBBB");
    }


}
