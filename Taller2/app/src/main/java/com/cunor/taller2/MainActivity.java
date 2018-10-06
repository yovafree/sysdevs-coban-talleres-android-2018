package com.cunor.taller2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnCalcular = findViewById(R.id.btnCalcular);
        final EditText txt1 = findViewById(R.id.txtNum1);
        final EditText txt2 = findViewById(R.id.txtNum2);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int val1 = Integer.parseInt(txt1.getText().toString());
                int val2 = Integer.parseInt(txt2.getText().toString());
                Toast.makeText(getBaseContext(), "El resultado es: " + (val1+val2), Toast.LENGTH_LONG).show();
                Log.d("El resultado", "" + (val1+val2));
            }
        });


    }
}
