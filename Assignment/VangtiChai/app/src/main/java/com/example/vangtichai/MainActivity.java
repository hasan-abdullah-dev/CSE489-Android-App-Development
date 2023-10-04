package com.example.vangtichai;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.vangtichai.databinding.ActivityMainBinding;
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;



    String currentValue = "";
    private static final String STATE_VAL = "currentValue";

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        if (savedInstanceState != null) {
            currentValue = savedInstanceState.getString(STATE_VAL);
            calculateChange();
            binding.taka1.setText(getString(R.string.tktext).concat(currentValue));
        }


        binding.button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                currentValue += "0";
                binding.taka1.setText(currentValue);
                calculateChange(currentValue);
            }
        });

        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                currentValue += "1";
                binding.taka1.setText(currentValue);
                calculateChange(currentValue);
            }
        });

        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                currentValue += "2";
                binding.taka1.setText(currentValue);
                calculateChange(currentValue);
            }
        });

        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                currentValue += "3";
                binding.taka1.setText(currentValue);
                calculateChange(currentValue);
            }
        });

        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                currentValue += "4";
                binding.taka1.setText(currentValue);
                calculateChange(currentValue);
            }
        });

        binding.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                currentValue += "5";
                binding.taka1.setText(currentValue);
                calculateChange(currentValue);
            }
        });

        binding.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                currentValue += "6";
                binding.taka1.setText(currentValue);
                calculateChange(currentValue);
            }
        });

        binding.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                currentValue += "7";
                binding.taka1.setText(currentValue);
                calculateChange(currentValue);
            }
        });

        binding.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                currentValue += "8";
                binding.taka1.setText(currentValue);
                calculateChange(currentValue);
            }
        });

        binding.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                currentValue += "9";
                binding.taka1.setText(currentValue);
                calculateChange(currentValue);
            }
        });

        binding.buttonCLR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentValue ="";
                binding.taka1.setText(currentValue);
                clear();
            }
        });

    }

    private void calculateChange() {
    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        savedInstanceState.putString(STATE_VAL, currentValue);
        super.onSaveInstanceState(savedInstanceState);
    }


    public void clear() {
        binding.text500.setText("500: 0");
        binding.text100.setText("100: 0");
        binding.text50.setText("50: 0");
        binding.text20.setText("20: 0");
        binding.text10.setText("10: 0");
        binding.text5.setText("5:  0");
        binding.text2.setText("2:  0");
        binding.text1.setText("1:  0");
    }




    private void calculateChange(String currentValue) {
        int num = Integer.parseInt(currentValue);

        if(num >=500) {
            int fiveHundred = num / 500;
            num = num % 500;
            binding.text500.setText("500: " +  String.valueOf(fiveHundred));
        }

        if (num >=100) {
            int oneHundred = num / 100;
            num = num % 100;
            binding.text100.setText("100:  "+ String.valueOf(oneHundred));
        }

        if (num >= 50) {
            int fifty = num / 50;
            num %= 50;
            binding.text50.setText("50:  "+ String.valueOf(fifty));
        }

        if (num >= 20) {
            int twenty = num / 20;
            num = num % 20;
            binding.text20.setText("20: "+ String.valueOf(twenty));
        }

        if (num >= 10) {
            int ten = num / 10;
            num = num % 10;
            binding.text10.setText("10: "+ String.valueOf(ten));
        }

        if (num >=5 ) {
            int five = num / 5;
            num = num % 5 ;
            binding.text5.setText("5: "+String.valueOf(five));
        }

        if (num >= 2) {
            int two = num / 2;
            num = num % 2;
            binding.text2.setText("2: "+ String.valueOf(two));
        }

        if (num >= 1) {
            int one = num / 1;

            binding.text1.setText("1: "+String.valueOf(one));
        }
    }
}

