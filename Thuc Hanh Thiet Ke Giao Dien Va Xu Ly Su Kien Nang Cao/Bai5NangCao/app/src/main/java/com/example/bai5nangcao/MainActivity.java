package com.example.bai5nangcao;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rg1, rg2, rg3, rg4, rg5;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ các thành phần giao diện
        rg1 = findViewById(R.id.rgQuestion1);
        rg2 = findViewById(R.id.rgQuestion2);
        rg3 = findViewById(R.id.rgQuestion3);
        rg4 = findViewById(R.id.rgQuestion4);
        rg5 = findViewById(R.id.rgQuestion5);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(v -> {
            checkAndSubmit();
        });
    }

    private void checkAndSubmit() {
        // Kiểm tra nâng cao: Phải chọn đủ các câu
        if (rg1.getCheckedRadioButtonId() == -1 ||
            rg2.getCheckedRadioButtonId() == -1 ||
            rg3.getCheckedRadioButtonId() == -1 ||
            rg4.getCheckedRadioButtonId() == -1 ||
            rg5.getCheckedRadioButtonId() == -1) {

            Toast.makeText(this, "Vui lòng hoàn thành tất cả 5 câu hỏi trước khi nộp!", Toast.LENGTH_SHORT).show();
            return;
        }

        int score = 0;

        // Chấm điểm: Mỗi câu đúng được 2 điểm (Tổng 10 điểm)
        // Câu 1: Đáp án B (Hà Nội)
        if (rg1.getCheckedRadioButtonId() == R.id.rb1b) score += 2;
        // Câu 2: Đáp án B (4)
        if (rg2.getCheckedRadioButtonId() == R.id.rb2b) score += 2;
        // Câu 3: Đáp án C (VNĐ)
        if (rg3.getCheckedRadioButtonId() == R.id.rb3c) score += 2;
        // Câu 4: Đáp án B (Google)
        if (rg4.getCheckedRadioButtonId() == R.id.rb4b) score += 2;
        // Câu 5: Đáp án C (7)
        if (rg5.getCheckedRadioButtonId() == R.id.rb5c) score += 2;

        showResultDialog(score);
    }

    private void showResultDialog(int score) {
        String comment;
        if (score >= 8) {
            comment = "Tốt";
        } else if (score >= 5) {
            comment = "Trung bình";
        } else {
            comment = "Yếu";
        }

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Kết quả trắc nghiệm");
        builder.setMessage("Điểm số của bạn: " + score + "/10\nNhận xét: " + comment);
        builder.setCancelable(false);
        builder.setPositiveButton("Làm lại", (dialog, which) -> {
            resetQuiz();
        });
        builder.setNegativeButton("Thoát", (dialog, which) -> {
            finish();
        });
        builder.show();
    }

    private void resetQuiz() {
        rg1.clearCheck();
        rg2.clearCheck();
        rg3.clearCheck();
        rg4.clearCheck();
        rg5.clearCheck();
    }
}
