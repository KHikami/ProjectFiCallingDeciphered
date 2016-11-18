package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View.OnClickListener;

final class doc implements jza, kcf, kci, kck, kco, kcp, kcq {
    final uq f10211a;
    dnc f10212b;
    doh f10213c;
    private dna f10214d;
    private final doe f10215e = new doe(this);
    private dij f10216f;

    doc(uq uqVar, kbu kbu) {
        this.f10211a = uqVar;
        kbu.m25514a((kcq) this);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f10212b = (dnc) jyn.m25443a(dnc.class);
        this.f10214d = (dna) jyn.m25443a(dna.class);
        this.f10213c = (doh) jyn.m25443a(doh.class);
    }

    public void z_() {
        this.f10212b.mo1623a(this.f10215e);
        this.f10214d.mo1610a(this.f10215e);
        this.f10216f = (dij) this.f10211a.m8308g().a();
        m12350b();
    }

    public void A_() {
        this.f10212b.mo1625b(this.f10215e);
        this.f10214d.mo1612b(this.f10215e);
    }

    public boolean mo670a(Menu menu) {
        new MenuInflater(this.f10211a).inflate(gwb.qi, menu);
        return mo672b(menu);
    }

    public boolean mo672b(Menu menu) {
        MenuItem findItem = menu.findItem(gwb.qg);
        boolean d = m12345d();
        findItem.setVisible(d);
        return d;
    }

    public boolean mo671a(MenuItem menuItem) {
        if (menuItem.getItemId() == gwb.qg) {
            return m12347a(2243);
        }
        return false;
    }

    boolean m12347a(int i) {
        if (m12345d()) {
            gwb.m2198f(i);
            switch (dod.f10217a[this.f10212b.mo1622a().ordinal()]) {
                case 1:
                    new dne().mo2341a(this.f10211a.J_(), null);
                    return true;
                case 2:
                case 3:
                    new dnv().mo2341a(this.f10211a.J_(), null);
                    return true;
            }
        }
        return false;
    }

    void m12350b() {
        OnClickListener onClickListener = null;
        this.f10211a.F_();
        if (this.f10216f != null) {
            Drawable drawable;
            boolean d = m12345d();
            if (d) {
                Resources resources = this.f10211a.getResources();
                switch (dod.f10217a[this.f10212b.mo1622a().ordinal()]) {
                    case 1:
                        drawable = resources.getDrawable(ba.kH);
                        break;
                    case 2:
                        drawable = resources.getDrawable(ba.kK);
                        break;
                    case 3:
                        drawable = resources.getDrawable(ba.kN);
                        break;
                }
            }
            drawable = null;
            this.f10216f.m12008a(drawable);
            dij dij = this.f10216f;
            if (d) {
                onClickListener = this.f10215e;
            }
            dij.setOnClickListener(onClickListener);
            this.f10216f.setClickable(d);
        }
    }

    private boolean m12345d() {
        dnd a = this.f10212b.mo1622a();
        return this.f10212b.mo1626b() && ((a == dnd.DOMAIN_RESTRICTED || a == dnd.DOMAIN_WITH_EXTERNAL || a == dnd.KNOCKABLE) && this.f10214d.mo1614b());
    }
}
