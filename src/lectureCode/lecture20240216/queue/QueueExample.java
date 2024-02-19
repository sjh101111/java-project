package lectureCode.lecture20240216.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Member> queue = new LinkedList<>();
        queue.offer(new Member("가"));
        queue.offer(new Member("나"));
        queue.offer(new Member("다"));

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println("===========");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println("===========");
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());



    }
}
