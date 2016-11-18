package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

final class cty {
    String f9083a;
    List<lym> f9084b;
    final List<cug> f9085c = new ArrayList();
    final /* synthetic */ ctn f9086d;
    private boolean f9087e;
    private boolean f9088f;
    private boolean f9089g;

    cty(ctn ctn, dli dli) {
        this.f9086d = ctn;
        m11002c();
        if (!"conversation".equals(ctn.f9052j.m11889b()) || !blo.m5871a(ctn.f9052j.m11893d())) {
            m10998a(dli);
        }
    }

    public void m10996a() {
        this.f9086d.f9051i.mo1403a(14);
        this.f9088f = true;
        m10995e();
    }

    public boolean m11001b() {
        return this.f9088f;
    }

    public void m11002c() {
        this.f9089g = this.f9086d.f9047e.m11068m();
        m10995e();
    }

    void m10998a(dli dli) {
        if (!TextUtils.isEmpty(this.f9086d.f9044b.m23173f())) {
            glk.m17970a("Babel_explane", "resolve: No resolve necessary; already have resolved hangoutId", new Object[0]);
            m10999a(this.f9086d.f9044b.m23173f(), dli);
        } else if (gwb.m2309n(this.f9086d.f9043a)) {
            this.f9086d.f9051i.mo1403a(13);
            nzf lzb = new lzb();
            lzb.f26975d = Boolean.valueOf(true);
            if (this.f9086d.f9052j.m11891c()) {
                glk.m17970a("Babel_explane", "resolve: Resolving a call for %s/%s.", this.f9086d.f9052j.m11889b(), this.f9086d.f9052j.m11893d());
                lzb.f26972a = new lyg();
                lzb.f26972a.f26861a = this.f9086d.f9052j.m11889b();
                lzb.f26972a.f26862b = this.f9086d.f9052j.m11893d();
                if ("conversation".equals(this.f9086d.f9052j.m11889b())) {
                    lzb.f26976e = Integer.valueOf(this.f9086d.f9052j.m11902l());
                }
            } else if (!TextUtils.isEmpty(this.f9086d.f9052j.m11896f()) || !TextUtils.isEmpty(this.f9086d.f9052j.m11898h()) || !TextUtils.isEmpty(this.f9086d.f9052j.m11899i())) {
                lzb.f26974c = new lzd();
                lzb.f26974c.f26984b = this.f9086d.f9052j.m11896f();
                lzb.f26974c.f26983a = this.f9086d.f9052j.m11897g();
                if (!(TextUtils.isEmpty(this.f9086d.f9052j.m11898h()) || TextUtils.isEmpty(this.f9086d.f9052j.m11899i()))) {
                    lzb.f26974c.f26985c = this.f9086d.f9052j.m11898h();
                    lzb.f26974c.f26986d = this.f9086d.f9052j.m11899i();
                }
            } else if (this.f9086d.f9052j.m11901k() != null) {
                lzb.f26977f = this.f9086d.f9052j.m11901k().toString();
            } else {
                glk.m17982e("Babel_explane", "resolve: No hangoutId or resolvable information given", new Object[0]);
                r2 = this.f9086d;
                r1 = new cui(this.f9086d.f9043a, ba.jE);
                if (r2.f9055m == null) {
                    r2.f9055m = r1;
                    for (ctt a : r2.f9053k) {
                        a.mo1394a(r2.f9055m);
                    }
                    switch (cts.f9073a[r1.f9074b - 1]) {
                        case 1:
                            r2.f9045c.mo3213a(10030);
                            return;
                        case 2:
                            r2.f9045c.mo3213a(((ctu) r1).f9075a);
                            return;
                        case 3:
                            r2.f9045c.mo3213a(72);
                            return;
                        default:
                            return;
                    }
                }
                return;
            }
            this.f9086d.f9046d.mo3358a("hangouts/resolve", lzb, lzc.class, new ctz(this, dli));
        } else {
            r2 = this.f9086d;
            r1 = new ctu(11001);
            if (r2.f9055m == null) {
                r2.f9055m = r1;
                for (ctt a2 : r2.f9053k) {
                    a2.mo1394a(r2.f9055m);
                }
                switch (cts.f9073a[r1.f9074b - 1]) {
                    case 1:
                        r2.f9045c.mo3213a(10030);
                        return;
                    case 2:
                        r2.f9045c.mo3213a(((ctu) r1).f9075a);
                        return;
                    case 3:
                        r2.f9045c.mo3213a(72);
                        return;
                    default:
                        return;
                }
            }
        }
    }

