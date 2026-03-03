package com.example.bai8nangcao;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private EditText edtName, edtAmount, edtDate;
    private Spinner spnType;
    private Button btnAdd;
    private TextView tvTotal;
    private ListView lvExpenses;

    private ArrayList<Expense> expenseList;
    private ArrayAdapter<Expense> adapter;
    private double totalAmount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setupSpinner();
        setupListView();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addExpense();
            }
        });
    }

    private void initViews() {
        edtName = findViewById(R.id.edtName);
        edtAmount = findViewById(R.id.edtAmount);
        edtDate = findViewById(R.id.edtDate);
        spnType = findViewById(R.id.spnType);
        btnAdd = findViewById(R.id.btnAdd);
        tvTotal = findViewById(R.id.tvTotal);
        lvExpenses = findViewById(R.id.lvExpenses);
    }

    private void setupSpinner() {
        String[] types = {"Ăn uống", "Di chuyển", "Mua sắm", "Giải trí", "Khác"};
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, types);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnType.setAdapter(spinnerAdapter);
    }

    private void setupListView() {
        expenseList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, expenseList);
        lvExpenses.setAdapter(adapter);
    }

    private void addExpense() {
        String name = edtName.getText().toString().trim();
        String amountStr = edtAmount.getText().toString().trim();
        String type = spnType.getSelectedItem().toString();
        String date = edtDate.getText().toString().trim();

        if (name.isEmpty() || amountStr.isEmpty() || date.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double amount = Double.parseDouble(amountStr);
            Expense expense = new Expense(name, amount, type, date);
            expenseList.add(expense);
            adapter.notifyDataSetChanged();

            totalAmount += amount;
            tvTotal.setText(String.format(Locale.getDefault(), "Tổng tiền: %,.0f VNĐ", totalAmount));

            if (totalAmount > 5000000) {
                Toast.makeText(this, "CẢNH BÁO: Tổng chi tiêu đã vượt quá 5 triệu!", Toast.LENGTH_LONG).show();
                tvTotal.setTextColor(Color.RED);
            } else {
                tvTotal.setTextColor(Color.BLACK);
            }

            // Xóa nội dung sau khi thêm
            edtName.setText("");
            edtAmount.setText("");
            edtDate.setText("");
            edtName.requestFocus();
            
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Số tiền không hợp lệ", Toast.LENGTH_SHORT).show();
        }
    }
}
