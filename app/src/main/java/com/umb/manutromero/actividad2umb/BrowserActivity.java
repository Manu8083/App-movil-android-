package com.umb.manutromero.actividad2umb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BrowserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        Button BuscarURL;


        BuscarURL = (Button)findViewById(R.id.Btnbrowser);

        BuscarURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText InputURL;
                String urlBuscar;

                InputURL = (EditText)findViewById(R.id.CampoURL);
                urlBuscar = InputURL.getText().toString();

                Intent intent = new Intent(BrowserActivity.this, WebViewActivity.class);
                intent.putExtra("url",urlBuscar);
                startActivity(intent);


            }
        });

    }
}
