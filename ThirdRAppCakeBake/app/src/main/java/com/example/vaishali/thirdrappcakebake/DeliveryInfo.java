package com.example.vaishali.thirdrappcakebake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DeliveryInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_info);
    }

    public void placeOrderClick(View view){
        Intent intent;
        intent = new Intent(DeliveryInfo.this,CustomersInfo.class);
        startActivity(intent);
    }
}
