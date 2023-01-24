package Celletion;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetApp {
    public static enum gender{
        MALE,FEMAEL,NOT_METION

    }
    public static void main(String[] args) {

       // EnumSet<gender>genders=EnumSet.allOf(gender.class);
        Set<gender> genders=EnumSet.of(gender.MALE,gender.FEMAEL);
        for (var gander:genders){
            System.out.println(gander);
        }
    }
}
