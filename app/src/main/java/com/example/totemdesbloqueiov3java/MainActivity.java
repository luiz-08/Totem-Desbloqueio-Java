package com.example.totemdesbloqueiov3java;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.totemdesbloqueiov3java.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Método para lidar com o clique no botão "Desbloqueio"
    public void abrirDesbloqueio(View view) {
        Intent intent = new Intent(this, DesbloqueioActivity.class);
        startActivity(intent);
    }

    // Método para lidar com o clique no botão "Reset de senha"
    public void abrirResetSenha(View view) {
        Intent intent = new Intent(this, ResetSenhaActivity.class);
        startActivity(intent);
    }
}
