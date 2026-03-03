package com.example.bi7nangcao;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvResult = findViewById(R.id.tvResult);
        Button btnBack = findViewById(R.id.btnBack);

        String result = getIntent().getStringExtra("bill");
        tvResult.setText(result);

        btnBack.setOnClickListener(v -> finish());
    }
}