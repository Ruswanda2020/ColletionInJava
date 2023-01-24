package Celletion;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeApp {
    public static void main(String[] args) {

        Deque<String> stack=new ArrayDeque<>();

        stack.offerFirst("wanda");
        stack.offerFirst("samsudin");
        stack.offerFirst("imam");

        System.out.println(stack.pollFirst());
        System.out.println(stack.pollFirst());
        System.out.println(stack.pollFirst());
        System.out.println("=============");

        Queue<String> queue=new LinkedList<>();
        stack.offerLast("wanda");
        stack.offerLast("samsudin");
        stack.offerLast("imam");

        System.out.println(stack.pollFirst());
        System.out.println(stack.pollFirst());
        System.out.println(stack.pollFirst());



    }
}
