package domain.Ipod;

import java.util.ArrayList;

public class Album {
    private ArrayList<Song> album;
    private String[] albumInfo;
    private Object albumCover;

    public Album(ArrayList<Song> album, String[] albumInfo, Object albumCover) {
        this.album = album;
        this.albumInfo = albumInfo;
        this.albumCover = albumCover;
    }

    public ArrayList<Song> getAlbum() {
        return album;
    }

    public String[] getAlbumInfo() {
        return albumInfo;
    }

    public Object getAlbumCover() {
        return albumCover;
    }
}
