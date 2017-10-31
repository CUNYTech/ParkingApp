package com.example.android.parkhere;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback;
import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.StreetViewPanoramaFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;


public class ParkHereStreet extends AppCompatActivity implements OnStreetViewPanoramaReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_park_here_street);
        StreetViewPanoramaFragment streetViewPanoramaFragment =
                (StreetViewPanoramaFragment) getFragmentManager().findFragmentById(R.id.streetviewpanorama);
        streetViewPanoramaFragment.getStreetViewPanoramaAsync(this);

    }

    @Override
    public void onStreetViewPanoramaReady(StreetViewPanorama panorama) {
        // Set the panorama location on startup, when no
        // panoramas have been loaded.

        panorama.setPosition(new LatLng(40.7484, -73.9857));
        StreetViewPanoramaCamera camera = new StreetViewPanoramaCamera.Builder()
                .bearing (180)
                .build ();
        panorama.animateTo(camera, 10000);
    }
}
