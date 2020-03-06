package day09.双列集合_Map.练习;


import java.util.*;

public class demo03 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        HashMap<Character,Integer> map = new HashMap<>();
        for (char key: s.toCharArray()){
            if (map.containsKey(key)){
                Integer value = map.get(key);
                value++;
                map.put(key,value);
            }else{
                map.put(key,1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<Character, Integer>> it = entries.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
