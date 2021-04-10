package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;

    @Override
    public void onBackPressed()
    {
        if(mWebView.canGoBack())
        {
            mWebView.goBack();
        }
        else
        {
           super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView=findViewById(R.id.webView);

        mWebView.loadUrl("https://weltec.ac.nz/");

        mWebView.setWebViewClient(new WebViewClient());
    }
}