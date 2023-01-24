package Celletion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

public class SortingApp {
    public static void main(String[] args) {

        List<String>list=new ArrayList<>();
        list.addAll(List.of("wanda","dika","alvito","rosal","alif"));

        Collections.sort(list);

        Comparator<String>reverse=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Collections.sort(list,reverse);
        for (var name:list){
            System.out.println(name);
        }

    }
}
