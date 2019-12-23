package com.example.fahad.timetably;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileshowActivity extends AppCompatActivity {
    Button monday;
    Button tuesday;
    Button wednesday;
    Button thursday;
    Button friday;
    Button saturday;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profileshow);
        monday = (Button) findViewById(R.id.monday);
        tuesday = (Button) findViewById(R.id.tuesday);
        wednesday = (Button) findViewById(R.id.wednesday);
        thursday = (Button) findViewById(R.id.thursday);
        friday = (Button) findViewById(R.id.friday);
        saturday = (Button) findViewById(R.id.saturday);


        monday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View args0) {
                Intent myIntent = new Intent(ProfileshowActivity.this,MondayActivity.class);
                startActivity(myIntent);


            }
        });
        tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View args0) {
                Intent myIntent = new Intent(ProfileshowActivity.this,TuesdayActivity.class);
                startActivity(myIntent);


            }
        });
        wednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View args0) {
                Intent myIntent = new Intent(ProfileshowActivity.this,WednesdayActivity.class);
                startActivity(myIntent);


            }
        });
        thursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View args0) {
                Intent myIntent = new Intent(ProfileshowActivity.this,ThursdayActivity.class);
                startActivity(myIntent);


            }
        });
        friday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View args0) {
                Intent myIntent = new Intent(ProfileshowActivity.this,FridayActivity.class);
                startActivity(myIntent);


            }
        });
        saturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View args0) {
                Intent myIntent = new Intent(ProfileshowActivity.this,SaturdayActivity.class);
                startActivity(myIntent);


            }
        });
    }
}
