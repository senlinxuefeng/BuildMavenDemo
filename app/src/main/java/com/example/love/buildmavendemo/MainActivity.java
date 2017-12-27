package com.example.love.buildmavendemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.testlibrary.GradleTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GradleTest gradleTest = new GradleTest();

    }
}
