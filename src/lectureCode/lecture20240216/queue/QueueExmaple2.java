package lectureCode.lecture20240216.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExmaple2 {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();
        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSms", "제니"));
        messageQueue.offer(new Message("sendKakaoTalk", "리사"));

        System.out.println(messageQueue);

//        홍길동에게 메일을 보냅니다.
//                제니에게 SMS를 보냅니다.
//        리사에게 카톡을 보냅니다.
        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            String command = message.getCommand();
            switch (command) {
                case "sendMail" -> System.out.println(message.getTo() + "메일을 보냅니다.");
//                        위는 new switch expression
//                   같은 의미  :System.out.println(message.getTo() + "메일을 보냅니다");
//                    break;
                case "sendSms" -> System.out.println(message.getTo() + "에게 문자를 보냅니다");
                case "sendKakaoTalk" -> System.out.println(message.getTo() + "에게 카톡을 보냅니다.");
            }
        }
    }
}

