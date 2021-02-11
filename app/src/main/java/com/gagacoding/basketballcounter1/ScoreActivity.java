package com.gagacoding.basketballcounter1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        Intent receive = this.getIntent();
        String NameA = receive.getStringExtra("nameA");
        String NameB = receive.getStringExtra("nameB");

        TextView RnameA = (TextView) findViewById(R.id.nameA);
        TextView RnameB = (TextView) findViewById(R.id.nameB);

        RnameA.setText(NameA);
        RnameB.setText(NameB);
     }

     public void point3A (View view){
        TextView Tscore1 = findViewById(R.id.txt_score1);
        String STscoreA  = Tscore1.getText().toString();
        Integer IscoreA  = Integer.parseInt(STscoreA);
        int jumlah = IscoreA + 3;
        Tscore1.setText(String.valueOf(jumlah));
     }
     public void point3B (View view){
        TextView Tscore2 = (TextView) findViewById(R.id.txt_score2);
        String STscoreB  = Tscore2.getText().toString();
        Integer IscoreB  = Integer.parseInt(STscoreB);
        int jumlah = IscoreB + 3;
        Tscore2.setText(String.valueOf(jumlah));
     }
     public void point2A (View view){
        TextView Tscore1 = (TextView) findViewById(R.id.txt_score1);
        String STscoreA  = Tscore1.getText().toString();
        Integer IscoreA  = Integer.parseInt(STscoreA);
        int jumlah = IscoreA + 2;
        Tscore1.setText(String.valueOf(jumlah));
     }
     public void point2B (View view){
        TextView Tscore2 = (TextView) findViewById(R.id.txt_score2);
        String STscoreB  = Tscore2.getText().toString();
        Integer IscoreB  = Integer.parseInt(STscoreB);
        int jumlah = IscoreB + 2;
        Tscore2.setText(String.valueOf(jumlah));
     }
     public void point1A (View view){
        TextView Tscore1 = (TextView) findViewById(R.id.txt_score1);
        String STscoreA  = Tscore1.getText().toString();
        Integer IscoreA  = Integer.parseInt(STscoreA);
        int jumlah = IscoreA + 1;
        Tscore1.setText(String.valueOf(jumlah));
     }
    public void point1B (View view){
        TextView Tscore2 = (TextView) findViewById(R.id.txt_score2);
        String STscoreB  = Tscore2.getText().toString();
        Integer IscoreB  = Integer.parseInt(STscoreB);
        int jumlah = IscoreB + 1;
        Tscore2.setText(String.valueOf(jumlah));
    }

    public void reset(View view){
        finish();
    }

}
