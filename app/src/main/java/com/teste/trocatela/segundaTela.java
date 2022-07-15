package com.teste.trocatela;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class segundaTela extends AppCompatActivity {

    private TextView txtNome, txtIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        txtNome = findViewById(R.id.textName);
        txtIdade = findViewById(R.id.textAge);

        Bundle dados = getIntent().getExtras();
        String nome = dados.getString("nome");
        int idade = dados.getInt("idade");

        Usuario u = (Usuario) dados.getSerializable("usuario");

        txtNome.setText(u.getNome());
        txtIdade.setText(String.valueOf(u.getIdade()));
    }
}