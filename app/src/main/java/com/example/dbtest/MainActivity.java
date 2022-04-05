package com.example.dbtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.asd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextInterfac textInterfac = new DBhelper(MainActivity.this,1);
                textInterfac.insert("1번째 메인엑티비티에서 저장된 DB입니다.");
                startActivity(new Intent(MainActivity.this, MainActivity2.class));

            }
        });
    }

}