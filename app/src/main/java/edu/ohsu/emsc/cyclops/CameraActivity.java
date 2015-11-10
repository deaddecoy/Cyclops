package edu.ohsu.emsc.cyclops;

import android.app.Activity;
import android.os.Bundle;

/**
 * Steps for using the camera:
 *
 * Detect and Access Camera
 * Create a Preview Class
 * Build a Preview Layout
 * Setup Listeners for Capture
 * Capture and Save Files
 * Release the Camera
 *
 * Test change for github repository.
 *
 */
public class CameraActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.container, Camera2BasicFragment.newInstance())
                    .commit();
        }
    }
}
