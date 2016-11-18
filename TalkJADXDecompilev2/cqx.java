package defpackage;

import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class cqx {
    private static final int g = gwb.oO;
    final uq a;
    final ctn b;
    final cus c;
    MenuItem d;
    String e;
    LoaderCallbacks<Cursor> f = new crb(this);
    private final tp h;
    private final ite i;
    private final crp j;
    private final ijb k;
    private final boolean l;
    private MenuItem m;
    private MenuItem n;
    private MenuItem o;
    private List<epk> p;
    private cuz q = new cqy(this);
    private final ctt r = new cqz(this);
    private itg s = new cra(this);
    private final cvm t = new crc(this);
    private ijj<lyh> u = new crd(this);
    private final jej v = new cre(this);

    public cqx(uq uqVar, tp tpVar, ctn ctn) {
        this.a = uqVar;
        this.h = tpVar;
        this.b = ctn;
        this.i = ctn.f();
        this.k = (ijb) this.i.t().a(ijb.class);
        this.c = ctn.g();
        this.p = jyn.c(uqVar, epk.class);
        this.j = (crp) jyn.a((Context) uqVar, crp.class);
        ((jek) jyn.a((Context) uqVar, jek.class)).a(gwb.op, this.v);
        this.l = ((cxg) jyn.a((Context) uqVar, cxg.class)).a("audioOnlyMode");
    }

    public void a() {
        this.k.a(this.u);
        this.i.a(this.s);
        this.c.a(this.q);
        this.b.h().a(this.t);
        this.b.a(this.r);
        d();
        c();
        a(this.c.o(), this.c.n());
        a(this.c.b());
        this.a.getLoaderManager().initLoader(0, null, this.f);
    }

    public void b() {
        this.k.b(this.u);
        this.i.b(this.s);
        this.c.b(this.q);
        this.b.h().b(this.t);
        this.b.b(this.r);
    }

    public void a(Menu menu) {
        this.a.getMenuInflater().inflate(gwb.po, menu);
        this.m = menu.findItem(gwb.oE);
        if (((cwv) jyn.b(this.a, cwv.class)) != null) {
            this.m.setTitle(ba.jT);
        }
        this.n = menu.findItem(gwb.ow);
        this.o = menu.findItem(gwb.oN);
        if (this.l) {
            int i;
            if (this.b.m()) {
                i = ba.jv;
            } else {
                i = ba.jU;
            }
            this.d = menu.add(0, g, 2, i);
        }
        d();
        c();
        a(this.c.o(), this.c.n());
        a(this.c.b());
        for (epk a : this.p) {
            a.a(this.a.getMenuInflater(), menu);
        }
    }

    public void b(Menu menu) {
        for (epk a : this.p) {
            a.a(menu);
        }
    }

    public boolean a(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.a.onBackPressed();
            return true;
        } else if (menuItem.getItemId() == gwb.oE) {
            gwb.i(this.a, 3347);
            this.j.a();
            return true;
        } else if (menuItem.getItemId() == gwb.ow) {
            gwb.i(this.a, 1531);
            this.c.p();
            return true;
        } else if (menuItem.getItemId() == gwb.oN) {
            gwb.i(this.a, 1533);
            switch (this.c.b()) {
                case 1:
                    this.c.a(2);
                    break;
                case 2:
                    this.c.a(1);
                    break;
            }
            return true;
        } else if (menuItem.getItemId() == g) {
            if (this.d != null) {
                int i;
                if (this.b.m()) {
                    i = ctx.a;
                } else {
                    i = ctx.b;
                }
                this.b.a(i);
            }
            return true;
        } else {
            for (epk a : this.p) {
                if (a.a(this.a, menuItem)) {
                    return true;
                }
            }
            return false;
        }
    }

    void c() {
        if (!this.b.s() || this.b.t()) {
            this.h.a(null);
        } else if (!TextUtils.isEmpty(this.e)) {
            this.h.a(this.e);
        } else if (this.b.h().c().isEmpty()) {
            this.h.a(this.a.getResources().getString(ba.jq));
        } else {
            CharSequence charSequence;
            tp tpVar = this.h;
            List arrayList = new ArrayList();
            for (lym lym : this.b.h().c()) {
                arrayList.add(lym.k != null ? lym.k : lym.d);
            }
            Resources resources = this.a.getResources();
            switch (arrayList.size()) {
                case 0:
                    charSequence = null;
                    break;
                case 1:
                    String str = (String) arrayList.get(0);
                    break;
                case 2:
                    charSequence = resources.getString(ba.jr, new Object[]{arrayList.get(0), arrayList.get(1)});
                    break;
                case 3:
                    charSequence = resources.getString(ba.js, new Object[]{arrayList.get(0), arrayList.get(1), arrayList.get(2)});
                    break;
                case 4:
                    charSequence = resources.getString(ba.jt, new Object[]{arrayList.get(0), arrayList.get(1), arrayList.get(2), arrayList.get(3)});
                    break;
                default:
                    charSequence = resources.getString(ba.ju, new Object[]{arrayList.get(0), arrayList.get(1), arrayList.get(2), Integer.valueOf(arrayList.size() - 3)});
                    break;
            }
            tpVar.a(charSequence);
        }
    }

    void d() {
        if (this.m != null) {
            this.m.setVisible(this.i.l());
        }
    }

    void a(int i) {
        if (this.o != null) {
            if (this.l && this.b.m()) {
                this.o.setVisible(false);
            } else if (this.c.b(2) && this.c.b(1)) {
                switch (i) {
                    case 1:
                        this.o.setTitle(ba.jZ);
                        break;
                    case 2:
                        this.o.setTitle(ba.ka);
                        break;
                }
                this.o.setVisible(true);
            } else {
                this.o.setVisible(false);
            }
        }
    }

    void a(isr isr, Set<isq> set) {
        if (this.n != null) {
            if (this.l && this.b.m()) {
                this.n.setVisible(false);
            } else if (set.size() > 1) {
                switch (crf.a[isr.ordinal()]) {
                    case 1:
                        this.n.setTitle(ba.jS);
                        this.n.setIcon(gwb.om);
                        break;
                    case 2:
                        this.n.setTitle(ba.jR);
                        this.n.setIcon(gwb.ol);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.n.setTitle(ba.jQ);
                        this.n.setIcon(gwb.ok);
                        break;
                    case 6:
                        this.n.setVisible(false);
                        return;
                }
                this.n.setVisible(true);
            } else {
                this.n.setVisible(false);
            }
        }
    }
}
