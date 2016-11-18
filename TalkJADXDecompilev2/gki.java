package defpackage;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager.WakeLock;
import java.lang.Thread.State;
import java.util.LinkedList;

public final class gki implements OnCompletionListener {
    Handler a = new Handler();
    final LinkedList<gkl> b = new LinkedList();
    Looper c;
    String d;
    gkk e;
    MediaPlayer f;
    WakeLock g;
    AudioManager h;
    private gkm i;
    private final Object j = new Object();
    private int k = 2;

    void a(gkl gkl) {
        try {
            synchronized (this.j) {
                if (!(this.c == null || this.c.getThread().getState() == State.TERMINATED)) {
                    this.c.quit();
                }
                this.i = new gkm(this, gkl);
                synchronized (this.i) {
                    this.i.start();
                    this.i.wait();
                }
            }
            long b = glj.b() - gkl.f;
            if (b > 1000) {
                glk.d(this.d, "Notification sound delayed by " + b + "msecs", new Object[0]);
            }
        } catch (Throwable e) {
            String str = this.d;
            String valueOf = String.valueOf(gkl.b);
            glk.c(str, new StringBuilder(String.valueOf(valueOf).length() + 24).append("error loading sound for ").append(valueOf).toString(), e);
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        if (this.h != null) {
            this.h.abandonAudioFocus(null);
        }
        synchronized (this.b) {
            if (this.b.size() == 0) {
                synchronized (this.j) {
                    if (this.c != null) {
                        this.c.quit();
                    }
                    this.i = null;
                }
            }
        }
    }

    public gki(String str) {
        this.d = str;
    }

    public void a(Uri uri, boolean z, int i, float f) {
        gkl gkl = new gkl();
        gkl.f = glj.b();
        gkl.a = 1;
        gkl.b = uri;
        gkl.c = true;
        gkl.d = 2;
        gkl.e = 1.0f;
        synchronized (this.b) {
            b(gkl);
            this.k = 1;
        }
    }

    public void a(boolean z) {
        synchronized (this.b) {
            if (this.k != 2) {
                gkl gkl = new gkl();
                gkl.f = glj.b();
                gkl.a = 2;
                gkl.g = z;
                b(gkl);
                this.k = 2;
            }
        }
    }

    private void b(gkl gkl) {
        this.b.add(gkl);
        if (this.e == null) {
            if (this.g != null) {
                this.g.acquire();
            }
            this.e = new gkk(this);
            this.e.start();
        }
    }
}
