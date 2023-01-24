package Celletion;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {

        Stack<String>stack=new Stack<>();
        stack.push("wanda ");
        stack.push("wandi");
        stack.push("wandu");
        stack.push("wande");
        stack.push("wando");

        for (var value =stack.pop();value!=null;value=stack.pop()){
            System.out.println(value);
        }
    }
}
