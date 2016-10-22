package defpackage;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: wq */
public final class wq {
    public final ws a;
    public final wr b;
    public final List c;

    public wq(ws wsVar) {
        this.a = wsVar;
        this.b = new wr();
        this.c = new ArrayList();
    }

    public final void a(View view) {
        this.c.add(view);
        this.a.c(view);
    }

    final boolean b(View view) {
        if (!this.c.remove(view)) {
            return false;
        }
        this.a.d(view);
        return true;
    }

    public final void a(View view, int i, boolean z) {
        int a;
        if (i < 0) {
            a = this.a.a();
        } else {
            a = a(i);
        }
        this.b.a(a, z);
        if (z) {
            a(view);
        }
        this.a.a(view, a);
    }

    final int a(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.a.a();
        int i2 = i;
        while (i2 < a) {
            int e = i - (i2 - this.b.e(i2));
            if (e == 0) {
                while (this.b.c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += e;
        }
        return -1;
    }

    public final View b(int i) {
        return this.a.b(a(i));
    }

    public final void a(View view, int i, LayoutParams layoutParams, boolean z) {
        int a;
        if (i < 0) {
            a = this.a.a();
        } else {
            a = a(i);
        }
        this.b.a(a, z);
        if (z) {
            a(view);
        }
        this.a.a(view, a, layoutParams);
    }

    public final int a() {
        return this.a.a() - this.c.size();
    }

    public final int b() {
        return this.a.a();
    }

    public final View c(int i) {
        return this.a.b(i);
    }

    final void d(int i) {
        int a = a(i);
        this.b.d(a);
        this.a.c(a);
    }

    final int c(View view) {
        int a = this.a.a(view);
        if (a == -1 || this.b.c(a)) {
            return -1;
        }
        return a - this.b.e(a);
    }

    public final boolean d(View view) {
        return this.c.contains(view);
    }

    public final String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
