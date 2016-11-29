package com.garagesalesapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.garagesaleslibrary.event.service.SaleEventManager;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int eventCount = getEventCount();

        TextView tv = (TextView) findViewById(R.id.textView);

        String displayText = "Number of events: " + eventCount;
        tv.setText(displayText);
    }
    private int getEventCount(){
        return SaleEventManager.getAllEvents(this).size();
    }
}
