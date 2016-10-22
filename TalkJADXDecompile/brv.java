import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.hangouts.R$drawable;

final class brv implements cyl, jza, kcf, kci, kck, kcq {
    private final Context a;
    private brr b;
    private jca c;
    private cgr d;
    private ed e;
    private iih f;
    private fit g;
    private MenuItem h;

    public brv(Context context, kbu kbu) {
        this.a = context;
        kbu.a((kcq) this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.b = (brr) jyn.a(brr.class);
        this.c = (jca) jyn.a(jca.class);
        this.d = (cgr) jyn.a(cgr.class);
        this.e = (ed) jyn.a(ed.class);
        this.f = (iih) jyn.a(iih.class);
        this.g = (fit) jyn.a(fit.class);
    }

    public boolean a(Menu menu) {
        this.h = menu.add(0, gwb.jM, 0, bc.iL);
        this.h.setIcon(R$drawable.bo);
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
            if (!(i || this.d.j())) {
                z = true;
            }
            menuItem.setVisible(z);
        }
        return true;
    }

    public boolean a(MenuItem menuItem) {
        if (menuItem.getItemId() != gwb.jM) {
            return false;
        }
        if (this.c.b()) {
            this.f.a(this.c.a()).b().c(3283);
            cyk a = cyk.a(this.a.getString(bc.iN), this.a.getString(bc.iM), this.a.getString(bc.iL), this.a.getString(bc.O));
            a.a((cyl) this);
            a.a(this.e, null);
            return true;
        }
        glk.d("Babel_DeleteMenuItem", "ConversationFragment delete failed because of null account.", new Object[0]);
        return true;
    }

    public void a(Bundle bundle, String str) {
        bko e = fde.e(this.c.a());
        String[] a = this.b.a();
        long[] b = this.b.b();
        for (int i = 0; i < a.length; i++) {
            this.g.a(e, a[i], b[i]);
        }
        this.b.a(this.d.a().a);
    }

    public void b_(String str) {
    }

    public void b(String str) {
    }
}
