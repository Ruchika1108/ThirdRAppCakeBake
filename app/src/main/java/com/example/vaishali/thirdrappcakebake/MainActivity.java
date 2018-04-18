package com.example.vaishali.thirdrappcakebake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        GridView gridView=(GridView)findViewById(R.id.gridview);
        gridView.setAdapter(new ImageAdapterMain(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,""+position,Toast.LENGTH_SHORT).show();
                switch (+position){
                    case 0:
                        Intent i2=new Intent(MainActivity.this,Main2ActivityDelcious.class);
                        startActivity(i2);
                        break;
                    case 1:
                        Intent i3=new Intent(MainActivity.this,Main3ActivityBirthday.class);
                        startActivity(i3);
                        break;
                    case 2:
                        Intent i4=new Intent(MainActivity.this,Main4ActivityEggless.class);
                        startActivity(i4);
                        break;
                    case 3:
                        Intent i5=new Intent(MainActivity.this,Main5ActivityCartoon.class);
                        startActivity(i5);
                        break;
                    default:;
                        break;
                }
            }
        });
    }

    public void homeClick(View view) {
        Intent intent = new Intent(MainActivity.this, Home.class);
        startActivity(intent);
    }
}
