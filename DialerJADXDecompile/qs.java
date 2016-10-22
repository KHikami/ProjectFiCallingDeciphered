import android.view.Menu;
import android.view.MenuItem;

/* compiled from: PG */
final class qs implements ru {
    final /* synthetic */ ql a;
    private ru b;

    public qs(ql qlVar, ru ruVar) {
        this.a = qlVar;
        this.b = ruVar;
    }

    public final boolean a(rt rtVar, Menu menu) {
        return this.b.a(rtVar, menu);
    }

    public final boolean b(rt rtVar, Menu menu) {
        return this.b.b(rtVar, menu);
    }

    public final boolean a(rt rtVar, MenuItem menuItem) {
        return this.b.a(rtVar, menuItem);
    }

    public final void a(rt rtVar) {
        this.b.a(rtVar);
        if (this.a.r != null) {
            this.a.c.getDecorView().removeCallbacks(this.a.s);
        }
        if (this.a.q != null) {
            this.a.l();
            this.a.t = kn.l(this.a.q).a(0.0f);
            this.a.t.a(new qt(this));
        }
        if (this.a.e != null) {
            qa qaVar = this.a.e;
            rt rtVar2 = this.a.p;
        }
        this.a.p = null;
    }
}
