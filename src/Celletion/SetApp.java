package Celletion;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {

       // Set<String> names=new HashSet<>();
        Set<String> names=new LinkedHashSet<>();
        names.add("wanda");
        names.add("rosal");
        names.add("vito");
        names.add("wanda");
        names.add("rosal");
        names.add("vito");

        for (var name:names){
            System.out.println(name);
        }
    }
}
