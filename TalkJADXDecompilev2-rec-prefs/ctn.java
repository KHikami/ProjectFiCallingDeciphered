package p000;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import junit.framework.Assert;

public final class ctn implements gia<fln> {
    final Context f9043a;
    final itf f9044b;
    final ite f9045c;
    final ijh f9046d;
    final cus f9047e;
    final cvh f9048f;
    final cuk f9049g;
    final cuf f9050h;
    final csq f9051i;
    dhz f9052j;
    final List<ctt> f9053k = new CopyOnWriteArrayList();
    long f9054l = -1;
    ctv f9055m;
    int f9056n = -1;
    final Runnable f9057o = new cto(this);
    boolean f9058p;
    private final cty f9059q;
    private final cvx f9060r;
    private final String f9061s;
    private final bko f9062t;
    private final gic f9063u;
    private int f9064v;
    private final Runnable f9065w = new ctp(this);
    private boolean f9066x = true;
    private boolean f9067y = true;
    private boolean f9068z;

    public static ctn m10954a(Context context, dhz dhz, dli dli, boolean z, boolean z2, boolean z3) {
        int i;
        bko a = fde.m14994a(dhz.m11885a());
        iri a2 = ((dgt) jyn.m25426a(context, dgt.class)).mo1391a();
        if (fdq.f12775Q.m14370b(a.m5638g())) {
            iti iti = new iti(context);
            iti.m23218b().m23219a(true);
            a2.m23043a(iti);
        }
        bko a3 = fde.m14994a(dhz.m11885a());
        Bundle bundle = new Bundle();
        bundle.putInt("account_id", a3.m5638g());
        lkm lkm = new lkm();
        lkm lkm2 = lkm;
        for (dlc a4 : jyn.m25438c(context, dlc.class)) {
            lkm2 = a4.mo1596a(lkm2, bundle);
        }
        off off = new off();
        off.f28728b = Integer.valueOf(412);
        if (gwb.az(context)) {
            i = 3;
        } else {
            i = 2;
        }
        off.f28727a = Integer.valueOf(i);
        off.f28729c = Integer.valueOf(2);
        Object g = fde.m15023g(a3.m5638g());
        if (TextUtils.isEmpty(g)) {
            fde.m15013c(a3);
        }
        i = 0;
        switch (dhz.m11902l()) {
            case 1:
                i = 3;
                break;
            case 2:
                i = 2;
                break;
            default:
                Assert.fail("Express lane only supports audio and video calls");
                break;
        }
        itf a5 = new itf().m23156a(off).m23199y().m23160b(i).m23157a(i == 3).m23182k(Long.toString(ffh.m15192a().m15201b())).m23180j(dhz.m11885a()).m23184l(g).m23155a(lkm2);
        if (!TextUtils.isEmpty(dhz.m11897g())) {
            a5.m23165c(dhz.m11897g());
        }
        ite a6 = a2.m23041a(a5);
        ijh a7 = ctn.m10955a(context, a2, a5);
        cus cus = new cus(context, a6, dhz.m11902l());
        cvh cvh = new cvh(context, a6, cus, a.m5638g());
        return new ctn(context, dhz, dli, a, a5, a6, a7, cus, cvh, new cuk(a7, a6, cvh), new cvx(context, a6, cus), new cuf(), z, z2, z3);
    }

    private ctn(Context context, dhz dhz, dli dli, bko bko, itf itf, ite ite, ijh ijh, cus cus, cvh cvh, cuk cuk, cvx cvx, cuf cuf, boolean z, boolean z2, boolean z3) {
        int i;
        int[] iArr;
        glk.m17979c("Babel_explane", "HangoutCall created", new Object[0]);
        this.f9043a = context;
        this.f9062t = bko;
        this.f9044b = itf;
        this.f9045c = ite;
        this.f9046d = ijh;
        this.f9047e = cus;
        this.f9048f = cvh;
        this.f9049g = cuk;
        this.f9060r = cvx;
        this.f9050h = cuf;
        if (dhz.m11902l() == 2) {
            i = ctx.f9081b;
        } else {
            i = ctx.f9080a;
        }
        this.f9064v = i;
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
        this.f9051i = new csq(context, iArr, ite, itf);
        this.f9052j = dhz.m11908r();
        this.f9059q = new cty(this, dli);
        iub iub = new iub();
        this.f9061s = iub.m23296a();
        this.f9048f.m11092a(new ctq(this));
        this.f9049g.m11031a(new ctr(this));
        this.f9063u = ((gie) jyn.m25426a(context, gie.class)).mo2279b(fln.class, this, fln.m15647a(this.f9052j.m11893d()));
    }

    public String m10958a() {
        return this.f9061s;
    }

    public String m10967b() {
        return this.f9052j.m11885a();
    }

    @Deprecated
    public bko m10971c() {
        return this.f9062t;
    }

    public String m10972d() {
        return this.f9052j.m11897g();
    }

    public int m10973e() {
        return this.f9056n;
    }

    public void m10959a(int i) {
        if (this.f9064v != i) {
            this.f9064v = i;
            for (ctt a : this.f9053k) {
                a.mo1384a();
            }
        }
    }

    public ite m10974f() {
        return this.f9045c;
    }

    public cus m10975g() {
        return this.f9047e;
    }

    public cvh m10976h() {
        return this.f9048f;
    }

    public cvx m10977i() {
        return this.f9060r;
    }

    public cuk m10978j() {
        return this.f9049g;
    }

    public csq m10979k() {
        return this.f9051i;
    }

