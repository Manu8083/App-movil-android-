package com.umb.manutromero.actividad2umb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.EditText;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        Bundle data = getIntent().getExtras();

        String urlbusqueda = data.getString("url");


        WebView webView = (WebView) this.findViewById(R.id.webview);
        webView.loadUrl("http://" + urlbusqueda);

    }

}
