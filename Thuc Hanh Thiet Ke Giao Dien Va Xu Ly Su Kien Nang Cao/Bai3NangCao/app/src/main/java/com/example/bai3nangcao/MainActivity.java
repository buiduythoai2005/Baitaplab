package com.example.bai3nangcao;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edtCustomerName;
    private Spinner spnMovies;
    private RadioGroup rgShowtime;
    private CheckBox cbCombo;
    private Button btnBook;

    private final int TICKET_PRICE = 70000;
    private final int COMBO_PRICE = 30000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        setupSpinner();

        btnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleBooking();
            }
        });
    }

    private void initViews() {
        edtCustomerName = findViewById(R.id.edtCustomerName);
        spnMovies = findViewById(R.id.spnMovies);
        rgShowtime = findViewById(R.id.rgShowtime);
        cbCombo = findViewById(R.id.cbCombo);
        btnBook = findViewById(R.id.btnBook);
    }

    private void setupSpinner() {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Lật Mặt 7");
        movies.add("Mai");
        movies.add("Doraemon: Bản giao hưởng của Nobita");
        movies.add("Kingdom of the Planet of the Apes");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, movies);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnMovies.setAdapter(adapter);
    }

    private void handleBooking() {
        String name = edtCustomerName.getText().toString().trim();
        if (name.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập tên khách hàng", Toast.LENGTH_SHORT).show();
            return;
        }

        String movie = spnMovies.getSelectedItem().toString();
        int selectedId = rgShowtime.getCheckedRadioButtonId();
        RadioButton rbSelected = findViewById(selectedId);
        String showtime = rbSelected.getText().toString();
        boolean hasCombo = cbCombo.isChecked();

        int totalPrice = TICKET_PRICE + (hasCombo ? COMBO_PRICE : 0);

        String info = "Khách hàng: " + name + "\n" +
                "Phim: " + movie + "\n" +
                "Suất chiếu: " + showtime + "\n" +
                "Combo: " + (hasCombo ? "Có" : "Không") + "\n" +
                "Tổng tiền: " + String.format("%,d", totalPrice) + "đ";

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Xác nhận đặt vé");
        builder.setMessage(info);
        builder.setPositiveButton("Đồng ý", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(MainActivity.this, InvoiceActivity.class);
                intent.putExtra("customer_name", name);
                intent.putExtra("movie_name", movie);
                intent.putExtra("showtime", showtime);
                intent.putExtra("has_combo", hasCombo);
                intent.putExtra("total_price", totalPrice);
                startActivity(intent);
            }
        });
        builder.setNegativeButton("Hủy", null);
        builder.show();
    }
}