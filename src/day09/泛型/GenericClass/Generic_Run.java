package day09.泛型.GenericClass;

import day09.泛型.GenericClass.GenericClass;

/*
* */
public class Generic_Run {
    public static void main(String[] args) {
        //创建对象时没有加入泛型，则是Object类，即什么类型的数据都可以存
        GenericClass gc = new GenericClass<String>();
        gc.setName(123);
        gc.setName("华俊文");
        System.out.println("gc.getName() = " + gc.getName());


        //创建对象时加入Integer类型的泛型，即只能存储Integer
        GenericClass<Integer> gc2 = new GenericClass<>();
//        gc2.setName("华俊文");   //只能存入Integer类型的数据
        gc2.setName(123);
        gc2.setName(314);

        //创建对象时加入String类型的泛型，即只能存储String
        GenericClass<String> gc3 = new GenericClass<>();
//        gc3.setName(123);   //只能存入String类型的数据
        gc3.setName("华俊文");
    }
}
