package defpackage;

import android.view.View;
import android.view.ViewGroup;

final class bun extends aed {
    public final ky<View, buo> e = new ky();
    public final boolean f;

    public bun(boolean z) {
        this.f = z;
    }

    public aed a(aer aer) {
        return a(aer, 0);
    }

    public aed a(aer aer, int i) {
        if (aer instanceof bxi) {
            ViewGroup v = ((bxi) aer).v();
            for (int i2 = 0; i2 < v.getChildCount(); i2++) {
                View childAt = v.getChildAt(i2);
                this.e.put(childAt, new buo(childAt.getTop(), childAt.getBottom(), childAt.getLeft(), childAt.getRight()));
            }
        }
        return super.a(aer, i);
    }
}
