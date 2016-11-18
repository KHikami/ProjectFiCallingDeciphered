package p000;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;

public final class iqw implements Runnable {
    final itf f18730a;
    final ijl<lzc> f18731b;
    final Handler f18732c;
    long f18733d;
    boolean f18734e;
    private final ijh f18735f;

    public iqw(Context context, ijh ijh, itf itf, ijl<lzc> ijl_lzc) {
        this(ijh, itf, new Handler(context.getMainLooper()), (ijl) ijl_lzc);
    }

    private iqw(ijh ijh, itf itf, Handler handler, ijl ijl) {
        this.f18735f = ijh;
        this.f18730a = itf;
        this.f18732c = handler;
        this.f18731b = ijl;
        this.f18733d = -1;
        this.f18734e = false;
    }

    public void run() {
        m22984b();
    }

    public void m22983a() {
        this.f18734e = true;
    }

    public static boolean m22980a(itf itf) {
        if (itf.m23173f() != null) {
            return false;
        }
        if (itf.m23188n() == null && itf.m23177h() == null && !iqw.m22981b(itf)) {
            return false;
        }
        return true;
    }

    static boolean m22981b(itf itf) {
        return (itf.m23181j() == null && itf.m23185l() == null && itf.m23187m() == null) ? false : true;
    }

    public void m22984b() {
        iil.m21874a("Nothing to resolve.", iqw.m22980a(this.f18730a));
        if (this.f18734e) {
            itx.m23277a(4, "vclib", "Resolve flow canceled");
            return;
        }
        nzf c;
        if (iqw.m22981b(this.f18730a)) {
            lzd lzd = new lzd();
            lzd.f26984b = this.f18730a.m23181j();
            lzd.f26983a = this.f18730a.m23183k();
            if (!(TextUtils.isEmpty(this.f18730a.m23185l()) || TextUtils.isEmpty(this.f18730a.m23187m()))) {
                lzd.f26985c = this.f18730a.m23185l();
                lzd.f26986d = this.f18730a.m23187m();
            }
            c = m22982c();
            c.f26974c = lzd;
        } else if (this.f18730a.m23177h() != null) {
            lyg lyg = new lyg();
            lyg.f26861a = this.f18730a.m23177h();
            lyg.f26862b = this.f18730a.m23179i();
            c = m22982c();
            c.f26972a = lyg;
        } else if (this.f18730a.m23188n() != null) {
            c = m22982c();
            c.f26977f = this.f18730a.m23188n().toString();
        } else {
            throw new IllegalArgumentException("CreateResolve request is not external key, named room or sharing url.");
        }
        itx.m23282a("vclib", "Issuing resolve request (%s)", c);
        this.f18735f.mo3358a("hangouts/resolve", c, lzc.class, new iqx(this));
    }

    private lzb m22982c() {
        lzb lzb = new lzb();
        if ("conversation".equals(this.f18730a.m23177h())) {
            int i;
            if (this.f18730a.m23194t()) {
                i = 1;
            } else {
                i = 2;
            }
            lzb.f26976e = Integer.valueOf(i);
        }
        lzb.f26975d = Boolean.valueOf(true);
        return lzb;
    }
}
