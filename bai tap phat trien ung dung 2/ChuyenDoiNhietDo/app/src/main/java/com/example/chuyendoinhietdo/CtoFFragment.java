package com.example.chuyendoinhietdo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.*;
import android.widget.*;
import androidx.fragment.app.Fragment;
import java.util.Locale;

public class CtoFFragment extends Fragment {

    EditText edtC;
    Button btnTinhC, btnXoaC;
    TextView txtKQ_C;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_c_to_f, container, false);

        edtC = view.findViewById(R.id.edtC);
        btnTinhC = view.findViewById(R.id.btnTinhC);
        btnXoaC = view.findViewById(R.id.btnXoaC);
        txtKQ_C = view.findViewById(R.id.txtKQ_C);

        btnTinhC.setOnClickListener(v -> {
            String input = edtC.getText().toString();

            if (TextUtils.isEmpty(input)) {
                Toast.makeText(getContext(),
                        getString(R.string.empty_input),
                        Toast.LENGTH_SHORT).show();
                return;
            }

            double c = Double.parseDouble(input);
            double f = c * 1.8 + 32;

            txtKQ_C.setText(
                    getString(R.string.result_f, f)
            );
        });

        btnXoaC.setOnClickListener(v -> {
            edtC.setText("");
            txtKQ_C.setText("");
        });

        return view;
    }
}