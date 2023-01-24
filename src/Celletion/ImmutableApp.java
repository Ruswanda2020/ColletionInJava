package Celletion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {

        List<String> one= Collections.singletonList("satu");
        List<String> empty=Collections.emptyList();

        List<String> mutable=new ArrayList<>();
        mutable.add("wanda");
        mutable.add("dika");
        List<String> immutable=Collections.unmodifiableList(mutable);
    }
}
