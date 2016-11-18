package defpackage;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

final class uf implements OnScrollListener {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ uc c;

    uf(uc ucVar, View view, View view2) {
        this.c = ucVar;
        this.a = view;
        this.b = view2;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int i4 = 0;
        View view = this.a;
        View view2 = this.b;
        if (view != null) {
            view.setVisibility(oa.b((View) absListView, -1) ? 0 : 4);
        }
        if (view2 != null) {
            if (!oa.b((View) absListView, 1)) {
                i4 = 4;
            }
            view2.setVisibility(i4);
        }
    }
}
