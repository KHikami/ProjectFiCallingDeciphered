package p000;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import java.util.List;

public final class aml<T> implements OnScrollListener {
    private final int f1312a;
    private final amp f1313b;
    private final amu f1314c;
    private final amm<T> f1315d;
    private final amn<T> f1316e;
    private int f1317f;
    private int f1318g;
    private int f1319h;
    private int f1320i;
    private boolean f1321j = true;

    public aml(amu amu, amm<T> amm_T, amn<T> amn_T, int i) {
        this.f1314c = amu;
        this.f1315d = amm_T;
        this.f1316e = amn_T;
        this.f1312a = i;
        this.f1313b = new amp(i + 1);
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        this.f1320i = i3;
        if (i > this.f1319h) {
            m2919a(i + i2, true);
        } else if (i < this.f1319h) {
            m2919a(i, false);
        }
        this.f1319h = i;
    }

    private void m2919a(int i, boolean z) {
        int i2;
        int max;
        if (this.f1321j != z) {
            this.f1321j = z;
            for (i2 = 0; i2 < this.f1312a; i2++) {
                this.f1314c.m2974a(this.f1313b.m2940a(0, 0));
            }
        }
        if (z) {
            i2 = this.f1312a;
        } else {
            i2 = -this.f1312a;
        }
        int i3 = i + i2;
        if (i < i3) {
            max = Math.max(this.f1317f, i);
            i2 = i3;
        } else {
            i2 = Math.min(this.f1318g, i);
            max = i3;
        }
        int min = Math.min(this.f1320i, i2);
        max = Math.min(this.f1320i, Math.max(0, max));
        if (i < i3) {
            for (i2 = max; i2 < min; i2++) {
                m2921a(this.f1315d.mo707c(i2), i2, true);
            }
        } else {
            for (i2 = min - 1; i2 >= max; i2--) {
                m2921a(this.f1315d.mo707c(i2), i2, false);
            }
        }
        this.f1318g = max;
        this.f1317f = min;
    }

    private void m2921a(List<T> list, int i, boolean z) {
        int size = list.size();
        int i2;
        if (z) {
            for (i2 = 0; i2 < size; i2++) {
                m2920a(list.get(i2), i, i2);
            }
            return;
        }
        for (i2 = size - 1; i2 >= 0; i2--) {
            m2920a(list.get(i2), i, i2);
        }
    }

    private void m2920a(T t, int i, int i2) {
        int[] a = this.f1316e.mo706a(t, i, i2);
        if (a != null) {
            this.f1315d.mo705a(t).m2969a(this.f1313b.m2940a(a[0], a[1]));
        }
    }
}
