package p000;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

final class bqz implements jza, kcf, kci, kck, kcq {
    private bqv f4261a;
    private jca f4262b;
    private cgr f4263c;
    private iih f4264d;
    private MenuItem f4265e;

    public bqz(kbu kbu) {
        kbu.m25514a((kcq) this);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f4261a = (bqv) jyn.m25443a(bqv.class);
        this.f4262b = (jca) jyn.m25443a(jca.class);
        this.f4263c = (cgr) jyn.m25443a(cgr.class);
        this.f4264d = (iih) jyn.m25443a(iih.class);
    }

    public boolean mo670a(Menu menu) {
        this.f4265e = menu.add(0, gwb.jH, 0, bc.f2955k);
        return true;
    }

    public boolean mo672b(Menu menu) {
        MenuItem menuItem = this.f4265e;
        boolean z = (this.f4261a.mo878b() || m6467a() == null) ? false : true;
        menuItem.setVisible(z);
        return true;
    }

    public boolean mo671a(MenuItem menuItem) {
        if (menuItem.getItemId() != gwb.jH) {
            return false;
        }
        this.f4264d.mo1979a(this.f4262b.mo2317a()).mo1693b().mo1714c(3272);
        String a = m6467a();
        iil.m21875b("Expected non-null", (Object) a);
        this.f4261a.mo877a().startActivityForResult(gwb.m1362A(a), 102);
        return true;
    }

    private String m6467a() {
        bpd a = this.f4263c.mo931a();
        if (a == null || a.f4155j != null || a.f4150e == null) {
            return null;
        }
        return a.f4150e;
    }
}
