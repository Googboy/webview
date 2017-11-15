package com.example.webview1;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        webView = findViewById(R.id.webView);
        //加载web资源
        webView.loadUrl("http://baidu.com");
        //覆盖webview默认使用第三方或系统默认浏览器打开网页的行为，使网页用webview打开
        webView.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view,String url){
                view.loadUrl(url);
                //返回值是ture的时候控制去webview打开，为false是调用系统默认或第三方浏览器
                return true;
            }
        });
    }
}
