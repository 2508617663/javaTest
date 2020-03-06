package day09.双列集合_Map;

import java.util.*;

/**
 * 练手：遍历HashMap
 *
 * */
public class 遍历map {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("谢霆锋","张柏芝");
        map.put("张杰","谢娜");
        map.put("邓超","孙俪");
        map.put("习近平","彭丽媛");
        System.out.println(map);//无序的，存入顺序和取出顺序不一致{邓超=孙俪, 习近平=彭丽媛, 谢霆锋=张柏芝, 张杰=谢娜}

        //遍历HashMap集合（无序的，存储顺序和输出顺序可能不一致：[邓超, 习近平, 谢霆锋, 张杰]）
        System.out.println(map.keySet());   //key.Set()方法取出Map集合中所有key
        Set<String> s = map.keySet();
        Iterator<String> it = s.iterator();//获取迭代器
        //遍历迭代器（此时迭代器里存的是Map集合中所有的key值）
        while (it.hasNext()){
            String next = it.next();
            String s1 = map.get(next); //get方法查找所有key所对应的value，并且赋值给s1，此次s1中就有所有value值
            System.out.println(next+"="+s1);//最后用一个字符串拼接把所有的next（key）值加上（=）s1（value）
        }

        LinkedHashMap<String,String> linkedMap = new LinkedHashMap<>();
        linkedMap.put("AA","aa");
        linkedMap.put("BB","bb");
        linkedMap.put("CC","cc");
        linkedMap.put("DD","dd");
        System.out.println(linkedMap);//有序的，存入顺序和取出顺序一致：{AA=aa, BB=bb, CC=cc, DD=dd}
        Set<String> keyset = linkedMap.keySet();//取出所有LinkedHashMap集合中所有的key
        Iterator<String> LinkedIt = keyset.iterator();//获取迭代器
        while (LinkedIt.hasNext()){
            String key = LinkedIt.next();       //通过循环得到所有key值
            String value = linkedMap.get(key);  //通过get方法得到所有value值
            System.out.println(key+"="+value);  //有序集合，存入顺序和取出顺序一致：AA=aa,BB=bb,CC=cc,DD=dd
        }

    }
}
