package p000;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.hangouts.R$drawable;

final class bsj implements cyl, jza, kcf, kci, kck, kcq {
    private final Context f4321a;
    private bsf f4322b;
    private jca f4323c;
    private cgr f4324d;
    private ed f4325e;
    private iih f4326f;
    private fit f4327g;
    private MenuItem f4328h;

    public bsj(Context context, kbu kbu) {
        this.f4321a = context;
        kbu.m25514a((kcq) this);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f4322b = (bsf) jyn.m25443a(bsf.class);
        this.f4323c = (jca) jyn.m25443a(jca.class);
        this.f4324d = (cgr) jyn.m25443a(cgr.class);
        this.f4325e = (ed) jyn.m25443a(ed.class);
        this.f4326f = (iih) jyn.m25443a(iih.class);
        this.f4327g = (fit) jyn.m25443a(fit.class);
    }

    public boolean mo670a(Menu menu) {
        this.f4328h = menu.add(0, gwb.jO, 0, bc.iV);
        this.f4328h.setIcon(R$drawable.bl);
        return true;
    }

    public boolean mo672b(Menu menu) {
        boolean z = false;
        bpd a = this.f4324d.mo931a();
        if (a == null) {
            this.f4328h.setVisible(false);
        } else {
            int e = this.f4324d.mo947e();
            boolean i = gwb.m2254i(a.f4147b);
            if (e != 2 || i) {
                i = false;
            } else {
                i = true;
            }
            MenuItem menuItem = this.f4328h;
            if (!(!i || this.f4324d.mo953j() || this.f4322b.mo890a())) {
                z = true;
            }
            menuItem.setVisible(z);
        }
        return true;
    }

    public boolean mo671a(MenuItem menuItem) {
        if (menuItem.getItemId() != gwb.jO) {
            return false;
        }
        if (this.f4323c.mo2319b()) {
            this.f4326f.mo1979a(this.f4323c.mo2317a()).mo1693b().mo1714c(3284);
            cyk a = cyk.m11264a(this.f4321a.getString(bc.ji), this.f4321a.getString(bc.jh), this.f4321a.getString(bc.jg), this.f4321a.getString(bc.jE));
            a.m11267a((cyl) this);
            a.mo2341a(this.f4325e, null);
            return true;
        }
        glk.m17981d("Babel_LeaveMenuItem", "ConversationFragment leave failed because of null account.", new Object[0]);
        return true;
    }

    public void mo678a(Bundle bundle, String str) {
        bko e = fde.m15018e(this.f4323c.mo2317a());
        bpd a = this.f4324d.mo931a();
        this.f4327g.mo2002a(e, a.f4146a);
        this.f4322b.mo889a(a.f4146a);
    }

    public void b_(String str) {
    }

    public void mo679b(String str) {
    }
}
