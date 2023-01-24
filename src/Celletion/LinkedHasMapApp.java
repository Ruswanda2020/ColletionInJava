package Celletion;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHasMapApp {
    public static void main(String[] args) {

        Map<String ,String> map=new LinkedHashMap<>();

        map.put("first.name","ruswanda");
        map.put("middel.name","dirgantara");
        map.put("last.name","amin");

        for (var key:map.keySet()){
            System.out.println(key);
        }
    }
}
