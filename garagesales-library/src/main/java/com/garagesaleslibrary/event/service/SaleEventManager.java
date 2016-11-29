package com.garagesaleslibrary.event.service;

import android.content.Context;
import android.util.Log;

import com.garagesaleslibrary.event.R;
import com.garagesaleslibrary.event.domain.SaleEvent;
import com.garagesaleslibrary.event.feed.EventXMLProcessor;

import java.io.InputStream;
import java.util.List;

public class SaleEventManager implements SaleEventManagerInterface {

    private static List<SaleEvent> saleEvents = null;

    private static final String TAG = "EventService";

    public static List<SaleEvent> getAllEvents(Context context) {
        Log.d(TAG, "running getAllEvents");

        if (saleEvents == null) {
            saleEvents = parseSaleEventXmlFile(context);
        }

        return saleEvents;
    }

    public static List<SaleEvent> parseSaleEventXmlFile(Context context) {

        EventXMLProcessor parser = new com.garagesaleslibrary.event.feed.EventXMLProcessorAndroidSAX();
        InputStream inputStream = context.getResources().openRawResource(R.raw.naper_events);
        List<SaleEvent> saleEvents = parser.processEventFeed(inputStream);
        return saleEvents;
    }


    public static void addEvent(Context context, SaleEvent event) {
        Log.d(TAG, "running addEvent");

        if (saleEvents == null) {
            saleEvents = parseSaleEventXmlFile(context);
        }

        event.setId(java.util.UUID.randomUUID().toString());
        event.setDate(new java.util.Date());

        saleEvents.add(0, event);

    }

    public static void updateEvent(Context context, SaleEvent event) {
    }

}
