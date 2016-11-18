package p000;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.hangouts.R$drawable;

final class brv implements cyl, jza, kcf, kci, kck, kcq {
    private final Context f4292a;
    private brr f4293b;
    private jca f4294c;
    private cgr f4295d;
    private ed f4296e;
    private iih f4297f;
    private fit f4298g;
    private MenuItem f4299h;

    public brv(Context context, kbu kbu) {
        this.f4292a = context;
        kbu.m25514a((kcq) this);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f4293b = (brr) jyn.m25443a(brr.class);
        this.f4294c = (jca) jyn.m25443a(jca.class);
        this.f4295d = (cgr) jyn.m25443a(cgr.class);
        this.f4296e = (ed) jyn.m25443a(ed.class);
        this.f4297f = (iih) jyn.m25443a(iih.class);
        this.f4298g = (fit) jyn.m25443a(fit.class);
    }

    public boolean mo670a(Menu menu) {
        this.f4299h = menu.add(0, gwb.jM, 0, bc.iL);
        this.f4299h.setIcon(R$drawable.bo);
        return true;
    }

    public boolean mo672b(Menu menu) {
        boolean z = false;
        bpd a = this.f4295d.mo931a();
        if (a == null) {
            this.f4299h.setVisible(false);
        } else {
            int e = this.f4295d.mo947e();
            boolean i = gwb.m2254i(a.f4147b);
            if (e != 2 || i) {
                i = false;
            } else {
                i = true;
            }
            MenuItem menuItem = this.f4299h;
            if (!(i || this.f4295d.mo953j())) {
                z = true;
            }
            menuItem.setVisible(z);
        }
        return true;
    }

    public boolean mo671a(MenuItem menuItem) {
        if (menuItem.getItemId() != gwb.jM) {
            return false;
        }
        if (this.f4294c.mo2319b()) {
            this.f4297f.mo1979a(this.f4294c.mo2317a()).mo1693b().mo1714c(3283);
            cyk a = cyk.m11264a(this.f4292a.getString(bc.iN), this.f4292a.getString(bc.iM), this.f4292a.getString(bc.iL), this.f4292a.getString(bc.f2931O));
            a.m11267a((cyl) this);
            a.mo2341a(this.f4296e, null);
            return true;
        }
        glk.m17981d("Babel_DeleteMenuItem", "ConversationFragment delete failed because of null account.", new Object[0]);
        return true;
    }

    public void mo678a(Bundle bundle, String str) {
        bko e = fde.m15018e(this.f4294c.mo2317a());
        String[] a = this.f4293b.mo887a();
        long[] b = this.f4293b.mo888b();
        for (int i = 0; i < a.length; i++) {
            this.f4298g.mo2004a(e, a[i], b[i]);
        }
        this.f4293b.mo886a(this.f4295d.mo931a().f4146a);
    }

    public void b_(String str) {
    }

    public void mo679b(String str) {
    }
}
