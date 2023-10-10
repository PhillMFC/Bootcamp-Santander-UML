package domain.Phone;

import java.util.ArrayList;

public class Phone {

    private ArrayList<Contact> contacts;
    private ArrayList<Call> calls;
    private ArrayList<VoiceMail> voiceMails;
    private ArrayList<Message> messages;

    public Phone( ArrayList<Contact> contacts, ArrayList<Call> calls, ArrayList<VoiceMail> voiceMails, ArrayList<Message> messages ) {
        this.calls = calls;
        this.contacts = contacts;
        this.messages = messages;
        this.voiceMails = voiceMails;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public ArrayList<Call> getCalls() {
        return calls;
    }

    public ArrayList<VoiceMail> getVoiceMails() {
        return voiceMails;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }    
}
