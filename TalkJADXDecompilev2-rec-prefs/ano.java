package p000;

import android.support.v7.widget.RecyclerView;
import android.widget.AbsListView.OnScrollListener;

public final class ano extends aei {
    private final OnScrollListener f1925a;
    private int f1926b = -1;
    private int f1927c = -1;
    private int f1928d = -1;

    public ano(OnScrollListener onScrollListener) {
        this.f1925a = onScrollListener;
    }

    public void mo305a(RecyclerView recyclerView, int i) {
        int i2;
        switch (i) {
            case 0:
                i2 = 0;
                break;
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            default:
                i2 = nzf.UNSET_ENUM_VALUE;
                break;
        }
        this.f1925a.onScrollStateChanged(null, i2);
    }

    public void mo306a(RecyclerView recyclerView, int i, int i2) {
        acx acx = (acx) recyclerView.m3072c();
        int p = acx.m567p();
        int abs = Math.abs(p - acx.m569r());
        int a = recyclerView.m3065b().mo736a();
        if (p != this.f1926b || abs != this.f1927c || a != this.f1928d) {
            this.f1925a.onScroll(null, p, abs, a);
            this.f1926b = p;
            this.f1927c = abs;
            this.f1928d = a;
        }
    }
}
