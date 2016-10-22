package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cty */
final class cty {
    String a;
    List<lym> b;
    final List<cug> c;
    final /* synthetic */ ctn d;
    private boolean e;
    private boolean f;
    private boolean g;

    cty(ctn ctn, dli dli) {
        this.d = ctn;
        this.c = new ArrayList();
        c();
        if (!"conversation".equals(ctn.j.b()) || !blo.a(ctn.j.d())) {
            a(dli);
        }
    }

    public void a() {
        this.d.i.a(14);
        this.f = true;
        e();
    }

    public boolean b() {
        return this.f;
    }

    public void c() {
        this.g = this.d.e.m();
        e();
    }

    void a(dli dli) {
        if (!TextUtils.isEmpty(this.d.b.f())) {
            glk.a("Babel_explane", "resolve: No resolve necessary; already have resolved hangoutId", new Object[0]);
            a(this.d.b.f(), dli);
        } else if (gwb.n(this.d.a)) {
            this.d.i.a(13);
            nzf lzb = new lzb();
            lzb.d = Boolean.valueOf(true);
            if (this.d.j.c()) {
                glk.a("Babel_explane", "resolve: Resolving a call for %s/%s.", this.d.j.b(), this.d.j.d());
                lzb.a = new lyg();
                lzb.a.a = this.d.j.b();
                lzb.a.b = this.d.j.d();
                if ("conversation".equals(this.d.j.b())) {
                    lzb.e = Integer.valueOf(this.d.j.l());
                }
            } else if (!TextUtils.isEmpty(this.d.j.f()) || !TextUtils.isEmpty(this.d.j.h()) || !TextUtils.isEmpty(this.d.j.i())) {
                lzb.c = new lzd();
                lzb.c.b = this.d.j.f();
                lzb.c.a = this.d.j.g();
                if (!(TextUtils.isEmpty(this.d.j.h()) || TextUtils.isEmpty(this.d.j.i()))) {
                    lzb.c.c = this.d.j.h();
                    lzb.c.d = this.d.j.i();
                }
            } else if (this.d.j.k() != null) {
                lzb.f = this.d.j.k().toString();
            } else {
                glk.e("Babel_explane", "resolve: No hangoutId or resolvable information given", new Object[0]);
                r2 = this.d;
                r1 = new cui(this.d.a, ba.jE);
                if (r2.m == null) {
                    r2.m = r1;
                    for (ctt a : r2.k) {
                        a.a(r2.m);
                    }
                    switch (cts.a[r1.b - 1]) {
                        case wi.j /*1*/:
                            r2.c.a(10030);
                            return;
                        case wi.l /*2*/:
                            r2.c.a(((ctu) r1).a);
                            return;
                        case wi.z /*3*/:
                            r2.c.a(72);
                            return;
                        default:
                            return;
                    }
                }
                return;
            }
            this.d.d.a("hangouts/resolve", lzb, lzc.class, new ctz(this, dli));
        } else {
            r2 = this.d;
            r1 = new ctu(11001);
            if (r2.m == null) {
                r2.m = r1;
                for (ctt a2 : r2.k) {
                    a2.a(r2.m);
                }
                switch (cts.a[r1.b - 1]) {
                    case wi.j /*1*/:
                        r2.c.a(10030);
                    case wi.l /*2*/:
                        r2.c.a(((ctu) r1).a);
                    case wi.z /*3*/:
                        r2.c.a(72);
                    default:
                }
            }
        }
    }

    void a(String str, dli dli) {
        this.a = str;
        this.d.j = this.d.j.d(str);
        this.d.b.c(str);
        if (this.d.j.m() == 7) {
            a(7, dli);
            return;
        }
        glk.a("Babel_explane", "HangoutCall: query started", new Object[0]);
        nzf lyx = new lyx();
        lyx.a = str;
        this.d.d.a("hangouts/query", lyx, lyy.class, new cub(this, str, dli));
    }

    void a(int i, dli dli) {
        boolean z = true;
        this.d.i.a(3);
        this.d.n = i;
        if (i != 7) {
            z = false;
        }
        if (dli != null) {
            dli.a(z);
        }
        if (z) {
            if (!this.c.isEmpty()) {
                d();
            }
            e();
            return;
        }
        gwb.i(this.d.a, 3346);
        ctn ctn = this.d;
        ctv cue = new cue();
        if (ctn.m == null) {
            ctn.m = cue;
            for (ctt a : ctn.k) {
                a.a(ctn.m);
            }
            switch (cts.a[cue.b - 1]) {
                case wi.j /*1*/:
                    ctn.c.a(10030);
                case wi.l /*2*/:
                    ctn.c.a(((ctu) cue).a);
                case wi.z /*3*/:
                    ctn.c.a(72);
                default:
            }
        }
    }

    void d() {
        if (gwb.n(this.d.a)) {
            ba.a(this.a);
            nzf lyv = new lyv();
            lyv.a = this.a;
            this.d.d.a("hangout_participants/search", lyv, lyw.class, new cua(this));
            return;
        }
        ctn ctn = this.d;
        ctv ctu = new ctu(11001);
        if (ctn.m == null) {
            ctn.m = ctu;
            for (ctt a : ctn.k) {
                a.a(ctn.m);
            }
            switch (cts.a[ctu.b - 1]) {
                case wi.j /*1*/:
                    ctn.c.a(10030);
                case wi.l /*2*/:
                    ctn.c.a(((ctu) ctu).a);
                case wi.z /*3*/:
                    ctn.c.a(72);
                default:
            }
        }
    }

    void a(List<lym> list) {
        this.b = list;
        for (cug a : this.c) {
            a.a(this.b);
        }
        this.c.clear();
    }

    private void e() {
        ctn ctn;
        ctv ctu;
        if (!gwb.n(this.d.a)) {
            ctn = this.d;
            ctu = new ctu(11001);
            if (ctn.m == null) {
                ctn.m = ctu;
                for (ctt a : ctn.k) {
                    a.a(ctn.m);
                }
                switch (cts.a[ctu.b - 1]) {
                    case wi.j /*1*/:
                        ctn.c.a(10030);
                    case wi.l /*2*/:
                        ctn.c.a(((ctu) ctu).a);
                    case wi.z /*3*/:
                        ctn.c.a(72);
                    default:
                }
            }
        } else if (gwb.o(this.d.a)) {
            ctn = this.d;
            ctu = new ctu(11013);
            if (ctn.m == null) {
                ctn.m = ctu;
                for (ctt a2 : ctn.k) {
                    a2.a(ctn.m);
                }
                switch (cts.a[ctu.b - 1]) {
                    case wi.j /*1*/:
                        ctn.c.a(10030);
                    case wi.l /*2*/:
                        ctn.c.a(((ctu) ctu).a);
                    case wi.z /*3*/:
                        ctn.c.a(72);
                    default:
                }
            }
        } else if (!this.e && this.f && this.g && this.a != null) {
            gwb.a(this.d.o, gwb.a(this.d.a, "babel_hangout_enter_master_timeout", 60000));
            this.e = true;
            this.d.c.a(this.d.b);
            this.d.b.a(this.d.h.a(this.d));
            this.d.e.k();
            this.d.e.q();
            this.d.c.a(new cuc(this));
        }
    }
}
