package com.example.seankwek.nest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class courseScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_screen);
        Button courseNext=(Button)findViewById(R.id.courseNext);
        final EditText courseText=(EditText)findViewById(R.id.courseText);

        courseNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(courseText.getText().toString())) {
                    Toast.makeText(courseScreen.this, "Please enter course name", Toast.LENGTH_LONG).show();
                }
                else{
                    String nestText="NEST COURSE ";
                    String location=courseText.getText().toString();
                    nestText+=location;
                    Intent myIntent = new Intent(courseScreen.this, endScreen.class).putExtra("nestText",nestText);
                    startActivity(myIntent);
                }
            }
        });
    }
}
