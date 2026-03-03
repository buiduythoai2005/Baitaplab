package com.example.bai1nangcao;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText edtFullName, edtEmail, edtPassword, edtConfirmPassword;
    private RadioGroup rgGender;
    private RadioButton rbMale;
    private CheckBox cbReading, cbSports, cbMusic;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ View
        edtFullName = findViewById(R.id.edtFullName);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        edtConfirmPassword = findViewById(R.id.edtConfirmPassword);
        rgGender = findViewById(R.id.rgGender);
        rbMale = findViewById(R.id.rbMale);
        cbReading = findViewById(R.id.cbReading);
        cbSports = findViewById(R.id.cbSports);
        cbMusic = findViewById(R.id.cbMusic);
        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(v -> {
            if (validateForm()) {
                sendDataToResultActivity();
            }
        });
    }

    private boolean validateForm() {
        String name = edtFullName.getText().toString().trim();
        String email = edtEmail.getText().toString().trim();
        String pass = edtPassword.getText().toString().trim();
        String confirmPass = edtConfirmPassword.getText().toString().trim();

        if (name.isEmpty() || email.isEmpty() || pass.isEmpty() || confirmPass.isEmpty()) {
            showError("Vui lòng nhập đầy đủ thông tin");
            return false;
        }

        if (!email.contains("@")) {
            showError("Email không hợp lệ (phải chứa @)");
            return false;
        }

        if (pass.length() < 6) {
            showError("Mật khẩu phải có ít nhất 6 ký tự");
            return false;
        }

        if (!pass.equals(confirmPass)) {
            showError("Mật khẩu xác nhận không trùng khớp");
            return false;
        }

        return true;
    }

    private void sendDataToResultActivity() {
        String name = edtFullName.getText().toString().trim();
        String email = edtEmail.getText().toString().trim();
        
        // Lấy giới tính
        String gender = rbMale.isChecked() ? "Nam" : "Nữ";

        // Lấy sở thích
        List<String> hobbies = new ArrayList<>();
        if (cbReading.isChecked()) hobbies.add("Đọc sách");
        if (cbSports.isChecked()) hobbies.add("Thể thao");
        if (cbMusic.isChecked()) hobbies.add("Âm nhạc");
        
        String hobbiesStr = hobbies.isEmpty() ? "Không có" : String.join(", ", hobbies);

        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        intent.putExtra("fullName", name);
        intent.putExtra("email", email);
        intent.putExtra("gender", gender);
        intent.putExtra("hobbies", hobbiesStr);
        startActivity(intent);
    }

    private void showError(String message) {
        new AlertDialog.Builder(this)
                .setTitle("Thông báo")
                .setMessage(message)
                .setPositiveButton("Đóng", null)
                .show();
    }
}