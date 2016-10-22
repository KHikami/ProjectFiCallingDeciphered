package defpackage;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

/* renamed from: cko */
final class cko implements OnPreparedListener {
    final /* synthetic */ ckm a;

    cko(ckm ckm) {
        this.a = ckm;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.a.w.setVolume(0.0f, 0.0f);
        this.a.w.setLooping(false);
        this.a.w.start();
    }
}
