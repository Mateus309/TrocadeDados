package com.teste.trocatela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button btnClick ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Usuario u = new Usuario("bbb", 15);

        btnClick = findViewById(R.id.button);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), segundaTela.class);
                //intent.putExtra("nome","AAAAA");
                //intent.putExtra("idade", 345);
                intent.putExtra("usuario", u);
                startActivity(intent);
            }
        });
    }
}