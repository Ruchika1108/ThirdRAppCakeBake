package com.example.vaishali.thirdrappcakebake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class egg2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egg2);
    }

    public void ordernowClick(View view) {
        Intent intent = new Intent(egg2.this, DeliveryInfo.class);
        startActivity(intent);
    }
}
