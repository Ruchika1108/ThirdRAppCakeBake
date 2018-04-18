package com.example.vaishali.thirdrappcakebake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Main2ActivityDelcious extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_delcious);
        GridView gridView=(GridView)findViewById(R.id.gridview);
        gridView.setAdapter(new ImageAdapterMain2(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Main2ActivityDelcious.this,""+position,Toast.LENGTH_SHORT).show();

                switch (+position){
                    case 0:
                        Intent i2=new Intent(Main2ActivityDelcious.this,del1.class);
                        startActivity(i2);
                        break;
                    case 1:
                        Intent i3=new Intent(Main2ActivityDelcious.this,del2.class);
                        startActivity(i3);
                        break;
                    case 2:
                        Intent i4=new Intent(Main2ActivityDelcious.this,del3.class);
                        startActivity(i4);
                        break;
                    case 3:
                        Intent i5=new Intent(Main2ActivityDelcious.this,del4.class);
                        startActivity(i5);
                        break;
                    case 4:
                        Intent i6=new Intent(Main2ActivityDelcious.this,del5.class);
                        startActivity(i6);
                        break;
                    case 5:
                        Intent i7=new Intent(Main2ActivityDelcious.this,del6.class);
                        startActivity(i7);
                        break;


                }
            }
        });
    }
}
