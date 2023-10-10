package domain.Phone;

import java.time.LocalDate;

public class VoiceMail {

    private Object voiceMail;
    private Contact sender;
    private LocalDate date;
    private String duration;

    public VoiceMail(Object voiceMail, Contact sender, LocalDate date, String duration) {
        this.voiceMail = voiceMail;
        this.sender = sender;
        this.date = date;
        this.duration = duration;
    }

    public Object getVoiceMail() {
        return voiceMail;
    }

    public Contact getSender() {
        return sender;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDuration() {
        return duration;
    }
}
