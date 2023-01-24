package Celletion;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ColletionsDefultMethodApp {


    public static void main(String[] args) {

        List<Integer> numbers=new ArrayList<>();
        for (int i = 1; i <=10; i++) {
            numbers.add(i);

        }
        numbers.replaceAll(new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        });
        System.out.print(numbers);

        for (var number:numbers){
            System.out.println(number);
        }

        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);

            }
        });

        numbers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer<5;
            }
        });
        System.out.println(numbers);
    }
}
