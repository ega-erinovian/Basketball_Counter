package com.gagacoding.basketballcounter1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void panggil_nama(View view){
        EditText inputNameA = (EditText) findViewById(R.id.txt_tim1);
        EditText inputNameB = (EditText) findViewById(R.id.txt_tim2);

        String getNameA = inputNameA.getText().toString();
        String getNameB = inputNameB.getText().toString();

        Intent send = new Intent (this, ScoreActivity.class);
        send.putExtra("nameA" , getNameA);
        send.putExtra("nameB" , getNameB);

        startActivity(send);
    }
}
