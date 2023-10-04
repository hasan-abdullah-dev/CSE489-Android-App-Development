package com.example.broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.Bundle;

import com.example.broadcastreceiver.databinding.ActivityCustomBroadcastReceiverBinding;

public class CustomBroadcastReceiver extends AppCompatActivity {
    ActivityCustomBroadcastReceiverBinding binding;
    CustomReceiver customReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCustomBroadcastReceiverBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        String Value = intent.getStringExtra("key");

        IntentFilter intentFilter = new IntentFilter("com.example.MY_CUSTOM_ACTION");
        customReceiver =new CustomReceiver(binding.receivedCustomText);
        registerReceiver(customReceiver, intentFilter);

        binding.receivedCustomText.setText(Value);




    }

}