package com.example.android.lamusica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        updateUI();
    }

    public void buttonsClicked(View view) {
        switch (view.getId()) {
            case R.id.detail_rewind:
                break;
            case R.id.detail_stop:
                break;
            case R.id.detail_play:
                break;
            case R.id.detail_forward:
                break;
        }
    }

    public void updateUI() {
        String songName = getIntent().getStringExtra("SONG_NAME");
        String artistName = getIntent().getStringExtra("ARTIST_NAME");
        TextView songTextView= (TextView) findViewById(R.id.detail_song_name);
        TextView artistTextView = (TextView) findViewById(R.id.detail_artist_name);

        songTextView.setText(songName);
        artistTextView.setText(artistName);

    }
}
