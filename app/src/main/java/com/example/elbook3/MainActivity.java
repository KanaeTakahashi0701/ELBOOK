package com.example.elbook3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.elbook3.R;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button returnButton = findViewById(R.id.button);
        Button adminButton = findViewById(R.id.adminbtn);
        Button testButton = findViewById(R.id.test);

        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), SubActivity.class);
                startActivity(intent);
            }
        });

        adminButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), com.example.elbook3.AdminActivity1.class);
                startActivity(intent);
            }
        });

        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),TestActivity.class);
                startActivity(intent);
            }
        });

/*        sendButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(),SubActivity.class);
            startActivity(intent);
        });*/
    }
}