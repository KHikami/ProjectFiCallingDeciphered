package defpackage;

import android.view.View;
import android.view.ViewParent;
import oa;
import to;

/* renamed from: av */
final class av extends to {
    final /* synthetic */ au a;
    private int b;
    private int c;

    av(au auVar) {
        this.a = auVar;
        this.c = -1;
    }

    public boolean a(View view, int i) {
        return this.c == -1 && this.a.b(view);
    }

    public void b(View view, int i) {
        this.c = i;
        this.b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public void a(int i) {
        if (this.a.c != null) {
            this.a.c.a(i);
        }
    }

    public void a(View view, float f, float f2) {
        boolean z;
        int i;
        boolean z2 = true;
        this.c = -1;
        int width = view.getWidth();
        if (f != 0.0f) {
            z = oa.d(view) == 1;
            z = this.a.d == 2 ? true : this.a.d == 0 ? z ? f < 0.0f : f > 0.0f : this.a.d == 1 ? z ? f > 0.0f : f < 0.0f : false;
        } else {
            z = Math.abs(view.getLeft() - this.b) >= Math.round(((float) view.getWidth()) * this.a.e);
        }
        if (z) {
            i = view.getLeft() < this.b ? this.b - width : this.b + width;
        } else {
            i = this.b;
            z2 = false;
        }
        if (this.a.b.a(i, view.getTop())) {
            oa.a(view, new ax(this.a, view, z2));
        } else if (z2 && this.a.c != null) {
            this.a.c.a(view);
        }
    }

    public int a(View view) {
        return view.getWidth();
    }

    public int c(View view, int i) {
        int width;
        int i2;
        Object obj = oa.d(view) == 1 ? 1 : null;
        if (this.a.d == 0) {
            if (obj != null) {
                width = this.b - view.getWidth();
                i2 = this.b;
            } else {
                width = this.b;
                i2 = this.b + view.getWidth();
            }
        } else if (this.a.d != 1) {
            width = this.b - view.getWidth();
            i2 = this.b + view.getWidth();
        } else if (obj != null) {
            width = this.b;
            i2 = this.b + view.getWidth();
        } else {
            width = this.b - view.getWidth();
            i2 = this.b;
        }
        return Math.min(Math.max(width, i), i2);
    }

    public int d(View view, int i) {
        return view.getTop();
    }

    public void a(View view, int i, int i2) {
        float width = ((float) this.b) + (((float) view.getWidth()) * this.a.f);
        float width2 = ((float) this.b) + (((float) view.getWidth()) * this.a.g);
        if (((float) i) <= width) {
            oa.c(view, 1.0f);
        } else if (((float) i) >= width2) {
            oa.c(view, 0.0f);
        } else {
            oa.c(view, au.a(0.0f, 1.0f - ((((float) i) - width) / (width2 - width)), 1.0f));
        }
    }
}
