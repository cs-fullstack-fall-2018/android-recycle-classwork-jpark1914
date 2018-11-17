package com.example.student.recycle;

class Musician{

    private String name;
    private String album;
    private String song;

    Musician(String name, String album, String song) {

        this.name = name;
        this.album = album;
        this.song = song;
    }

    String getName() {return name; }
    String getAlbum() {return album;}
    String getSong() {return song;}


}
