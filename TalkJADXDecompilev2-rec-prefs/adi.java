package p000;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

final class adi implements OnScrollListener {
    final /* synthetic */ add f338a;

    adi(add add) {
        this.f338a = add;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1 && !this.f338a.m171n() && this.f338a.f118h.getContentView() != null) {
            this.f338a.f117g.removeCallbacks(this.f338a.f116f);
            this.f338a.f116f.run();
        }
    }
}
