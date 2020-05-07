package mymaps.app;

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

        // Add a marker in Sydney and move the camera
        LatLng diponegoro = new LatLng(-7.875354, 112.5311458);
        mMap.addMarker(new MarkerOptions().position(diponegoro).title("Marker in SPBU Diponegoro"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(diponegoro));

        LatLng sudirman = new LatLng(-7.8683126, 112.518552);
        mMap.addMarker(new MarkerOptions().position(sudirman).title("Marker in SPBU Panglima Sudirman"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sudirman));

        LatLng songgoriti = new LatLng(-7.864668, 112.502039);
        mMap.addMarker(new MarkerOptions().position(songgoriti).title("Marker in SPBU Songgoriti"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(songgoriti));

        LatLng pandanrejo = new LatLng(-7.8649335, 112.5423306);
        mMap.addMarker(new MarkerOptions().position(pandanrejo).title("Marker in SPBU Pandanrejo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pandanrejo));

    }
}
