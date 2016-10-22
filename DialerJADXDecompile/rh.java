import android.view.View;

/* compiled from: PG */
final class rh extends mh {
    private /* synthetic */ rg a;

    rh(rg rgVar) {
        this.a = rgVar;
    }

    public final void b(View view) {
        if (this.a.j && this.a.f != null) {
            kn.b(this.a.f, 0.0f);
            kn.b(this.a.c, 0.0f);
        }
        this.a.c.setVisibility(8);
        this.a.c.a(false);
        this.a.l = null;
        rg rgVar = this.a;
        if (rgVar.i != null) {
            rgVar.i.a(rgVar.h);
            rgVar.h = null;
            rgVar.i = null;
        }
        if (this.a.b != null) {
            kn.n(this.a.b);
        }
    }
}
