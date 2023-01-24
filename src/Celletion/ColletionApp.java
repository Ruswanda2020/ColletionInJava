package Celletion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ColletionApp {
    public static void main(String[] args) {

        Collection<String >collection=new ArrayList<>();
        collection.add("wanda");
        collection.add("indra");
        collection.add("dika");
        collection.addAll(List.of("alvito","alif","rosal"));

        for (var name:collection){
            System.out.println(name);
        }
        System.out.println("================");

        collection.remove("wanda");
        collection.remove("indra");
        collection.removeAll(List.of("alvito","alif"));

        for (var name:collection){
            System.out.println(name);
        }

        System.out.println(collection.contains("dika"));
        System.out.println(collection.containsAll(List.of("rosal")));
        System.out.println(collection.size());

    }
}
