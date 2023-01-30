package com.example.practicawebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtDirection;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.wbWeb);
        txtDirection = findViewById(R.id.txtUrlBox);
    }

    public void InternetNavigation(View view) {
        this.webView.loadUrl("https://" + txtDirection.getText());
        this.webView.setWebViewClient((new showInApp()));
    }

    public void back(View view) {
        this.webView.goBack();
    }

    private class showInApp extends WebViewClient {
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}