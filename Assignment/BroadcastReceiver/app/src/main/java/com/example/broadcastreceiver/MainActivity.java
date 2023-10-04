package com.example.broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.example.broadcastreceiver.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        dropdownManager();
    }

    private void dropdownManager() {
        String items []= new String[]{
                "Custom broadcast receiver",
                "Wifi RTT state change receiver",
                "System battery notification receiver"
        };


        ArrayAdapter<String> adapter= new ArrayAdapter<>(
                MainActivity.this,
                R.layout.drop_down_text,
                items
        );

        binding.dropDownText.setAdapter(adapter);

        binding.btnProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (binding.dropDownText.getText().toString()){
                    case "Custom broadcast receiver":
                        startActivity(new Intent(MainActivity.this, CustomBroadSender.class));
                        break;
                    case "Wifi RTT state change receiver":
                        startActivity(new Intent(MainActivity.this,WifiRttStateChangeReceiver.class));
                        break;
                    case "System battery notification receiver":
                        startActivity(new Intent(MainActivity.this,UserInputBatteryPercentage.class));
                        break;
                    default:
                        break;
                }
            }
        });
    }
}