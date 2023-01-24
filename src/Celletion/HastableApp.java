package Celletion;

import java.util.Hashtable;
import java.util.Map;

public class HastableApp {
    public static void main(String[] args) {

        Map<String,String> hastable=new Hashtable<>();
        hastable.put("first name","rus");
        hastable.put("middelname","wanda");
        hastable.put("lastname","dirgantara");

        for (var name:hastable.keySet()){
            System.out.println(name);
        }
    }
}
