package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: adv */
public final class adv implements Runnable {
    final /* synthetic */ RecyclerView a;

    public adv(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void run() {
        if (this.a.o && !this.a.isLayoutRequested()) {
            if (!this.a.m) {
                this.a.requestLayout();
            } else if (this.a.q) {
                this.a.p = true;
            } else {
                this.a.d();
            }
        }
    }
}
