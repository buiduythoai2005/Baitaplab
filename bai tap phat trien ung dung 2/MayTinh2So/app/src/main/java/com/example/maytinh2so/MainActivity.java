package com.example.maytinh2so;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText edtSo1, edtSo2;
    Button btnCong, btnTru, btnNhan, btnChia, btnXoa;
    TextView txtKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ
        edtSo1 = findViewById(R.id.edtSo1);
        edtSo2 = findViewById(R.id.edtSo2);

        btnCong = findViewById(R.id.btnCong);
        btnTru = findViewById(R.id.btnTru);
        btnNhan = findViewById(R.id.btnNhan);
        btnChia = findViewById(R.id.btnChia);
        btnXoa = findViewById(R.id.btnXoa);

        txtKetQua = findViewById(R.id.txtKetQua);

        // Nút Cộng
        btnCong.setOnClickListener(v -> tinhToan("+"));

        // Nút Trừ
        btnTru.setOnClickListener(v -> tinhToan("-"));

        // Nút Nhân
        btnNhan.setOnClickListener(v -> tinhToan("*"));

        // Nút Chia
        btnChia.setOnClickListener(v -> tinhToan("/"));

        // Nút Xóa
        btnXoa.setOnClickListener(v -> {
            edtSo1.setText("");
            edtSo2.setText("");
            txtKetQua.setText("Kết quả:");
        });
    }

    private void tinhToan(String phepTinh) {

        if (edtSo1.getText().toString().isEmpty() ||
                edtSo2.getText().toString().isEmpty()) {

            Toast.makeText(this, "Vui lòng nhập đủ 2 số", Toast.LENGTH_SHORT).show();
            return;
        }

        double so1 = Double.parseDouble(edtSo1.getText().toString());
        double so2 = Double.parseDouble(edtSo2.getText().toString());
        double ketQua = 0;

        switch (phepTinh) {
            case "+":
                ketQua = so1 + so2;
                break;
            case "-":
                ketQua = so1 - so2;
                break;
            case "*":
                ketQua = so1 * so2;
                break;
            case "/":
                if (so2 == 0) {
                    Toast.makeText(this,
                            "Không thể chia cho 0",
                            Toast.LENGTH_LONG).show();
                    return;
                }
                ketQua = so1 / so2;
                break;
        }

        txtKetQua.setText("Kết quả: " + ketQua);
    }
}