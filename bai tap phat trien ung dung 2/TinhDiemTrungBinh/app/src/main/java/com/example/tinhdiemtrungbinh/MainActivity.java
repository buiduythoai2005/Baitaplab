package com.example.tinhdiemtrungbinh;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText edtToan, edtVan, edtAnh;
    Button btnTinh, btnXoa, btnHienThi;
    TextView txtKetQua;

    double diemTrungBinh = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ
        edtToan = findViewById(R.id.edtToan);
        edtVan = findViewById(R.id.edtVan);
        edtAnh = findViewById(R.id.edtAnh);

        btnTinh = findViewById(R.id.btnTinh);
        btnXoa = findViewById(R.id.btnXoa);
        btnHienThi = findViewById(R.id.btnHienThi);

        txtKetQua = findViewById(R.id.txtKetQua);

        // Nút Tính
        btnTinh.setOnClickListener(v -> tinhDiem());

        // Nút Hiển thị
        btnHienThi.setOnClickListener(v -> hienThiKetQua());

        // Nút Xóa
        btnXoa.setOnClickListener(v -> {
            edtToan.setText("");
            edtVan.setText("");
            edtAnh.setText("");
            txtKetQua.setText("Điểm trung bình:");
        });
    }

    private void tinhDiem() {

        if (edtToan.getText().toString().isEmpty() ||
                edtVan.getText().toString().isEmpty() ||
                edtAnh.getText().toString().isEmpty()) {

            Toast.makeText(this,
                    "Vui lòng nhập đủ điểm",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        double toan = Double.parseDouble(edtToan.getText().toString());
        double van = Double.parseDouble(edtVan.getText().toString());
        double anh = Double.parseDouble(edtAnh.getText().toString());

        // Kiểm tra hợp lệ
        if (toan < 0 || toan > 10 ||
                van < 0 || van > 10 ||
                anh < 0 || anh > 10) {

            Toast.makeText(this,
                    "Điểm không hợp lệ (0–10)",
                    Toast.LENGTH_LONG).show();
            return;
        }

        diemTrungBinh = (toan + van + anh) / 3;
    }

    private void hienThiKetQua() {

        if (diemTrungBinh == 0) {
            Toast.makeText(this,
                    "Vui lòng tính điểm trước",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        DecimalFormat df = new DecimalFormat("#.00");
        txtKetQua.setText("Điểm trung bình: " + df.format(diemTrungBinh));
    }
}