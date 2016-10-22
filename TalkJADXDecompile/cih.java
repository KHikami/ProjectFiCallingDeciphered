import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

final class cih implements OnPreparedListener {
    final /* synthetic */ cid a;

    cih(cid cid) {
        this.a = cid;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.setVolume(0.0f, 0.0f);
        mediaPlayer.setLooping(true);
        this.a.h.q.start();
    }
}
