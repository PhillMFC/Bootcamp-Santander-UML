package domain.Ipod;

public class Video {
   
    private String[] videoInfo;
    private Object videoAudio;

    public Video(String[] videoInfo, Object videoAudio){
        this.videoInfo = videoInfo;
        this.videoAudio = videoAudio;
    }

    public String[] getVideoInfo() {
        return videoInfo;
    }

    public Object getVideoAudio() {
        return videoAudio;
    }
}
