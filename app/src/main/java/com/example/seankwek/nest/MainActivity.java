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
        Button rsNest=(Button) findViewById(R.id.rsOption);
        Button offNest=(Button) findViewById(R.id.offOption);
        Button mcNest=(Button) findViewById(R.id.mcOption);
        Button leaveNest=(Button) findViewById(R.id.leaveOption);
        Button outNest=(Button) findViewById(R.id.outOption);
        Button courseNest=(Button) findViewById(R.id.courseOption);

        defaultNest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String nestText="NEST";
                Intent myIntent = new Intent(MainActivity.this, endScreen.class).putExtra("nestText",nestText);
                startActivity(myIntent);
            }
        });

        rsNest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String nestText="NEST RS";
                Intent myIntent = new Intent(MainActivity.this, endScreen.class).putExtra("nestText",nestText).putExtra("remindText","remindRS");
                startActivity(myIntent);
            }
        });

        offNest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String nestText="NEST OFF";
                Intent myIntent = new Intent(MainActivity.this, endScreen.class).putExtra("nestText",nestText);
                startActivity(myIntent);
            }
        });

        mcNest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, mcScreen.class);
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

        courseNest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, courseScreen.class);
                startActivity(myIntent);
            }
        });
    }
}
