package com.example.bai1nangcao;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    private TextView tvFullName, tvEmail, tvGender, tvHobbies;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvFullName = findViewById(R.id.tvResultFullName);
        tvEmail = findViewById(R.id.tvResultEmail);
        tvGender = findViewById(R.id.tvResultGender);
        tvHobbies = findViewById(R.id.tvResultHobbies);
        btnBack = findViewById(R.id.btnBack);

        Intent intent = getIntent();
        if (intent != null) {
            tvFullName.setText("Họ tên: " + intent.getStringExtra("fullName"));
            tvEmail.setText("Email: " + intent.getStringExtra("email"));
            tvGender.setText("Giới tính: " + intent.getStringExtra("gender"));
            tvHobbies.setText("Sở thích: " + intent.getStringExtra("hobbies"));
        }

        btnBack.setOnClickListener(v -> finish());
    }
}