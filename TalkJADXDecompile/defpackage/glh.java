package defpackage;

import android.view.Choreographer;

/* renamed from: glh */
public final class glh implements kcj, kcm, kcq {
    private static final boolean d;
    final String a;
    long b;
    int c;
    private final gli e;

    static {
        kae kae = glk.h;
        d = false;
    }

    public glh(String str, kbu kbu) {
        this.e = new gli(this);
        this.a = str;
        kbu.a((kcq) this);
    }

    public void R_() {
        if (d) {
            c();
        }
    }

    void c() {
        Choreographer.getInstance().postFrameCallback(this.e);
    }

    public void T_() {
        Choreographer.getInstance().removeFrameCallback(this.e);
    }
}
