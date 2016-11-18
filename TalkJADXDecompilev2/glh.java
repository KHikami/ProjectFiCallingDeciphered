package defpackage;

import android.view.Choreographer;

public final class glh implements kcj, kcm, kcq {
    private static final boolean d = false;
    final String a;
    long b;
    int c;
    private final gli e = new gli(this);

    static {
        kae kae = glk.h;
    }

    public glh(String str, kbu kbu) {
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
