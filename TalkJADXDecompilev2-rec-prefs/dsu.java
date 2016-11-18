package p000;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

final class dsu implements jza, kcf, kci, kck, kcq {
    private final Context f10472a;
    private jca f10473b;
    private biw f10474c;
    private cgr f10475d;
    private bpe f10476e;
    private ed f10477f;
    private dsi f10478g;
    private iih f10479h;
    private MenuItem f10480i;

    public dsu(Context context, kbu kbu) {
        this.f10472a = context;
        kbu.m25514a((kcq) this);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f10473b = (jca) jyn.m25443a(jca.class);
        this.f10474c = (biw) jyn.m25443a(biw.class);
        this.f10475d = (cgr) jyn.m25443a(cgr.class);
        this.f10476e = (bpe) jyn.m25443a(bpe.class);
        this.f10477f = (ed) jyn.m25443a(ed.class);
        this.f10478g = (dsi) jyn.m25443a(dsi.class);
        this.f10479h = (iih) jyn.m25443a(iih.class);
    }

    public boolean mo670a(Menu menu) {
        this.f10480i = menu.add(0, gwb.rs, 0, ba.mc);
        return true;
    }

    public boolean mo672b(Menu menu) {
        boolean z = false;
        bpd a = this.f10475d.mo931a();
        if (a == null) {
            this.f10480i.setVisible(false);
        } else {
            boolean z2 = this.f10474c.mo564a("babel_enable_viral_flow_v1", true) && fde.m15016d().length > 0 && this.f10475d.mo947e() != 2 && this.f10476e.mo968e() == null;
            boolean i = gwb.m2254i(a.f4147b);
            if (z2 && i) {
                MenuItem menuItem = this.f10480i;
                if (!this.f10475d.mo953j()) {
                    z = true;
                }
                menuItem.setVisible(z);
            } else {
                this.f10480i.setVisible(false);
            }
        }
        return true;
    }

    public boolean mo671a(MenuItem menuItem) {
        if (menuItem.getItemId() != gwb.rs) {
            return false;
        }
        this.f10479h.mo1979a(this.f10473b.mo2317a()).mo1693b().mo1714c(3270);
        dsk dsk = dsk.INVITE;
        bpd e = this.f10476e.mo968e();
        if (e != null) {
            this.f10476e.mo962a(e);
        } else {
            bpd a = this.f10475d.mo931a();
            String str = a.f4150e;
            if (a.f4153h != null) {
                str = gwb.m1648a(this.f10472a, a.f4153h, true);
            }
            this.f10478g.mo1660a(this.f10472a, this.f10477f, str, a.f4150e, a.f4146a, dsk);
        }
        return true;
    }
}
