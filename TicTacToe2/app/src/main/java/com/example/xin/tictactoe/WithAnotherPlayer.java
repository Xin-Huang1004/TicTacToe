package com.example.xin.tictactoe;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WithAnotherPlayer extends AppCompatActivity {
    Button B1,B2,B3,B4,B5,B6,B7,B8,B9;
    int Player = 1;
    String winner;

    private SharedPreferences playerXHistory,playerOHistory,drawHistory2,total;
    private SharedPreferences.Editor playerXEditor,playerOEditor,drawEditor2,totalEditor;
    private int playerXCount,playerOCount,drawCount2,totalCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_another_player);

        playerXHistory = getSharedPreferences("playerXHistory", Context.MODE_PRIVATE);
        playerOHistory = getSharedPreferences("playerOHistory", Context.MODE_PRIVATE);
        drawHistory2 = getSharedPreferences("drawHistory2", Context.MODE_PRIVATE);
        total = getSharedPreferences("total", Context.MODE_PRIVATE);
        playerXEditor = playerXHistory.edit();
        playerOEditor = playerOHistory.edit();
        drawEditor2 = drawHistory2.edit();
        totalEditor = total.edit();

        B1 = (Button) findViewById(R.id.B1);
        B2 = (Button) findViewById(R.id.B2);
        B3 = (Button) findViewById(R.id.B3);
        B4 = (Button) findViewById(R.id.B4);
        B5 = (Button) findViewById(R.id.B5);
        B6 = (Button) findViewById(R.id.B6);
        B7 = (Button) findViewById(R.id.B7);
        B8 = (Button) findViewById(R.id.B8);
        B9 = (Button) findViewById(R.id.B9);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (B1.getText().toString().equals("")) {
                    if (Player == 1) {
                        Player = 2;
                        B1.setText("X");
                        B1.setTextColor(Color.rgb(255, 0, 0));
                    } else if (Player == 2) {
                        Player = 1;
                        B1.setText("O");
                        B1.setTextColor(Color.rgb(0, 0, 255));
                    }

                }
                end();
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if (B2.getText().toString().equals("")) {
                    if (Player == 1) {
                        Player = 2;
                        B2.setText("X");
                        B2.setTextColor(Color.rgb(255, 0, 0));
                    } else if (Player == 2) {
                        Player = 1;
                        B2.setText("O");
                        B2.setTextColor(Color.rgb(0, 0, 255));
                    }

                }
                end();

            }
        });

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if (B3.getText().toString().equals("")) {
                    if (Player == 1) {
                        Player = 2;
                        B3.setText("X");
                        B3.setTextColor(Color.rgb(255, 0, 0));
                    } else if (Player == 2) {
                        Player = 1;
                        B3.setText("O");
                        B3.setTextColor(Color.rgb(0, 0, 255));
                    }

                }
                end();

            }
        });

        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if (B4.getText().toString().equals("")) {
                    if (Player == 1) {
                        Player = 2;
                        B4.setText("X");
                        B4.setTextColor(Color.rgb(255, 0, 0));
                    } else if (Player == 2) {
                        Player = 1;
                        B4.setText("O");
                        B4.setTextColor(Color.rgb(0, 0, 255));
                    }

                }
                end();

            }
        });

        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if (B5.getText().toString().equals("")) {
                    if (Player == 1) {
                        Player = 2;
                        B5.setText("X");
                        B5.setTextColor(Color.rgb(255, 0, 0));
                    } else if (Player == 2) {
                        Player = 1;
                        B5.setText("O");
                        B5.setTextColor(Color.rgb(0, 0, 255));
                    }

                }
                end();

            }
        });

        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if (B6.getText().toString().equals("")) {
                    if (Player == 1) {
                        Player = 2;
                        B6.setText("X");
                        B6.setTextColor(Color.rgb(255, 0, 0));
                    } else if (Player == 2) {
                        Player = 1;
                        B6.setText("O");
                        B6.setTextColor(Color.rgb(0, 0, 255));
                    }

                }
                end();

            }
        });

        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if (B7.getText().toString().equals("")) {
                    if (Player == 1) {
                        Player = 2;
                        B7.setText("X");
                        B7.setTextColor(Color.rgb(255, 0, 0));
                    } else if (Player == 2) {
                        Player = 1;
                        B7.setText("O");
                        B7.setTextColor(Color.rgb(0, 0, 255));
                    }

                }
                end();

            }
        });

        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if (B8.getText().toString().equals("")) {
                    if (Player == 1) {
                        Player = 2;
                        B8.setText("X");
                        B8.setTextColor(Color.rgb(255, 0, 0));
                    } else if (Player == 2) {
                        Player = 1;
                        B8.setText("O");
                        B8.setTextColor(Color.rgb(0, 0, 255));
                    }

                }
                end();

            }
        });

        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if (B9.getText().toString().equals("")) {
                    if (Player == 1) {
                        Player = 2;
                        B9.setText("X");
                        B9.setTextColor(Color.rgb(255, 0, 0));
                    } else if (Player == 2) {
                        Player = 1;
                        B9.setText("O");
                        B9.setTextColor(Color.rgb(0, 0, 255));
                    }

                }
                end();

            }
        });
    }

    public void end(){
        String oneLeft,oneMid,oneRight,twoLeft,twoMid,twoRight,threeLeft,threeMid,threeRight;
        oneLeft = B1.getText().toString();
        oneMid = B2.getText().toString();
        oneRight = B3.getText().toString();
        twoLeft = B4.getText().toString();
        twoMid = B5.getText().toString();
        twoRight = B6.getText().toString();
        threeLeft = B7.getText().toString();
        threeMid = B8.getText().toString();
        threeRight = B9.getText().toString();


        // horizontal
        if(oneLeft.equals(oneMid) && oneMid.equals(oneRight) && (oneLeft == "X" || oneLeft == "O")) {
            winner = "Winner: Player " + oneLeft + " !";
            showdialog();
        }
        else if(twoLeft.equals(twoMid) && twoMid.equals(twoRight) && (twoLeft == "X" || twoLeft == "O")) {
            winner = "Winner: Player " + twoLeft + " !";
            showdialog();
        }
        else if(threeLeft.equals(threeMid) && threeMid.equals(threeRight) && (threeLeft == "X" || threeLeft == "O")) {
            winner = "Winner: Player " + threeLeft + " !";
            showdialog();
        }

        // vertical
        else if(oneLeft.equals(twoLeft) && twoLeft.equals(threeLeft) && (oneLeft == "X" || oneLeft == "O")) {
            winner = "Winner: Player " + oneLeft + " !";
            showdialog();
        }

        else if(oneMid.equals(twoMid) && twoMid.equals(threeMid) && (oneMid == "X" || oneMid == "O")) {
            winner = "Winner: Player " + oneMid + " !";
            showdialog();
        }
        else if(oneRight.equals(twoRight) && twoRight.equals(threeRight) && (oneRight == "X" || oneRight == "O")) {
            winner = "Winner: Player " + oneRight + " !";
            showdialog();
        }

        // diagonal
        else if(oneLeft.equals(twoMid) && twoMid.equals(threeRight) && (oneLeft == "X" || oneLeft == "O") ) {
            winner = "Winner: Player " + oneLeft + " !";
            showdialog();
        }

        else if(oneRight.equals(twoMid) && twoMid.equals(threeLeft) && (oneRight == "X" || oneRight == "O")) {
            winner = "Winner: Player " + oneRight + " !";
            showdialog();
        }

        // draw
        else if(oneLeft != "" && oneMid != "" && oneRight != "" &&
                twoLeft != "" && twoMid != "" && twoRight != "" &&
                threeLeft != "" && threeMid != "" && threeRight != ""){
            winner = "Draw !";
            showdialog();
        }

    }

    public void showdialog() {
        if (winner.equals("Winner: Player X !")){
            playerXCount = playerXHistory.getInt("playerXCounter", 0);
            playerXCount++;
            playerXEditor.putInt("playerXCounter", playerXCount);
            playerXEditor.commit();
        }

        if(winner.equals("Winner: Player O !")){
            playerOCount = playerOHistory.getInt("playerOCounter",0);
            playerOCount++;
            playerOEditor.putInt("playerOCounter",playerOCount);
            playerOEditor.commit();
        }

        if(winner.equals("Draw !")){
            drawCount2 = drawHistory2.getInt("drawCounter2",0);
            drawCount2++;
            drawEditor2.putInt("drawCounter2",drawCount2);
            drawEditor2.commit();
        }

        totalCount = total.getInt("totalCounter",0);
        totalCount++;
        totalEditor.putInt("totalCounter",totalCount);
        totalEditor.commit();

        AlertDialog.Builder alertdialogbuilder=new AlertDialog.Builder(this);
        alertdialogbuilder.setMessage(winner);
        alertdialogbuilder.setPositiveButton("menu", click1);
        alertdialogbuilder.setNegativeButton("refresh", click2);
        AlertDialog alertdialog1=alertdialogbuilder.create();
        alertdialog1.show();
        alertdialog1.setCancelable(false);
    }
    private DialogInterface.OnClickListener click1=new DialogInterface.OnClickListener(){
        @Override
        public void onClick(DialogInterface arg0,int arg1) {
            Intent intent = new Intent(WithAnotherPlayer.this, MainActivity.class);
            startActivity(intent);
        }
    };
    private DialogInterface.OnClickListener click2=new DialogInterface.OnClickListener()
    {
        @Override
        public void onClick(DialogInterface arg0,int arg1) {arg0.cancel();
            finish();
            Intent intent = new Intent(WithAnotherPlayer.this, WithAnotherPlayer.class);
            startActivity(intent);
        }
    };
}

