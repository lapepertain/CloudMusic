package com.example.xsd.cloudmusic;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
class Main2Activity extends AppCompatActivity {
    Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }
}
