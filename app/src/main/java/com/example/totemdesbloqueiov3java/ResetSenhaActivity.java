package com.example.totemdesbloqueiov3java;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class ResetSenhaActivity extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_senha);

        // Inicializar a WebView
        webView = findViewById(R.id.webViewResetSenha);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Ativar JavaScript, se necessário
        webView.setWebViewClient(new WebViewClient()); // Abrir URLs na WebView

        // Carregar uma URL na WebView
        webView.loadUrl("https://sspr-auth.ambev.com.br/logon/LogonPoint/tmindex.html");
    }

    // Método para finalizar a atividade e encerrar a WebView
    public void finalizarResetSenha(View view) {
        // Limpar histórico, cache e armazenamento local
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookies(null);

        // Finalizar a WebView
        webView.stopLoading();
        webView.clearCache(true);
        webView.clearHistory();
        webView.destroy();
        finish(); // Encerrar a atividade ResetSenhaActivity e retornar à MainActivity
    }
}
