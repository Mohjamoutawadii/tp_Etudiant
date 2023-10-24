package com.example.projetws;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button addStudentButton = findViewById(R.id.addStudentButton);
        Button viewStudentsButton = findViewById(R.id.viewStudentsButton);

        addStudentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Démarrer l'activité d'ajout d'étudiant
                Intent intent = new Intent(WelcomeActivity.this, addEtudiant.class);
                startActivity(intent);
            }
        });

        viewStudentsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Démarrer l'activité de visualisation de la liste des étudiants
                Intent intent = new Intent(WelcomeActivity.this, listEtudiants.class);
                startActivity(intent);
            }
        });
    }
}
