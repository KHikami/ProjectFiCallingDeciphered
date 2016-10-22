package defpackage;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

/* renamed from: adi */
final class adi implements OnScrollListener {
    final /* synthetic */ add a;

    adi(add add) {
        this.a = add;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1 && !this.a.n() && this.a.h.getContentView() != null) {
            this.a.g.removeCallbacks(this.a.f);
            this.a.f.run();
        }
    }
}
