package com.example.dbtest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBhelper extends SQLiteOpenHelper implements TextInterfac{
    static final String DATABASE_NAME = "testmemo.db";
    public DBhelper(Context context,int version,String DATABASE_NAME) {
        super(context, DATABASE_NAME,null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Memo(todo TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS Memo");
        onCreate(db);
    }

    @Override
    public void testMethod(String result) {

    }

    @Override
    public void insert(String memo) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("INSERT INTO Memo VALUES('"+memo+"')");
        db.close();
    }

    @Override
    public void Delete(String memo) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE Memo WHERE todo= '"+memo+ "'");
        db.close();
    }

}
