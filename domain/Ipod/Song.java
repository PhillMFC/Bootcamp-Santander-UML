package domain.Ipod;

public class Song {

    private String[] songInfo;
    private Object songAudio;

    public Song(String[] songInfo, Object songAudio){
        this.songInfo = songInfo;
        this.songAudio = songAudio;
    }

    public String[] getSongInfo() {
        return songInfo;
    }

    public Object getSongAudio() {
        return songAudio;
    }
}
