package defpackage;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Looper;

/* renamed from: gkm */
final class gkm extends Thread {
    public gkl a;
    final /* synthetic */ gki b;

    public gkm(gki gki, gkl gkl) {
        this.b = gki;
        this.a = gkl;
    }

    public void run() {
        Looper.prepare();
        this.b.c = Looper.myLooper();
        synchronized (this) {
            AudioManager audioManager = (AudioManager) gwb.H().getSystemService("audio");
            try {
                MediaPlayer mediaPlayer = new MediaPlayer();
                mediaPlayer.setAudioStreamType(this.a.d);
                mediaPlayer.setDataSource(gwb.H(), this.a.b);
                mediaPlayer.setLooping(this.a.c);
                mediaPlayer.setVolume(this.a.e, this.a.e);
                mediaPlayer.prepare();
                if (!(this.a.b == null || this.a.b.getEncodedPath() == null || this.a.b.getEncodedPath().length() <= 0)) {
                    int i;
                    int i2 = this.a.d;
                    if (this.a.c) {
                        i = 2;
                    } else {
                        i = 3;
                    }
                    audioManager.requestAudioFocus(null, i2, i);
                }
                mediaPlayer.setOnCompletionListener(this.b);
                mediaPlayer.start();
                if (this.b.f != null) {
                    this.b.f.release();
                }
                this.b.f = mediaPlayer;
            } catch (Throwable e) {
                String str = this.b.d;
                String valueOf = String.valueOf(this.a.b);
                glk.c(str, new StringBuilder(String.valueOf(valueOf).length() + 24).append("error loading sound for ").append(valueOf).toString(), e);
            }
            this.b.h = audioManager;
            notify();
        }
        Looper.loop();
    }
}
