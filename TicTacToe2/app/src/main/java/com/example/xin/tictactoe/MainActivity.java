package com.example.xin.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button withComputer, withPlayer,history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        withComputer = (Button) findViewById(R.id.withComputer);
        withComputer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WithComputer.class);
                startActivity(intent);
            }

        });

        withPlayer = (Button) findViewById(R.id.withPlayer);
        withPlayer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WithAnotherPlayer.class);
                startActivity(intent);
            }

        });

        history = (Button) findViewById(R.id.history);
        history.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, History.class);
                startActivity(intent);
            }

        });
    }



}
