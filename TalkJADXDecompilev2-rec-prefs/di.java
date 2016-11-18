package p000;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

final class di implements OnPreDrawListener {
    final /* synthetic */ View f9799a;
    final /* synthetic */ dk f9800b;
    final /* synthetic */ int f9801c;
    final /* synthetic */ Object f9802d;
    final /* synthetic */ dg f9803e;

    di(dg dgVar, View view, dk dkVar, int i, Object obj) {
        this.f9803e = dgVar;
        this.f9799a = view;
        this.f9800b = dkVar;
        this.f9801c = i;
        this.f9802d = obj;
    }

    public boolean onPreDraw() {
        this.f9799a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f9803e.m11669a(this.f9800b, this.f9801c, this.f9802d);
        return true;
    }
}
