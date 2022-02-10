package 集合.基础;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author lysoy
 */
public class MapExample {
    public static void main(String[] args) {
        String[] array = {"a","b","c","d","e"};
        Map<String, Integer> map = new HashMap<String, Integer>();
        Integer ONE = 1;
        for (int i=0, n=array.length; i<n; i++) {
            String key = array[i];
            int frequency = i+1;
            map.put(key, frequency);
        }
        System.out.println(map);
        Map<String, Integer> sortedMap = new TreeMap<>(map);
        System.out.println(sortedMap);
        //hashmap的同步
        Map map1 = Collections.synchronizedMap(map);
        System.out.println(map1);

    }
}


