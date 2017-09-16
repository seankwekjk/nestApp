package com.example.seankwek.nest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mcScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mc_screen);
        Button mlOption = (Button)findViewById(R.id.mlOption);
        Button omlOption = (Button)findViewById(R.id.omlOption);

        mlOption.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String nestText="NEST MC ";
                Intent myIntent = new Intent(mcScreen.this, leaveDatesScreen.class).putExtra("nestText",nestText);
                myIntent.putExtra("typeText","mc");
                startActivity(myIntent);
            }
        });

        omlOption.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String nestText="NEST MC (OML) ";
                Intent myIntent = new Intent(mcScreen.this, leaveDatesScreen.class).putExtra("nestText",nestText);
                myIntent.putExtra("typeText","oml");
                startActivity(myIntent);
            }
        });
    }
}
