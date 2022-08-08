package com.example.dts_project5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private char operator;
    private double operan1;
    private double operan2;

    private EditText txtOperan1;
    private EditText txtOperan2;
    private TextView txtHasil;
    private TextView txtJawab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTambah = findViewById(R.id.btnTambah);
        btnTambah.setOnClickListener(view -> {
            operator = '+';
            operan1 = Double.parseDouble(txtOperan1.getText().toString());
            operan2 = Double.parseDouble(txtOperan2.getText().toString());
        });
        Button btnKurang = findViewById(R.id.btnKurang);
        btnKurang.setOnClickListener(view -> {
            operator = '-';
            operan1 = Double.parseDouble(txtOperan1.getText().toString());
            operan2 = Double.parseDouble(txtOperan2.getText().toString());
        });
        Button btnBagi = findViewById(R.id.btnBagi);
        btnBagi.setOnClickListener(view -> {
            operator = '/';
            operan1 = Double.parseDouble(txtOperan1.getText().toString());
            operan2 = Double.parseDouble(txtOperan2.getText().toString());
        });
        Button btnKali = findViewById(R.id.btnKali);
        btnKali.setOnClickListener(view -> {
            operator = 'x';
            operan1 = Double.parseDouble(txtOperan1.getText().toString());
            operan2 = Double.parseDouble(txtOperan2.getText().toString());
        });
        Button btnHitung = findViewById(R.id.btnHitung);
        btnHitung.setOnClickListener(view -> {
            double jawab = hitung(operator,operan1,operan2);
            txtJawab.setText(""+jawab);
        });

        txtOperan1 = findViewById(R.id.txtOperan1);
        txtOperan2 = findViewById(R.id.txtOperan2);
        txtHasil = findViewById(R.id.txtHasil);
        txtJawab = findViewById(R.id.txtJawab);
    }

    private double hitung(char operator, double operan1, double operan2){
        switch (operator){
            case 'x' :
                return operan1*operan2;
            case '/' :
                return operan1/operan2;
            case '+' :
                return operan1+operan2;
            case '-' :
                return operan1-operan2;
            default:
                return 0;
        }
    }
}