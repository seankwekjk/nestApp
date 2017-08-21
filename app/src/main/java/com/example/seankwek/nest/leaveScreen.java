package com.example.seankwek.nest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class leaveScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave_screen);
        Button leaveNext=(Button)findViewById(R.id.leaveNext);
        final EditText fromDate =(EditText)findViewById(R.id.fromDate);
        final EditText toDate=(EditText)findViewById(R.id.toDate);

        leaveNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(fromDate.getText().toString())||TextUtils.isEmpty(toDate.getText().toString())) {
                    Toast.makeText(leaveScreen.this, "Please enter a date", Toast.LENGTH_LONG).show();
                }
                else{
                    String nestText="NEST LL ";
                    String from=fromDate.getText().toString(),to=toDate.getText().toString();
                    nestText=nestText+from+" - "+to;
                    Intent myIntent = new Intent(leaveScreen.this, endScreen.class).putExtra("nestText",nestText);
                    startActivity(myIntent);
                }
            }
        });
    }
}