package com.example.broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionMode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.broadcastreceiver.databinding.ActivityCustomBroadSenderBinding;

public class CustomBroadSender extends AppCompatActivity {
    ActivityCustomBroadSenderBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCustomBroadSenderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        binding.btnBroadcastCustom.setOnClickListener(v -> {
//            Intent customBroadcastIntent = new Intent();
//            customBroadcastIntent.setAction("com.example.MY_CUSTOM_ACTION");
//            customBroadcastIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
//            sendBroadcast(customBroadcastIntent);
//            Toast.makeText(this, "Broadcasting Started", Toast.LENGTH_SHORT).show();

            Intent serviceIntent = new Intent(CustomBroadSender.this, MyService.class);
            startService(serviceIntent);
        });

        binding.btnReceivePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CustomBroadSender.this, CustomBroadcastReceiver.class);
                intent.putExtra("key", binding.edtCustomSenderName.getText().toString());
                startActivity(intent);
            }
        });



    }
}