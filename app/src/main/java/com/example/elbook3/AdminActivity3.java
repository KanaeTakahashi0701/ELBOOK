package com.example.elbook3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class AdminActivity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin3);

        Button adminCategoryBtn = findViewById(R.id.categorybtn);
        Button adminHumanBtn = findViewById(R.id.humanbtn);
        Button userBtn = findViewById(R.id.userbtn);

        adminHumanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), com.example.elbook3.AdminActivity1.class);
                startActivity(intent);
            }
        });

        adminCategoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), com.example.elbook3.AdminActivity2.class);
                startActivity(intent);
            }
        });

        userBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}