package com.example.broadcastreceiver;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

public class BatteryReceiver extends BroadcastReceiver {
    TextView tvSystem;
    TextView tvUserInput;
    String percentageBattery;
    BatteryReceiver(TextView tv, String percentageBattery, TextView txtBatteryPerFromUser){
        this.tvSystem=tv;
        this.percentageBattery=percentageBattery;
        this.tvUserInput=txtBatteryPerFromUser;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onReceive(Context context, Intent intent) {
        int percentage=intent.getIntExtra("level",0);
        if(percentage!=0){
            tvSystem.setText("Percentage received from broadcast : "+percentage+ "%");
            tvUserInput.setText("Users Entered percentage : "+percentageBattery+ "%");

        }
    }
}
