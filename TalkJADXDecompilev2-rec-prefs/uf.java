package p000;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

final class uf implements OnScrollListener {
    final /* synthetic */ View f35240a;
    final /* synthetic */ View f35241b;
    final /* synthetic */ uc f35242c;

    uf(uc ucVar, View view, View view2) {
        this.f35242c = ucVar;
        this.f35240a = view;
        this.f35241b = view2;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int i4 = 0;
        View view = this.f35240a;
        View view2 = this.f35241b;
        if (view != null) {
            view.setVisibility(oa.m37346b((View) absListView, -1) ? 0 : 4);
        }
        if (view2 != null) {
            if (!oa.m37346b((View) absListView, 1)) {
                i4 = 4;
            }
            view2.setVisibility(i4);
        }
    }
}
