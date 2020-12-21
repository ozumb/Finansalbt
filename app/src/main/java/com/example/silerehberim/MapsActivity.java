package com.example.silerehberim;

import androidx.fragment.app.FragmentActivity;

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

        LatLng fener = new LatLng(41.17775943097829, 29.61668996424161);
        mMap.addMarker(new MarkerOptions().position(fener).title("Marker in Şile Feneri"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(fener,10));

        LatLng kale = new LatLng(41.18233659353632, 29.612903671133786);
        mMap.addMarker(new MarkerOptions().position(kale).title("Marker in Şile Kalesi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kale,10));

        LatLng masatliik = new LatLng(41.18017965670974, 29.61358576998159);
        mMap.addMarker(new MarkerOptions().position(masatliik).title("Marker in Maşatlık Parkı"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(masatliik,10));

        LatLng liman = new LatLng(41.178880181663246, 29.600565539662597);
        mMap.addMarker(new MarkerOptions().position(liman).title("Marker in Şile Limanı"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(liman,10));

        LatLng aglayankaya = new LatLng(41.175650388812414, 29.623975829223934);
        mMap.addMarker(new MarkerOptions().position(aglayankaya).title("Marker in Ağlayankaya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(aglayankaya,10));

       LatLng agva = new LatLng(41.13879551106025, 29.855726892053145);
        mMap.addMarker(new MarkerOptions().position(agva).title("Marker in Ağva"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(agva,10));

    }
}