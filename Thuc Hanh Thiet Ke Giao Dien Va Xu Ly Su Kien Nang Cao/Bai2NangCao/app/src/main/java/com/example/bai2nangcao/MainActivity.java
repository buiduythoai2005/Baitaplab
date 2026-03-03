package com.example.bai2nangcao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private EditText edtName, edtYear, edtClass;
    private Button btnAdd, btnViewList;
    public static ArrayList<String> studentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edtName);
        edtYear = findViewById(R.id.edtYear);
        edtClass = findViewById(R.id.edtClass);
        btnAdd = findViewById(R.id.btnAdd);
        btnViewList = findViewById(R.id.btnViewList);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addStudent();
            }
        });

        btnViewList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StudentListActivity.class);
                startActivity(intent);
            }
        });
    }

    private void addStudent() {
        String name = edtName.getText().toString().trim();
        String yearStr = edtYear.getText().toString().trim();
        String className = edtClass.getText().toString().trim();

        if (name.isEmpty() || yearStr.isEmpty() || className.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
            return;
        }

        int year = Integer.parseInt(yearStr);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        if (year > currentYear) {
            Toast.makeText(this, "Năm sinh không được lớn hơn năm hiện tại", Toast.LENGTH_SHORT).show();
            return;
        }

        for (String student : studentList) {
            if (student.startsWith(name + " -")) {
                Toast.makeText(this, "Tên sinh viên đã tồn tại", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        String studentInfo = name + " - " + year + " - " + className;
        studentList.add(studentInfo);
        Toast.makeText(this, "Thêm thành công", Toast.LENGTH_SHORT).show();
        
        // Clear inputs
        edtName.setText("");
        edtYear.setText("");
        edtClass.setText("");
    }
}