package Celletion;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpiltratorApp {
    public static void main(String[] args) {
        List<String>list=List.of("rus","wanda","dirgantara","progremmer","zaman","ayena");

        Spliterator<String>spliterator1= list.spliterator();
        Spliterator<String>spliterator2=spliterator1.trySplit();
        Spliterator<String>spliterator3=spliterator2.trySplit();

        System.out.println(spliterator1.estimateSize());
        System.out.println(spliterator2.estimateSize());
        System.out.println(spliterator3.estimateSize());

        spliterator1.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        spliterator2.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        spliterator3.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("===");
                System.out.println(s);
            }
        });
    }
}
