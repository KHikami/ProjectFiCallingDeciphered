import android.database.DataSetObserver;

/* compiled from: PG */
final class yb extends DataSetObserver {
    private /* synthetic */ xx a;

    yb(xx xxVar) {
        this.a = xxVar;
    }

    public final void onChanged() {
        if (this.a.q.isShowing()) {
            this.a.b();
        }
    }

    public final void onInvalidated() {
        this.a.c();
    }
}
