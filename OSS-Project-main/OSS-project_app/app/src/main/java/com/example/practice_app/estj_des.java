package com.example.practice_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class estj_des extends AppCompatActivity {

    private Button estj_btn_return;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estj_des);

        estj_btn_return = findViewById(R.id.estj_btn_return);
        estj_btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(estj_des.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}