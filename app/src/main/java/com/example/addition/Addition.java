package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Addition extends AppCompatActivity {
 EditText edtFirst,edtSecond;
    Button btnCalculate;
         TextView txtResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        edtFirst=findViewById(R.id.edtFirst);
        edtSecond=findViewById(R.id.edtSecond);
        btnCalculate =findViewById(R.id.btnCalculate);
        txtResult =findViewById(R.id.txtResult);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int  first,second,result;
                first=Integer.parseInt(edtFirst.getText().toString());
                second=Integer.parseInt(edtSecond.getText().toString());
                result=first+second;
                txtResult.setText("Result="+result);
            }
        });


    }
}