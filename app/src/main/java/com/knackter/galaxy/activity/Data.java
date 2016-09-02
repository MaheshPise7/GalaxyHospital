package com.knackter.galaxy.activity;

import com.knackter.galaxy.R;
import com.knackter.galaxy.model.ModelInfo;

import java.util.ArrayList;

/**
 * Created by MAHESH on 27-Aug-16.
 */

public class Data {

    public static ArrayList<ModelInfo>  getData(){

        ArrayList<ModelInfo> data = new ArrayList<>();
        int [] images ={

                R.drawable.f,
                R.drawable.g,
                R.drawable.d,
                R.drawable.e,
                R.drawable.download,
                R.drawable.h,
        };

        String[] categories = {"Galaxy1","Galaxy2","Galaxy3","Galaxy4","Galaxy5","Galaxy6"};

        for (int i=0; i<images.length; i++) {
            ModelInfo current = new ModelInfo();
            current.imageId = images[i];
            current.title = categories[i];

            data.add(current);
        }

        return data;
    }
}
