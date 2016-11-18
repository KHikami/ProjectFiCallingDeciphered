package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

final class dsu implements jza, kcf, kci, kck, kcq {
    private final Context a;
    private jca b;
    private biw c;
    private cgr d;
    private bpe e;
    private ed f;
    private dsi g;
    private iih h;
    private MenuItem i;

    public dsu(Context context, kbu kbu) {
        this.a = context;
        kbu.a((kcq) this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.b = (jca) jyn.a(jca.class);
        this.c = (biw) jyn.a(biw.class);
        this.d = (cgr) jyn.a(cgr.class);
        this.e = (bpe) jyn.a(bpe.class);
        this.f = (ed) jyn.a(ed.class);
        this.g = (dsi) jyn.a(dsi.class);
        this.h = (iih) jyn.a(iih.class);
    }

    public boolean a(Menu menu) {
        this.i = menu.add(0, gwb.rs, 0, ba.mc);
        return true;
    }

    public boolean b(Menu menu) {
        boolean z = false;
        bpd a = this.d.a();
        if (a == null) {
            this.i.setVisible(false);
        } else {
            boolean z2 = this.c.a("babel_enable_viral_flow_v1", true) && fde.d().length > 0 && this.d.e() != 2 && this.e.e() == null;
            boolean i = gwb.i(a.b);
            if (z2 && i) {
                MenuItem menuItem = this.i;
                if (!this.d.j()) {
                    z = true;
                }
                menuItem.setVisible(z);
            } else {
                this.i.setVisible(false);
            }
        }
        return true;
    }

    public boolean a(MenuItem menuItem) {
        if (menuItem.getItemId() != gwb.rs) {
            return false;
        }
        this.h.a(this.b.a()).b().c(3270);
        dsk dsk = dsk.INVITE;
        bpd e = this.e.e();
        if (e != null) {
            this.e.a(e);
        } else {
            bpd a = this.d.a();
            String str = a.e;
            if (a.h != null) {
                str = gwb.a(this.a, a.h, true);
            }
            this.g.a(this.a, this.f, str, a.e, a.a, dsk);
        }
        return true;
    }
}
