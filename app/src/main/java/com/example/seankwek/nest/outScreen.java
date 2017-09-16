package com.example.seankwek.nest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class outScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_out_screen);
        Button cnb=(Button) findViewById(R.id.cnb);
        Button tnb=(Button) findViewById(R.id.tnb);
        Button mindef=(Button) findViewById(R.id.mindef);
        Button other=(Button) findViewById(R.id.other);
        Button courseNext=(Button)findViewById(R.id.courseNext);
        final EditText courseText=(EditText)findViewById(R.id.courseText);
        final EditText otherText=(EditText) findViewById(R.id.otherText);

        cnb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String nestText="NEST OS CNB";
                Intent myIntent = new Intent(outScreen.this, endScreen.class).putExtra("nestText",nestText);
                startActivity(myIntent);
            }
        });

        tnb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String nestText="NEST OS TNB";
                Intent myIntent = new Intent(outScreen.this, endScreen.class).putExtra("nestText",nestText);
                startActivity(myIntent);
            }
        });

        mindef.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String nestText="NEST OS MINDEF";
                Intent myIntent = new Intent(outScreen.this, endScreen.class).putExtra("nestText",nestText);
                startActivity(myIntent);
            }
        });

        other.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(otherText.getText().toString())) {
                    Toast.makeText(outScreen.this, "Please enter location", Toast.LENGTH_LONG).show();
                }
                else{
                    String nestText="NEST OS ";
                    String location=otherText.getText().toString();
                    nestText+=location;
                    Intent myIntent = new Intent(outScreen.this, endScreen.class).putExtra("nestText",nestText);
                    startActivity(myIntent);
                }
            }
        });

        courseNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(courseText.getText().toString())) {
                    Toast.makeText(outScreen.this, "Please enter course name", Toast.LENGTH_LONG).show();
                }
                else{
                    String nestText="NEST OS COURSE ";
                    String location=courseText.getText().toString();
                    nestText+=location;
                    Intent myIntent = new Intent(outScreen.this, endScreen.class).putExtra("nestText",nestText);
                    startActivity(myIntent);
                }
            }
        });
    }
}
