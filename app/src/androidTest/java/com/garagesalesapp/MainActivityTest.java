package com.garagesalesapp;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

/**
 * Created by patrickb on 11/29/16.
 */

public class MainActivityTest extends ActivityInstrumentationTestCase2 {
    public MainActivityTest(){
        super(MainActivity.class);
    }

    Activity mainActivity;

    @Override
    protected  void setUp() throws Exception {
        super.setUp();
        mainActivity = getActivity();
    }

    public void testActivityUI() {
        TextView textView = (TextView) mainActivity.findViewById(R.id.textView);
        assertEquals("Number of events: 15", textView.getText().toString());
    }
}
