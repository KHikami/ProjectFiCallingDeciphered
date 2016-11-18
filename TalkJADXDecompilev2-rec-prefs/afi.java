package p000;

import android.view.View;

public abstract class afi extends aeb {
    boolean f182h = true;

    public abstract boolean mo29a(aer aer);

    public abstract boolean mo30a(aer aer, int i, int i2, int i3, int i4);

    public abstract boolean mo31a(aer aer, aer aer2, int i, int i2, int i3, int i4);

    public abstract boolean mo34b(aer aer);

    public boolean mo27g(aer aer) {
        return !this.f182h || aer.m871k();
    }

    public boolean mo23a(aer aer, aed aed, aed aed2) {
        int i = aed.f382a;
        int i2 = aed.f383b;
        View view = aer.f438a;
        int left = aed2 == null ? view.getLeft() : aed2.f382a;
        int top = aed2 == null ? view.getTop() : aed2.f383b;
        if (aer.m874n() || (i == left && i2 == top)) {
            return mo29a(aer);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo30a(aer, i, i2, left, top);
    }

    public boolean mo25b(aer aer, aed aed, aed aed2) {
        if (aed == null || (aed.f382a == aed2.f382a && aed.f383b == aed2.f383b)) {
            return mo34b(aer);
        }
        return mo30a(aer, aed.f382a, aed.f383b, aed2.f382a, aed2.f383b);
    }

    public boolean mo26c(aer aer, aed aed, aed aed2) {
        if (aed.f382a == aed2.f382a && aed.f383b == aed2.f383b) {
            m327f(aer);
            return false;
        }
        return mo30a(aer, aed.f382a, aed.f383b, aed2.f382a, aed2.f383b);
    }

    public boolean mo24a(aer aer, aer aer2, aed aed, aed aed2) {
        int i;
        int i2;
        int i3 = aed.f382a;
        int i4 = aed.f383b;
        if (aer2.m863c()) {
            i = aed.f382a;
            i2 = aed.f383b;
        } else {
            i = aed2.f382a;
            i2 = aed2.f383b;
        }
        return mo31a(aer, aer2, i3, i4, i, i2);
    }
}
