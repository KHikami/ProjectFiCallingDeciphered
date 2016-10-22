package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/* renamed from: bro */
final class bro implements jza, kcf, kci, kck, kcq {
    private final Context a;
    private brk b;
    private jca c;
    private cgr d;
    private MenuItem e;

    public bro(Context context, kbu kbu) {
        this.a = context;
        kbu.a((kcq) this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.b = (brk) jyn.a(brk.class);
        this.c = (jca) jyn.a(jca.class);
        this.d = (cgr) jyn.a(cgr.class);
    }

    public boolean a(Menu menu) {
        this.e = menu.add(0, gwb.jK, 1001, gwb.jL);
        return true;
    }

    public boolean b(Menu menu) {
        this.e.setVisible(gld.a());
        return true;
    }

    public boolean a(MenuItem menuItem) {
        if (menuItem.getItemId() != gwb.jK) {
            return false;
        }
        bko e = fde.e(this.c.a());
        bpd a = this.d.a();
        if (a == null) {
            return true;
        }
        new cch(this.a).a(e).a(this.b.a()).a(this.b.b()).a(a).a().show();
        return true;
    }
}
