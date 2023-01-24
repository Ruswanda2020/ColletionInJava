package Celletion;

import Celletion.Data.Person;
import Celletion.Data.PersonComparator;

import java.util.Collection;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args){
                                                        //reversed() mrthod untuk mrngurutkan nama agar desending

        SortedSet<Person> people=new TreeSet<>(new PersonComparator());
        people.add(new Person("wanda"));
        people.add(new Person("ADI"));
        people.add(new Person("DENDI"));

        for (var person:people){
            System.out.println(person.getName());
        }
        SortedSet<Person>personSortedSet= Collections.unmodifiableSortedSet(people);
        //ini EROR
        //personSortedSet.add(new Person("wanda"));

    }
}
