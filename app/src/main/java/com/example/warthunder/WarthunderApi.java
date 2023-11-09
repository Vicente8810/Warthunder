package com.example.warthunder;

import android.net.Uri;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

public class WarthunderApi {
    private final String BASE_URL = "https://gcsmcitskbbmrdfdhikm.supabase.co/rest/v1/";
    private final String API_KEY = "<eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Imdjc21jaXRza2JibXJkZmRoaWttIiwicm9sZSI6ImFub24iLCJpYXQiOjE2OTk1MTgzMjgsImV4cCI6MjAxNTA5NDMyOH0.82CfMZGOQAi5uitjypQrKuRXXDPGT6bKnS283gBPboU>";

    ArrayList<Aviones> getAviones() {
        Uri builtUri = Uri.parse(BASE_URL)
                .buildUpon()
                .appendQueryParameter("apikey", API_KEY)
                .build();
        String url = builtUri.toString();

        return doCall(url);
    }

    private ArrayList<Aviones> arrayJson(String json){
        ArrayList<Aviones> aviones=new ArrayList<>();
        Log.d("uwu","hola");
        try{

            JSONArray jsonaviones=new JSONArray(json);
            Log.d("vicrom","json creado");

            for (int i=0;i<jsonaviones.length();i++){
                JSONObject avionesData=jsonaviones.getJSONObject(i);
                Aviones aviones1=new Aviones();
                aviones1.setId(avionesData.getInt("id"));
                aviones1.setMotores(avionesData.getInt("Motores"));
                aviones1.setVelocidadMaxima(avionesData.getInt("VelocidadMaxima"));
                aviones1.setAlturaMaxima(avionesData.getInt("AlturaMaxima"));
                aviones1.setAñoFabricacion(avionesData.getInt("AñoFabricacion"));
                aviones1.setUrl_imagen(avionesData.getString("Url_imagen"));

                aviones.add(aviones1);
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return aviones; // Devuelve la lista de objetos Aviones

    }



    private ArrayList<Aviones> doCall(String url) {
        try {
            String JsonResponse = HttpUtils.get(url);
            return arrayJson(JsonResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }








}
