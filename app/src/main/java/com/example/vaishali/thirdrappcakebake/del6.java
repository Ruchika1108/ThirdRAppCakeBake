package com.example.vaishali.thirdrappcakebake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class del6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_del6);
    }


    public void ordernowClick(View view) {
        Intent intent = new Intent(del6.this, DeliveryInfo.class);
        startActivity(intent);
    }
}
