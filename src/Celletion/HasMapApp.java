package Celletion;

import java.util.HashMap;
import java.util.Map;

public class HasMapApp {
    public static void main(String[] args) {

        Map<String,String> map=new HashMap<>();

        map.put("name.first","wanda");
        map.put("name.midel","ganteng");
        map.put("name.last","aminn");

        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.midel"));
        System.out.println(map.get("name.last"));


    }
}
