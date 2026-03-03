package com.example.bai6nangcao;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edtProductName, edtPrice, edtQuantity;
    private Spinner spnCategory;
    private Button btnAdd;
    private ListView lvProducts;
    private TextView tvTotalPrice;

    private ArrayList<Product> productList;
    private ArrayAdapter<Product> adapter;
    private String[] categories = {"Điện tử", "Gia dụng", "Thời trang", "Thực phẩm"};

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
                addProduct();
            }
        });

        lvProducts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showProductDetail(productList.get(position));
            }
        });
    }

    private void initViews() {
        edtProductName = findViewById(R.id.edtProductName);
        edtPrice = findViewById(R.id.edtPrice);
        edtQuantity = findViewById(R.id.edtQuantity);
        spnCategory = findViewById(R.id.spnCategory);
        btnAdd = findViewById(R.id.btnAdd);
        lvProducts = findViewById(R.id.lvProducts);
        tvTotalPrice = findViewById(R.id.tvTotalPrice);
    }

    private void setupSpinner() {
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categories);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnCategory.setAdapter(spinnerAdapter);
    }

    private void setupListView() {
        productList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, productList);
        lvProducts.setAdapter(adapter);
    }

    private void addProduct() {
        String name = edtProductName.getText().toString().trim();
        String priceStr = edtPrice.getText().toString().trim();
        String quantityStr = edtQuantity.getText().toString().trim();
        String category = spnCategory.getSelectedItem().toString();

        if (name.isEmpty() || priceStr.isEmpty() || quantityStr.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double price = Double.parseDouble(priceStr);
            int quantity = Integer.parseInt(quantityStr);

            Product product = new Product(name, price, quantity, category);
            productList.add(product);
            adapter.notifyDataSetChanged();

            updateTotalPrice();
            clearInputs();
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Giá và số lượng phải là số hợp lệ", Toast.LENGTH_SHORT).show();
        }
    }

    private void updateTotalPrice() {
        double total = 0;
        for (Product p : productList) {
            total += p.getTotal();
        }
        tvTotalPrice.setText("Tổng tiền: " + total);
    }

    private void clearInputs() {
        edtProductName.setText("");
        edtPrice.setText("");
        edtQuantity.setText("");
        spnCategory.setSelection(0);
        edtProductName.requestFocus();
    }

    private void showProductDetail(Product product) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Chi tiết sản phẩm");
        String detail = "Tên: " + product.getName() +
                         "\nGiá: " + product.getPrice() +
                         "\nSố lượng: " + product.getQuantity() +
                         "\nLoại: " + product.getCategory() +
                         "\nThành tiền: " + product.getTotal();
        builder.setMessage(detail);
        builder.setPositiveButton("Đóng", null);
        builder.show();
    }
}
