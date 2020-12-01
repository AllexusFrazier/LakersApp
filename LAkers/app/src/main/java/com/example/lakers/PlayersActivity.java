package com.example.lakers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PlayersActivity extends AppCompatActivity {

    private TextView mPlayersName;
    private TextView mCoach;
    private TextView mKobeBryant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);

        mPlayersName = (TextView) findViewById(R.id.text_palyersName);
        mCoach=(TextView) findViewById(R.id.coach);
        mKobeBryant=(TextView) findViewById(R.)

    }
}