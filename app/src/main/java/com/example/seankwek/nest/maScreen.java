package com.example.seankwek.nest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class maScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_screen);
        final EditText maText = (EditText)findViewById(R.id.maText);
        Button maNext = (Button)findViewById(R.id.maNext);

        maNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(maText.getText().toString())) {
                    Toast.makeText(maScreen.this, "Please enter appointment location", Toast.LENGTH_LONG).show();
                }
                else{
                    String nestText="NEST MA ";
                    String location=maText.getText().toString();
                    nestText+=location;
                    Intent myIntent = new Intent(maScreen.this, endScreen.class).putExtra("nestText",nestText);
                    startActivity(myIntent);
                }
            }
        });
    }
}
