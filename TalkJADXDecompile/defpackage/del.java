package defpackage;

import android.content.Context;
import android.media.ToneGenerator;
import android.provider.Settings.System;

/* renamed from: del */
public final class del {
    private boolean a;
    private final Context b;
    private final der c;
    private ToneGenerator d;

    public del(Context context) {
        this.c = new der();
        this.b = context;
        try {
            this.c.a(this.b, this.b.getResources().getBoolean(gwb.dD));
        } catch (Throwable e) {
            glk.d("Babel_dialer", "Vibrate control bool missing.", e);
        }
        try {
            this.d = new ToneGenerator(8, 80);
        } catch (Throwable e2) {
            glk.c("Babel_dialer", "ToneGenerator was not able to be initialized. This might be due to Android running out of AudioTracks. Is another app potentially using up too many audio tracks?", e2);
        }
        b();
    }

    private boolean e() {
        return this.d != null;
    }

    public void a() {
        if (e()) {
            this.d.release();
            this.d = null;
        }
    }

    public void b() {
        boolean z = true;
        if (System.getInt(this.b.getContentResolver(), "dtmf_tone", 1) != 1) {
            z = false;
        }
        this.a = z;
        this.c.a();
    }

    public void c() {
        if (e()) {
            this.d.stopTone();
        }
    }

    public void d() {
        this.c.b();
    }

    public void a(int i) {
        if (e() && this.a) {
            this.d.startTone(i, -1);
        }
    }
}
