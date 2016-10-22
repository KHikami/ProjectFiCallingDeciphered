package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* renamed from: yq */
public final class yq implements Runnable {
    private /* synthetic */ RecyclerView a;

    public yq(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void run() {
        if (this.a.y != null) {
            this.a.y.a();
        }
        this.a.D = false;
    }
}
