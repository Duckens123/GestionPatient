package com.KingComputing.gestionpersonne;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnvalider;
    private EditText pseudo,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnvalider=findViewById(R.id.btnvalider);
        pseudo=findViewById(R.id.editpseudo);
        password=findViewById(R.id.editpassword);
        btnvalider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Login();
            }
        });
    }
    public void Login(){
        if (pseudo.getText().toString().equalsIgnoreCase("Admin") && password.getText().toString().equals("Admin")){
            startActivity(new Intent(MainActivity.this,ListePatient.class));
            finish();
        }
        else {
            Toast.makeText(MainActivity.this, "Echec de connexion, pseudo ou mot de passe est incorrect", Toast.LENGTH_LONG).show();
            pseudo.setText("");
            password.setText("");
        }
    }
}