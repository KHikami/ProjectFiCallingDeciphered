package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.hangouts.R$drawable;

final class brg implements jza, kcf, kci, kck, kcq {
    brc f4270a;
    private final Handler f4271b = new Handler();
    private jca f4272c;
    private cgr f4273d;
    private iih f4274e;
    private fit f4275f;
    private fmf f4276g;
    private MenuItem f4277h;
    private MenuItem f4278i;

    public brg(kbu kbu) {
        kbu.m25514a((kcq) this);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f4270a = (brc) jyn.m25443a(brc.class);
        this.f4272c = (jca) jyn.m25443a(jca.class);
        this.f4273d = (cgr) jyn.m25443a(cgr.class);
        this.f4274e = (iih) jyn.m25443a(iih.class);
        this.f4275f = (fit) jyn.m25443a(fit.class);
        this.f4276g = (fmf) jyn.m25443a(fmf.class);
    }

    public boolean mo670a(Menu menu) {
        this.f4277h = menu.add(0, gwb.jI, 0, bc.iK);
        this.f4277h.setIcon(R$drawable.bn);
        this.f4278i = menu.add(0, gwb.jJ, 0, bc.iZ);
        this.f4278i.setIcon(R$drawable.bs);
        return true;
    }

    public boolean mo672b(Menu menu) {
        boolean z;
        boolean z2 = false;
        MenuItem menuItem = this.f4277h;
        if (this.f4273d.mo952i() || this.f4273d.mo953j()) {
            z = false;
        } else {
            z = true;
        }
        menuItem.setVisible(z);
        MenuItem menuItem2 = this.f4278i;
        if (this.f4273d.mo952i() && !this.f4273d.mo953j()) {
            z2 = true;
        }
        menuItem2.setVisible(z2);
        return true;
    }

    public boolean mo671a(MenuItem menuItem) {
        if (menuItem.getItemId() == gwb.jI) {
            m6487a(true, 3281);
            return true;
        } else if (menuItem.getItemId() != gwb.jJ) {
            return false;
        } else {
            m6487a(false, 3282);
            return true;
        }
    }

    private void m6487a(boolean z, int i) {
        bpd a = this.f4273d.mo931a();
        if (a != null) {
            this.f4274e.mo1979a(this.f4272c.mo2317a()).mo1693b().mo1714c(i);
            this.f4275f.mo2012a(this.f4276g.mo2036a(-1), fde.m15018e(this.f4272c.mo2317a()), this.f4270a.mo884a(), this.f4270a.mo885b(), z, false);
            this.f4271b.postDelayed(new brh(this, a), 250);
        }
    }
}
