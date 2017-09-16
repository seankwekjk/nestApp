package com.example.seankwek.nest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class medicalScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_screen);
        Button mcNest = (Button)findViewById(R.id.mcOption);
        Button maNest = (Button)findViewById(R.id.maOption);
        Button rsNest = (Button)findViewById(R.id.rsOption);

        mcNest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(medicalScreen.this, mcScreen.class);
                startActivity(myIntent);
            }
        });

        rsNest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String nestText="NEST RS";
                Intent myIntent = new Intent(medicalScreen.this, endScreen.class).putExtra("nestText",nestText).putExtra("remindText","remindRS");
                startActivity(myIntent);
            }
        });

        maNest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(medicalScreen.this, maScreen.class);
                startActivity(myIntent);
            }
        });
    }
}
