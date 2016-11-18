package defpackage;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;

final class cvg implements OnErrorListener {
    final /* synthetic */ cve a;

    cvg(cve cve) {
        this.a = cve;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        glk.e("Babel_explane", "[Outgoing ringtone] Error: code = " + i + " extra = " + i2, new Object[0]);
        return false;
    }
}
