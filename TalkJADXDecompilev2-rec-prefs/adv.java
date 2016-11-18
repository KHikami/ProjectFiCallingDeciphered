package p000;

import android.support.v7.widget.RecyclerView;

public final class adv implements Runnable {
    final /* synthetic */ RecyclerView f360a;

    public adv(RecyclerView recyclerView) {
        this.f360a = recyclerView;
    }

    public void run() {
        if (this.f360a.f1453o && !this.f360a.isLayoutRequested()) {
            if (!this.f360a.f1451m) {
                this.f360a.requestLayout();
            } else if (this.f360a.f1455q) {
                this.f360a.f1454p = true;
            } else {
                this.f360a.m3079d();
            }
        }
    }
}
