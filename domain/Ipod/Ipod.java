package domain.Ipod;

import java.util.ArrayList;

public class Ipod {
    private ArrayList<Song> songs;
    private ArrayList<Album> albums;
    private ArrayList<Video> videos;

    public Ipod(ArrayList<Song> songs, ArrayList<Album> albums, ArrayList<Video> videos) {
        this.songs = songs;
        this.albums = albums;
        this.videos = videos;
    }

    private void play() {

    }

    private void pause() {

    }

    private Song playNext() {

    }

    private Song playPrevious() {

    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }
}