package defpackage;

import android.support.v7.widget.RecyclerView;

public final class adw implements Runnable {
    final /* synthetic */ RecyclerView a;

    public adw(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void run() {
        if (this.a.v != null) {
            this.a.v.a();
        }
        this.a.A = false;
    }
}
