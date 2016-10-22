package defpackage;

import com.google.android.libraries.hangouts.video.internal.GlRemoteRenderer;

/* renamed from: ilk */
public final class ilk implements Runnable {
    final /* synthetic */ GlRemoteRenderer a;

    public ilk(GlRemoteRenderer glRemoteRenderer) {
        this.a = glRemoteRenderer;
    }

    public void run() {
        if (this.a.b != null) {
            this.a.b.release();
            this.a.b = null;
            this.a.c.release();
            this.a.c = null;
            int i = this.a.a;
            this.a.a = 0;
            gwb.E(i);
        }
    }
}
