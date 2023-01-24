package Celletion;

import Celletion.javakoleksi.SingelQeue;

import java.util.Queue;

public class SingelQeueApp {
    public static void main(String[] args) {

        Queue<String>queue=new SingelQeue<>();
        System.out.println(queue.size());

        System.out.println(queue.offer("rus"));
        System.out.println(queue.offer("wanda"));
        System.out.println(queue.offer("dirgantara"));

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());
    }
}
