package com.example.vaishali.thirdrappcakebake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class birth5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth5);
    }

    public void ordernowClick(View view) {
        Intent intent = new Intent(birth5.this, DeliveryInfo.class);
        startActivity(intent);
    }
}
