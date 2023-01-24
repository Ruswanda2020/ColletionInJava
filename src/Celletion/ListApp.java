package Celletion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<String> stringList=new LinkedList<>();
        //List<String>stringList=new ArrayList<>();

        stringList.add("wanda");
        stringList.add("dika");
        stringList.add("alif");

        stringList.set(0,"adi");
        stringList.remove(1);
        System.out.println(stringList.get(0));

        for (var value:stringList){
            System.out.println(value);
        }

    }
}
