package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int scoreforTeamA = 0;
int scoreforTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    public void scoreThree(View view){
        scoreforTeamA=scoreforTeamA+3;
        displayForTeamA(scoreforTeamA);

    }
    public void scoreTwo(View view){
        scoreforTeamA=scoreforTeamA+2;
        displayForTeamA(scoreforTeamA);
    }
    public void scoreFreeThrow(View view){
        scoreforTeamA=scoreforTeamA+1;
        displayForTeamA(scoreforTeamA);
    }
    public void ResetScore(View view){
     scoreforTeamA = 0;
     scoreforTeamB = 0;
     displayForTeamB(scoreforTeamB);
     displayForTeamA(scoreforTeamA);
    }
    public void scoreThreeforB(View view){
        scoreforTeamB=scoreforTeamB+3;
        displayForTeamB(scoreforTeamB);

    }
    public void scoreTwoforB(View view) {
        scoreforTeamB = scoreforTeamB + 2;
        displayForTeamB(scoreforTeamB);
    }
    public void scoreOneforB(View view) {
        scoreforTeamB = scoreforTeamB + 1;
        displayForTeamB(scoreforTeamB);
    }
        /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
