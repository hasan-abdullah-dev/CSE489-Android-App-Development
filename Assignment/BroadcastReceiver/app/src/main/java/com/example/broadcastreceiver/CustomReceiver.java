package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {


    TextView tv;
    public CustomReceiver(TextView receivedCustomText) {
        this.tv=receivedCustomText;

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Toast.makeText(context, "Broadcast Received", Toast.LENGTH_SHORT).show();

    }
}
