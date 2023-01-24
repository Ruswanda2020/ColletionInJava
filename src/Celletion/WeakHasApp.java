package Celletion;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHasApp {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new WeakHashMap<>(10000000);
        for (var i=0;i<1_000_000;i++){
            map.put(i,i);
        }
        System.gc();

        System.out.println(map.size());
    }
}
