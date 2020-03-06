package day09.双列集合_Map.JDK9新特性_of;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * JDK9+的新特性:of
 *      List接口，Set接口，Map接口中都增加了一个静态方法of，可以给集合【一次性】添加多个元素
 *      static <E> List<E> of (E...elements)
 * of方法使用前提：
 *      当集合中要存储的元素个数已经确定了，不在改变的时候使用
 * 注意：
 *      1，of方法只适用于List，Set，Map接口，不适用于这些接口的实现类比如：ArrayList，HashSet，HashMap等
 *      2，of方法的返回值是一个不能改变的集合，集合不能再使用add，put方法添加元素，会抛出异常
 *      3，Set接口和Map接口再调用of方法的使用不能有重复的元素，否则会抛出异常
 *
 *
 *
 * */
public class test {
    public static void main(String[] args) {
        /**1，of方法只适用于List，Set，Map接口，不适用于这些接口的实现类比如：ArrayList，HashSet，HashMap等*/
//        ArrayList<Integer> arrl = ArrayList.of();     //无法通过编译，of方法只能List，Set，Map接口使用


        /**2，of方法的返回值是一个不能改变的集合，集合不能再使用add，put方法添加元素，会抛出异常*/
        List<Integer> list1 = List.of(1,2,3,4,5,6);
//        list1.add(321);        //抛出不支持操作异常：java.lang.UnsupportedOperationException
        Map<Integer, Integer> map = Map.of(7, 8);
//        map.put(000);

        /**3，Set接口和Map接口再调用of方法的使用不能有重复的元素，否则会抛出异常*/
        List<Integer> list2 = List.of(1,1,1,1,1,1);//没问题
//        Set<Integer> set2 = Set.of(2, 2, 2, 2, 2);  //异常：java.lang.IllegalArgumentException:

        Map<Integer, Integer> map1 = Map.of(1, 2, 3, 4);
//        Map<Integer, Integer> map2 = Map.of(2, 2, 2, 2);//异常：java.lang.IllegalArgumentException:
    }
}
