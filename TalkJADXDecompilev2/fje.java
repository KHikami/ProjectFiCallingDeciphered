package defpackage;

import android.content.Context;

public abstract class fje extends fip {
    private final Context a;
    private int b;

    public abstract void a(fiu fiu);

    public fje(Context context) {
        this.a = context;
    }

    public final void d() {
        ((fit) jyn.a(this.a, fit.class)).b(this);
    }

    public final void a(fme fme) {
        this.b = fme.a();
        if (this.b >= 0) {
            ((fit) jyn.a(this.a, fit.class)).a(this);
        }
    }

    public final void a(int i, bko bko, fiu fiu) {
        if (this.b == i) {
            d();
            a(fiu);
        }
    }

    public final void a(int i, bko bko, fok fok, fdo fdo) {
        if (this.b == i) {
            d();
            a((Exception) fdo);
        }
    }

    public void a(Exception exception) {
    }
}
