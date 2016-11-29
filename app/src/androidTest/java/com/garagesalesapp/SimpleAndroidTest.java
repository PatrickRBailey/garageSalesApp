package com.garagesalesapp;

import android.test.AndroidTestCase;
import android.util.Log;

import com.garagesaleslibrary.event.service.SaleEventManager;

/**
 * Created by patrickb on 11/29/16.
 */

public class SimpleAndroidTest extends AndroidTestCase {

    public void testGetAllEvents(){
        // Create the object under test
        // Run the method under test
        // Get the actual results
        int actualResults = SaleEventManager.getAllEvents(getContext()).size();

        // compare to expected results
        int expectedResults = 15;
        Log.d("SimpleAndroidTest", "Found events: " + 15);
        assertEquals(expectedResults, actualResults);
    }
}