    void m10999a(String str, dli dli) {
        this.f9083a = str;
        this.f9086d.f9052j = this.f9086d.f9052j.m11892d(str);
        this.f9086d.f9044b.m23165c(str);
        if (this.f9086d.f9052j.m11903m() == 7) {
            m10997a(7, dli);
            return;
        }
        glk.m17970a("Babel_explane", "HangoutCall: query started", new Object[0]);
        nzf lyx = new lyx();
        lyx.f26963a = str;
        this.f9086d.f9046d.mo3358a("hangouts/query", lyx, lyy.class, new cub(this, str, dli));
    }

    void m10997a(int i, dli dli) {
        boolean z = true;
        this.f9086d.f9051i.mo1403a(3);
        this.f9086d.f9056n = i;
        if (i != 7) {
            z = false;
        }
        if (dli != null) {
            dli.m12187a(z);
        }
        if (z) {
            if (!this.f9085c.isEmpty()) {
                m11003d();
            }
            m10995e();
            return;
        }
        gwb.m2251i(this.f9086d.f9043a, 3346);
        ctn ctn = this.f9086d;
        ctv cue = new cue();
        if (ctn.f9055m == null) {
            ctn.f9055m = cue;
            for (ctt a : ctn.f9053k) {
                a.mo1394a(ctn.f9055m);
            }
            switch (cts.f9073a[cue.f9074b - 1]) {
                case 1:
                    ctn.f9045c.mo3213a(10030);
                    return;
                case 2:
                    ctn.f9045c.mo3213a(((ctu) cue).f9075a);
                    return;
                case 3:
                    ctn.f9045c.mo3213a(72);
                    return;
                default:
                    return;
            }
        }
    }

    void m11003d() {
        if (gwb.m2309n(this.f9086d.f9043a)) {
            ba.m4536a(this.f9083a);
            nzf lyv = new lyv();
            lyv.f26958a = this.f9083a;
            this.f9086d.f9046d.mo3358a("hangout_participants/search", lyv, lyw.class, new cua(this));
            return;
        }
        ctn ctn = this.f9086d;
        ctv ctu = new ctu(11001);
        if (ctn.f9055m == null) {
            ctn.f9055m = ctu;
            for (ctt a : ctn.f9053k) {
                a.mo1394a(ctn.f9055m);
            }
            switch (cts.f9073a[ctu.f9074b - 1]) {
                case 1:
                    ctn.f9045c.mo3213a(10030);
                    return;
                case 2:
                    ctn.f9045c.mo3213a(((ctu) ctu).f9075a);
                    return;
                case 3:
                    ctn.f9045c.mo3213a(72);
                    return;
                default:
                    return;
            }
        }
    }

    void m11000a(List<lym> list) {
        this.f9084b = list;
        for (cug a : this.f9085c) {
            a.m11027a(this.f9084b);
        }
        this.f9085c.clear();
    }

    private void m10995e() {
        ctn ctn;
        ctv ctu;
        if (!gwb.m2309n(this.f9086d.f9043a)) {
            ctn = this.f9086d;
            ctu = new ctu(11001);
            if (ctn.f9055m == null) {
                ctn.f9055m = ctu;
                for (ctt a : ctn.f9053k) {
                    a.mo1394a(ctn.f9055m);
                }
                switch (cts.f9073a[ctu.f9074b - 1]) {
                    case 1:
                        ctn.f9045c.mo3213a(10030);
                        return;
                    case 2:
                        ctn.f9045c.mo3213a(((ctu) ctu).f9075a);
                        return;
                    case 3:
                        ctn.f9045c.mo3213a(72);
                        return;
                    default:
                        return;
                }
            }
        } else if (gwb.m2318o(this.f9086d.f9043a)) {
            ctn = this.f9086d;
            ctu = new ctu(11013);
            if (ctn.f9055m == null) {
                ctn.f9055m = ctu;
                for (ctt a2 : ctn.f9053k) {
                    a2.mo1394a(ctn.f9055m);
                }
                switch (cts.f9073a[ctu.f9074b - 1]) {
                    case 1:
                        ctn.f9045c.mo3213a(10030);
                        return;
                    case 2:
                        ctn.f9045c.mo3213a(((ctu) ctu).f9075a);
                        return;
                    case 3:
                        ctn.f9045c.mo3213a(72);
                        return;
                    default:
                        return;
                }
            }
        } else if (!this.f9087e && this.f9088f && this.f9089g && this.f9083a != null) {
            gwb.m1864a(this.f9086d.f9057o, gwb.m1519a(this.f9086d.f9043a, "babel_hangout_enter_master_timeout", 60000));
            this.f9087e = true;
            this.f9086d.f9045c.mo3216a(this.f9086d.f9044b);
            this.f9086d.f9044b.m23152a(this.f9086d.f9050h.m11026a(this.f9086d));
            this.f9086d.f9047e.m11066k();
            this.f9086d.f9047e.m11072q();
            this.f9086d.f9045c.mo3217a(new cuc(this));
        }
    }
}
