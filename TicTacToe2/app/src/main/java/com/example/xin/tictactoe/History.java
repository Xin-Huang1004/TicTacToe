package com.example.xin.tictactoe;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class History extends MainActivity {

    private SharedPreferences playerHistory,computerHistory,drawHistory;
    private SharedPreferences playerXHistory,playerOHistory,drawHistory2;
    private SharedPreferences total;
    private int playerCount,computerCount,drawCount;
    private int playerXCount,playerOCount,drawCount2;
    private int totalCount;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        playerHistory = getSharedPreferences("playerHistory", Context.MODE_PRIVATE);
        computerHistory = getSharedPreferences("computerHistory", Context.MODE_PRIVATE);
        drawHistory = getSharedPreferences("drawHistory", Context.MODE_PRIVATE);
        total = getSharedPreferences("total",Context.MODE_PRIVATE);

        playerCount = playerHistory.getInt("playerCounter", 0);
        computerCount = computerHistory.getInt("computerCounter",0);
        drawCount = drawHistory.getInt("drawCounter",0);
        totalCount = total.getInt("totalCounter",0);

        playerXHistory = getSharedPreferences("playerXHistory", Context.MODE_PRIVATE);
        playerOHistory = getSharedPreferences("playerOHistory", Context.MODE_PRIVATE);
        drawHistory2 = getSharedPreferences("drawHistory2", Context.MODE_PRIVATE);


        playerXCount = playerXHistory.getInt("playerXCounter", 0);
        playerOCount = playerOHistory.getInt("playerOCounter",0);
        drawCount2 = drawHistory2.getInt("drawCounter2",0);
        DecimalFormat fnum  =   new  DecimalFormat("##0.00");

        float playerRate = Float.valueOf(playerCount);
        float computerRate = Float.valueOf(computerCount);
        float drawRate = Float.valueOf(drawCount);
        float playerRateInt = playerRate / (playerRate + computerRate + drawRate);
        float computerRateInt = computerRate / (playerRate + computerRate + drawRate);
        float drawRateInt = drawRate / (playerRate + computerRate + drawRate);


        String playerWinRate = fnum.format(playerRateInt);
        TextView playerWinRateText = (TextView) findViewById(R.id.playerRate);
        playerWinRateText.setText(playerWinRate);

        String computerWinRate = fnum.format(computerRateInt);
        TextView computerWinRateText = (TextView) findViewById(R.id.computerRate);
        computerWinRateText.setText(computerWinRate);

        String drawRateStr = fnum.format(drawRateInt);
        TextView drawRateText = (TextView) findViewById(R.id.drawRate);
        drawRateText.setText(drawRateStr);

        float playerXRate = Float.valueOf(playerXCount);
        float playerOrate = Float.valueOf(playerOCount);
        float drawRate2 = Float.valueOf(drawCount2);
        float playerXRateInt = playerXRate / (playerXRate + playerOrate + drawRate2);
        float playerORateInt = playerOrate / (playerXRate + playerOrate + drawRate2);
        float drawRateInt2 = drawRate2 / (playerXRate + playerOrate + drawRate2);

        String playerXWinRate = fnum.format(playerXRateInt);
        TextView playerXWinRateText = (TextView) findViewById(R.id.playerXRate);
        playerXWinRateText.setText(playerXWinRate);

        String playerOWinRate = fnum.format(playerORateInt);
        TextView playerOWinRateText = (TextView) findViewById(R.id.playerORate);
        playerOWinRateText.setText(playerOWinRate);

        String drawRateStr2 = fnum.format(drawRateInt2);
        TextView drawRateText2 = (TextView) findViewById(R.id.drawRate2);
        drawRateText2.setText(drawRateStr2);


        String playerHistory = "Player has " + playerCount + " wins";
        TextView playerHistoryText = (TextView) findViewById(R.id.PlayerHistory);
        playerHistoryText.setText(playerHistory);

        String computerHistory = "Computer has " + computerCount + " wins";
        TextView computerHistoryText = (TextView) findViewById(R.id.ComputerHistory);
        computerHistoryText.setText(computerHistory);

        String drawHistory = "There are " + drawCount + " draw";
        TextView drawHistoryText = (TextView) findViewById(R.id.drawHistory);
        drawHistoryText.setText(drawHistory);


        String playerXHistory = "Player X has " + playerXCount + " wins ";
        TextView playerXHistoryText = (TextView) findViewById(R.id.PlayerXHistory);
        playerXHistoryText.setText(playerXHistory);

        String playerOHistory = "Player O has " + playerOCount + " wins ";
        TextView playerOHistoryText = (TextView) findViewById(R.id.PlayerOHistory);
        playerOHistoryText.setText(playerOHistory);

        String drawHistory2 = "There are " + drawCount2 + " draw";
        TextView drawHistoryText2 = (TextView) findViewById(R.id.DrawHistory2);
        drawHistoryText2.setText(drawHistory2);

        String total = "You have played " + totalCount + " games";
        TextView totalText = (TextView) findViewById(R.id.total);
        totalText.setText(total);
    }
}
