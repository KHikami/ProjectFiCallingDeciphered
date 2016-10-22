import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

/* compiled from: PG */
final class pr implements OnScrollListener {
    private /* synthetic */ View a;
    private /* synthetic */ View b;

    pr(po poVar, View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int i4 = 0;
        View view = this.a;
        View view2 = this.b;
        if (view != null) {
            view.setVisibility(kn.b((View) absListView, -1) ? 0 : 4);
        }
        if (view2 != null) {
            if (!kn.b((View) absListView, 1)) {
                i4 = 4;
            }
            view2.setVisibility(i4);
        }
    }
}
