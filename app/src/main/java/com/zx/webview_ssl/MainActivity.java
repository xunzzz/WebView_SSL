package com.zx.webview_ssl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    private Button btnA;
    private TextView tv;

    private String url1 = "https://10.10.8.232:8443/";//自己的ip地址

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        btnA = (Button)findViewById(R.id.btn1);
        webView = (WebView)findViewById(R.id.webView);
        webView.setWebViewClient(new SslWebViewClient());
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView.clearView();
                tv.setText("连接：" + url1);
                webView.loadUrl(url1);
            }
        });
    }
}
