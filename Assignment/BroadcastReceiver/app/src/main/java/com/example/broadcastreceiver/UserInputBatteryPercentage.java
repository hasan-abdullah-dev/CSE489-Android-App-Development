package com.example.broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.broadcastreceiver.databinding.ActivityUserInputBatteryPercentageBinding;

public class UserInputBatteryPercentage extends AppCompatActivity {
    ActivityUserInputBatteryPercentageBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityUserInputBatteryPercentageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnFinalPageOfBatteryPerGuider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(UserInputBatteryPercentage.this, BatteryBroadcastReceiver.class);
                intent.putExtra("key", binding.txtUserBatteryPercentInput.getText().toString());
                startActivity(intent);
            }
        });



    }
}