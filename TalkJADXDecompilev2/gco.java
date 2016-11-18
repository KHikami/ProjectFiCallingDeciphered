package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Handler;

final class gco implements OnErrorListener, OnPreparedListener {
    private final Context a;
    private final int b;
    private final Handler c = new Handler();
    private MediaPlayer d;
    private boolean e;
    private boolean f;

    gco(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    void a() {
        glk.c("Babel_telephony", "TeleConnectingSoundPlayer.start, waiting for millis: " + this.b, new Object[0]);
        this.c.postDelayed(new gcp(this), (long) this.b);
    }

    void b() {
        glk.c("Babel_telephony", "TeleConnectingSoundPlayer.stop", new Object[0]);
        if (this.e) {
            this.f = true;
        } else if (this.d != null) {
            this.f = false;
            if (this.d.isPlaying()) {
                this.d.stop();
            }
            this.d.reset();
            this.d.release();
            this.d = null;
        }
        this.c.removeCallbacksAndMessages(null);
    }

    void c() {
        glk.c("Babel_telephony", "TeleConnectingSoundPlayer.startAfterDelay", new Object[0]);
        this.d = new MediaPlayer();
        this.d.setLooping(true);
        this.d.setOnPreparedListener(this);
        this.d.setOnErrorListener(this);
        this.d.setAudioStreamType(0);
        try {
            this.d.setDataSource(this.a, gld.c(gwb.vc));
            try {
                this.d.prepareAsync();
                this.e = true;
            } catch (Throwable e) {
                glk.d("Babel_telephony", "TeleConnectingSoundPlayer.startAfterDelay, failed to prepare", e);
                b();
            }
        } catch (Throwable e2) {
            glk.d("Babel_telephony", "TeleConnectingSoundPlayer.startAfterDelay, failed to set data source", e2);
            b();
        }
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        glk.c("Babel_telephony", "TeleConnectingSoundPlayer.onPrepared", new Object[0]);
        this.e = false;
        if (this.f) {
            b();
        } else if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        glk.c("Babel_telephony", String.format("TeleConnectingSoundPlayer.onError, what: %d, extra: %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), new Object[0]);
        this.e = false;
        b();
        return true;
    }
}
