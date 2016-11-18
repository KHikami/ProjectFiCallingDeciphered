package p000;

import android.view.View;
import android.view.ViewGroup;

final class bun extends aed {
    public final ky<View, buo> f4521e = new ky();
    public final boolean f4522f;

    public bun(boolean z) {
        this.f4522f = z;
    }

    public aed mo745a(aer aer) {
        return mo746a(aer, 0);
    }

    public aed mo746a(aer aer, int i) {
        if (aer instanceof bxi) {
            ViewGroup v = ((bxi) aer).mo710v();
            for (int i2 = 0; i2 < v.getChildCount(); i2++) {
                View childAt = v.getChildAt(i2);
                this.f4521e.put(childAt, new buo(childAt.getTop(), childAt.getBottom(), childAt.getLeft(), childAt.getRight()));
            }
        }
        return super.mo746a(aer, i);
    }
}
