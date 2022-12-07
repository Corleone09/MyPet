package com.example.mypet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    private EditText et1, et2;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        firebaseAuth = FirebaseAuth.getInstance();
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);

    }
    public void validar (View view){

        String correo = et1.getText().toString();
        String contrasena = et2.getText().toString();

        firebaseAuth.signInWithEmailAndPassword(correo, contrasena).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(Login.this, "El ingreso fue exitoso", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Login.this, Home.class);
                    startActivity(intent);

                }else {
                    Toast.makeText(Login.this, "Correo o contrasena incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void registrar (View view){

        String correo = et1.getText().toString();
        String contrasena = et2.getText().toString();

        firebaseAuth.createUserWithEmailAndPassword(correo, contrasena).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if (task.isSuccessful()){
                    Toast.makeText(Login.this, "Usuario creado con exito", Toast.LENGTH_SHORT).show();


                }else {
                    Toast.makeText(Login.this, "Ingrese usuario y contrasena", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

}