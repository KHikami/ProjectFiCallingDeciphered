package defpackage;

import android.support.v4.widget.NestedScrollView;
import android.view.View;

public class sw {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ uc c;

    public void a(NestedScrollView nestedScrollView) {
        int i = 0;
        View view = this.a;
        View view2 = this.b;
        if (view != null) {
            view.setVisibility(oa.b((View) nestedScrollView, -1) ? 0 : 4);
        }
        if (view2 != null) {
            if (!oa.b((View) nestedScrollView, 1)) {
                i = 4;
            }
            view2.setVisibility(i);
        }
    }

    public sw(uc ucVar, View view, View view2) {
        this.c = ucVar;
        this.a = view;
        this.b = view2;
    }
}
