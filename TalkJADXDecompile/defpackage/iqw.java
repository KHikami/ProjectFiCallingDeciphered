package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;

/* renamed from: iqw */
public final class iqw implements Runnable {
    final itf a;
    final ijl<lzc> b;
    final Handler c;
    long d;
    boolean e;
    private final ijh f;

    public iqw(Context context, ijh ijh, itf itf, ijl<lzc> ijl_lzc) {
        this(ijh, itf, new Handler(context.getMainLooper()), (ijl) ijl_lzc);
    }

    private iqw(ijh ijh, itf itf, Handler handler, ijl ijl) {
        this.f = ijh;
        this.a = itf;
        this.c = handler;
        this.b = ijl;
        this.d = -1;
        this.e = false;
    }

    public void run() {
        b();
    }

    public void a() {
        this.e = true;
    }

    public static boolean a(itf itf) {
        if (itf.f() != null) {
            return false;
        }
        if (itf.n() == null && itf.h() == null && !iqw.b(itf)) {
            return false;
        }
        return true;
    }

    static boolean b(itf itf) {
        return (itf.j() == null && itf.l() == null && itf.m() == null) ? false : true;
    }

    public void b() {
        iil.a("Nothing to resolve.", iqw.a(this.a));
        if (this.e) {
            itx.a(4, "vclib", "Resolve flow canceled");
            return;
        }
        nzf c;
        if (iqw.b(this.a)) {
            lzd lzd = new lzd();
            lzd.b = this.a.j();
            lzd.a = this.a.k();
            if (!(TextUtils.isEmpty(this.a.l()) || TextUtils.isEmpty(this.a.m()))) {
                lzd.c = this.a.l();
                lzd.d = this.a.m();
            }
            c = c();
            c.c = lzd;
        } else if (this.a.h() != null) {
            lyg lyg = new lyg();
            lyg.a = this.a.h();
            lyg.b = this.a.i();
            c = c();
            c.a = lyg;
        } else if (this.a.n() != null) {
            c = c();
            c.f = this.a.n().toString();
        } else {
            throw new IllegalArgumentException("CreateResolve request is not external key, named room or sharing url.");
        }
        itx.a("vclib", "Issuing resolve request (%s)", c);
        this.f.a("hangouts/resolve", c, lzc.class, new iqx(this));
    }

    private lzb c() {
        lzb lzb = new lzb();
        if ("conversation".equals(this.a.h())) {
            int i;
            if (this.a.t()) {
                i = 1;
            } else {
                i = 2;
            }
            lzb.e = Integer.valueOf(i);
        }
        lzb.d = Boolean.valueOf(true);
        return lzb;
    }
}
