package c.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSample {
    public static void main(String[] args) {
        MapSample sample = new MapSample();
        sample.checkHashMapEntry();
    }
    public void checkHashMap(){
        HashMap<String,String> map=new HashMap<>();
        map.put("A","a");
        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
    }
    public void checkKeySet(){
        HashMap<String,String> map=new HashMap<>();
        map.put("A","a");
        map.put("B","b");
        map.put("C","c");
        Set<String> keySet=map.keySet();
        for (String key :
                keySet) {
            System.out.println(key+"="+map.get(key));
        }
    }
    public void checkHashMapEntry(){
        HashMap<String,String> map=new HashMap<>();
        map.put("A","a");
        map.put("B","b");
        map.put("C","c");
        map.put("D","d");
        Set<Map.Entry<String,String>> entries=map.entrySet();
        for (Map.Entry<String, String> entry :
                entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
