package com.biolerplate.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.biolerplate.android.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
