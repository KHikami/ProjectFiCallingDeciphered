package defpackage;

import android.support.v4.widget.NestedScrollView;
import android.view.View;

/* compiled from: PG */
/* renamed from: on */
public class on {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;

    public void a(NestedScrollView nestedScrollView) {
        int i = 0;
        View view = this.a;
        View view2 = this.b;
        if (view != null) {
            view.setVisibility(kn.b((View) nestedScrollView, -1) ? 0 : 4);
        }
        if (view2 != null) {
            if (!kn.b((View) nestedScrollView, 1)) {
                i = 4;
            }
            view2.setVisibility(i);
        }
    }

    public on(po poVar, View view, View view2) {
        this.a = view;
        this.b = view2;
    }
}
