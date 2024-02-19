package lectureCode.lecture20240216.queue;

public class Message {
    private String command;
    private String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }

    public String getCommand() {
        return command;
    }

    public String getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "Message{" +
                "command='" + command + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}
