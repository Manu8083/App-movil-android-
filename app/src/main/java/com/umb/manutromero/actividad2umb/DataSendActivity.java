package com.umb.manutromero.actividad2umb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DataSendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_send);

        Button GuardarDatos;

        GuardarDatos = (Button)findViewById(R.id.BtnSendData);

        GuardarDatos.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                EditText InputNombre,InputApellido,InputEmail,InputEdad, InputAdicional;
                String nombre,apellido, email,edad, msjSexo = "" ,adicional;

                InputNombre = (EditText)findViewById(R.id.CampoNombre);
                nombre = InputNombre.getText().toString();

                InputApellido = (EditText)findViewById(R.id.CampoApellido);
                apellido = InputApellido.getText().toString();

                InputEmail = (EditText)findViewById(R.id.CampoEmail);
                email = InputEmail.getText().toString();

                // InputSexo = (EditText)findViewById(R.id.CampoSexo);
                //sexo = InputNombre.getText().toString();

                InputEdad = (EditText)findViewById(R.id.CampoEdad);
                edad = InputEdad.getText().toString();

                InputAdicional = (EditText)findViewById(R.id.CampoAdicional);
                adicional = InputAdicional.getText().toString();

                Intent guardarDatos = new Intent(DataSendActivity.this,  DataReceiveActivity.class);
                guardarDatos.putExtra("nombre", nombre);
                guardarDatos.putExtra("apellido", apellido);
                guardarDatos.putExtra("email", email);
                guardarDatos.putExtra("sexo", msjSexo);
                guardarDatos.putExtra("edad", edad);
                guardarDatos.putExtra("adicional", adicional);
                startActivity(guardarDatos);
            }

        });
    }
}
