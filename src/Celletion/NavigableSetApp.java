package Celletion;

import java.security.SecureRandom;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names= new TreeSet<>();
        boolean addAll = names.addAll(Set.of("wanda", "hamidah", "sukabumi", "progremmer"));

        NavigableSet<String> nameRivers=names.descendingSet();
                                            //headset
        NavigableSet<String> sukabumi=names.tailSet("sukabumi",true);

        for (var name:sukabumi){
            System.out.println(name);
        }

        NavigableSet<String> imutable= Collections.unmodifiableNavigableSet(names);

        //INI EROR
         //imutable.add("eka");
    }
}
