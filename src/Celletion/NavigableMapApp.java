package Celletion;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {

        NavigableMap<String,String> map=new TreeMap<>();
        map.put("wanda","wanda");
        map.put("wandi","wandi");
        map.put("wandu","wandu");

        for (var key:map.keySet()){
            System.out.println(key);
        }

        System.out.println("===================");
        System.out.println(map.lowerKey("wandi"));
        System.out.println(map.higherKey("wanda"));
        System.out.println("====================");

        NavigableMap<String,String> mapdecs=map.descendingMap();
        for (var key:mapdecs.keySet()){
            System.out.println(key);
        }

        NavigableMap<String,String> empty= Collections.emptyNavigableMap();
        NavigableMap<String,String> immutable=Collections.unmodifiableNavigableMap(mapdecs);

        //this EROR because immutable has been set as unmodifiableNavigableMap
       // immutable.put("wanda","wanda");

    }
}
