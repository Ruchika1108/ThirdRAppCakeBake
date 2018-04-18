package com.example.vaishali.thirdrappcakebake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class Main5ActivityCartoon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5_cartoon);

        GridView gridView=(GridView)findViewById(R.id.gridview);
        gridView.setAdapter(new ImageAdapterMain5(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Main5ActivityCartoon.this,""+position,Toast.LENGTH_SHORT).show();
                switch (+position){
                    case 0:
                        Intent i2=new Intent(Main5ActivityCartoon.this,cartoon1.class);
                        startActivity(i2);
                        break;
                    case 1:
                        Intent i3=new Intent(Main5ActivityCartoon.this,cartoon2.class);
                        startActivity(i3);
                        break;
                    case 2:
                        Intent i4=new Intent(Main5ActivityCartoon.this,cartoon3.class);
                        startActivity(i4);
                        break;
                    case 3:
                        Intent i5=new Intent(Main5ActivityCartoon.this,cartoon4.class);
                        startActivity(i5);
                        break;
                    case 4:
                        Intent i6=new Intent(Main5ActivityCartoon.this,cartoon5.class);
                        startActivity(i6);
                        break;
                    case 5:
                        Intent i7=new Intent(Main5ActivityCartoon.this,cartoon6.class);
                        startActivity(i7);
                        break;
                }
            }
        });
    }
}
