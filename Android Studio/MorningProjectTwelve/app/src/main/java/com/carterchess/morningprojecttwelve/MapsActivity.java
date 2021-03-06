package com.carterchess.morningprojecttwelve;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng emobilis = new LatLng(-1.264793, 36.800743);
        mMap.addMarker(new MarkerOptions().position(emobilis).title("Marker in Emobilis"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(emobilis));

        LatLng nakuru = new LatLng(-0.3030988, 36.080026);
        mMap.addMarker(new MarkerOptions().position(nakuru).title("Marker in Nakuru"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(nakuru));

        LatLng Meru = new LatLng(0.0514721, 37.6456042);
        mMap.addMarker(new MarkerOptions().position(Meru).title("Marker in Meru"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Meru));
    }
}
