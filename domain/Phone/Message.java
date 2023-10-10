package domain.Phone;

import java.time.LocalDate;

public class Message {

    private Contact sender;
    private String content;
    private LocalDate date;

    public Message(Contact sender, String content, LocalDate date) {
        this.sender = sender;
        this.content = content;
        this.date = date;
    }

    public Contact getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    public LocalDate getDate() {
        return date;
    }
}
