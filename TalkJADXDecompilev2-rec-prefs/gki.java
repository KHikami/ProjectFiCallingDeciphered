package p000;

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
    Handler f15488a = new Handler();
    final LinkedList<gkl> f15489b = new LinkedList();
    Looper f15490c;
    String f15491d;
    gkk f15492e;
    MediaPlayer f15493f;
    WakeLock f15494g;
    AudioManager f15495h;
    private gkm f15496i;
    private final Object f15497j = new Object();
    private int f15498k = 2;

    void m17887a(gkl gkl) {
        try {
            synchronized (this.f15497j) {
                if (!(this.f15490c == null || this.f15490c.getThread().getState() == State.TERMINATED)) {
                    this.f15490c.quit();
                }
                this.f15496i = new gkm(this, gkl);
                synchronized (this.f15496i) {
                    this.f15496i.start();
                    this.f15496i.wait();
                }
            }
            long b = glj.m17963b() - gkl.f15506f;
            if (b > 1000) {
                glk.m17981d(this.f15491d, "Notification sound delayed by " + b + "msecs", new Object[0]);
            }
        } catch (Throwable e) {
            String str = this.f15491d;
            String valueOf = String.valueOf(gkl.f15502b);
            glk.m17978c(str, new StringBuilder(String.valueOf(valueOf).length() + 24).append("error loading sound for ").append(valueOf).toString(), e);
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        if (this.f15495h != null) {
            this.f15495h.abandonAudioFocus(null);
        }
        synchronized (this.f15489b) {
            if (this.f15489b.size() == 0) {
                synchronized (this.f15497j) {
                    if (this.f15490c != null) {
                        this.f15490c.quit();
                    }
                    this.f15496i = null;
                }
            }
        }
    }

    public gki(String str) {
        this.f15491d = str;
    }

    public void m17886a(Uri uri, boolean z, int i, float f) {
        gkl gkl = new gkl();
        gkl.f15506f = glj.m17963b();
        gkl.f15501a = 1;
        gkl.f15502b = uri;
        gkl.f15503c = true;
        gkl.f15504d = 2;
        gkl.f15505e = 1.0f;
        synchronized (this.f15489b) {
            m17885b(gkl);
            this.f15498k = 1;
        }
    }

    public void m17888a(boolean z) {
        synchronized (this.f15489b) {
            if (this.f15498k != 2) {
                gkl gkl = new gkl();
                gkl.f15506f = glj.m17963b();
                gkl.f15501a = 2;
                gkl.f15507g = z;
                m17885b(gkl);
                this.f15498k = 2;
            }
        }
    }

    private void m17885b(gkl gkl) {
        this.f15489b.add(gkl);
        if (this.f15492e == null) {
            if (this.f15494g != null) {
                this.f15494g.acquire();
            }
            this.f15492e = new gkk(this);
            this.f15492e.start();
        }
    }
}
