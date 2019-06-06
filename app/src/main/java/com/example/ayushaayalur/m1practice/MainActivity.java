package com.example.ayushaayalur.m1practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void TestUpload() {
        int i = 1 + 1;
        int ii = 2 + 2;
        int iii = i + ii;
    }

    public void doSomeWork() {
        int i = 7;
        int ii = 30;
        int iii = 56;

        String iString = Integer.toString(ii);
        String iiString;

        if(i < 100) {
            iiString = Integer.toString(ii + 6);
        }
    }
}
