package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.hangouts.R$drawable;

final class brg implements jza, kcf, kci, kck, kcq {
    brc a;
    private final Handler b = new Handler();
    private jca c;
    private cgr d;
    private iih e;
    private fit f;
    private fmf g;
    private MenuItem h;
    private MenuItem i;

    public brg(kbu kbu) {
        kbu.a((kcq) this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.a = (brc) jyn.a(brc.class);
        this.c = (jca) jyn.a(jca.class);
        this.d = (cgr) jyn.a(cgr.class);
        this.e = (iih) jyn.a(iih.class);
        this.f = (fit) jyn.a(fit.class);
        this.g = (fmf) jyn.a(fmf.class);
    }

    public boolean a(Menu menu) {
        this.h = menu.add(0, gwb.jI, 0, bc.iK);
        this.h.setIcon(R$drawable.bn);
        this.i = menu.add(0, gwb.jJ, 0, bc.iZ);
        this.i.setIcon(R$drawable.bs);
        return true;
    }

    public boolean b(Menu menu) {
        boolean z;
        boolean z2 = false;
        MenuItem menuItem = this.h;
        if (this.d.i() || this.d.j()) {
            z = false;
        } else {
            z = true;
        }
        menuItem.setVisible(z);
        MenuItem menuItem2 = this.i;
        if (this.d.i() && !this.d.j()) {
            z2 = true;
        }
        menuItem2.setVisible(z2);
        return true;
    }

    public boolean a(MenuItem menuItem) {
        if (menuItem.getItemId() == gwb.jI) {
            a(true, 3281);
            return true;
        } else if (menuItem.getItemId() != gwb.jJ) {
            return false;
        } else {
            a(false, 3282);
            return true;
        }
    }

    private void a(boolean z, int i) {
        bpd a = this.d.a();
        if (a != null) {
            this.e.a(this.c.a()).b().c(i);
            this.f.a(this.g.a(-1), fde.e(this.c.a()), this.a.a(), this.a.b(), z, false);
            this.b.postDelayed(new brh(this, a), 250);
        }
    }
}
