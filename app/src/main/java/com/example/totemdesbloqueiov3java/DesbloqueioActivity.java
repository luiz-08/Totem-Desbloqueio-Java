package com.example.totemdesbloqueiov3java;

import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class DesbloqueioActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desbloqueio);

        // Inicializar a WebView
        webView = findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Ativar JavaScript, se necessário
        webView.setWebViewClient(new WebViewClient()); // Abrir URLs na WebView

        // Carregar uma URL na WebView
        webView.loadUrl("https://desbloqueio.ambev.com.br/");
    }

    // Método para finalizar a atividade e encerrar a WebView
    public void finalizarDesbloqueio(View view) {
        // Limpar cookies
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookies(null);

        // Finalizar a WebView
        webView.stopLoading();
        webView.clearCache(true);
        webView.clearHistory();
        webView.destroy();

        finish(); // Encerrar a atividade DesbloqueioActivity e retornar à MainActivity
    }
}
