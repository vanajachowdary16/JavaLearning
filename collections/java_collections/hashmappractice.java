package collections.java_collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class hashmappractice {
    public static void main(String[] args){
        Map<String, Integer> maps = new HashMap<>();
        maps.put("students", 20);
        maps.put("name", 01);
        maps.put("ary", 02);
        maps.put("rayn", 03);
        System.out.println("hash map is " +maps);
        System.out.println(maps.get("students"));
        System.out.println(maps.containsKey("students"));
        System.out.println(maps.containsValue(20));
        maps.replace("name", 22);
        System.out.println(maps.get("name"));
        maps.remove("name");
         System.out.println("updated hash map is " +maps);

        Map<String, Integer> citys = new LinkedHashMap<>();
        citys.put("yes",  01);
        citys.put("vij", 02);
        citys.put("hyd", 03);
        citys.put("nyl", 04);
        System.out.println("linked hashmap is " +citys);
    }
    
}
