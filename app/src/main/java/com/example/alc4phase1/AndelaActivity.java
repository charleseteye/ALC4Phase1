package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AndelaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andela);
        setTitle("About ALC");


        WebView webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
               handler.proceed();
            }
        });

        webView.loadUrl("https://andela.com/alc/");

        webView.getSettings().setJavaScriptEnabled(true);






    }
}
