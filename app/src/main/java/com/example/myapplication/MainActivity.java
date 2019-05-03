package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn_saludar = findViewById(R.id.btn_calcular);
        final TextView txt_suma = findViewById(R.id.txt_suma);
        final EditText txt_num_1 = findViewById(R.id.txt_num_1);
        final EditText txt_num_2 = findViewById(R.id.txt_num_2);

        btn_saludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_suma.setText("La suma de los números es: " +(
                                Integer.parseInt(txt_num_1.getText().toString()) +
                                Integer.parseInt(txt_num_2.getText().toString())
                        )
                );
            }
        });
    }
}
