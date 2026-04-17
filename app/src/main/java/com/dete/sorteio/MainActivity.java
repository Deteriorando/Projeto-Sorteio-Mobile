package com.dete.sorteio;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button2);
        final TextView textView = findViewById(R.id.number);

        button.setOnClickListener(v -> {
            Random random = new Random();
            int number = random.nextInt(100);
            textView.setText(String.valueOf(number));
        });
    }
}