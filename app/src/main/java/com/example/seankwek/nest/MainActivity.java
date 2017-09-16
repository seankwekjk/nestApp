package com.example.seankwek.nest;

import android.Manifest;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS}, 1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button defaultNest=(Button) findViewById(R.id.stdOption);
        Button offNest=(Button) findViewById(R.id.offOption);
        Button medNest=(Button) findViewById(R.id.medOption);
        Button leaveNest=(Button) findViewById(R.id.leaveOption);
        Button outNest=(Button) findViewById(R.id.outOption);

        defaultNest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String nestText="NEST";
                Intent myIntent = new Intent(MainActivity.this, endScreen.class).putExtra("nestText",nestText);
                startActivity(myIntent);
            }
        });

        medNest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, medicalScreen.class);
                startActivity(myIntent);
            }
        });

        offNest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, offScreen.class);
                startActivity(myIntent);
            }
        });

        leaveNest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, leaveScreen.class);
                startActivity(myIntent);
            }
        });

        outNest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, outScreen.class);
                startActivity(myIntent);
            }
        });
    }
}
