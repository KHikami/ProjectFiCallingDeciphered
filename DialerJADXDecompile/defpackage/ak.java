package defpackage;

import android.view.View;
import android.view.ViewParent;

/* compiled from: PG */
/* renamed from: ak */
final class ak extends pk {
    private int a;
    private int b;
    private /* synthetic */ aj c;

    ak(aj ajVar) {
        this.c = ajVar;
        this.b = -1;
    }

    public final boolean a(View view, int i) {
        return this.b == -1 && this.c.a(view);
    }

    public final void b(View view, int i) {
        this.b = i;
        this.a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final void a(int i) {
        if (this.c.b != null) {
            this.c.b.a(i);
        }
    }

    public final void a(View view, float f, float f2) {
        boolean z;
        int i;
        boolean z2 = true;
        this.b = -1;
        int width = view.getWidth();
        if (f != 0.0f) {
            z = kn.f(view) == 1;
            z = this.c.c == 2 ? true : this.c.c == 0 ? z ? f < 0.0f : f > 0.0f : this.c.c == 1 ? z ? f > 0.0f : f < 0.0f : false;
        } else {
            z = Math.abs(view.getLeft() - this.a) >= Math.round(((float) view.getWidth()) * this.c.d);
        }
        if (z) {
            i = view.getLeft() < this.a ? this.a - width : this.a + width;
        } else {
            i = this.a;
            z2 = false;
        }
        if (this.c.a.a(i, view.getTop())) {
            kn.a(view, new am(this.c, view, z2));
        } else if (z2 && this.c.b != null) {
            this.c.b.a(view);
        }
    }

    public final int a(View view) {
        return view.getWidth();
    }

    public final int c(View view, int i) {
        int width;
        int i2;
        Object obj = kn.f(view) == 1 ? 1 : null;
        if (this.c.c == 0) {
            if (obj != null) {
                width = this.a - view.getWidth();
                i2 = this.a;
            } else {
                width = this.a;
                i2 = this.a + view.getWidth();
            }
        } else if (this.c.c != 1) {
            width = this.a - view.getWidth();
            i2 = this.a + view.getWidth();
        } else if (obj != null) {
            width = this.a;
            i2 = this.a + view.getWidth();
        } else {
            width = this.a - view.getWidth();
            i2 = this.a;
        }
        return Math.min(Math.max(width, i), i2);
    }

    public final int d(View view, int i) {
        return view.getTop();
    }

    public final void a(View view, int i, int i2) {
        float width = ((float) this.a) + (((float) view.getWidth()) * this.c.e);
        float width2 = ((float) this.a) + (((float) view.getWidth()) * this.c.f);
        if (((float) i) <= width) {
            kn.c(view, 1.0f);
        } else if (((float) i) >= width2) {
            kn.c(view, 0.0f);
        } else {
            kn.c(view, aj.a(0.0f, 1.0f - ((((float) i) - width) / (width2 - width)), 1.0f));
        }
    }
}
