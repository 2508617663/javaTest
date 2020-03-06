package day09.双列集合_Map.练习;

import java.util.*;

/**
 * 计算一个字符串中每个字符出现的个数，用map集合
 *  分析：
 *      1，使用Scanner获取用户输入的字符串
 *      2，创建Map集合，key是输入的字符串中的字符，value是字符出现的个数
 *      3，遍历字符串，获取每一个字符
 *      4，使用获取到的字符，去Map集合判断key是否存在
 *          key存在：通过字符（key）获取value（字符个数）——> value++
 *          put（key，value）存储到map集合中
 * */
public class demo01 {
    public static void main(String[] args) {
        String next = new Scanner(System.in).next();//获取用户输入的字符串
        char[] chars = next.toCharArray();//用toCharArray()方法把用户输入的字符串转换为字符数组chars
        HashMap<Character,Integer> map = new HashMap<>();//创建一个HashMap集合，泛型为字符包装类和整型包装类
        for (char key : chars){   //使用foreach遍历
//            System.out.println(key);
            if (map.containsKey(key)){//用containsKey()方法判断map数组中是否有指定的键（c）c是遍历后的字符
                Integer value = map.get(key); //把遍历出来的键（K）的值（V）赋值给value
                value++;
                map.put(key,value);
            }else{
                map.put(key,1);//如果集合中没有元素就直接把遍历出的键（key）存入map，（value）直接存1
            }
        }
        System.out.println(map);
    }
}
