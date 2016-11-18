package p000;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Looper;

final class gkm extends Thread {
    public gkl f15508a;
    final /* synthetic */ gki f15509b;

    public gkm(gki gki, gkl gkl) {
        this.f15509b = gki;
        this.f15508a = gkl;
    }

    public void run() {
        Looper.prepare();
        this.f15509b.f15490c = Looper.myLooper();
        synchronized (this) {
            AudioManager audioManager = (AudioManager) gwb.m1400H().getSystemService("audio");
            try {
                MediaPlayer mediaPlayer = new MediaPlayer();
                mediaPlayer.setAudioStreamType(this.f15508a.f15504d);
                mediaPlayer.setDataSource(gwb.m1400H(), this.f15508a.f15502b);
                mediaPlayer.setLooping(this.f15508a.f15503c);
                mediaPlayer.setVolume(this.f15508a.f15505e, this.f15508a.f15505e);
                mediaPlayer.prepare();
                if (!(this.f15508a.f15502b == null || this.f15508a.f15502b.getEncodedPath() == null || this.f15508a.f15502b.getEncodedPath().length() <= 0)) {
                    int i;
                    int i2 = this.f15508a.f15504d;
                    if (this.f15508a.f15503c) {
                        i = 2;
                    } else {
                        i = 3;
                    }
                    audioManager.requestAudioFocus(null, i2, i);
                }
                mediaPlayer.setOnCompletionListener(this.f15509b);
                mediaPlayer.start();
                if (this.f15509b.f15493f != null) {
                    this.f15509b.f15493f.release();
                }
                this.f15509b.f15493f = mediaPlayer;
            } catch (Throwable e) {
                String str = this.f15509b.f15491d;
                String valueOf = String.valueOf(this.f15508a.f15502b);
                glk.m17978c(str, new StringBuilder(String.valueOf(valueOf).length() + 24).append("error loading sound for ").append(valueOf).toString(), e);
            }
            this.f15509b.f15495h = audioManager;
            notify();
        }
        Looper.loop();
    }
}
