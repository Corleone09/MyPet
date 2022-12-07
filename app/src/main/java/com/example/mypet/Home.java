package com.example.mypet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.LinkedList;

public class Home extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = findViewById(R.id.rvMascotas);

        LinkedList<Mascotas> mascotas = new LinkedList<Mascotas>();

        mascotas.add(new Mascotas("Volcano", "2 años", "perro", "4623719", R.drawable.perro));
        mascotas.add(new Mascotas("Pupi", "3 años", "perro", "456987321", R.drawable.perro2));
        mascotas.add(new Mascotas("Lucas", "4 años", "perro", "789456123", R.drawable.perro3));

        MascotasAdapter adapter = new MascotasAdapter(mascotas);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.cs:
                Intent i = new Intent(this, Login.class);
                startActivity(i);
                break;
            case R.id.pm:
                Intent j = new Intent(this, Publica.class);
                startActivity(j);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}