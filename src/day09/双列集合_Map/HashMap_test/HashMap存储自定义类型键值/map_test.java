package day09.双列集合_Map.HashMap_test.HashMap存储自定义类型键值;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * HashMap存储自定义类型键值
 * Map集合保证key是唯一的：
 *      作为key的元素，必须要保证重写hashCode方法和equals方法，以保证key唯一
 *      如果key元素没有重写key方法则key可以存储重复对象，并不能保证key唯一
 *
 *
 * */
public class map_test {
    public static void main(String[] args) {
        //创建HashMap集合
        HashMap<id,name> map = new HashMap<>();
        map.put(new id(18),new name("华俊文"));
        map.put(new id(19),new name("李四"));
        map.put(new id(11),new name("王五"));
        map.put(new id(12),new name("华俊文"));
        map.put(new id(12),new name("华俊文"));
        map.put(new id(12),new name("啊啊啊"));
        System.out.println(map);

        //遍历map集合
        //迭代器
        /*Set<id> set = map.keySet();
        Iterator<id> it = set.iterator();
        while (it.hasNext()){
            id key = it.next();
            name value = map.get(key);
            System.out.println(key+"="+value);
        }*/
        //Entry
        Set<Map.Entry<id, name>> set = map.entrySet();
        Iterator<Map.Entry<id, name>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<id, name> next = it.next();
            System.out.println(next.getKey()+"="+next.getValue());
        }
    }
}
