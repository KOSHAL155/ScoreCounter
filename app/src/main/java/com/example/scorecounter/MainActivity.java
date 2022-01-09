package com.example.scorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score_A=0;
    int score_B=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void threePoint(View view){
        score_A =score_A+3;
        diplayScore(score_A,1);
    }
    public  void twoPoint(View view){
        score_A=score_A+2;
        diplayScore(score_A,1);
    }
    public  void freeThrow(View view){
        score_A=score_A+1;
        diplayScore(score_A,1);
    }
    public  void reset(View view){
        score_A=0;
        diplayScore(score_A,1);
    }
    public void diplayScore(int n,int t){
        TextView score;
        if(t==1){
         score=(TextView)findViewById(R.id.score_A);}else{
             score=(TextView)findViewById(R.id.score_B);
        }
        score.setText(""+n);
    }
    public  void threePointB(View view){
        score_B =score_B+3;
        diplayScore(score_B,2);
    }
    public  void twoPointB(View view){
        score_B=score_B+2;
        diplayScore(score_B,2);
    }
    public  void freeThrowB(View view){
        score_B=score_B+1;
        diplayScore(score_B,2);
    }
    public  void resetB(View view){
        score_B=0;
        diplayScore(score_B,2);
    }


}