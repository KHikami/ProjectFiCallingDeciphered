package p000;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;

final class cvg implements OnErrorListener {
    final /* synthetic */ cve f9159a;

    cvg(cve cve) {
        this.f9159a = cve;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        glk.m17982e("Babel_explane", "[Outgoing ringtone] Error: code = " + i + " extra = " + i2, new Object[0]);
        return false;
    }
}
