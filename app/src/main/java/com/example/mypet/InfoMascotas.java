package com.example.mypet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoMascotas extends AppCompatActivity {

    private ImageView imagenMascotaInfo;
    private TextView tvNombreMascotaInfo, tvEdadMascotaInfo, tvRazaMascotaInfo, tvNumeroMascotaInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_mascotas);

        imagenMascotaInfo = findViewById(R.id.ibtnMascotaInfo);
        tvNombreMascotaInfo = findViewById(R.id.tvNombreMascota);
        tvEdadMascotaInfo = findViewById(R.id.tvEdadMascotaInfo);
        tvRazaMascotaInfo = findViewById(R.id.tvRazaMascotaInfo);
        tvNumeroMascotaInfo = findViewById(R.id.tvNumeroMascotaInfo);

        imagenMascotaInfo.setImageResource(getIntent().getIntExtra("idImagen", 0));
        tvNombreMascotaInfo.setText(getIntent().getStringExtra("nombre"));
        tvRazaMascotaInfo.setText(getIntent().getStringExtra("raza"));
        tvEdadMascotaInfo.setText(getIntent().getStringExtra("edad"));
        tvNumeroMascotaInfo.setText(getIntent().getStringExtra("telefono"));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

        @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.hm:
                Intent home = new Intent(this, Home.class);
                startActivity(home);
                break;

            case R.id.cs:
                Intent login = new Intent(this, Login.class);
                startActivity(login);
                break;
            case R.id.pm:
                Intent publica = new Intent(this, Publica.class);
                startActivity(publica);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}