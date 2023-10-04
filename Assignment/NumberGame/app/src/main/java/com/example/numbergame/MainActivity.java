package com.example.numbergame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2, text3;
    Button number1, number2;
    View mainLayout;

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
        mainLayout = findViewById(R.id.mainLayout);

        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value1 = Integer.parseInt(number1.getText().toString());
                int value2 = Integer.parseInt(number2.getText().toString());

                if (value1 > value2) {
                    score++;
                    Toast.makeText(MainActivity.this, "Correct! You earned a point.", Toast.LENGTH_SHORT).show();
                    mainLayout.setBackgroundColor(Color.GREEN);
                } else {
                    score--;
                    Toast.makeText(MainActivity.this, "Wrong! You lost a point.", Toast.LENGTH_SHORT).show();
                    mainLayout.setBackgroundColor(Color.RED);
                }

                updateScore();
                generateRandomNumbers();
            }
        });

        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value1 = Integer.parseInt(number1.getText().toString());
                int value2 = Integer.parseInt(number2.getText().toString());

                if (value2 > value1) {
                    score++;
                    Toast.makeText(MainActivity.this, "Correct! You earned a point.", Toast.LENGTH_SHORT).show();
                    mainLayout.setBackgroundColor(Color.GREEN);
                } else {
                    score--;
                    Toast.makeText(MainActivity.this, "Wrong! You lost a point.", Toast.LENGTH_SHORT).show();
                    mainLayout.setBackgroundColor(Color.RED);
                }

                updateScore();
                generateRandomNumbers();
            }
        });

        generateRandomNumbers();
    }

    private void generateRandomNumbers() {
        Random random = new Random();
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);

        number1.setText(String.valueOf(num1));
        number2.setText(String.valueOf(num2));

    }

    private void updateScore() {
        text3.setText("Score: " + score);
    }
}
