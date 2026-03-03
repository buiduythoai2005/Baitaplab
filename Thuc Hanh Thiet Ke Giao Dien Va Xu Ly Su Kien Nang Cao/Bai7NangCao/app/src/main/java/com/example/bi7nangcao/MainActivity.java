package com.example.bi7nangcao;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edtHoTen, edtCMND, edtSoNgay;
    private RadioGroup rgLoaiPhong;
    private RadioButton rbVip, rbDouble, rbSingle;
    private CheckBox cbAnSang, cbGiatUi;
    private Button btnDatPhong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        btnDatPhong.setOnClickListener(v -> handleBooking());
    }

    private void initViews() {
        edtHoTen = findViewById(R.id.edtHoTen);
        edtCMND = findViewById(R.id.edtCMND);
        edtSoNgay = findViewById(R.id.edtSoNgay);
        rgLoaiPhong = findViewById(R.id.rgLoaiPhong);
        rbVip = findViewById(R.id.rbVip);
        rbDouble = findViewById(R.id.rbDouble);
        rbSingle = findViewById(R.id.rbSingle);
        cbAnSang = findViewById(R.id.cbAnSang);
        cbGiatUi = findViewById(R.id.cbGiatUi);
        btnDatPhong = findViewById(R.id.btnDatPhong);
    }

    private void handleBooking() {
        String hoTen = edtHoTen.getText().toString();
        String cmnd = edtCMND.getText().toString();
        String soNgayStr = edtSoNgay.getText().toString();

        if (hoTen.isEmpty() || cmnd.isEmpty() || soNgayStr.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
            return;
        }

        int soNgay = Integer.parseInt(soNgayStr);
        double donGiaPhong = 0;
        String loaiPhong = "";

        if (rbVip.isChecked()) {
            donGiaPhong = 1000;
            loaiPhong = "VIP";
        } else if (rbDouble.isChecked()) {
            donGiaPhong = 500;
            loaiPhong = "Double";
        } else if (rbSingle.isChecked()) {
            donGiaPhong = 300;
            loaiPhong = "Single";
        }

        double tienPhong = donGiaPhong * soNgay;
        if (soNgay > 5) {
            tienPhong *= 0.9; // Giảm 10%
        }

        double tienDichVu = 0;
        StringBuilder dichVu = new StringBuilder();
        if (cbAnSang.isChecked()) {
            tienDichVu += 100;
            dichVu.append("- Ăn sáng (100)\n");
        }
        if (cbGiatUi.isChecked()) {
            tienDichVu += 50;
            dichVu.append("- Giặt ủi (50)\n");
        }

        double tongTien = tienPhong + tienDichVu;

        StringBuilder bill = new StringBuilder();
        bill.append("Khách hàng: ").append(hoTen).append("\n");
        bill.append("CMND: ").append(cmnd).append("\n");
        bill.append("Loại phòng: ").append(loaiPhong).append("\n");
        bill.append("Số ngày ở: ").append(soNgay).append("\n");
        bill.append("Dịch vụ thêm:\n").append(dichVu.length() > 0 ? dichVu.toString() : "Không có\n");
        bill.append("----------------------------\n");
        bill.append("TỔNG TIỀN: ").append(tongTien).append(" USD");

        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("bill", bill.toString());
        startActivity(intent);
    }
}