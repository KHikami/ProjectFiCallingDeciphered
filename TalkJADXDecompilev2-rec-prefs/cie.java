package p000;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

final class cie implements OnPreparedListener {
    final /* synthetic */ cid f5368a;

    cie(cid cid) {
        this.f5368a = cid;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.setVolume(0.0f, 0.0f);
        mediaPlayer.setLooping(true);
        this.f5368a.f5367h.f6076q.start();
    }
}
