package defpackage;

import android.support.v4.widget.DrawerLayout;
import android.view.View;

public final class sk extends to {
    final int a;
    tl b;
    final /* synthetic */ DrawerLayout c;
    private final Runnable d = new sl(this);

    public sk(DrawerLayout drawerLayout, int i) {
        this.c = drawerLayout;
        this.a = i;
    }

    public void a(tl tlVar) {
        this.b = tlVar;
    }

    public void a() {
        this.c.removeCallbacks(this.d);
    }

    public boolean a(View view, int i) {
        return this.c.g(view) && this.c.a(view, this.a) && this.c.a(view) == 0;
    }

    public void a(int i) {
        this.c.a(i, this.b.c());
    }

    public void a(View view, int i, int i2) {
        float f;
        int width = view.getWidth();
        if (this.c.a(view, 3)) {
            f = ((float) (width + i)) / ((float) width);
        } else {
            f = ((float) (this.c.getWidth() - i)) / ((float) width);
        }
        this.c.b(view, f);
        view.setVisibility(f == 0.0f ? 4 : 0);
        this.c.invalidate();
    }

    public void b(View view, int i) {
        ((sh) view.getLayoutParams()).c = false;
        b();
    }

    void b() {
        int i = 3;
        if (this.a == 3) {
            i = 5;
        }
        View d = this.c.d(i);
        if (d != null) {
            this.c.i(d);
        }
    }

    public void a(View view, float f, float f2) {
        int i;
        float d = this.c.d(view);
        int width = view.getWidth();
        if (this.c.a(view, 3)) {
            i = (f > 0.0f || (f == 0.0f && d > 0.5f)) ? 0 : -width;
        } else {
            i = this.c.getWidth();
            if (f < 0.0f || (f == 0.0f && d > 0.5f)) {
                i -= width;
            }
        }
        this.b.a(i, view.getTop());
        this.c.invalidate();
    }

    public void c() {
        this.c.postDelayed(this.d, 160);
    }

    public void a(int i, int i2) {
        View d;
        if ((i & 1) == 1) {
            d = this.c.d(3);
        } else {
            d = this.c.d(5);
        }
        if (d != null && this.c.a(d) == 0) {
            this.b.a(d, i2);
        }
    }

    public int a(View view) {
        return this.c.g(view) ? view.getWidth() : 0;
    }

    public int c(View view, int i) {
        if (this.c.a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = this.c.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    public int d(View view, int i) {
        return view.getTop();
    }
}
