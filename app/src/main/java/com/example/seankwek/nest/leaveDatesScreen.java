package com.example.seankwek.nest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class leaveDatesScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave_dates_screen);
        Button leaveNext=(Button)findViewById(R.id.leaveNext);
        final String nsText = getIntent().getExtras().getString("nestText");
        final String typeText = getIntent().getExtras().getString("typeText");
        final EditText dateText =(EditText)findViewById(R.id.dateText);
        TextView promptText = (TextView)findViewById(R.id.promptText);
        if(typeText.equals("ll")){
            promptText.setText("Period of Leave");
        }
        else{
            promptText.setText("Period of MC");
        }

        leaveNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(dateText.getText().toString())) {
                    Toast.makeText(leaveDatesScreen.this, "Please enter a date", Toast.LENGTH_LONG).show();
                }
                else{
                    String date= dateText.getText().toString();
                    String nestText=nsText+date;
                    Intent myIntent = new Intent(leaveDatesScreen.this, endScreen.class).putExtra("nestText",nestText);
                    if(typeText.equals("mc")){
                        myIntent.putExtra("remindText","remindMC");
                    }
                    startActivity(myIntent);
                }
            }
        });
    }
}