    public String m10980l() {
        if (m10987s()) {
            ijb ijb = (ijb) this.f9045c.mo3229t().m21926a(ijb.class);
            lyh a = ijb != null ? ijb.mo3375a() : null;
            if (!(a == null || a.f26873h == null)) {
                return a.f26873h.f25931a;
            }
        } else if ("conversation".equals(this.f9044b.m23177h())) {
            return this.f9044b.m23179i();
        }
        return null;
    }

    public void m10982n() {
        this.f9059q.m10996a();
    }

    public boolean m10983o() {
        return this.f9059q.m11001b();
    }

    public void m10984p() {
        if (this.f9067y) {
            this.f9051i.mo1403a(6);
            this.f9067y = false;
        }
    }

    public void m10985q() {
        m10968b(10030);
    }

    public void m10968b(int i) {
        glk.m17979c("Babel_explane", "HangoutCall.cleanup()", new Object[0]);
        if (this.f9066x) {
            this.f9066x = false;
            this.f9048f.m11091a();
            this.f9060r.m11145b();
            this.f9045c.mo3213a(i);
            this.f9046d.mo3357a();
            gwb.m2042b(this.f9057o);
            this.f9051i.mo1401a();
            return;
        }
        glk.m17981d("Babel_explane", "HangoutCall.cleanup(): Ignored. Call was not valid.", new Object[0]);
    }

    protected void finalize() {
        if (this.f9066x) {
            glk.m17981d("Babel_explane", "HangoutCall should not be valid in finalizer.", new Object[0]);
            m10985q();
        }
        super.finalize();
    }

    private void m10957a(fln fln) {
        if (this.f9063u != null) {
            ((gie) jyn.m25426a(this.f9043a, gie.class)).mo2278a(this.f9063u);
        }
        if ("conversation".equals(this.f9052j.m11889b()) && blo.m5871a(fln.f13413a) && !blo.m5871a(fln.f13414b) && this.f9052j.m11893d().equals(fln.f13413a)) {
            this.f9052j = this.f9052j.m11894e(fln.f13414b);
            this.f9059q.m10998a(null);
        }
    }

    public void m10986r() {
        this.f9059q.m11002c();
        this.f9047e.m11063h();
    }

    public boolean m10966a(dhz dhz) {
        return this.f9052j.equals(dhz);
    }

    public void m10965a(itg itg) {
        this.f9045c.mo3217a(itg);
    }

    public void m10970b(itg itg) {
        this.f9045c.mo3219b(itg);
    }

    public boolean m10987s() {
        return this.f9045c.mo3221l();
    }

    public boolean m10988t() {
        m10989u();
        return this.f9058p;
    }

    void m10989u() {
        boolean z = true;
        cuo a = this.f9049g.m11028a();
        boolean z2 = (this.f9045c.mo3223n() || !this.f9048f.m11100c().isEmpty() || a == null || a.m11037b()) ? false : true;
        if (a == null || !(a.m11039d() || a.m11040e())) {
            z = false;
        }
        if (this.f9058p != z2 || this.f9068z != z) {
            this.f9058p = z2;
            this.f9068z = z;
            gwb.m1863a(this.f9065w);
        }
    }

    public void m10964a(cug cug) {
        if (this.f9045c.mo3221l()) {
            ctn.m10956a(cug, this.f9048f.m11100c());
            return;
        }
        cty cty = this.f9059q;
        if (cty.f9084b != null) {
            ctn ctn = cty.f9086d;
            ctn.m10956a(cug, cty.f9084b);
            return;
        }
        cty.f9085c.add(cug);
        if (cty.f9085c.size() == 1 && cty.f9083a != null) {
            cty.m11003d();
        }
    }

    static void m10956a(cug cug, Collection<lym> collection) {
        gwb.m1863a(new cuh(cug, collection));
    }

    public void m10962a(ctt ctt) {
        if (!this.f9053k.contains(ctt)) {
            ctt.mo1438a(this.f9058p, this.f9049g.m11028a());
            if (this.f9055m != null) {
                ctt.mo1394a(this.f9055m);
            }
            this.f9053k.add(ctt);
        }
    }

    public void m10969b(ctt ctt) {
        this.f9053k.remove(ctt);
    }

    void m10963a(ctv ctv) {
        if (this.f9055m == null) {
            this.f9055m = ctv;
            for (ctt a : this.f9053k) {
                a.mo1394a(this.f9055m);
            }
            switch (cts.f9073a[ctv.f9074b - 1]) {
                case 1:
                    this.f9045c.mo3213a(10030);
                    return;
                case 2:
                    this.f9045c.mo3213a(((ctu) ctv).f9075a);
                    return;
                case 3:
                    this.f9045c.mo3213a(72);
                    return;
                default:
                    return;
            }
        }
    }

    private static ijh m10955a(Context context, iri iri, itf itf) {
        int i;
        off off = new off();
        off.f28728b = Integer.valueOf(412);
        if (gwb.az(context)) {
            i = 3;
        } else {
            i = 2;
        }
        off.f28727a = Integer.valueOf(i);
        off.f28729c = Integer.valueOf(2);
        loh loh = new loh();
        loh.f25866a = Integer.valueOf(1);
        try {
            loh.f25869d = Long.valueOf((long) context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            loe loe = new loe();
            loe.f25857a = itf.m23191q();
            loe.f25858b = itf.m23190p();
            loe.f25860d = itf.m23163b();
            ijh a = iri.m23040a(itf.m23189o(), new itg((byte) 0));
            a.mo3361a(loh);
            a.mo3360a(loe);
            a.mo3362a(off);
            return a;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public boolean m10981m() {
        return this.f9064v == ctx.f9081b;
    }
}
