import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View.OnClickListener;

final class doc implements jza, kcf, kci, kck, kco, kcp, kcq {
    final uq a;
    dnc b;
    doh c;
    private dna d;
    private final doe e;
    private dij f;

    doc(uq uqVar, kbu kbu) {
        this.a = uqVar;
        this.e = new doe(this);
        kbu.a((kcq) this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.b = (dnc) jyn.a(dnc.class);
        this.d = (dna) jyn.a(dna.class);
        this.c = (doh) jyn.a(doh.class);
    }

    public void z_() {
        this.b.a(this.e);
        this.d.a(this.e);
        this.f = (dij) this.a.g().a();
        b();
    }

    public void A_() {
        this.b.b(this.e);
        this.d.b(this.e);
    }

    public boolean a(Menu menu) {
        new MenuInflater(this.a).inflate(gwb.qi, menu);
        return b(menu);
    }

    public boolean b(Menu menu) {
        MenuItem findItem = menu.findItem(gwb.qg);
        boolean d = d();
        findItem.setVisible(d);
        return d;
    }

    public boolean a(MenuItem menuItem) {
        if (menuItem.getItemId() == gwb.qg) {
            return a(2243);
        }
        return false;
    }

    boolean a(int i) {
        if (d()) {
            gwb.f(i);
            switch (dod.a[this.b.a().ordinal()]) {
                case wi.j /*1*/:
                    new dne().a(this.a.J_(), null);
                    return true;
                case wi.l /*2*/:
                case wi.z /*3*/:
                    new dnv().a(this.a.J_(), null);
                    return true;
            }
        }
        return false;
    }

    void b() {
        OnClickListener onClickListener = null;
        this.a.F_();
        if (this.f != null) {
            Drawable drawable;
            boolean d = d();
            if (d) {
                Resources resources = this.a.getResources();
                switch (dod.a[this.b.a().ordinal()]) {
                    case wi.j /*1*/:
                        drawable = resources.getDrawable(ba.kH);
                        break;
                    case wi.l /*2*/:
                        drawable = resources.getDrawable(ba.kK);
                        break;
                    case wi.z /*3*/:
                        drawable = resources.getDrawable(ba.kN);
                        break;
                }
            }
            drawable = null;
            this.f.a(drawable);
            dij dij = this.f;
            if (d) {
                onClickListener = this.e;
            }
            dij.setOnClickListener(onClickListener);
            this.f.setClickable(d);
        }
    }

    private boolean d() {
        dnd a = this.b.a();
        return this.b.b() && ((a == dnd.DOMAIN_RESTRICTED || a == dnd.DOMAIN_WITH_EXTERNAL || a == dnd.KNOCKABLE) && this.d.b());
    }
}
