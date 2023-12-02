package com.example.android.quran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView wed = findViewById(R.id.web);
        wed.loadUrl("file:///android_asset/index.html");
    }
    @Override
    public void onBackPressed() {
        WebView wed = findViewById(R.id.web);
        if (wed.canGoBack()) {
            wed.goBack();
        } else {
            super.onBackPressed();
        }
    }
}