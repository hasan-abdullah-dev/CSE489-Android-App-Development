package com.example.broadcastreceiver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Broadcast Started", Toast.LENGTH_SHORT).show();
        Intent broadcastIntent = new Intent("com.example.MY_CUSTOM_ACTION");
        broadcastIntent.putExtra("message", "Hello, world!");
        sendBroadcast(broadcastIntent);

        return START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
