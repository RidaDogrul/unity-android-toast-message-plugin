package com.example.unityplugin;

import android.app.Activity;
import android.widget.Toast;

public class PluginInstance {

    public int Add(int i, int j){
        return i+j;
    }

    private static Activity unityActivity;

    public static  void receiveUnityActivity(Activity tActivity){
        unityActivity = tActivity;
    }

    public void Toast(String massage){
        Toast.makeText(unityActivity, massage, Toast.LENGTH_SHORT).show();
    }
}
