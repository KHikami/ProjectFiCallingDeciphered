package p000;

import android.view.Choreographer;

public final class glh implements kcj, kcm, kcq {
    private static final boolean f15541d = false;
    final String f15542a;
    long f15543b;
    int f15544c;
    private final gli f15545e = new gli(this);

    static {
        kae kae = glk.f15561h;
    }

    public glh(String str, kbu kbu) {
        this.f15542a = str;
        kbu.m25514a((kcq) this);
    }

    public void R_() {
        if (f15541d) {
            m17955c();
        }
    }

    void m17955c() {
        Choreographer.getInstance().postFrameCallback(this.f15545e);
    }

    public void T_() {
        Choreographer.getInstance().removeFrameCallback(this.f15545e);
    }
}
