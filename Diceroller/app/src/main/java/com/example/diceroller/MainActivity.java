package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView resultTextView;
    private TextView resultTextView1;
    private Button rollButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.textView);
        resultTextView1 = findViewById(R.id.textView3);
        rollButton = findViewById(R.id.button3);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rollDice();
                rollDice1();
            }
        });
    }
    private void rollDice1() {
        Random random = new Random();
        int result = random.nextInt(6) + 1;
        resultTextView1.setText(String.valueOf(result));
    }
    private void rollDice() {
        Random random = new Random();
        int result = random.nextInt(6) + 1;
        resultTextView.setText(String.valueOf(result));

    }
}
