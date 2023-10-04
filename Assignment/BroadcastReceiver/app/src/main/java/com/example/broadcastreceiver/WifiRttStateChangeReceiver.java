package com.example.broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.net.wifi.rtt.WifiRttManager;
import android.os.Bundle;

import com.example.broadcastreceiver.databinding.ActivityWifiRttStateChangeReceiverBinding;

public class WifiRttStateChangeReceiver extends AppCompatActivity {
    ActivityWifiRttStateChangeReceiverBinding binding;
    WifiReceivier wifiReceivier;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityWifiRttStateChangeReceiverBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        wifiReceivier = new WifiReceivier(binding.txtWiftStateChange);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(WifiManager.WIFI_STATE_CHANGED_ACTION);
        registerReceiver(wifiReceivier, intentFilter);
        
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(wifiReceivier);
    }
}