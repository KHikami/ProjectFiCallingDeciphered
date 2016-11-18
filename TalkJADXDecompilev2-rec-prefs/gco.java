package p000;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Handler;

final class gco implements OnErrorListener, OnPreparedListener {
    private final Context f14669a;
    private final int f14670b;
    private final Handler f14671c = new Handler();
    private MediaPlayer f14672d;
    private boolean f14673e;
    private boolean f14674f;

    gco(Context context, int i) {
        this.f14669a = context;
        this.f14670b = i;
    }

    void m16932a() {
        glk.m17979c("Babel_telephony", "TeleConnectingSoundPlayer.start, waiting for millis: " + this.f14670b, new Object[0]);
        this.f14671c.postDelayed(new gcp(this), (long) this.f14670b);
    }

    void m16933b() {
        glk.m17979c("Babel_telephony", "TeleConnectingSoundPlayer.stop", new Object[0]);
        if (this.f14673e) {
            this.f14674f = true;
        } else if (this.f14672d != null) {
            this.f14674f = false;
            if (this.f14672d.isPlaying()) {
                this.f14672d.stop();
            }
            this.f14672d.reset();
            this.f14672d.release();
            this.f14672d = null;
        }
        this.f14671c.removeCallbacksAndMessages(null);
    }

    void m16934c() {
        glk.m17979c("Babel_telephony", "TeleConnectingSoundPlayer.startAfterDelay", new Object[0]);
        this.f14672d = new MediaPlayer();
        this.f14672d.setLooping(true);
        this.f14672d.setOnPreparedListener(this);
        this.f14672d.setOnErrorListener(this);
        this.f14672d.setAudioStreamType(0);
        try {
            this.f14672d.setDataSource(this.f14669a, gld.m17944c(gwb.vc));
            try {
                this.f14672d.prepareAsync();
                this.f14673e = true;
            } catch (Throwable e) {
                glk.m17980d("Babel_telephony", "TeleConnectingSoundPlayer.startAfterDelay, failed to prepare", e);
                m16933b();
            }
        } catch (Throwable e2) {
            glk.m17980d("Babel_telephony", "TeleConnectingSoundPlayer.startAfterDelay, failed to set data source", e2);
            m16933b();
        }
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        glk.m17979c("Babel_telephony", "TeleConnectingSoundPlayer.onPrepared", new Object[0]);
        this.f14673e = false;
        if (this.f14674f) {
            m16933b();
        } else if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        glk.m17979c("Babel_telephony", String.format("TeleConnectingSoundPlayer.onError, what: %d, extra: %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), new Object[0]);
        this.f14673e = false;
        m16933b();
        return true;
    }
}
