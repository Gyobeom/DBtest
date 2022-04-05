package com.example.dbtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextInterfac textInterfac = new DBhelper(MainActivity2.this,1);
                textInterfac.insert("2번째 액티비티에서 저장된 DB입니다.");
            }
        });

    }
}