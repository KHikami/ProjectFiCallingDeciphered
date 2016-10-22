package defpackage;

import android.content.Context;

/* renamed from: drm */
public final class drm implements drc {
    private final Context a;

    public drm(Context context) {
        this.a = context;
    }

    public void a(int i, String str, int i2) {
        ((bhl) jyn.a(this.a, bhl.class)).a(new drw(fde.e(i), str, i2));
    }

    public void a(int i, String str) {
        ((bhl) jyn.a(this.a, bhl.class)).a(new drd(fde.e(i), str));
    }

    public void b(int i, String str) {
        ((bhl) jyn.a(this.a, bhl.class)).a(new drv(fde.e(i), str));
    }
}
