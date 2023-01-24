package Celletion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColletionApps {
    public static void main(String[] args) {

        List<String> name=new ArrayList<>();
        name.addAll(List.of("rus","wanda","dirgartra","kumolowongso"));
        System.out.println(name);

        Collections.reverse(name);
        System.out.println(name);

        Collections.shuffle(name);
        System.out.println(name);


    }
}
