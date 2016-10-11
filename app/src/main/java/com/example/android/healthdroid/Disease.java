package com.example.android.healthdroid;

import java.util.ArrayList;

/**
 * Created by TanmayDas on 01-10-2016.
 */
public class Disease {
    public String head;
    public String symptoms;
    public String causes;
    public String treat;
    public String prevent;
    //public String Link;

    public Disease(String name ) {

        this.head = name;

    }



    public static ArrayList<Disease> getDisease() {
        ArrayList<Disease> dis = new ArrayList<Disease>();
        Disease item = new Disease("Chikungunya");
        item.symptoms = "high fever\n" +
                "depression\n" +
                "fatigue\n" +
                "a headache\n" +
                "muscle pain\n" +
                "a rash\n";
        item.causes = "Two mosquito species, Aedes aegypti and Aedes albopictus, are carriers of the chikungunya virus. These mosquito types are most common in the southeastern United States and tend to bite people in the daytime. A mosquito can transmit the virus by biting a person. The virus then multiplies rapidly in the blood.\n" +
                "Mosquitoes also transmit viruses such as dengue and West Nile. The chikungunya virus is more likely to infect a person than other mosquito-transmitted viruses. After a bite by a carrier mosquito, 72 to 97 percent of people will experience symptoms, according to CIDRAP.\n";
        item.treat = "A cure for chikungunya isn’t available. \n" +
                "As with the flu and other similar viruses, treatment focuses on keeping you as comfortable as possible and reducing your pain. Nonsteroidal anti-inflammatory drugs, such as ibuprofen and acetaminophen, and other over-the-counter medications that don’t contain aspirin, are usually recommended. Your doctor may prescribe pain medication if the pain is severe. \n";
        item.prevent = "Avoid collections of standing water, such as stagnant ponds, and even flowerpots that have collected rain.\n" +
                "Use screens, windows, and doors to keep mosquitoes out of the house, and sleep with a mosquito net over your bed to prevent mosquitoes from biting you while you sleep.\n" +
                "Wear pants and long-sleeved shirts when you’re outside.\n" +
                "Apply insect repellants that contain deet, picaridin, IR3535, oil of lemon eucalyptus, or para-menthane-diol, to protect against mosquitoes\n" +
                "Treat your clothes with permethrin or buy permethrin-treated clothes to protect against mosquito bites.\n" +
                "Avoid spending a lot of time outdoors during the day in areas where chikungunya is prevalent. Mosquitoes tend to bite in the daytime.\n";

        dis.add(item);
        return dis;
    }

}
