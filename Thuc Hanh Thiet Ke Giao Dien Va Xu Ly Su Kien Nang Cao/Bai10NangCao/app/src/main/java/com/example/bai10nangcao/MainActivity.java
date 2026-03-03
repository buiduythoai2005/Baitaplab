package com.example.bai10nangcao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText etCustomerName, etProductName, etProductPrice, etProductQuantity;
    private Button btnAddToCart, btnViewCart;
    private ArrayList<Product> cartList;
    private static final int REQUEST_CODE_CART = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etCustomerName = findViewById(R.id.etCustomerName);
        etProductName = findViewById(R.id.etProductName);
        etProductPrice = findViewById(R.id.etProductPrice);
        etProductQuantity = findViewById(R.id.etProductQuantity);
        btnAddToCart = findViewById(R.id.btnAddToCart);
        btnViewCart = findViewById(R.id.btnViewCart);

        cartList = new ArrayList<>();

        btnAddToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addProductToCart();
            }
        });

        btnViewCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCartActivity();
            }
        });
    }

    private void addProductToCart() {
        String name = etProductName.getText().toString().trim();
        String priceStr = etProductPrice.getText().toString().trim();
        String quantityStr = etProductQuantity.getText().toString().trim();

        if (name.isEmpty() || priceStr.isEmpty() || quantityStr.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập đầy đủ thông tin sản phẩm", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double price = Double.parseDouble(priceStr);
            int quantity = Integer.parseInt(quantityStr);

            Product product = new Product(name, price, quantity);
            cartList.add(product);

            Toast.makeText(this, "Đã thêm " + name + " vào giỏ hàng", Toast.LENGTH_SHORT).show();

            // Clear input for next product
            etProductName.setText("");
            etProductPrice.setText("");
            etProductQuantity.setText("");
            etProductName.requestFocus();

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Giá hoặc số lượng không hợp lệ", Toast.LENGTH_SHORT).show();
        }
    }

    private void openCartActivity() {
        if (cartList.isEmpty()) {
            Toast.makeText(this, "Giỏ hàng đang trống", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(MainActivity.this, CartActivity.class);
        intent.putExtra("customerName", etCustomerName.getText().toString().trim());
        intent.putExtra("cartList", cartList);
        startActivityForResult(intent, REQUEST_CODE_CART);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_CART && resultCode == RESULT_OK && data != null) {
            boolean cartCleared = data.getBooleanExtra("cartCleared", false);
            if (cartCleared) {
                cartList.clear();
                etCustomerName.setText("");
            }
        }
    }
}
