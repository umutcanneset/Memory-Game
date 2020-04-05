package com.umutcanneset.memorygame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity {

    private Button singleButton;
    private Button multiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        singleButton=(Button) findViewById(R.id.singleButton);
        multiButton=(Button) findViewById(R.id.multiButton);


        multiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainPage.this, Game.class);
                MainPage.this.startActivity(myIntent);

            }
        });

        singleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainPage.this, GameSingle.class);
                MainPage.this.startActivity(myIntent);

            }
        });
    }

}
