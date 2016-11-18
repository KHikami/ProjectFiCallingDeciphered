package p000;

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
    private static final int f8903g = gwb.oO;
    final uq f8904a;
    final ctn f8905b;
    final cus f8906c;
    MenuItem f8907d;
    String f8908e;
    LoaderCallbacks<Cursor> f8909f = new crb(this);
    private final tp f8910h;
    private final ite f8911i;
    private final crp f8912j;
    private final ijb f8913k;
    private final boolean f8914l;
    private MenuItem f8915m;
    private MenuItem f8916n;
    private MenuItem f8917o;
    private List<epk> f8918p;
    private cuz f8919q = new cqy(this);
    private final ctt f8920r = new cqz(this);
    private itg f8921s = new cra(this);
    private final cvm f8922t = new crc(this);
    private ijj<lyh> f8923u = new crd(this);
    private final jej f8924v = new cre(this);

    public cqx(uq uqVar, tp tpVar, ctn ctn) {
        this.f8904a = uqVar;
        this.f8910h = tpVar;
        this.f8905b = ctn;
        this.f8911i = ctn.m10974f();
        this.f8913k = (ijb) this.f8911i.mo3229t().m21926a(ijb.class);
        this.f8906c = ctn.m10975g();
        this.f8918p = jyn.m25438c(uqVar, epk.class);
        this.f8912j = (crp) jyn.m25426a((Context) uqVar, crp.class);
        ((jek) jyn.m25426a((Context) uqVar, jek.class)).m24033a(gwb.op, this.f8924v);
        this.f8914l = ((cxg) jyn.m25426a((Context) uqVar, cxg.class)).mo1454a("audioOnlyMode");
    }

    public void m10748a() {
        this.f8913k.mo3363a(this.f8923u);
        this.f8911i.mo3217a(this.f8921s);
        this.f8906c.m11052a(this.f8919q);
        this.f8905b.m10976h().m11092a(this.f8922t);
        this.f8905b.m10962a(this.f8920r);
        m10756d();
        m10755c();
        m10751a(this.f8906c.m11070o(), this.f8906c.m11069n());
        m10749a(this.f8906c.m11054b());
        this.f8904a.getLoaderManager().initLoader(0, null, this.f8909f);
    }

    public void m10753b() {
        this.f8913k.mo3366b(this.f8923u);
        this.f8911i.mo3219b(this.f8921s);
        this.f8906c.m11055b(this.f8919q);
        this.f8905b.m10976h().m11098b(this.f8922t);
        this.f8905b.m10969b(this.f8920r);
    }

    public void m10750a(Menu menu) {
        this.f8904a.getMenuInflater().inflate(gwb.po, menu);
        this.f8915m = menu.findItem(gwb.oE);
        if (((cwv) jyn.m25433b(this.f8904a, cwv.class)) != null) {
            this.f8915m.setTitle(ba.jT);
        }
        this.f8916n = menu.findItem(gwb.ow);
        this.f8917o = menu.findItem(gwb.oN);
        if (this.f8914l) {
            int i;
            if (this.f8905b.m10981m()) {
                i = ba.jv;
            } else {
                i = ba.jU;
            }
            this.f8907d = menu.add(0, f8903g, 2, i);
        }
        m10756d();
        m10755c();
        m10751a(this.f8906c.m11070o(), this.f8906c.m11069n());
        m10749a(this.f8906c.m11054b());
        for (epk a : this.f8918p) {
            a.mo1646a(this.f8904a.getMenuInflater(), menu);
        }
    }

    public void m10754b(Menu menu) {
        for (epk a : this.f8918p) {
            a.mo1645a(menu);
        }
    }

    public boolean m10752a(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.f8904a.onBackPressed();
            return true;
        } else if (menuItem.getItemId() == gwb.oE) {
            gwb.m2251i(this.f8904a, 3347);
            this.f8912j.mo1395a();
            return true;
        } else if (menuItem.getItemId() == gwb.ow) {
            gwb.m2251i(this.f8904a, 1531);
            this.f8906c.m11071p();
            return true;
        } else if (menuItem.getItemId() == gwb.oN) {
            gwb.m2251i(this.f8904a, 1533);
            switch (this.f8906c.m11054b()) {
                case 1:
                    this.f8906c.m11051a(2);
                    break;
                case 2:
                    this.f8906c.m11051a(1);
                    break;
            }
            return true;
        } else if (menuItem.getItemId() == f8903g) {
            if (this.f8907d != null) {
                int i;
                if (this.f8905b.m10981m()) {
                    i = ctx.f9080a;
                } else {
                    i = ctx.f9081b;
                }
                this.f8905b.m10959a(i);
            }
            return true;
        } else {
            for (epk a : this.f8918p) {
                if (a.mo1648a(this.f8904a, menuItem)) {
                    return true;
                }
            }
            return false;
        }
    }

    void m10755c() {
        if (!this.f8905b.m10987s() || this.f8905b.m10988t()) {
            this.f8910h.a(null);
        } else if (!TextUtils.isEmpty(this.f8908e)) {
            this.f8910h.a(this.f8908e);
        } else if (this.f8905b.m10976h().m11100c().isEmpty()) {
            this.f8910h.a(this.f8904a.getResources().getString(ba.jq));
        } else {
            CharSequence charSequence;
            tp tpVar = this.f8910h;
            List arrayList = new ArrayList();
            for (lym lym : this.f8905b.m10976h().m11100c()) {
                arrayList.add(lym.f26916k != null ? lym.f26916k : lym.f26909d);
            }
            Resources resources = this.f8904a.getResources();
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

    void m10756d() {
        if (this.f8915m != null) {
            this.f8915m.setVisible(this.f8911i.mo3221l());
        }
    }

    void m10749a(int i) {
        if (this.f8917o != null) {
            if (this.f8914l && this.f8905b.m10981m()) {
                this.f8917o.setVisible(false);
            } else if (this.f8906c.m11057b(2) && this.f8906c.m11057b(1)) {
                switch (i) {
                    case 1:
                        this.f8917o.setTitle(ba.jZ);
                        break;
                    case 2:
                        this.f8917o.setTitle(ba.ka);
                        break;
                }
                this.f8917o.setVisible(true);
            } else {
                this.f8917o.setVisible(false);
            }
        }
    }

    void m10751a(isr isr, Set<isq> set) {
        if (this.f8916n != null) {
            if (this.f8914l && this.f8905b.m10981m()) {
                this.f8916n.setVisible(false);
            } else if (set.size() > 1) {
                switch (crf.f8935a[isr.ordinal()]) {
                    case 1:
                        this.f8916n.setTitle(ba.jS);
                        this.f8916n.setIcon(gwb.om);
                        break;
                    case 2:
                        this.f8916n.setTitle(ba.jR);
                        this.f8916n.setIcon(gwb.ol);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        this.f8916n.setTitle(ba.jQ);
                        this.f8916n.setIcon(gwb.ok);
                        break;
                    case 6:
                        this.f8916n.setVisible(false);
                        return;
                }
                this.f8916n.setVisible(true);
            } else {
                this.f8916n.setVisible(false);
            }
        }
    }
}
