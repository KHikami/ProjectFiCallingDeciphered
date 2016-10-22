import android.view.View;

/* compiled from: PG */
final class wa extends xm {
    private /* synthetic */ wc c;
    private /* synthetic */ vz d;

    wa(vz vzVar, View view, wc wcVar) {
        this.d = vzVar;
        this.c = wcVar;
        super(view);
    }

    public final to a() {
        return this.c;
    }

    public final boolean b() {
        if (!this.d.b.q.isShowing()) {
            this.d.b.b();
        }
        return true;
    }
}
