import android.view.Menu;
import android.view.Window.Callback;

/* compiled from: PG */
final class qw implements tk {
    private /* synthetic */ ql a;

    qw(ql qlVar) {
        this.a = qlVar;
    }

    public final void a(su suVar, boolean z) {
        Menu menu;
        Menu k = suVar.k();
        boolean z2 = k != suVar;
        ql qlVar = this.a;
        if (z2) {
            menu = k;
        }
        qv a = qlVar.a(menu);
        if (a == null) {
            return;
        }
        if (z2) {
            this.a.a(a.a, a, k);
            this.a.a(a, true);
            return;
        }
        this.a.a(a, z);
    }

    public final boolean a(su suVar) {
        if (suVar == null && this.a.g) {
            Callback callback = this.a.c.getCallback();
            if (!(callback == null || this.a.m)) {
                callback.onMenuOpened(108, suVar);
            }
        }
        return true;
    }
}
