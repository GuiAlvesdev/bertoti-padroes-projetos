
//METODO QUE INTEGRA OUTROS METODOS DENTRO DO MESMO
public class VideoFacade {
    private VideoEncoder encoder;
    private VideoDecoder decoder;
    private VideoPlayer player;

    public VideoFacade() {
        this.encoder = new VideoEncoder();
        this.decoder = new VideoDecoder();
        this.player = new VideoPlayer();
    }

    public void processVideo(String videoFile) {
        encoder.encodeVideo(videoFile);
        decoder.decodeVideo(videoFile);
        player.playVideo(videoFile);
    }
}
