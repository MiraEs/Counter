package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset button
     */
    public void resetScores(View v) {
        score = 0;
        scoreB = 0;
        displayForTeamA(0);
        displayForTeamB(0);
    }



    /**
     * Button functionality team A
     */
    public void didTapThreeButton(View v) {
        score = score + 3;
        displayForTeamA(score);
    }

    public void didTapTwoButton(View v) {
        score = score + 2;
        displayForTeamA(score);
    }

    public void didTapFreeThrow(View v) {
        score = score + 1;
        displayForTeamA(score);
    }

    /**
     * Button functionality team B
     */
    public void didTapThreeButtonB(View v) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void didTapTwoButtonB(View v) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void didTapFreeThrowB(View v) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

}
