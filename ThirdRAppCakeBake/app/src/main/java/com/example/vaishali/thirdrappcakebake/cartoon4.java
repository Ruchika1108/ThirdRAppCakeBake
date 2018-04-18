package com.example.vaishali.thirdrappcakebake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cartoon4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartoon4);
    }

    public void ordernowClick(View view) {
        Intent intent = new Intent(cartoon4.this, DeliveryInfo.class);
        startActivity(intent);
    }
}
