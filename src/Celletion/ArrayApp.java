package Celletion;

import java.util.Arrays;
import java.util.List;

public class ArrayApp {
    public static void main(String[] args) {

        List<String> name=List.of("wanda","rus","dirgantara");
        Object[] names=name.toArray();
        String[] nama=name.toArray(new String[]{});

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(nama));

    }
}
