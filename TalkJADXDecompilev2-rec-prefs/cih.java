package p000;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

final class cih implements OnPreparedListener {
    final /* synthetic */ cid f5371a;

    cih(cid cid) {
        this.f5371a = cid;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.setVolume(0.0f, 0.0f);
        mediaPlayer.setLooping(true);
        this.f5371a.f5367h.f6076q.start();
    }
}
