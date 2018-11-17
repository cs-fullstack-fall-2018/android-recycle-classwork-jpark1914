package com.example.student.recycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<Musician> mMusicData;
    private MusicAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mMusicData = new ArrayList<>();

        mAdapter = new MusicAdapter(this, mMusicData);
        mRecyclerView.setAdapter(mAdapter);

        initializeData();

    }

    private void initializeData() {

        String[] musicName= getResources().getStringArray(R.array.music_names);
        String[] musicAlbum = getResources().getStringArray(R.array.music_album);
        String[] musicSong = getResources().getStringArray(R.array.music_song);

        mMusicData.clear();

        for(int i = 0; i<musicName.length; i++){
            mMusicData.add(new Musician(musicName[i], musicAlbum[i], musicSong[i]));
        }

        mAdapter.notifyDataSetChanged();
    }

}
