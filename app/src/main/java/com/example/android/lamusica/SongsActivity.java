package com.example.android.lamusica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        populateListView();

    }

    public void populateListView() {
        ListView list = (ListView) findViewById(R.id.songs_list_view);

        Globals g = Globals.getInstance();
        final String artist = g.getArtist();

        final HashMap<String, String> musicInfo = new HashMap<>();

        if (artist == getText(R.string.artist1).toString()) {
            musicInfo.put("Karma", "Alicia Keys");
            musicInfo.put("If I Ain't Got You", "Alicia Keys");
        } else if (artist == getText(R.string.artist2).toString()) {
            musicInfo.put("Fade To Black", "Metallica");
            musicInfo.put("One", "Metallica");
        } else if (artist == getText(R.string.artist3).toString()) {
            musicInfo.put("Harukaze", "SCANDAL");
        } else {
            musicInfo.put("Harukaze", "SCANDAL");
            musicInfo.put("One", "Metallica");
            musicInfo.put("Fade To Black", "Metallica");
            musicInfo.put("If I Ain't Got You", "Alicia Keys");
            musicInfo.put("Karma", "Alicia Keys");
        }

        List<HashMap<String, String>> songItems = new ArrayList<>();

        SimpleAdapter adapter = new SimpleAdapter(this,
                songItems,
                R.layout.song_items,
                new String[]{"First Line", "Second Line"},
                new int[]{R.id.text1, R.id.text2});

        Iterator it = musicInfo.entrySet().iterator();
        while (it.hasNext()) {
            HashMap<String, String> resultMap = new HashMap<>();
            Map.Entry pair = (Map.Entry)it.next();
            resultMap.put("First Line", pair.getKey().toString());
            resultMap.put("Second Line", pair.getValue().toString());
            songItems.add(resultMap);
        }

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(SongsActivity.this, DetailActivity.class);
                String songName = (new ArrayList<String>(musicInfo.keySet())).get(position);
                String artistName = (new ArrayList<String>(musicInfo.values())).get(position);
                System.out.println(songName);
                System.out.println(artistName);
                intent.putExtra("SONG_NAME", songName);
                intent.putExtra("ARTIST_NAME", artistName);
                startActivity(intent);
            }
        });
    }
}
