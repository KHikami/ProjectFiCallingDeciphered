package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* compiled from: PG */
/* renamed from: cr */
final class cr implements OnPreDrawListener {
    private /* synthetic */ View a;
    private /* synthetic */ ct b;
    private /* synthetic */ int c;
    private /* synthetic */ Object d;
    private /* synthetic */ cp e;

    cr(cp cpVar, View view, ct ctVar, int i, Object obj) {
        this.e = cpVar;
        this.a = view;
        this.b = ctVar;
        this.c = i;
        this.d = obj;
    }

    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.e.a(this.b, this.c, this.d);
        return true;
    }
}
