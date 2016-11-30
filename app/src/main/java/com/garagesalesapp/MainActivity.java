package com.garagesalesapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import com.garagesaleslibrary.event.domain.SaleEvent;
import com.garagesaleslibrary.event.service.SaleEventManager;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int eventCount = getEventCount();

        TextView tv = (TextView) findViewById(R.id.textView);

        String displayText = "Number of events: " + eventCount;
        tv.setText(displayText);
        displayListView();
    }
    private int getEventCount(){
        return SaleEventManager.getAllEvents(this).size();
    }
    private void displayListView(){
        List<SaleEvent> events = SaleEventManager.getAllEvents(this);



        final SaleEventArrayAdapter adapter =
                new SaleEventArrayAdapter(this, R.layout.event_list_item,events);

        ListView list = (ListView)findViewById(R.id.eventlistview);

        list.setAdapter(adapter);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
// Handle item selection
        switch (item.getItemId()) {
            case R.id.mi_add_event:
                addEvent();
                return true;
            case R.id.mi_show_map:
                showMap();
                return true;
            case R.id.mi_prefs:
                showPrefs();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    private void showPrefs() {

    }
    private void showMap() {

    }
    private void addEvent() {

    }
}
