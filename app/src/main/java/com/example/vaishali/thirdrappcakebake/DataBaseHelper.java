package com.example.vaishali.thirdrappcakebake;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Vaishali on 15-04-2018.
 */
public  class DataBaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_Name="CustomerInfo.db";
    public static final String TABLE_NAME="CustomerDetails";
    public static final String  COL_1="ID";
    public static final String  COL_2="Name";
    public static final String  COL_3="MobNo";
    public static final String  COL_4="EmailId";
    public static final String  COL_5="Address";
    public static final String  COL_6="Date";
    public static final String  COL_7="Time";
    public static final String COL_8="Message";


    public DataBaseHelper(Context context) {
        super(context, DATABASE_Name,null,1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" create table " +TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT ,Name TEXT,MobNo INTEGER, EmailId TEXT,Address TEXT,Date INTEGER,Time INTEGER,Message TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS "+ TABLE_NAME);
        onCreate(db);
    }


    public boolean insertdata(String name,String mobno,String emailid,String address,String date,String time,String message){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,mobno);
        contentValues.put(COL_4,emailid);
        contentValues.put(COL_5,address);
        contentValues.put(COL_6,date);
        contentValues.put(COL_7,time);
        contentValues.put(COL_8,message);
        long result= db.insert(TABLE_NAME,null,contentValues);
        if (result==-1){
            return false;
        }
        else {
            return true;
        }
    }

    public Cursor getAllData(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res =db.rawQuery("select * from "+TABLE_NAME,null);
        return res;
    }

    public boolean updateData(String name,String mobno,String emailid,String address,String date,String time,String message){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,mobno);
        contentValues.put(COL_4,emailid);
        contentValues.put(COL_5,address);
        contentValues.put(COL_6,date);
        contentValues.put(COL_7,time);
        contentValues.put(COL_8,message);
        db.update(TABLE_NAME,contentValues,"MobNo= ?",new String[]{emailid});
        return true;
    }

    public int deleteData(String emailid){
        SQLiteDatabase db=this.getWritableDatabase();
        return db.delete(TABLE_NAME,"MobNo= ?",new String[] {emailid});

    }
}




