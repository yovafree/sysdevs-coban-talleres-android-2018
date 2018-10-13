package com.cunor.taller3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AgregarTareaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_tarea);

        Button btnAgregarTarea = findViewById(R.id.btnAgregarTarea);
        final EditText txtDescripcion = findViewById(R.id.txtDescripcion);

        btnAgregarTarea.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(AgregarTareaActivity.this, ListaTareasActivity.class);
                intent.putExtra("DESCRIPCION",txtDescripcion.getText().toString());
                startActivity(intent);
            }
        });
    }
}
