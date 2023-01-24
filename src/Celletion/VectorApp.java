package Celletion;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {

        List<String> list=new Vector<>();
        list.add("rus");
        list.add("wanda");
        list.add("dirgantara");

        for (var name:list){
            System.out.println(name);
        }
    }
}
