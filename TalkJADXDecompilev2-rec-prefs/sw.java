package p000;

import android.support.v4.widget.NestedScrollView;
import android.view.View;

public class sw {
    public final /* synthetic */ View f35116a;
    public final /* synthetic */ View f35117b;
    public final /* synthetic */ uc f35118c;

    public void m40684a(NestedScrollView nestedScrollView) {
        int i = 0;
        View view = this.f35116a;
        View view2 = this.f35117b;
        if (view != null) {
            view.setVisibility(oa.m37346b((View) nestedScrollView, -1) ? 0 : 4);
        }
        if (view2 != null) {
            if (!oa.m37346b((View) nestedScrollView, 1)) {
                i = 4;
            }
            view2.setVisibility(i);
        }
    }

    public sw(uc ucVar, View view, View view2) {
        this.f35118c = ucVar;
        this.f35116a = view;
        this.f35117b = view2;
    }
}
