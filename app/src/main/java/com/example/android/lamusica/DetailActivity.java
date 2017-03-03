package com.example.android.lamusica;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        updateUI();
    }

    public void buttonClicked(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text;
        Toast toast;

        switch (view.getId()) {
            case R.id.detail_rewind:
                text = "Rewinding Music";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
            case R.id.detail_stop:
                text = "Stopping Music";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
            case R.id.detail_play:
                text = "Playing Music";
                toast = Toast.makeText(context, text, duration);
                toast.show();
                break;
            case R.id.detail_forward:
                text = "Forwarding Music";
                toast = Toast.makeText(context, text, duration);
                toast.show();
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
