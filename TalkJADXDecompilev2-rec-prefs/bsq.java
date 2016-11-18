package p000;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.google.android.apps.hangouts.R$drawable;

final class bsq implements jza, kcf, kci, kck, kcq {
    private final Context f4332a;
    private bsm f4333b;
    private jca f4334c;
    private bbm f4335d;
    private cnt f4336e;
    private cgr f4337f;
    private iih f4338g;
    private MenuItem f4339h;
    private MenuItem f4340i;

    public bsq(Context context, kbu kbu) {
        this.f4332a = context;
        kbu.m25514a((kcq) this);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f4333b = (bsm) jyn.m25443a(bsm.class);
        this.f4334c = (jca) jyn.m25443a(jca.class);
        this.f4335d = (bbm) jyn.m25443a(bbm.class);
        this.f4336e = (cnt) jyn.m25443a(cnt.class);
        this.f4337f = (cgr) jyn.m25443a(cgr.class);
        this.f4338g = (iih) jyn.m25443a(iih.class);
    }

    public boolean mo670a(Menu menu) {
        this.f4339h = menu.add(0, gwb.jQ, 0, gwb.jS);
        this.f4339h.setIcon(R$drawable.bq);
        this.f4339h.setShowAsAction(0);
        this.f4340i = menu.add(0, gwb.jP, 0, gwb.jR);
        this.f4340i.setIcon(R$drawable.bp);
        this.f4340i.setShowAsAction(0);
        return true;
    }

    public boolean mo672b(Menu menu) {
        boolean z = false;
        bpd a = this.f4337f.mo931a();
        if (a == null || gwb.m2254i(a.f4147b) || !gwb.m2238h(this.f4332a, this.f4334c.mo2317a()) || this.f4337f.mo953j()) {
            this.f4339h.setVisible(false);
            this.f4340i.setVisible(false);
        } else {
            MenuItem menuItem = this.f4339h;
            if (!this.f4333b.mo881a()) {
                z = true;
            }
            menuItem.setVisible(z);
            this.f4340i.setVisible(this.f4333b.mo881a());
        }
        return true;
    }

    public boolean mo671a(MenuItem menuItem) {
        if (menuItem.getItemId() == gwb.jQ) {
            this.f4338g.mo1979a(this.f4334c.mo2317a()).mo1693b().mo1714c(3277);
            m6551a(this.f4332a, 2, this.f4337f.mo943c());
            return true;
        } else if (menuItem.getItemId() != gwb.jP) {
            return false;
        } else {
            this.f4338g.mo1979a(this.f4334c.mo2317a()).mo1693b().mo1714c(3278);
            m6551a(this.f4332a, 1, this.f4337f.mo943c());
            return true;
        }
    }

    private void m6551a(Context context, int i, String str) {
        if (this.f4333b.mo882b() == 2) {
            int i2;
            if (this.f4335d.mo448h(this.f4334c.mo2317a())) {
                i2 = gwb.jU;
            } else {
                i2 = gwb.jT;
            }
            Toast.makeText(context, i2, 0).show();
            return;
        }
        this.f4336e.mo1025a(this.f4334c.mo2317a(), str, i);
    }
}
