package defpackage;

import android.support.v7.widget.RecyclerView;
import android.widget.AbsListView.OnScrollListener;

public final class ano extends aei {
    private final OnScrollListener a;
    private int b = -1;
    private int c = -1;
    private int d = -1;

    public ano(OnScrollListener onScrollListener) {
        this.a = onScrollListener;
    }

    public void a(RecyclerView recyclerView, int i) {
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
        this.a.onScrollStateChanged(null, i2);
    }

    public void a(RecyclerView recyclerView, int i, int i2) {
        acx acx = (acx) recyclerView.c();
        int p = acx.p();
        int abs = Math.abs(p - acx.r());
        int a = recyclerView.b().a();
        if (p != this.b || abs != this.c || a != this.d) {
            this.a.onScroll(null, p, abs, a);
            this.b = p;
            this.c = abs;
            this.d = a;
        }
    }
}
