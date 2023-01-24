package Celletion;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class MapDefutlApp {
    public static void main(String[] args) {

        Map<String,String>map=new TreeMap<>();
        map.put("firsname","rus");
        map.put("middelname","wanda");
        map.put("lastame","dirgantara");

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+":"+value);
            }
        });
    }
}
