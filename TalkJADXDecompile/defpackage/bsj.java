package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.hangouts.R$drawable;

/* renamed from: bsj */
final class bsj implements cyl, jza, kcf, kci, kck, kcq {
    private final Context a;
    private bsf b;
    private jca c;
    private cgr d;
    private ed e;
    private iih f;
    private fit g;
    private MenuItem h;

    public bsj(Context context, kbu kbu) {
        this.a = context;
        kbu.a((kcq) this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.b = (bsf) jyn.a(bsf.class);
        this.c = (jca) jyn.a(jca.class);
        this.d = (cgr) jyn.a(cgr.class);
        this.e = (ed) jyn.a(ed.class);
        this.f = (iih) jyn.a(iih.class);
        this.g = (fit) jyn.a(fit.class);
    }

    public boolean a(Menu menu) {
        this.h = menu.add(0, gwb.jO, 0, bc.iV);
        this.h.setIcon(R$drawable.bl);
        return true;
    }

    public boolean b(Menu menu) {
        boolean z = false;
        bpd a = this.d.a();
        if (a == null) {
            this.h.setVisible(false);
        } else {
            int e = this.d.e();
            boolean i = gwb.i(a.b);
            if (e != 2 || i) {
                i = false;
            } else {
                i = true;
            }
            MenuItem menuItem = this.h;
            if (!(!i || this.d.j() || this.b.a())) {
                z = true;
            }
            menuItem.setVisible(z);
        }
        return true;
    }

    public boolean a(MenuItem menuItem) {
        if (menuItem.getItemId() != gwb.jO) {
            return false;
        }
        if (this.c.b()) {
            this.f.a(this.c.a()).b().c(3284);
            cyk a = cyk.a(this.a.getString(bc.ji), this.a.getString(bc.jh), this.a.getString(bc.jg), this.a.getString(bc.jE));
            a.a((cyl) this);
            a.a(this.e, null);
            return true;
        }
        glk.d("Babel_LeaveMenuItem", "ConversationFragment leave failed because of null account.", new Object[0]);
        return true;
    }

    public void a(Bundle bundle, String str) {
        bko e = fde.e(this.c.a());
        bpd a = this.d.a();
        this.g.a(e, a.a);
        this.b.a(a.a);
    }

    public void b_(String str) {
    }

    public void b(String str) {
    }
}
