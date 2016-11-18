package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

final class di implements OnPreDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ dk b;
    final /* synthetic */ int c;
    final /* synthetic */ Object d;
    final /* synthetic */ dg e;

    di(dg dgVar, View view, dk dkVar, int i, Object obj) {
        this.e = dgVar;
        this.a = view;
        this.b = dkVar;
        this.c = i;
        this.d = obj;
    }

    public boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.e.a(this.b, this.c, this.d);
        return true;
    }
}
