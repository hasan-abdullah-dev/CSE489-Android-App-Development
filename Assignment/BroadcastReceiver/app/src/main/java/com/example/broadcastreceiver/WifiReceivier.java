package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.widget.TextView;
import android.widget.Toast;

public class WifiReceivier extends BroadcastReceiver {

    TextView tv;
    WifiReceivier(TextView state){
        this.tv=state;
    }


    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(WifiManager.WIFI_STATE_CHANGED_ACTION)) {
            int wifiState = intent.getIntExtra(WifiManager.EXTRA_WIFI_STATE, WifiManager.WIFI_STATE_UNKNOWN);
            switch (wifiState) {
                case WifiManager.WIFI_STATE_DISABLED:
                    tv.setText("Wifi is OFF");
                    break;
                case WifiManager.WIFI_STATE_ENABLED:
                    tv.setText("Wifi is ON");
                    break;
            }
        }

    }



}
