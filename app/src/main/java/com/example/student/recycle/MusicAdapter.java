package com.example.student.recycle;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.ViewHolder> {

    private ArrayList<Musician> mMusicData;
    private Context mContext;

    MusicAdapter(Context context, ArrayList<Musician> musicData){
        this.mMusicData = musicData;
        this.mContext = context;
    }


    @Override
    public MusicAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(MusicAdapter.ViewHolder holder, int position) {
        Musician currentMusician = mMusicData.get(position);

        holder.bindTo(currentMusician);
    }

    @Override
    public int getItemCount() {return mMusicData.size(); }


    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mSongText ;
        private TextView mAlbumText;
        private TextView mNameText;
        ViewHolder(View itemView) {
            super(itemView);

            mSongText = (TextView)itemView.findViewById(R.id.music_song);
            mAlbumText = (TextView)itemView.findViewById(R.id.music_album);
            mNameText = (TextView)itemView.findViewById(R.id.music_name);

        }

        void bindTo(Musician currentMusician) {

            mAlbumText.setText(currentMusician.getAlbum());
            mNameText.setText(currentMusician.getName());
            mSongText.setText(currentMusician.getSong());
        }

    }
}
