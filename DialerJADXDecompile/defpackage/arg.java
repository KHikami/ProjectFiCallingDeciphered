package defpackage;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

/* compiled from: PG */
/* renamed from: arg */
final class arg implements OnScrollListener {
    private /* synthetic */ arc a;

    arg(arc arc) {
        this.a = arc;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        this.a.e.c(i);
    }
}
