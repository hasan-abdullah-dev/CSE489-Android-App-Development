package com.example.broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Toast;

import com.example.broadcastreceiver.databinding.ActivityBatteryBroadcastReceiverBinding;

public class BatteryBroadcastReceiver extends AppCompatActivity {
    ActivityBatteryBroadcastReceiverBinding binding;
    BatteryReceiver batteryReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityBatteryBroadcastReceiverBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String percentageBattery = getIntent().getStringExtra("key");

        batteryReceiver=new BatteryReceiver(binding.txtDisplayBatteryPerSystem,percentageBattery,binding.txtBatteryPerFromUser);
        registerReceiver(batteryReceiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));



    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(batteryReceiver);
    }
}