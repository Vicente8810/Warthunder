package com.example.warthunder;

import android.net.Uri;

import java.io.IOException;
import java.util.ArrayList;

public class WarthunderApi {
    private final String BASE_URL = "https://gcsmcitskbbmrdfdhikm.supabase.co/rest/v1/";
    private final String API_KEY = "<eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Imdjc21jaXRza2JibXJkZmRoaWttIiwicm9sZSI6ImFub24iLCJpYXQiOjE2OTk1MTgzMjgsImV4cCI6MjAxNTA5NDMyOH0.82CfMZGOQAi5uitjypQrKuRXXDPGT6bKnS283gBPboU>";

    String getAviones(String pais) {
        Uri builtUri = Uri.parse(BASE_URL)
                .buildUpon()
                .appendQueryParameter("apikey", API_KEY)
                .build();
        String url = builtUri.toString();

        return doCall(url);
    }

    private ArrayList<Aviones> arrayJson(String json){



    }



    private String doCall(String url) {
        try {
            String JsonResponse = HttpUtils.get(url);
            return JsonResponse;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }








}
