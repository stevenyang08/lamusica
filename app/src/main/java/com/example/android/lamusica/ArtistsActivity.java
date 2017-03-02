package com.example.android.lamusica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        TextView artist1 = (TextView) findViewById(R.id.artists_artist1);
        artist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Globals g = Globals.getInstance();
                g.setArtist(getText(R.string.artist1).toString());
                Intent intent = new Intent(ArtistsActivity.this, SongsActivity.class);
                startActivity(intent);
            }
        });

        TextView artist2 = (TextView) findViewById(R.id.artists_artist2);
        artist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Globals g = Globals.getInstance();
                g.setArtist(getText(R.string.artist2).toString());
                Intent intent = new Intent(ArtistsActivity.this, SongsActivity.class);
                startActivity(intent);
            }
        });

        TextView artist3 = (TextView) findViewById(R.id.artists_artist3);
        artist3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Globals g = Globals.getInstance();
                g.setArtist(getText(R.string.artist3).toString());
                Intent intent = new Intent(ArtistsActivity.this, SongsActivity.class);
                startActivity(intent);
            }
        });
    }
}
