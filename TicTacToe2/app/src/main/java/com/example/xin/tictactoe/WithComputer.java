package com.example.xin.tictactoe;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


//AI logic form https://www.youtube.com/watch?v=6CM5x4B6BKA&t=4s 2017/07/26 22:02
public class WithComputer extends AppCompatActivity {
    Button A1,A2,A3,A4,A5,A6,A7,A8,A9;
    String winner;
    int gameEnd = 0;
    int getStart;
    int computerFirst = 0;
    private SharedPreferences playerHistory,computerHistory,drawHistory,total;
    private SharedPreferences.Editor playerEditor,computerEditor,drawEditor,totalEditor;
    private int playerCount,computerCount,drawCount,totalCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_computer);

        // set up the file for save the number of wins
        playerHistory = getSharedPreferences("playerHistory", Context.MODE_PRIVATE);
        computerHistory = getSharedPreferences("computerHistory", Context.MODE_PRIVATE);
        drawHistory = getSharedPreferences("drawHistory", Context.MODE_PRIVATE);
        total = getSharedPreferences("total", Context.MODE_PRIVATE);
        playerEditor = playerHistory.edit();
        computerEditor = computerHistory.edit();
        drawEditor = drawHistory.edit();
        totalEditor = total.edit();

        Random r = new Random();
        getStart = r.nextInt(2);
        if(getStart == 0) {
            computerFirst = 1;
            Toast.makeText(getApplicationContext(), "Computer first", Toast.LENGTH_SHORT).show();
        }
        if(getStart == 1){
            Toast.makeText(getApplicationContext(), "You first", Toast.LENGTH_SHORT).show();

        }

        A1 = (Button) findViewById(R.id.A1);
        A2 = (Button) findViewById(R.id.A2);
        A3 = (Button) findViewById(R.id.A3);
        A4 = (Button) findViewById(R.id.A4);
        A5 = (Button) findViewById(R.id.A5);
        A6 = (Button) findViewById(R.id.A6);
        A7 = (Button) findViewById(R.id.A7);
        A8 = (Button) findViewById(R.id.A8);
        A9 = (Button) findViewById(R.id.A9);

    if(getStart == 0){
        ComputerAttrackMove();
        getStart = 1;
    }
    if(getStart == 1) {
        A1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (A1.getText().toString().equals("")) {
                    A1.setText("X");
                    A1.setTextColor(Color.rgb(255, 0, 0));
                    if(computerFirst == 1){
                        ComputerAttrackMove();
                    }
                    else{
                        ComputerDefendMove();
                    }
                }
                end();
            }
        });

        A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (A2.getText().toString().equals("")) {
                    A2.setText("X");
                    A2.setTextColor(Color.rgb(255, 0, 0));
                    if(computerFirst == 1){
                        ComputerAttrackMove();
                    }
                    else{
                        ComputerDefendMove();
                    }
                }
                end();
            }
        });

        A3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (A3.getText().toString().equals("")) {
                    A3.setText("X");
                    A3.setTextColor(Color.rgb(255, 0, 0));
                    if(computerFirst == 1){
                        ComputerAttrackMove();
                    }
                    else{
                        ComputerDefendMove();
                    }
                }
                end();
            }
        });

        A4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (A4.getText().toString().equals("")) {
                    A4.setText("X");
                    A4.setTextColor(Color.rgb(255, 0, 0));
                    if(computerFirst == 1){
                        ComputerAttrackMove();
                    }
                    else{
                        ComputerDefendMove();
                    }
                }
                end();
            }
        });

        A5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (A5.getText().toString().equals("")) {
                    A5.setText("X");
                    A5.setTextColor(Color.rgb(255, 0, 0));
                    if(computerFirst == 1){
                        ComputerAttrackMove();
                    }
                    else{
                        ComputerDefendMove();
                    }
                }
                end();
            }
        });

        A6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (A6.getText().toString().equals("")) {
                    A6.setText("X");
                    A6.setTextColor(Color.rgb(255, 0, 0));
                    if(computerFirst == 1){
                        ComputerAttrackMove();
                    }
                    else{
                        ComputerDefendMove();
                    }
                }
                end();
            }
        });

        A7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (A7.getText().toString().equals("")) {
                    A7.setText("X");
                    A7.setTextColor(Color.rgb(255, 0, 0));
                    if(computerFirst == 1){
                        ComputerAttrackMove();
                    }
                    else{
                        ComputerDefendMove();
                    }
                }
                end();
            }
        });

        A8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (A8.getText().toString().equals("")) {
                    A8.setText("X");
                    A8.setTextColor(Color.rgb(255, 0, 0));
                    if(computerFirst == 1){
                        ComputerAttrackMove();
                    }
                    else{
                        ComputerDefendMove();
                    }
                }
                end();
            }
        });

        A9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (A9.getText().toString().equals("")) {
                    A9.setText("X");
                    A9.setTextColor(Color.rgb(255, 0, 0));
                    if(computerFirst == 1){
                        ComputerAttrackMove();
                    }
                    else{
                        ComputerDefendMove();
                    }
                }
                end();
            }
        });
    }
    }

    public void ComputerAttrackMove() {
            end();
            Button move = null;
            move = BasicMove("O");
            if (move == null) {
                move = BasicMove("X");
                if (move == null) {
                    move = OtherMove();
                    if (move == null) {
                        move = firstMove();
                    }
                }
            }
            if(gameEnd == 0 && move != null) {
                move.setText("O");
                move.setTextColor(Color.rgb(0, 0, 0));
            }
    }

    public void ComputerDefendMove(){
        end();
        Button move = null;
        move = BasicMove("X");
        if (move == null) {
            move = BasicMove("O");
            if (move == null) {
                move = OtherMove();
                if (move == null) {
                    move = firstMove();
                }
            }
        }
        if(gameEnd == 0 && move != null) {
            move.setText("O");
            move.setTextColor(Color.rgb(0, 0, 0));
        }

    }

    public Button BasicMove(String point){
        //check for horizontal
        if(A2.getText().toString() == A3.getText().toString() && A2.getText().toString()== point && A1.getText().toString() == ""){
            return A1;
        }
        if(A1.getText().toString() == A3.getText().toString() && A1.getText().toString()== point && A2.getText().toString() == ""){
            return A2;
        }
        if(A1.getText().toString() == A2.getText().toString() && A1.getText().toString()== point && A3.getText().toString() == ""){
            return A3;
        }
        if(A5.getText().toString() == A6.getText().toString() && A5.getText().toString()== point && A4.getText().toString() == ""){
            return A4;
        }
        if(A4.getText().toString() == A6.getText().toString() && A4.getText().toString()== point && A5.getText().toString() == ""){
            return A5;
        }
        if(A4.getText().toString() == A5.getText().toString() && A4.getText().toString()== point && A6.getText().toString() == ""){
            return A6;
        }
        if(A8.getText().toString() == A9.getText().toString() && A8.getText().toString()== point && A7.getText().toString() == ""){
            return A7;
        }
        if(A7.getText().toString() == A9.getText().toString() && A7.getText().toString()== point && A8.getText().toString() == ""){
            return A8;
        }
        if(A7.getText().toString() == A8.getText().toString() && A7.getText().toString()== point && A9.getText().toString() == ""){
            return A9;
        }

        //check for vertical
        if(A4.getText().toString() == A7.getText().toString() && A4.getText().toString()== point && A1.getText().toString() == ""){
            return A1;
        }
        if(A1.getText().toString() == A7.getText().toString() && A1.getText().toString()== point && A4.getText().toString() == ""){
            return A4;
        }
        if(A1.getText().toString() == A4.getText().toString() && A1.getText().toString()== point && A7.getText().toString() == ""){
            return A7;
        }
        if(A5.getText().toString() == A8.getText().toString() && A5.getText().toString()== point && A2.getText().toString() == ""){
            return A2;
        }
        if(A2.getText().toString() == A8.getText().toString() && A2.getText().toString()== point && A5.getText().toString() == ""){
            return A5;
        }
        if(A2.getText().toString() == A5.getText().toString() && A2.getText().toString()== point && A8.getText().toString() == ""){
            return A8;
        }
        if(A6.getText().toString() == A9.getText().toString() && A6.getText().toString()== point && A3.getText().toString() == ""){
            return A3;
        }
        if(A3.getText().toString() == A9.getText().toString() && A3.getText().toString()== point && A6.getText().toString() == ""){
            return A6;
        }
        if(A3.getText().toString() == A6.getText().toString() && A3.getText().toString()== point && A9.getText().toString() == ""){
            return A9;
        }

        //check for diagonal
        if(A5.getText().toString() == A9.getText().toString() && A5.getText().toString()== point && A1.getText().toString() == ""){
            return A1;
        }
        if(A1.getText().toString() == A9.getText().toString() && A1.getText().toString()== point && A5.getText().toString() == ""){
            return A5;
        }
        if(A1.getText().toString() == A5.getText().toString() && A1.getText().toString()== point && A9.getText().toString() == ""){
            return A9;
        }
        if(A5.getText().toString() == A7.getText().toString() && A5.getText().toString()== point && A3.getText().toString() == ""){
            return A3;
        }
        if(A3.getText().toString() == A7.getText().toString() && A3.getText().toString()== point && A5.getText().toString() == ""){
            return A5;
        }
        if(A3.getText().toString() == A5.getText().toString() && A3.getText().toString()== point && A7.getText().toString() == ""){
            return A7;
        }

        return null;
    }

    public Button OtherMove(){
        // computer to attrack basically put mark "O" to for corner
        if(A1.getText().toString() == "O"){
            if(A3.getText().toString() == ""){
                return A3;
            }
            if(A7.getText().toString() == ""){
                return A7;
            }
            if(A9.getText().toString() == ""){
                return A9;
            }
        }

        if(A3.getText().toString() == "O"){
            if(A1.getText().toString() == ""){
                return A1;
            }
            if(A7.getText().toString() == ""){
                return A7;
            }
            if(A9.getText().toString() == ""){
                return A9;
            }
        }

        if(A7.getText().toString() == "O"){
            if(A1.getText().toString() == ""){
                return A1;
            }
            if(A3.getText().toString() == ""){
                return A3;
            }
            if(A9.getText().toString() == ""){
                return A9;
            }
        }

        if(A9.getText().toString() == "O"){
            if(A1.getText().toString() == ""){
                return A1;
            }
            if(A3.getText().toString() == ""){
                return A3;
            }
            if(A7.getText().toString() == ""){
                return A7;
            }

        }
        return null;
    }

    public Button firstMove() {
        //usually as computer's first move
        int chcker = 0;
        List<Button> buttonList = new ArrayList<Button>();
        buttonList.add(A1);
        buttonList.add(A2);
        buttonList.add(A3);
        buttonList.add(A4);
        buttonList.add(A5);
        buttonList.add(A6);
        buttonList.add(A7);
        buttonList.add(A8);
        buttonList.add(A9);

        while (chcker == 0 && gameEnd != 1) {
            Random r1 = new Random();
            int randomNum = r1.nextInt(9);
            Button tmpButton = buttonList.get(randomNum);
            if (tmpButton.getText().toString() == "") {
                return tmpButton;
            }
        }
        return null;
    }

    public void end(){
        String oneLeft,oneMid,oneRight,twoLeft,twoMid,twoRight,threeLeft,threeMid,threeRight;
        oneLeft = A1.getText().toString();
        oneMid = A2.getText().toString();
        oneRight = A3.getText().toString();
        twoLeft = A4.getText().toString();
        twoMid = A5.getText().toString();
        twoRight = A6.getText().toString();
        threeLeft = A7.getText().toString();
        threeMid = A8.getText().toString();
        threeRight = A9.getText().toString();


        //horizontal
        if(oneLeft.equals(oneMid) && oneMid.equals(oneRight) && (oneLeft == "X" || oneLeft == "O")) {
            winner = "Winner: Player " + oneLeft + " !";
            gameEnd = 1;
            showdialog();

        }
        else if(twoLeft.equals(twoMid) && twoMid.equals(twoRight) && (twoLeft == "X" || twoLeft == "O")) {
            winner = "Winner: Player " + twoLeft + " !";
            showdialog();
            gameEnd = 1;

        }
        else if(threeLeft.equals(threeMid) && threeMid.equals(threeRight) && (threeLeft == "X" || threeLeft == "O")) {
            winner = "Winner: Player " + threeLeft + " !";
            showdialog();
            gameEnd = 1;

        }

        // vertical
        else if(oneLeft.equals(twoLeft) && twoLeft.equals(threeLeft) && (oneLeft == "X" || oneLeft == "O")) {
            winner = "Winner: Player " + oneLeft + " !";
            showdialog();
            gameEnd = 1;

        }

        else if(oneMid.equals(twoMid) && twoMid.equals(threeMid) && (oneMid == "X" || oneMid == "O")) {
            winner = "Winner: Player " + oneMid + " !";
            showdialog();
            gameEnd = 1;

        }
        else if(oneRight.equals(twoRight) && twoRight.equals(threeRight) && (oneRight == "X" || oneRight == "O")) {
            winner = "Winner: Player " + oneRight + " !";
            showdialog();
            gameEnd = 1;

        }

        // diagonal
        else if(oneLeft.equals(twoMid) && twoMid.equals(threeRight) && (oneLeft == "X" || oneLeft == "O") ) {
            winner = "Winner: Player " + oneLeft + " !";
            showdialog();
            gameEnd = 1;
        }

        else if(oneRight.equals(twoMid) && twoMid.equals(threeLeft) && (oneRight == "X" || oneRight == "O")) {
            winner = "Winner: Player " + oneRight + " !";
            showdialog();
            gameEnd = 1;
        }

        else if(oneLeft != "" && oneMid != "" && oneRight != "" &&
                twoLeft != "" && twoMid != "" && twoRight != "" &&
                threeLeft != "" && threeMid != "" && threeRight != ""){
            winner = "Draw !";
            showdialog();
            gameEnd = 1;
        }
    }

    public void showdialog() {
        if (winner.equals("Winner: Player X !")){
            winner = "Player wins !";
            playerCount = playerHistory.getInt("playerCounter", 0);
            playerCount++;
            playerEditor.putInt("playerCounter", playerCount);
            playerEditor.commit();
        }

        if(winner.equals("Winner: Player O !")){
            winner = "Computer wins !";
            computerCount = computerHistory.getInt("computerCounter",0);
            computerCount++;
            computerEditor.putInt("computerCounter",computerCount);
            computerEditor.commit();
        }

        if(winner.equals("Draw !")){
            drawCount = drawHistory.getInt("drawCounter",0);
            drawCount++;
            drawEditor.putInt("drawCounter",drawCount);
            drawEditor.commit();
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
            Intent intent = new Intent(WithComputer.this, MainActivity.class);
            startActivity(intent);
        }
    };
    private DialogInterface.OnClickListener click2=new DialogInterface.OnClickListener()
    {
        @Override
        public void onClick(DialogInterface arg0,int arg1) {arg0.cancel();
            finish();
            Intent intent = new Intent(WithComputer.this, WithComputer.class);
            startActivity(intent);
        }
    };


}
