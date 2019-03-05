package com.example.loteria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton btnrosa,btnarbol,btnvaliente,btnbandera,btnvenado,btnarpa,btnjaras,btncalavera,btnsirena,btnchalupa,btncatrin,btnviolincello,btnbandolon,btncantaro,btnestrella,btnnopal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnarbol=findViewById(R.id.btnarbol);
        btnrosa=findViewById(R.id.btnrosa);
        btnvaliente=findViewById(R.id.btnvaliente);
        btnbandera=findViewById(R.id.btnbandera);
        btnvenado=findViewById(R.id.btnvenado);
        btnarpa=findViewById(R.id.btnarpa);
        btnjaras=findViewById(R.id.btnjaras);
        btncalavera=findViewById(R.id.btncalavera);
        btnsirena=findViewById(R.id.btnsirena);
        btnchalupa=findViewById(R.id.btnchalupa);
        btncatrin=findViewById(R.id.btncatrin);
        btnviolincello=findViewById(R.id.btnviolincello);
        btnbandolon=findViewById(R.id.btnbandolon);
        btncantaro=findViewById(R.id.btncantaro);
        btnestrella=findViewById(R.id.btnestrella);
        btnnopal=findViewById(R.id.btnnopal);

        btnnopal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnnopal.setImageResource(R.mipmap.ficha);
            }
        });
        btnarbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnarbol.setImageResource(R.mipmap.ficha);
            }
        });
        btnestrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnestrella.setImageResource(R.mipmap.ficha);
            }
        });
        btncantaro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btncantaro.setImageResource(R.mipmap.ficha);
            }
        });
        btnviolincello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnviolincello.setImageResource(R.mipmap.ficha);
            }
        });
        btncalavera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btncalavera.setImageResource(R.mipmap.ficha);
            }
        });
        btnvenado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnvenado.setImageResource(R.mipmap.ficha);
            }
        });
        btnarpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnarpa.setImageResource(R.mipmap.ficha);
            }
        });
        btnbandera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnbandera.setImageResource(R.mipmap.ficha);
            }
        });
        btnbandolon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnbandolon.setImageResource(R.mipmap.ficha);
            }
        });
        btncatrin.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v)
            {
                btncatrin.setImageResource(R.mipmap.ficha);
            }
        });
        btnchalupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnchalupa.setImageResource(R.mipmap.ficha);
            }
        });
        btnjaras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnjaras.setImageResource(R.mipmap.ficha);
            }
        });
        btnrosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnrosa.setImageResource(R.mipmap.ficha);
            }
        });
        btnsirena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnsirena.setImageResource(R.mipmap.ficha);
            }
        });
        btnvaliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnvaliente.setImageResource(R.mipmap.ficha);
            }
        });


    }
}
