package p000;

import android.content.Context;
import android.widget.Toast;

final class fuj extends czj<etr, ezs> {
    final ets f14025d;
    private final Context f14026e;
    private final int f14027f;
    private final jwb f14028g;
    private final boc f14029h;
    private final String f14030i;

    protected fuj(Context context, int i, jwb jwb, boc boc, ets ets, String str) {
        this.f14026e = context;
        this.f14027f = i;
        this.f14028g = jwb;
        this.f14029h = boc;
        this.f14030i = str;
        this.f14025d = ets;
    }

    public void mo1480a(fme fme) {
        gwb.m1823a(fde.m15018e(this.f14027f), 1594);
        bnz.m6274a(fme, this.f14027f, this.f14029h, this.f14025d);
    }

    protected void mo1888a(Exception exception) {
        super.mo1888a(exception);
        this.f14028g.m16373a(this.f14030i);
        this.f14028g.mo2102b(this.f14028g.m16384f()[this.f14028g.m16377b(this.f14030i)]);
    }

    protected void mo1887a(fiu fiu) {
        super.mo1887a(fiu);
        bnz.m6273a(this.f14027f, this.f14029h, this.f14025d);
    }

    public void mo1475b() {
        if (czj.m11296i()) {
            Toast.makeText(this.f14026e, bc.f2939W, 0).show();
        } else {
            Toast.makeText(this.f14026e, bc.f2940X, 0).show();
        }
    }

    public Class<etr> mo1481d() {
        return etr.class;
    }

    public Class<ezs> mo1482e() {
        return ezs.class;
    }

    public String mo1479a() {
        return this.f14026e.getResources().getString(bc.f2938V);
    }
}
