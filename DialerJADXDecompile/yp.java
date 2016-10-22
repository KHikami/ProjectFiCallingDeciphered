import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
public final class yp implements Runnable {
    private /* synthetic */ RecyclerView a;

    public yp(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void run() {
        if (this.a.o && !this.a.isLayoutRequested()) {
            if (!this.a.m) {
                this.a.requestLayout();
            } else if (this.a.q) {
                this.a.p = true;
            } else {
                this.a.a();
            }
        }
    }
}
