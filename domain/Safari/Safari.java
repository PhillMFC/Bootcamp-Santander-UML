package domain.Safari;

import java.util.ArrayList;

public class Safari{

    ArrayList<Tab> openTabs;

    public Safari(ArrayList<Tab> openTabs){
        this.openTabs = openTabs;
    }    

    public void closeTab(Tab tab) {
        openTabs.remove(tab);
    }
}
