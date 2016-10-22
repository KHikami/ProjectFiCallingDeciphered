package defpackage;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

/* compiled from: PG */
/* renamed from: aqw */
final class aqw implements OnScrollListener {
    private /* synthetic */ aqv a;

    aqw(aqv aqv) {
        this.a = aqv;
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (this.a.p != null) {
            this.a.p.c(i);
        }
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
