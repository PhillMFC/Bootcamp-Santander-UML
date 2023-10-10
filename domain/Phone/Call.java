package domain.Phone;

import java.time.LocalDate;
import java.util.ArrayList;

public class Call {

    private ArrayList<Contact> contacts;
    private String durantion;
    private LocalDate callDate;

    public Call(ArrayList<Contact> contacts, LocalDate callDate) {
        this.contacts = contacts;
        this.callDate = callDate;
    }

    public void answerCall(){
        
    }

    public void holdCall(){
        
    }

    public void endCall(){
        
    }

    public Call mergeCall(ArrayList<Contact> contacts, LocalDate callDate){
        return new Call(contacts, callDate);
    }

    public ArrayList<Contact> getContact() {
        return contacts;
    }

    public String getDurantion() {
        return durantion;
    }

    public LocalDate getCallDate() {
        return callDate;
    }

    public void setDuration(String duration) {
        this.durantion = duration;
    }
}
