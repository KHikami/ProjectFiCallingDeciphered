package defpackage;

import android.view.View;

public abstract class afi extends aeb {
    boolean h = true;

    public abstract boolean a(aer aer);

    public abstract boolean a(aer aer, int i, int i2, int i3, int i4);

    public abstract boolean a(aer aer, aer aer2, int i, int i2, int i3, int i4);

    public abstract boolean b(aer aer);

    public boolean g(aer aer) {
        return !this.h || aer.k();
    }

    public boolean a(aer aer, aed aed, aed aed2) {
        int i = aed.a;
        int i2 = aed.b;
        View view = aer.a;
        int left = aed2 == null ? view.getLeft() : aed2.a;
        int top = aed2 == null ? view.getTop() : aed2.b;
        if (aer.n() || (i == left && i2 == top)) {
            return a(aer);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return a(aer, i, i2, left, top);
    }

    public boolean b(aer aer, aed aed, aed aed2) {
        if (aed == null || (aed.a == aed2.a && aed.b == aed2.b)) {
            return b(aer);
        }
        return a(aer, aed.a, aed.b, aed2.a, aed2.b);
    }

    public boolean c(aer aer, aed aed, aed aed2) {
        if (aed.a == aed2.a && aed.b == aed2.b) {
            f(aer);
            return false;
        }
        return a(aer, aed.a, aed.b, aed2.a, aed2.b);
    }

    public boolean a(aer aer, aer aer2, aed aed, aed aed2) {
        int i;
        int i2;
        int i3 = aed.a;
        int i4 = aed.b;
        if (aer2.c()) {
            i = aed.a;
            i2 = aed.b;
        } else {
            i = aed2.a;
            i2 = aed2.b;
        }
        return a(aer, aer2, i3, i4, i, i2);
    }
}
