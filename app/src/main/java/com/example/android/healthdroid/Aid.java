package com.example.android.healthdroid;

import java.util.ArrayList;

/**
 * Created by TanmayDas on 01-10-2016.
 * For Hackathon V2 Hack for India. 
 */
public class Aid {
    public String head;
    public String data;
    //public String Link;

    public Aid(String name ) {
        this.head = name;
    }



    public static ArrayList<Aid> getAid() {
        ArrayList<Aid> Aids = new ArrayList<Aid>();
        Aid item = new Aid("Contents of a First-Aid Box");
        item.data = "Emergency telephone numbers for emergency medical services (EMS) 1092/102/108\n" +
                "Sterile gauze pads (dressings) in small and large squares to place over wounds\n" +
                "Disinfectants like dettol or savlon\n" +
                "Medicines like pain killers (ibuprofen) and antibiotics\n" +
                "Roller bandages to hold dressings in place \n" +
                "Adhesive tape\n" +
                "Adhesive bandages in assorted sizes\n" +
                "Scissors\n" +
                "Tweezers\n" +
                "Safety pins\n" +
                "Antiseptic wipes or soap\n" +
                "Thermometer\n" +
                "Barrier devices, such as a pocket mask or face shield\n";
        Aids.add(item);
        item = new Aid("Heavy Bleeding");
        item.data = "Put pressure on the wound with whatever available to stop or slow down the flow of the blood.\n" +
                "Call local emergency numbers or ask for some body help to get to hospital.\n" +
                "Keep pressure on the wound until the help arrives.\n";
        Aids.add(item);
        return Aids;
    }

}
