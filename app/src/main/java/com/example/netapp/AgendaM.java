package com.example.netapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AgendaM extends AppCompatActivity {
    WebView visor;
    String URL="https://redesproyecto2020.000webhostapp.com/netapp/agenda/agenda.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendam);

        visor= (WebView) findViewById(R.id.Visualizar);
        final WebSettings ajustesVisor= visor.getSettings();
        ajustesVisor.setJavaScriptEnabled(true);
        ajustesVisor.setJavaScriptCanOpenWindowsAutomatically(true);


        //Abra las páginas dentro del mismo WebView
        WebViewClient mWebViewClient = new WebViewClient();
        visor.setWebViewClient(mWebViewClient);
        visor.loadUrl(URL);

    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        WebView miVisorWeb;
        miVisorWeb = (WebView) findViewById(R.id.Visualizar);
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (miVisorWeb.canGoBack()) {
                        miVisorWeb.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }

}
