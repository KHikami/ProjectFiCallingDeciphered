import android.view.View;

/* compiled from: PG */
final class xy implements Runnable {
    private /* synthetic */ xx a;

    xy(xx xxVar) {
        this.a = xxVar;
    }

    public final void run() {
        View view = this.a.k;
        if (view != null && view.getWindowToken() != null) {
            this.a.b();
        }
    }
}
