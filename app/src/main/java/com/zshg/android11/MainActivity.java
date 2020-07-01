package com.zshg.android11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Snackbar.make(mLayout,
                R.string.camera_permission_available,
                Snackbar.LENGTH_SHORT).show();
    }
}
