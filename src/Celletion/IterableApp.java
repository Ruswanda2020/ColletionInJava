package Celletion;

import java.util.List;

public class IterableApp {
    public static void main(String[] args) {

       Iterable<String>names= List.of("ruswanda","hendro","dika");

       for(var name:names){
           System.out.println(name);
       }
    }
}
