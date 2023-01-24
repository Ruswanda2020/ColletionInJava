package Celletion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EntriApp {
    public static void main(String[] args) {

        Map<String,String> map=new HashMap<>();

        map.put("name","wanda");
        map.put("middelname","palefi");
        map.put("lastname","dirgantara");

        Set<Map.Entry<String,String>> entri=map.entrySet();

        for (var name:entri){
            System.out.println(name.getKey()+" : "+name.getValue());
        }
    }
}
