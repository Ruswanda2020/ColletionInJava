package Celletion;

import java.util.EnumMap;
import java.util.Map;
import java.util.logging.Level;

public class EnumHasmapApp {

    public static enum Level{
        FREE,STANDAR,PREMIUM,VIP
    }
    public static void main(String[] args) {

        Map<Level,String> map=new EnumMap<>(Level.class);
        map.put(Level.FREE,"ruswanda");
        map.put(Level.STANDAR,"dika");
        map.put(Level.PREMIUM,"alif");
        map.put(Level.VIP,"wandi");

        for (var maps:map.entrySet()){
            System.out.println(maps);
        }


    }
}
