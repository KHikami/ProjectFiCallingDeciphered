package p000;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

final class bro implements jza, kcf, kci, kck, kcq {
    private final Context f4284a;
    private brk f4285b;
    private jca f4286c;
    private cgr f4287d;
    private MenuItem f4288e;

    public bro(Context context, kbu kbu) {
        this.f4284a = context;
        kbu.m25514a((kcq) this);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f4285b = (brk) jyn.m25443a(brk.class);
        this.f4286c = (jca) jyn.m25443a(jca.class);
        this.f4287d = (cgr) jyn.m25443a(cgr.class);
    }

    public boolean mo670a(Menu menu) {
        this.f4288e = menu.add(0, gwb.jK, 1001, gwb.jL);
        return true;
    }

    public boolean mo672b(Menu menu) {
        this.f4288e.setVisible(gld.m17936a());
        return true;
    }

    public boolean mo671a(MenuItem menuItem) {
        if (menuItem.getItemId() != gwb.jK) {
            return false;
        }
        bko e = fde.m15018e(this.f4286c.mo2317a());
        bpd a = this.f4287d.mo931a();
        if (a == null) {
            return true;
        }
        new cch(this.f4284a).m7201a(e).m7204a(this.f4285b.mo891a()).m7203a(this.f4285b.mo892b()).m7202a(a).m7200a().show();
        return true;
    }
}
