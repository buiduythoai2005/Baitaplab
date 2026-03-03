package com.example.bai4nangcao;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText edtHoTen, edtNgayCong;
    private Spinner spnChucVu;
    private CheckBox cbTangCa;
    private Button btnTinhLuong;
    private TextView tvKetQua;

    private String[] listChucVu = {"Giám đốc", "Trưởng phòng", "Nhân viên"};
    private long[] luongCoBan = {20000000, 15000000, 10000000};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setupSpinner();

        btnTinhLuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhLuong();
            }
        });
    }

    private void initViews() {
        edtHoTen = findViewById(R.id.edtHoTen);
        edtNgayCong = findViewById(R.id.edtNgayCong);
        spnChucVu = findViewById(R.id.spnChucVu);
        cbTangCa = findViewById(R.id.cbTangCa);
        btnTinhLuong = findViewById(R.id.btnTinhLuong);
        tvKetQua = findViewById(R.id.tvKetQua);
    }

    private void setupSpinner() {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, listChucVu);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnChucVu.setAdapter(adapter);
    }

    private void tinhLuong() {
        String hoTen = edtHoTen.getText().toString().trim();
        String sNgayCong = edtNgayCong.getText().toString().trim();

        if (hoTen.isEmpty() || sNgayCong.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
            return;
        }

        int ngayCong = Integer.parseInt(sNgayCong);
        if (ngayCong < 20) {
            Toast.makeText(this, "Cảnh báo: Số ngày công ít hơn 20 ngày!", Toast.LENGTH_LONG).show();
        }

        int index = spnChucVu.getSelectedItemPosition();
        long baseSalary = luongCoBan[index];
        long phuCapTangCa = cbTangCa.isChecked() ? 500000 : 0;

        // Giả sử lương tính theo: Lương CB + Tăng ca
        // Hoặc có thể là (Lương CB / 26) * ngayCong + Tăng ca. 
        // Đề bài nói "Lương cơ bản theo chức vụ" và "Tăng ca + 500.000", tôi sẽ cộng dồn.
        long tongLuong = baseSalary + phuCapTangCa;

        DecimalFormat df = new DecimalFormat("###,###,### VNĐ");
        String ketQua = "NHÂN VIÊN: " + hoTen + "\n" +
                "Chức vụ: " + listChucVu[index] + "\n" +
                "Số ngày công: " + ngayCong + "\n" +
                "Tăng ca: " + (cbTangCa.isChecked() ? "Có" : "Không") + "\n" +
                "---------------------------\n" +
                "TỔNG LƯƠNG: " + df.format(tongLuong);

        tvKetQua.setText(ketQua);

        // Nếu lương > 20 triệu -> đổi màu TextView sang màu đỏ
        if (tongLuong > 20000000) {
            tvKetQua.setTextColor(Color.RED);
        } else {
            tvKetQua.setTextColor(Color.BLACK);
        }
    }
}