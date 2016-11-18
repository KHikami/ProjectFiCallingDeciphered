package defpackage;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

public final class abq {
    final abs a;
    final abr b = new abr();
    final List<View> c = new ArrayList();

    public abq(abs abs) {
        this.a = abs;
    }

    private void g(View view) {
        this.c.add(view);
        this.a.c(view);
    }

    private boolean h(View view) {
        if (!this.c.remove(view)) {
            return false;
        }
        this.a.d(view);
        return true;
    }

    public void a(View view, boolean z) {
        a(view, -1, true);
    }

    void a(View view, int i, boolean z) {
        int a;
        if (i < 0) {
            a = this.a.a();
        } else {
            a = e(i);
        }
        this.b.a(a, z);
        if (z) {
            g(view);
        }
        this.a.a(view, a);
    }

    private int e(int i) {
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

    void a(View view) {
        int a = this.a.a(view);
        if (a >= 0) {
            if (this.b.d(a)) {
                h(view);
            }
            this.a.a(a);
        }
    }

    void a(int i) {
        int e = e(i);
        View b = this.a.b(e);
        if (b != null) {
            if (this.b.d(e)) {
                h(b);
            }
            this.a.a(e);
        }
    }

    public View b(int i) {
        return this.a.b(e(i));
    }

    public void a() {
        this.b.a();
        for (int size = this.c.size() - 1; size >= 0; size--) {
            this.a.d((View) this.c.get(size));
            this.c.remove(size);
        }
        this.a.b();
    }

    View a(int i, int i2) {
        int size = this.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) this.c.get(i3);
            aer b = this.a.b(view);
            if (b.d() == i && !b.k() && !b.n() && (i2 == -1 || b.e == i2)) {
                return view;
            }
        }
        return null;
    }

    public void a(View view, int i, LayoutParams layoutParams, boolean z) {
        int a;
        if (i < 0) {
            a = this.a.a();
        } else {
            a = e(i);
        }
        this.b.a(a, z);
        if (z) {
            g(view);
        }
        this.a.a(view, a, layoutParams);
    }

    public int b() {
        return this.a.a() - this.c.size();
    }

    public int c() {
        return this.a.a();
    }

    public View c(int i) {
        return this.a.b(i);
    }

    void d(int i) {
        int e = e(i);
        this.b.d(e);
        this.a.c(e);
    }

    int b(View view) {
        int a = this.a.a(view);
        if (a == -1 || this.b.c(a)) {
            return -1;
        }
        return a - this.b.e(a);
    }

    public boolean c(View view) {
        return this.c.contains(view);
    }

    public void d(View view) {
        int a = this.a.a(view);
        if (a < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        this.b.a(a);
        g(view);
    }

    void e(View view) {
        int a = this.a.a(view);
        if (a < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.b.c(a)) {
            this.b.b(a);
            h(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }

    boolean f(View view) {
        int a = this.a.a(view);
        if (a == -1) {
            h(view);
            return true;
        } else if (!this.b.c(a)) {
            return false;
        } else {
            this.b.d(a);
            h(view);
            this.a.a(a);
            return true;
        }
    }
}
