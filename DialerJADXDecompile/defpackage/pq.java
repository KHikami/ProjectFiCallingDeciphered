package defpackage;

import android.view.View;

/* compiled from: PG */
/* renamed from: pq */
final class pq implements Runnable {
    private /* synthetic */ View a;
    private /* synthetic */ View b;
    private /* synthetic */ po c;

    pq(po poVar, View view, View view2) {
        this.c = poVar;
        this.a = view;
        this.b = view2;
    }

    public final void run() {
        int i = 0;
        View view = this.c.w;
        View view2 = this.a;
        View view3 = this.b;
        if (view2 != null) {
            view2.setVisibility(kn.b(view, -1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!kn.b(view, 1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }
}
