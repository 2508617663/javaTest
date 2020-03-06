package day07.OOP.innerClass.接口作为方法的参数或返回值;

import java.util.ArrayList;
import java.util.List;

/*
* 接口作为方法的参数或者返回值
* java.util.ArrayList正是List的实现类
*
* */
public class DemoInterface {
    public static void main(String[] args) {
        //左边是接口名称，右边是实现类名称，这正是多态写法
        List<Integer> al = new ArrayList<>();

        List<Integer> result = addNames(al);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
    public static List<Integer> addNames (List<Integer> list){
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        return list;
    }
}
