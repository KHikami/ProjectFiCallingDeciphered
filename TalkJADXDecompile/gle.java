import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

final class gle implements OnCompletionListener {
    gle() {
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        mediaPlayer.release();
    }
}
