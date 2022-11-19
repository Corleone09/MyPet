package com.example.mypet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private EditText et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);

    }
    public void validar (View view){


        String usuario = et1.getText().toString();
        String clave = et2.getText().toString();

        if (usuario.equals("admin") && clave.equals("12345")){

            Intent i = new Intent(this, Home.class);
            startActivity(i);
        }else{
            Toast mensaje = Toast.makeText(this, "por favor verifique usuario y  contrasena", Toast.LENGTH_SHORT);
            mensaje.show();
        }
    }

}