package com.biolerplate.android.util;

import com.google.gson.Gson;

/**
 * Created by vJ on 2/8/17.
 */

public class GsonUtils {

    private static Gson gson;

    public static Gson getGson(){
        if(gson == null){
            gson = new Gson();
        }
        return gson;
    }


}
