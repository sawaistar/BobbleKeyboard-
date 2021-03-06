package com.example.noone.mybobblekeyboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.noone.mybobblekeyboard.home.HomeFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_container, new HomeFragment())
                .commit();
    }
}
