package domain.OS;

import java.util.ArrayList;
import java.util.List;

import domain.Ipod.Ipod;
import domain.Phone.Phone;
import domain.Safari.Safari;

public class OS {
    private static List<Object> Apps = new ArrayList<Object>();
    private static Phone phone = new Phone(null, null, null, null);
    private static Ipod ipod = new Ipod(null, null, null);
    private static Safari safari = new Safari(null);

    public static void main(String[] args){
   
        Apps.add(phone);
        Apps.add(ipod);
        Apps.add(safari);
    }
}
