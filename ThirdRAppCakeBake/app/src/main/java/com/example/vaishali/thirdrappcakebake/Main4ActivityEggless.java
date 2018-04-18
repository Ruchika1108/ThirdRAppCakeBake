package com.example.vaishali.thirdrappcakebake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Main4ActivityEggless extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4_eggless);

        GridView gridView=(GridView)findViewById(R.id.gridview);
        gridView.setAdapter(new ImageAdapterMain4(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Main4ActivityEggless.this,""+position,Toast.LENGTH_SHORT).show();
                switch (+position){
                    case 0:
                        Intent i2=new Intent(Main4ActivityEggless.this,egg1.class);
                        startActivity(i2);
                        break;
                    case 1:
                        Intent i3=new Intent(Main4ActivityEggless.this,egg2.class);
                        startActivity(i3);
                        break;
                    case 2:
                        Intent i4=new Intent(Main4ActivityEggless.this,egg3.class);
                        startActivity(i4);
                        break;
                    case 3:
                        Intent i5=new Intent(Main4ActivityEggless.this,egg4.class);
                        startActivity(i5);
                        break;
                    case 4:
                        Intent i6=new Intent(Main4ActivityEggless.this,egg5.class);
                        startActivity(i6);
                        break;
                    case 5:
                        Intent i7=new Intent(Main4ActivityEggless.this,egg6.class);
                        startActivity(i7);
                        break;
                }
            }
        });
    }
}
