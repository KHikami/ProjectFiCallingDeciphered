import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.google.android.apps.hangouts.R$drawable;

final class bsq implements jza, kcf, kci, kck, kcq {
    private final Context a;
    private bsm b;
    private jca c;
    private bbm d;
    private cnt e;
    private cgr f;
    private iih g;
    private MenuItem h;
    private MenuItem i;

    public bsq(Context context, kbu kbu) {
        this.a = context;
        kbu.a((kcq) this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.b = (bsm) jyn.a(bsm.class);
        this.c = (jca) jyn.a(jca.class);
        this.d = (bbm) jyn.a(bbm.class);
        this.e = (cnt) jyn.a(cnt.class);
        this.f = (cgr) jyn.a(cgr.class);
        this.g = (iih) jyn.a(iih.class);
    }

    public boolean a(Menu menu) {
        this.h = menu.add(0, gwb.jQ, 0, gwb.jS);
        this.h.setIcon(R$drawable.bq);
        this.h.setShowAsAction(0);
        this.i = menu.add(0, gwb.jP, 0, gwb.jR);
        this.i.setIcon(R$drawable.bp);
        this.i.setShowAsAction(0);
        return true;
    }

    public boolean b(Menu menu) {
        boolean z = false;
        bpd a = this.f.a();
        if (a == null || gwb.i(a.b) || !gwb.h(this.a, this.c.a()) || this.f.j()) {
            this.h.setVisible(false);
            this.i.setVisible(false);
        } else {
            MenuItem menuItem = this.h;
            if (!this.b.a()) {
                z = true;
            }
            menuItem.setVisible(z);
            this.i.setVisible(this.b.a());
        }
        return true;
    }

    public boolean a(MenuItem menuItem) {
        if (menuItem.getItemId() == gwb.jQ) {
            this.g.a(this.c.a()).b().c(3277);
            a(this.a, 2, this.f.c());
            return true;
        } else if (menuItem.getItemId() != gwb.jP) {
            return false;
        } else {
            this.g.a(this.c.a()).b().c(3278);
            a(this.a, 1, this.f.c());
            return true;
        }
    }

    private void a(Context context, int i, String str) {
        if (this.b.b() == 2) {
            int i2;
            if (this.d.h(this.c.a())) {
                i2 = gwb.jU;
            } else {
                i2 = gwb.jT;
            }
            Toast.makeText(context, i2, 0).show();
            return;
        }
        this.e.a(this.c.a(), str, i);
    }
}
