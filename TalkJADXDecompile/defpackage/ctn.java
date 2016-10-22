package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import junit.framework.Assert;

/* renamed from: ctn */
public final class ctn implements gia<fln> {
    final Context a;
    final itf b;
    final ite c;
    final ijh d;
    final cus e;
    final cvh f;
    final cuk g;
    final cuf h;
    final csq i;
    dhz j;
    final List<ctt> k;
    long l;
    ctv m;
    int n;
    final Runnable o;
    boolean p;
    private final cty q;
    private final cvx r;
    private final String s;
    private final bko t;
    private final gic u;
    private int v;
    private final Runnable w;
    private boolean x;
    private boolean y;
    private boolean z;

    public static ctn a(Context context, dhz dhz, dli dli, boolean z, boolean z2, boolean z3) {
        int i;
        bko a = fde.a(dhz.a());
        iri a2 = ((dgt) jyn.a(context, dgt.class)).a();
        if (fdq.Q.b(a.g())) {
            iti iti = new iti(context);
            iti.b().a(true);
            a2.a(iti);
        }
        bko a3 = fde.a(dhz.a());
        Bundle bundle = new Bundle();
        bundle.putInt("account_id", a3.g());
        lkm lkm = new lkm();
        lkm lkm2 = lkm;
        for (dlc a4 : jyn.c(context, dlc.class)) {
            lkm2 = a4.a(lkm2, bundle);
        }
        off off = new off();
        off.b = Integer.valueOf(412);
        if (gwb.az(context)) {
            i = 3;
        } else {
            i = 2;
        }
        off.a = Integer.valueOf(i);
        off.c = Integer.valueOf(2);
        Object g = fde.g(a3.g());
        if (TextUtils.isEmpty(g)) {
            fde.c(a3);
        }
        i = 0;
        switch (dhz.l()) {
            case wi.j /*1*/:
                i = 3;
                break;
            case wi.l /*2*/:
                i = 2;
                break;
            default:
                Assert.fail("Express lane only supports audio and video calls");
                break;
        }
        itf a5 = new itf().a(off).y().b(i).a(i == 3).k(Long.toString(ffh.a().b())).j(dhz.a()).l(g).a(lkm2);
        if (!TextUtils.isEmpty(dhz.g())) {
            a5.c(dhz.g());
        }
        ite a6 = a2.a(a5);
        ijh a7 = ctn.a(context, a2, a5);
        cus cus = new cus(context, a6, dhz.l());
        cvh cvh = new cvh(context, a6, cus, a.g());
        return new ctn(context, dhz, dli, a, a5, a6, a7, cus, cvh, new cuk(a7, a6, cvh), new cvx(context, a6, cus), new cuf(), z, z2, z3);
    }

    private ctn(Context context, dhz dhz, dli dli, bko bko, itf itf, ite ite, ijh ijh, cus cus, cvh cvh, cuk cuk, cvx cvx, cuf cuf, boolean z, boolean z2, boolean z3) {
        int i;
        int[] iArr;
        this.k = new CopyOnWriteArrayList();
        this.l = -1;
        this.n = -1;
        this.o = new cto(this);
        this.w = new ctp(this);
        this.x = true;
        this.y = true;
        glk.c("Babel_explane", "HangoutCall created", new Object[0]);
        this.a = context;
        this.t = bko;
        this.b = itf;
        this.c = ite;
        this.d = ijh;
        this.e = cus;
        this.f = cvh;
        this.g = cuk;
        this.r = cvx;
        this.h = cuf;
        if (dhz.l() == 2) {
            i = ctx.b;
        } else {
            i = ctx.a;
        }
        this.v = i;
        if (z3) {
            if (z2) {
                iArr = new int[]{1, 3, 18};
            } else if (z) {
                iArr = new int[]{1, 3, 17};
            } else {
                iArr = new int[]{1, 3};
            }
        } else if (z) {
            iArr = new int[]{1, 2, 17};
        } else {
            iArr = new int[]{1, 2};
        }
        this.i = new csq(context, iArr, ite, itf);
        this.j = dhz.r();
        this.q = new cty(this, dli);
        iub iub = new iub();
        this.s = iub.a();
        this.f.a(new ctq(this));
        this.g.a(new ctr(this));
        this.u = ((gie) jyn.a(context, gie.class)).b(fln.class, this, fln.a(this.j.d()));
    }

    public String a() {
        return this.s;
    }

    public String b() {
        return this.j.a();
    }

    @Deprecated
    public bko c() {
        return this.t;
    }

    public String d() {
        return this.j.g();
    }

    public int e() {
        return this.n;
    }

    public void a(int i) {
        if (this.v != i) {
            this.v = i;
            for (ctt a : this.k) {
                a.a();
            }
        }
    }

