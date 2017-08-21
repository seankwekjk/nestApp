package com.example.seankwek.nest;

import android.Manifest;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.telephony.SmsManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class endScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_screen);
        final String nestText = getIntent().getExtras().getString("nestText");
        TextView textPreview = (TextView) findViewById(R.id.textPreview);
        textPreview.setText(nestText);
        Button resetButton = (Button) findViewById(R.id.resetButton);
        Button confirmButton = (Button) findViewById(R.id.confirmButton);

        resetButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(endScreen.this, MainActivity.class);
                startActivity(myIntent);
            }
        });

        confirmButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                sendSms("98386686",nestText);
            }
        });
    }

    public void sendSms(String phoneNumber,String nestText){
        try {
            SmsManager sms = SmsManager.getDefault();
            sms.sendTextMessage(phoneNumber, null, nestText, null, null);
            finishAffinity();
        }
        catch(Exception e){
            Toast.makeText(endScreen.this,"Sms failed",Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }
}
