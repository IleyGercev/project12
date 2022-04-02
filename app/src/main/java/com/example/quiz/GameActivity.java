package com.example.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamelevels);

        Button buttonBack = (Button) findViewById(R.id.button_back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(GameActivity.this, MainActivity.class);
                    startActivity(intent);finish();
                }catch (Exception e) {

                }
            }
        });

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        int i =2;
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (i==1) {
                        Intent intent = new Intent(GameActivity.this, Level1.class);
                        startActivity(intent);
                        finish();
                    }
                    if (i==2){
                        Intent intent = new Intent(GameActivity.this, Level1.class);
                        startActivity(intent);
                        finish();
                    }
                }catch (Exception e) {

                }
            }
        });
    }
    @Override
    public void onBackPressed() {
        try {
            Intent intent = new Intent(GameActivity.this, MainActivity.class);
            startActivity(intent);finish();
        }catch (Exception e) {

        }
    }
}