package com.example.vaishali.thirdrappcakebake;

import android.content.Intent;
import android.database.Cursor;
import android.location.Address;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.jar.Attributes;

public class DeliveryInfo extends AppCompatActivity {
    DataBaseHelper myDb;
    EditText editName,edittMobNo,editEmailId,editAddress,editDate,editTime,editMessage;
    Button btInsert,btUpdate,btDelete,btViewAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_info);
        myDb = new DataBaseHelper(this);

        editName = (EditText) findViewById(R.id.etName);
        edittMobNo = (EditText) findViewById(R.id.etMobNo);
        editEmailId = (EditText) findViewById(R.id.etEmailId);
        editAddress = (EditText) findViewById(R.id.etAddress);
        editDate = (EditText) findViewById(R.id.etDate);
        editTime = (EditText) findViewById(R.id.etTime);
        editMessage = (EditText) findViewById(R.id.etMessage);
        btInsert = (Button) findViewById(R.id.Insert);
        btUpdate=(Button)findViewById(R.id.Update);
        btDelete=(Button)findViewById(R.id.Delete);
        btViewAll=(Button)findViewById(R.id.ViewAll);
        InsertData();
        UpdateData();
        DeleteData();
        viewall();
    }
    public void InsertData()
    {
        btInsert.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted=myDb.insertdata(editName.getText().toString(),edittMobNo.getText().toString(), editEmailId.getText().toString(),
                        editAddress.getText().toString(),editDate.getText().toString(),
                        editTime.getText().toString(),editMessage.getText().toString());
                if (isInserted==true){
                    Toast.makeText(DeliveryInfo.this,"Data is inserted", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(DeliveryInfo.this,"Data not inserted",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void UpdateData(){
        btUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isUpdate=myDb.updateData(editName.getText().toString(),edittMobNo.getText().toString(),
                        editEmailId.getText().toString(),editAddress.getText().toString(),editDate.getText().toString(),
                        editTime.getText().toString(),editMessage.getText().toString());
                if (isUpdate==true)
                {
                    Toast.makeText(DeliveryInfo.this,"Data is updated",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(DeliveryInfo.this,"Data not updated",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void DeleteData(){
        btDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Integer deletedRows=myDb.deleteData(edittMobNo.getText().toString());
              if(deletedRows>0){
                  Toast.makeText(DeliveryInfo.this, "Data is Deleted", Toast.LENGTH_LONG).show();
              } else {
                  Toast.makeText(DeliveryInfo.this, "Data is not Deleted", Toast.LENGTH_LONG).show();
              }
            }
        });
    }

    public void viewall(){
        btViewAll.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Cursor res =myDb.getAllData();
                        if (res.getCount()==0){
                            showMessage("Error","Nothing Found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while (res.moveToNext()){
                          buffer.append("ID: "+ res.getString(0)+"\n");
                            buffer.append("Name: "+ res.getString(1)+"\n");
                            buffer.append("MobNo: "+ res.getString(2)+"\n");
                            buffer.append("EmailId: "+ res.getString(3)+"\n");
                            buffer.append("Address: "+ res.getString(4)+"\n");
                            buffer.append("Date: "+ res.getString(5)+"\n");
                            buffer.append("Time: "+ res.getString(6)+"\n");
                            buffer.append("Message: "+ res.getString(7)+"\n\n\n");

                        }
                        showMessage("Data",buffer.toString());
                    }
                }
        );
    }

    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }



    //public void placeOrderClick(View view){
      //  Intent intent;
        //intent = new Intent(DeliveryInfo.this,CustomersInfo.class);
        //startActivity(intent);
    //}


}
