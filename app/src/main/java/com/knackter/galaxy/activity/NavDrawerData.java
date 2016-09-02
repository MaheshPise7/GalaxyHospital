package com.knackter.galaxy.activity;

import com.knackter.galaxy.R;
import com.knackter.galaxy.model.NavDrawerItem;

import java.util.ArrayList;

/**
 * Created by MAHESH on 30-Aug-16.
 */

public class NavDrawerData {
    public static ArrayList<NavDrawerItem> getData(){

        ArrayList<NavDrawerItem> data = new ArrayList<>();
        int [] images ={

                R.drawable.ic_action_home,
                R.drawable.ic_action_name,
                R.drawable.ic_action_aptmt,
                R.drawable.ic_action_contact,
                R.drawable.ic_action_abt,

        };

        String[] categories = {"Home","Health Tips","Appointment","Contact","About"};

        for (int i=0; i<images.length; i++) {
            NavDrawerItem current = new NavDrawerItem();
            current.image = images[i];
            current.title = categories[i];

            data.add(current);
        }

        return data;
    }
}
