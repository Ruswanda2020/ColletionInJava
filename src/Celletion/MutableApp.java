package Celletion;

import Celletion.Data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {

        Person person=new Person("wanda");
        person.addhobby("mainbola");
        person.addhobby("ngoding");
        System.out.println(person.getName());
        doSomethingWithHobbies(person.getHobbies());


        for (var hobby:person.getHobbies()){
            System.out.println(hobby);


        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies){
        hobbies.add("bukan hobbi");

    }
}
