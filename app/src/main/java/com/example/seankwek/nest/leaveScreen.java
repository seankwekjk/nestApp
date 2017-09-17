package com.example.seankwek.nest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

import java.util.ArrayList;

public class leaveScreen extends AppCompatActivity implements OnItemSelectedListener {
    private String leaveType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave_screen);
        Button leaveNext = (Button)findViewById(R.id.leaveTypeNext);
        Spinner leaveSpinner = (Spinner)findViewById(R.id.leaveSpinner);
        ArrayList<String> optionList = new ArrayList<String>();
        optionList.add("Local Leave");
        optionList.add("Child Care Conditional");
        optionList.add("Child Care Unconditional");
        optionList.add("Compassionate");
        optionList.add("Marriage");
        optionList.add("Parent Care");
        optionList.add("Paternity/Maternity");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(leaveScreen.this,android.R.layout.simple_spinner_item,optionList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        leaveSpinner.setAdapter(adapter);
        leaveSpinner.setOnItemSelectedListener(this);

        leaveNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String nestText="NEST LL ";
                if(!leaveType.equals("Local Leave")){
                    nestText+="("+leaveType+") ";
                }
                Intent myIntent = new Intent(leaveScreen.this, leaveDatesScreen.class).putExtra("nestText",nestText);
                myIntent.putExtra("typeText","ll");
                startActivity(myIntent);
            }
        });
    }

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id){
        leaveType= (String) parent.getItemAtPosition(pos);
    }

    public void onNothingSelected(AdapterView<?> parent) {

    }


}
