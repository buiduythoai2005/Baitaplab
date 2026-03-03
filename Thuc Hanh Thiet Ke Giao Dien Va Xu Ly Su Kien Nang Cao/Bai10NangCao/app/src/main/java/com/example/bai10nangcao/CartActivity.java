package com.example.bai10nangcao;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {

    private TextView tvCustomerInfo, tvTotal;
    private ListView lvCart;
    private Button btnCheckout;
    private ArrayList<Product> cartList;
    private String customerName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        tvCustomerInfo = findViewById(R.id.tvCustomerInfo);
        tvTotal = findViewById(R.id.tvTotal);
        lvCart = findViewById(R.id.lvCart);
        btnCheckout = findViewById(R.id.btnCheckout);

        // Nhận dữ liệu từ MainActivity
        Intent intent = getIntent();
        customerName = intent.getStringExtra("customerName");
        cartList = (ArrayList<Product>) intent.getSerializableExtra("cartList");

        tvCustomerInfo.setText("Khách hàng: " + (customerName.isEmpty() ? "Vãng lai" : customerName));

        displayCart();

        btnCheckout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCheckoutDialog();
            }
        });
    }

    private void displayCart() {
        double total = 0;
        ArrayList<String> displayList = new ArrayList<>();
        for (Product p : cartList) {
            displayList.add(p.toString());
            total += p.getTotal();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, displayList);
        lvCart.setAdapter(adapter);
        tvTotal.setText("Tổng tiền: " + total + " VNĐ");
    }

    private void showCheckoutDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Xác nhận thanh toán");
        builder.setMessage("Bạn có chắc chắn muốn thanh toán và xóa giỏ hàng không?");
        builder.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                cartList.clear();
                Toast.makeText(CartActivity.this, "Thanh toán thành công!", Toast.LENGTH_SHORT).show();
                
                // Trả về kết quả để xóa giỏ hàng ở MainActivity
                Intent resultIntent = new Intent();
                resultIntent.putExtra("cartCleared", true);
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });
        builder.setNegativeButton("Hủy", null);
        builder.show();
    }
}
