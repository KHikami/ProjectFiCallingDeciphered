package defpackage;

import android.content.Context;
import android.widget.Toast;

/* renamed from: fuj */
final class fuj extends czj<etr, ezs> {
    final ets d;
    private final Context e;
    private final int f;
    private final jwb g;
    private final boc h;
    private final String i;

    protected fuj(Context context, int i, jwb jwb, boc boc, ets ets, String str) {
        this.e = context;
        this.f = i;
        this.g = jwb;
        this.h = boc;
        this.i = str;
        this.d = ets;
    }

    public void a(fme fme) {
        gwb.a(fde.e(this.f), 1594);
        bnz.a(fme, this.f, this.h, this.d);
    }

    protected void a(Exception exception) {
        super.a(exception);
        this.g.a(this.i);
        this.g.b(this.g.f()[this.g.b(this.i)]);
    }

    protected void a(fiu fiu) {
        super.a(fiu);
        bnz.a(this.f, this.h, this.d);
    }

    public void b() {
        if (czj.i()) {
            Toast.makeText(this.e, bc.W, 0).show();
        } else {
            Toast.makeText(this.e, bc.X, 0).show();
        }
    }

    public Class<etr> d() {
        return etr.class;
    }

    public Class<ezs> e() {
        return ezs.class;
    }

    public String a() {
        return this.e.getResources().getString(bc.V);
    }
}
