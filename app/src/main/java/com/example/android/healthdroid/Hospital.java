package com.example.android.healthdroid;

import java.util.ArrayList;

/**
 * Created by TanmayDas on 01-10-2016.
 */
public class Hospital {
    public String head;
    public String address;
    public String contact_info;
    public String img_hos;
    public String link;
    //public String Link;

    public Hospital(String name ) {
        this.head = name;
    }



    public static ArrayList<Hospital> getHospital() {
        ArrayList<Hospital> hospi = new ArrayList<Hospital>();
        Hospital item = new Hospital("Ruban Hospital");
        item.address="19,Patliputra Colony, Near Patliputra Golamber, Patna 800013 (Bihar) India\n";
        item.contact_info="Phone no : +91 612 227 0059 , 97 , 8406003102, 8406003103\n";
        item.img_hos="ic_ruban";
        item.link=" http://www.rubanpatliputrahospital.com/";


        hospi.add(item);

        return hospi;
    }

}
