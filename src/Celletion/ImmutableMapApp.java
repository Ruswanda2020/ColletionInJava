package Celletion;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {

        Map<String, String> emty = Collections.emptyMap();
        Map<String, String> singel = Collections.singletonMap("name", "wanda");

        Map<String,String> map=new HashMap<>();
        map.put("name","ruswanda");

        Map<String,String> immutable=Collections.unmodifiableMap(map);
        Map<String,String> map1=Map.of(
                "name","wanda",
                "nim","211011400750",
                "alamat","sukabumi"
        );
        //ini EROR
        //map1.put("name","wanda");
        System.out.println(map1);
    }
}