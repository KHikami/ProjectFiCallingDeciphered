package defpackage;

import android.support.v7.widget.RecyclerView;
import oa;

/* renamed from: ael */
public final class ael extends aea {
    final /* synthetic */ RecyclerView a;

    public ael(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(int i, int i2, Object obj) {
        this.a.a(null);
        if (this.a.d.a(i, i2, obj)) {
            a();
        }
    }

    public void a(int i, int i2) {
        this.a.a(null);
        if (this.a.d.c(i, i2)) {
            a();
        }
    }

    public void b(int i, int i2) {
        this.a.a(null);
        if (this.a.d.d(i, i2)) {
            a();
        }
    }

    public void a(int i, int i2, int i3) {
        this.a.a(null);
        if (this.a.d.a(i, i2, 1)) {
            a();
        }
    }

    private void a() {
        if (this.a.s && this.a.n && this.a.m) {
            oa.a(this.a, this.a.g);
            return;
        }
        this.a.r = true;
        this.a.requestLayout();
    }
}
