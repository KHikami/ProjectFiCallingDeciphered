package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

final class bqz implements jza, kcf, kci, kck, kcq {
    private bqv a;
    private jca b;
    private cgr c;
    private iih d;
    private MenuItem e;

    public bqz(kbu kbu) {
        kbu.a((kcq) this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.a = (bqv) jyn.a(bqv.class);
        this.b = (jca) jyn.a(jca.class);
        this.c = (cgr) jyn.a(cgr.class);
        this.d = (iih) jyn.a(iih.class);
    }

    public boolean a(Menu menu) {
        this.e = menu.add(0, gwb.jH, 0, bc.k);
        return true;
    }

    public boolean b(Menu menu) {
        MenuItem menuItem = this.e;
        boolean z = (this.a.b() || a() == null) ? false : true;
        menuItem.setVisible(z);
        return true;
    }

    public boolean a(MenuItem menuItem) {
        if (menuItem.getItemId() != gwb.jH) {
            return false;
        }
        this.d.a(this.b.a()).b().c(3272);
        String a = a();
        iil.b("Expected non-null", (Object) a);
        this.a.a().startActivityForResult(gwb.A(a), 102);
        return true;
    }

    private String a() {
        bpd a = this.c.a();
        if (a == null || a.j != null || a.e == null) {
            return null;
        }
        return a.e;
    }
}
