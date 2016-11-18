package p000;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

final class cko implements OnPreparedListener {
    final /* synthetic */ ckm f5526a;

    cko(ckm ckm) {
        this.f5526a = ckm;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.f5526a.f5521w.setVolume(0.0f, 0.0f);
        this.f5526a.f5521w.setLooping(false);
        this.f5526a.f5521w.start();
    }
}