    public ite f() {
        return this.c;
    }

    public cus g() {
        return this.e;
    }

    public cvh h() {
        return this.f;
    }

    public cvx i() {
        return this.r;
    }

    public cuk j() {
        return this.g;
    }

    public csq k() {
        return this.i;
    }

    public String l() {
        if (s()) {
            ijb ijb = (ijb) this.c.t().a(ijb.class);
            lyh a = ijb != null ? ijb.a() : null;
            if (!(a == null || a.h == null)) {
                return a.h.a;
            }
        } else if ("conversation".equals(this.b.h())) {
            return this.b.i();
        }
        return null;
    }

    public void n() {
        this.q.a();
    }

    public boolean o() {
        return this.q.b();
    }

    public void p() {
        if (this.y) {
            this.i.a(6);
            this.y = false;
        }
    }

    public void q() {
        b(10030);
    }

    public void b(int i) {
        glk.c("Babel_explane", "HangoutCall.cleanup()", new Object[0]);
        if (this.x) {
            this.x = false;
            this.f.a();
            this.r.b();
            this.c.a(i);
            this.d.a();
            gwb.b(this.o);
            this.i.a();
            return;
        }
        glk.d("Babel_explane", "HangoutCall.cleanup(): Ignored. Call was not valid.", new Object[0]);
    }

    protected void finalize() {
        if (this.x) {
            glk.d("Babel_explane", "HangoutCall should not be valid in finalizer.", new Object[0]);
            q();
        }
        super.finalize();
    }

    private void a(fln fln) {
        if (this.u != null) {
            ((gie) jyn.a(this.a, gie.class)).a(this.u);
        }
        if ("conversation".equals(this.j.b()) && blo.a(fln.a) && !blo.a(fln.b) && this.j.d().equals(fln.a)) {
            this.j = this.j.e(fln.b);
            this.q.a(null);
        }
    }

    public void r() {
        this.q.c();
        this.e.h();
    }

    public boolean a(dhz dhz) {
        return this.j.equals(dhz);
    }

    public void a(itg itg) {
        this.c.a(itg);
    }

    public void b(itg itg) {
        this.c.b(itg);
    }

    public boolean s() {
        return this.c.l();
    }

    public boolean t() {
        u();
        return this.p;
    }

    void u() {
        boolean z = true;
        cuo a = this.g.a();
        boolean z2 = (this.c.n() || !this.f.c().isEmpty() || a == null || a.b()) ? false : true;
        if (a == null || !(a.d() || a.e())) {
            z = false;
        }
        if (this.p != z2 || this.z != z) {
            this.p = z2;
            this.z = z;
            gwb.a(this.w);
        }
    }

    public void a(cug cug) {
        if (this.c.l()) {
            ctn.a(cug, this.f.c());
            return;
        }
        cty cty = this.q;
        if (cty.b != null) {
            ctn ctn = cty.d;
            ctn.a(cug, cty.b);
            return;
        }
        cty.c.add(cug);
        if (cty.c.size() == 1 && cty.a != null) {
            cty.d();
        }
    }

    static void a(cug cug, Collection<lym> collection) {
        gwb.a(new cuh(cug, collection));
    }

    public void a(ctt ctt) {
        if (!this.k.contains(ctt)) {
            ctt.a(this.p, this.g.a());
            if (this.m != null) {
                ctt.a(this.m);
            }
            this.k.add(ctt);
        }
    }

    public void b(ctt ctt) {
        this.k.remove(ctt);
    }

    void a(ctv ctv) {
        if (this.m == null) {
            this.m = ctv;
            for (ctt a : this.k) {
                a.a(this.m);
            }
            switch (cts.a[ctv.b - 1]) {
                case wi.j /*1*/:
                    this.c.a(10030);
                case wi.l /*2*/:
                    this.c.a(((ctu) ctv).a);
                case wi.z /*3*/:
                    this.c.a(72);
                default:
            }
        }
    }

    private static ijh a(Context context, iri iri, itf itf) {
        int i;
        off off = new off();
        off.b = Integer.valueOf(412);
        if (gwb.az(context)) {
            i = 3;
        } else {
            i = 2;
        }
        off.a = Integer.valueOf(i);
        off.c = Integer.valueOf(2);
        loh loh = new loh();
        loh.a = Integer.valueOf(1);
        try {
            loh.d = Long.valueOf((long) context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            loe loe = new loe();
            loe.a = itf.q();
            loe.b = itf.p();
            loe.d = itf.b();
            ijh a = iri.a(itf.o(), new itg((byte) 0));
            a.a(loh);
            a.a(loe);
            a.a(off);
            return a;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public boolean m() {
        return this.v == ctx.b;
    }
}
