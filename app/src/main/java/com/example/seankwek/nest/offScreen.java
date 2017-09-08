package com.example.seankwek.nest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class offScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_off_screen);
        Button dutyOff = (Button) findViewById(R.id.dutyOff);
        Button inLieuOff = (Button) findViewById(R.id.inLieuOff);
        final EditText offText = (EditText) findViewById(R.id.offText);

        dutyOff.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(offText.getText().toString())) {
                    Toast.makeText(offScreen.this, "Please enter a reason for off", Toast.LENGTH_LONG).show();
                }
                else{
                    String nestText="NEST DUTY OFF ";
                    String off=offText.getText().toString();
                    nestText=nestText+off;
                    Intent myIntent = new Intent(offScreen.this, endScreen.class).putExtra("nestText",nestText);
                    startActivity(myIntent);
                }
            }
        });

        inLieuOff.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(offText.getText().toString())) {
                    Toast.makeText(offScreen.this, "Please enter a reason for off", Toast.LENGTH_LONG).show();
                }
                else{
                    String nestText="NEST OFF IN LIEU ";
                    String off=offText.getText().toString();
                    nestText=nestText+off;
                    Intent myIntent = new Intent(offScreen.this, endScreen.class).putExtra("nestText",nestText);
                    startActivity(myIntent);
                }
            }
        });
    }
}
