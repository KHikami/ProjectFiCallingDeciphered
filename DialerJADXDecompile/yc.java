import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

/* compiled from: PG */
final class yc implements OnScrollListener {
    private /* synthetic */ xx a;

    yc(xx xxVar) {
        this.a = xxVar;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1 && !this.a.h() && this.a.q.getContentView() != null) {
            this.a.n.removeCallbacks(this.a.m);
            this.a.m.run();
        }
    }
}
