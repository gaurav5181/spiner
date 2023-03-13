package com.example.spinner;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBhelper extends SQLiteOpenHelper {
    public DBhelper(@Nullable Context context)
    {
        super(context, "DBb", null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE INFO(ID INTEGER PRIMARY KEY AUTOINCREMENT,EMAIL TEXT,COUNTRY TEXT,STATE TEXT,CITY TEXT,CHAQUE TEXT,GENDER TEXT,PAYMENT TEXT)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {

    }
    public void infoadd(Orderinfo orderinfo){

        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("INSERT INTO INFO(EMAIL,COUNTRY,STATE,CITY,GENDER,CHAQUE,PAYMENT) VALUES('"+orderinfo.getEmail()+"','"+orderinfo.country+"','"+orderinfo.state+"','"+orderinfo.city+"','"+orderinfo.chaque+"','"+orderinfo.gender+"','"+orderinfo.payment+"')");


    }

}
