package p000;

import android.support.v7.widget.RecyclerView;

public final class adw implements Runnable {
    final /* synthetic */ RecyclerView f361a;

    public adw(RecyclerView recyclerView) {
        this.f361a = recyclerView;
    }

    public void run() {
        if (this.f361a.f1460v != null) {
            this.f361a.f1460v.mo28a();
        }
        this.f361a.f1422A = false;
    }
}
