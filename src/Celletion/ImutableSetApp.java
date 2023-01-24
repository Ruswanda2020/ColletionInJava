package Celletion;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImutableSetApp {
    public static void main(String[] args) {
            Set<String> empty= Collections.emptySet();
            Set<String> one=Collections.singleton("wanda");

            Set<String> mutable=new HashSet<>();
            mutable.add("wanda");
            mutable.add("andi");
            Set<String> immutable=Collections.unmodifiableSet(mutable);
            Set<String> set=Set.of("wanda","andi");

             //ini Eror
            //  set.add("hamdi");
           // set.remove("wanda");
              System.out.println(set);
              System.out.println(empty);
              System.out.println(one);

    }

}
