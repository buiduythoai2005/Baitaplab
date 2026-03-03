package com.example.bai9nangcao;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edtHoTen, edtMSSV;
    private CheckBox cbAndroid, cbJava, cbPython, cbWeb, cbDatabase, cbNetworking;
    private Button btnTinh, btnReset;
    private TextView tvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ View
        initViews();

        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhHocPhi();
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetForm();
            }
        });
    }

    private void initViews() {
        edtHoTen = findViewById(R.id.edtHoTen);
        edtMSSV = findViewById(R.id.edtMSSV);
        cbAndroid = findViewById(R.id.cbAndroid);
        cbJava = findViewById(R.id.cbJava);
        cbPython = findViewById(R.id.cbPython);
        cbWeb = findViewById(R.id.cbWeb);
        cbDatabase = findViewById(R.id.cbDatabase);
        cbNetworking = findViewById(R.id.cbNetworking);
        btnTinh = findViewById(R.id.btnTinh);
        btnReset = findViewById(R.id.btnReset);
        tvKetQua = findViewById(R.id.tvKetQua);
    }

    private void tinhHocPhi() {
        String hoTen = edtHoTen.getText().toString().trim();
        String mssv = edtMSSV.getText().toString().trim();

        if (hoTen.isEmpty() || mssv.isEmpty()) {
            Toast.makeText(this, getString(R.string.msg_input_empty), Toast.LENGTH_SHORT).show();
            return;
        }

        ArrayList<String> monHocDaChon = new ArrayList<>();
        if (cbAndroid.isChecked()) monHocDaChon.add(cbAndroid.getText().toString());
        if (cbJava.isChecked()) monHocDaChon.add(cbJava.getText().toString());
        if (cbPython.isChecked()) monHocDaChon.add(cbPython.getText().toString());
        if (cbWeb.isChecked()) monHocDaChon.add(cbWeb.getText().toString());
        if (cbDatabase.isChecked()) monHocDaChon.add(cbDatabase.getText().toString());
        if (cbNetworking.isChecked()) monHocDaChon.add(cbNetworking.getText().toString());

        int soMon = monHocDaChon.size();
        if (soMon == 0) {
            Toast.makeText(this, getString(R.string.msg_no_subject), Toast.LENGTH_SHORT).show();
            return;
        }

        double donGia = 500000;
        double tongTien = soMon * donGia;
        double giamGia = 0;

        // Nếu đăng ký >= 4 môn -> giảm 5%
        if (soMon >= 4) {
            giamGia = tongTien * 0.05;
        }

        double thanhTien = tongTien - giamGia;

        DecimalFormat df = new DecimalFormat("#,###");

        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.receipt_title)).append("\n");
        sb.append(getString(R.string.receipt_student)).append(hoTen).append("\n");
        sb.append(getString(R.string.receipt_mssv)).append(mssv).append("\n");
        sb.append("----------------------------\n");
        sb.append(getString(R.string.receipt_selected_subjects)).append("\n");
        for (String mon : monHocDaChon) {
            sb.append("- ").append(mon).append("\n");
        }
        sb.append("----------------------------\n");
        sb.append(getString(R.string.receipt_count)).append(soMon).append("\n");
        sb.append(getString(R.string.receipt_total)).append(df.format(tongTien)).append(" VNĐ\n");
        if (giamGia > 0) {
            sb.append(getString(R.string.receipt_discount)).append(df.format(giamGia)).append(" VNĐ\n");
        }
        sb.append(getString(R.string.receipt_final)).append(df.format(thanhTien)).append(" VNĐ");

        tvKetQua.setText(sb.toString());
    }

    private void resetForm() {
        edtHoTen.setText("");
        edtMSSV.setText("");
        cbAndroid.setChecked(false);
        cbJava.setChecked(false);
        cbPython.setChecked(false);
        cbWeb.setChecked(false);
        cbDatabase.setChecked(false);
        cbNetworking.setChecked(false);
        tvKetQua.setText(R.string.receipt_placeholder);
        edtHoTen.requestFocus();
    }
}