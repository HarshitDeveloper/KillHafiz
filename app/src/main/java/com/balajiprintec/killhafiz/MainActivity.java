package com.balajiprintec.killhafiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.gospelware.liquidbutton.LiquidButton;

public class MainActivity extends AppCompatActivity {

    LiquidButton liquidButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        liquidButton = (LiquidButton) findViewById(R.id.button);
        liquidButton.startPour();
        liquidButton.setEnabled(false);
        liquidButton.setFillAfter(true);
        liquidButton.setAutoPlay(true);

        liquidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, level1.class);
                startActivity(intent);
                // Toast.makeText(MainActivity.this, "Awesome", Toast.LENGTH_SHORT).show();


            }
        });

        liquidButton.setPourFinishListener(new LiquidButton.PourFinishListener() {
            @Override
            public void onPourFinish() {
                liquidButton.setEnabled(true);
            }

            @Override
            public void onProgressUpdate(float progress) {

            }
        });
    }
}
