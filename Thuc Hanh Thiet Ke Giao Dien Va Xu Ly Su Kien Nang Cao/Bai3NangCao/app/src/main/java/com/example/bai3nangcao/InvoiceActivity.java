package com.example.bai3nangcao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InvoiceActivity extends AppCompatActivity {

    private TextView tvCustomerName, tvMovie, tvShowtime, tvCombo, tvTotalPrice;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice);

        tvCustomerName = findViewById(R.id.tvCustomerName);
        tvMovie = findViewById(R.id.tvMovie);
        tvShowtime = findViewById(R.id.tvShowtime);
        tvCombo = findViewById(R.id.tvCombo);
        tvTotalPrice = findViewById(R.id.tvTotalPrice);
        btnBack = findViewById(R.id.btnBack);

        Intent intent = getIntent();
        String name = intent.getStringExtra("customer_name");
        String movie = intent.getStringExtra("movie_name");
        String showtime = intent.getStringExtra("showtime");
        boolean hasCombo = intent.getBooleanExtra("has_combo", false);
        int total = intent.getIntExtra("total_price", 0);

        tvCustomerName.setText("Khách hàng: " + name);
        tvMovie.setText("Phim: " + movie);
        tvShowtime.setText("Suất chiếu: " + showtime);
        tvCombo.setText("Combo: " + (hasCombo ? "Có (30.000đ)" : "Không"));
        tvTotalPrice.setText("Tổng tiền: " + String.format("%,d", total) + "đ");

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}