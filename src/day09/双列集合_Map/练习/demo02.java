package day09.双列集合_Map.练习;

import java.util.HashMap;
import java.util.Scanner;

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
public class demo02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String next = s.next();//next就是用户输入的字符串，使用
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c :next.toCharArray()){//使用toCharArray()方法把next接收到的字符串转换为字符数组（char[]）后用foreach进行遍历
            if (map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else{
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
