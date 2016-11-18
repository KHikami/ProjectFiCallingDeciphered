package p000;

import android.content.Context;
import android.media.ToneGenerator;
import android.provider.Settings.System;

public final class del {
    private boolean f9559a;
    private final Context f9560b;
    private final der f9561c = new der();
    private ToneGenerator f9562d;

    public del(Context context) {
        this.f9560b = context;
        try {
            this.f9561c.m11528a(this.f9560b, this.f9560b.getResources().getBoolean(gwb.dD));
        } catch (Throwable e) {
            glk.m17980d("Babel_dialer", "Vibrate control bool missing.", e);
        }
        try {
            this.f9562d = new ToneGenerator(8, 80);
        } catch (Throwable e2) {
            glk.m17978c("Babel_dialer", "ToneGenerator was not able to be initialized. This might be due to Android running out of AudioTracks. Is another app potentially using up too many audio tracks?", e2);
        }
        m11524b();
    }

    private boolean m11521e() {
        return this.f9562d != null;
    }

    public void m11522a() {
        if (m11521e()) {
            this.f9562d.release();
            this.f9562d = null;
        }
    }

    public void m11524b() {
        boolean z = true;
        if (System.getInt(this.f9560b.getContentResolver(), "dtmf_tone", 1) != 1) {
            z = false;
        }
        this.f9559a = z;
        this.f9561c.m11527a();
    }

    public void m11525c() {
        if (m11521e()) {
            this.f9562d.stopTone();
        }
    }

    public void m11526d() {
        this.f9561c.m11529b();
    }

    public void m11523a(int i) {
        if (m11521e() && this.f9559a) {
            this.f9562d.startTone(i, -1);
        }
    }
}
