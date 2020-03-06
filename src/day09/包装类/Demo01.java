package day09.包装类;

import java.util.ArrayList;

/*
* 自动装箱与自动拆箱：基本数据类型的数据和包装类之间可以自动的相互转换（jdk1.5之后出现的新特性）
*
* */
public class Demo01 {
    public static void main(String[] args) {
        //普通int类型 int num = 10;
        //自动装箱：
        Integer num = 10;   //自动把num=10装箱在integer包装类中，相当于：integer num = new integer(10);

        //自动拆箱： num已经是包装类，无法直接参与运算，可以自动转换为基本数据类型，在进行计算
        Integer num1 = num+20;//num+2就相当于num.intValue() + 2,然后num1又是一个包装类，就等于先进行自动拆箱计算后又进行自动装箱
        //integer num1 = num.intValue() + 2 //赋值给num1  num1 是一个integer类型的，所以这里又进行了自动装箱
        System.out.println("num1 = " + num1);

        /**
         * 案例：
         * ArrayList集合无法直接存储基本数据类型，只能存储包装类
         */

        ArrayList<Integer> List = new ArrayList<>();
        List.add(10);  /**但是这个10确实是基本数据类型，所以这里隐含了一个自动装箱*/

        int li = List.get(0); /**同理我们取出来的数据也是包装类，但是我们可以用int类型来接收，所以这里同样也隐含了自动拆箱*/
    }
}
