package com.example.android.healthdroid;

import java.util.ArrayList;

/**
 * Created by TanmayDas on 01-10-2016.
 */
public class Policy {
    public String head;
    public String info;
    public String obj;
    public String img;
    public String link;

    public Policy(String name ) {
        this.head = name;
    }



    public static ArrayList<Policy> getPolicy() {
        ArrayList<Policy> policy = new ArrayList<Policy>();
        Policy item = new Policy("Mission Indradhanush");
        item.info ="Mission Indradhanush was launched by Ministry of Health and Family Welfare (MOHFW) Government of India on 25th December, 2014. The objective of this mission is to ensure that all children under the age of two years as well as pregnant women are fully immunized with seven vaccine preventable diseases.\n" +
                "The Mission Indradhanush, depicting seven colours of the rainbow, targets to immunize all children against seven vaccine preventable diseases, namely:\n" +
                "1.\tDiphtheria\n" +
                "2.\tPertussis (Whooping Cough)\n" +
                "3.\tTetanus\n" +
                "4.\tTuberculosis\n" +
                "5.\tPolio\n" +
                "6.\tHepatitis B\n" +
                "7.\tMeasles.\n";
        item.obj = "The aim is to achieve full immunization in 352 districts which includes 279 mid priority districts, 33 districts from the North East states and 40 districts from phase one where huge number of missed out children were detected.";
        item.img = "ic_indradhanush";
        item.link = "www.missionindradhanush.in";

        policy.add(item);
        return policy;
    }

}
