package com.example.chuyendoinhietdo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.*;
import android.widget.*;
import androidx.fragment.app.Fragment;

public class FtoCFragment extends Fragment {

    EditText edtF;
    Button btnTinhF, btnXoaF;
    TextView txtKQ_F;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_f_to_c, container, false);

        edtF = view.findViewById(R.id.edtF);
        btnTinhF = view.findViewById(R.id.btnTinhF);
        btnXoaF = view.findViewById(R.id.btnXoaF);
        txtKQ_F = view.findViewById(R.id.txtKQ_F);

        btnTinhF.setOnClickListener(v -> {
            String input = edtF.getText().toString();

            if (TextUtils.isEmpty(input)) {
                Toast.makeText(getContext(),
                        getString(R.string.empty_input),
                        Toast.LENGTH_SHORT).show();
                return;
            }

            double f = Double.parseDouble(input);
            double c = (f - 32) / 1.8;

            txtKQ_F.setText(
                    getString(R.string.result_c, c)
            );
        });

        btnXoaF.setOnClickListener(v -> {
            edtF.setText("");
            txtKQ_F.setText("");
        });

        return view;
    }
}