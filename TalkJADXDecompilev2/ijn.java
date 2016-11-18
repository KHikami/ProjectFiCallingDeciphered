package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import com.google.android.libraries.hangouts.video.internal.DecoderManager;
import com.google.android.libraries.hangouts.video.internal.EncoderManager;
import com.google.android.libraries.hangouts.video.internal.RendererManager;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ijn implements ite {
    final Context a;
    final iti b;
    final ijt c;
    final itw d = new itw();
    final ild e;
    final ine f;
    final RendererManager g;
    final EncoderManager h;
    final DecoderManager i;
    final iom j;
    final ire k;
    itf l;
    boolean m = false;
    int n = 0;
    boolean o = true;
    boolean p;
    itk q = null;
    private final ijs r;
    private final iny s;
    private final iim t;
    private ito u;
    private itc v;
    private itd w;

    public ijn(Context context, iti iti, itf itf) {
        this.a = context;
        this.b = iti;
        this.l = itf;
        this.k = new ire(context, this);
        if (ikp.a == null) {
            ikp.a = new ikp();
        }
        this.c = new ijt(this);
        this.e = new ild(context);
        this.r = new ijs(this);
        this.f = new ine(this);
        this.h = new EncoderManager(context);
        this.i = new DecoderManager(context);
        this.g = new RendererManager(this);
        this.j = new iom(this);
        this.s = this.j.b();
        this.c.a(this.r);
        inx.a().a(this.c);
        if (this.l != null) {
            ijn.a(context, this.l);
            this.c.b(this.l);
        }
        this.t = new iim(context);
    }

    public Context a() {
        return this.a;
    }

    public iti b() {
        return this.b;
    }

    public ire c() {
        return this.k;
    }

    public ine d() {
        return this.f;
    }

    public ijt e() {
        return this.c;
    }

    public ild f() {
        return this.e;
    }

    public RendererManager g() {
        return this.g;
    }

    public EncoderManager h() {
        return this.h;
    }

    public DecoderManager i() {
        return this.i;
    }

    public iom j() {
        return this.j;
    }

    public itg k() {
        return this.d;
    }

    public void a(PrintWriter printWriter) {
        printWriter.println(String.valueOf(o()));
        printWriter.println("Call is connected: " + l());
        this.c.a(printWriter);
    }

    public boolean l() {
        return this.n == 2;
    }

    public boolean m() {
        return this.n == 0;
    }

    public boolean n() {
        return this.n == 4;
    }

    public ith o() {
        String str;
        String str2 = null;
        ikd a = this.c.a();
        ith a2 = new ith().a(this.b).a(this.l).a(this.q);
        if (this.l == null) {
            str = null;
        } else {
            str = this.l.b();
        }
        a2 = a2.c(str);
        if (a == null) {
            str = null;
        } else {
            str = a.e();
        }
        ith a3 = a2.a(str);
        if (a != null) {
            str2 = a.f();
        }
        ith b = a3.b(str2);
        int i = (a == null || !a.o()) ? 1 : 2;
        return b.a(i).b(this.t.a());
    }

    private static void a(Context context, itf itf) {
        iil.b("accountName not specified in CallInfo!", TextUtils.isEmpty(itf.o()));
        iub iub = new iub();
        if (TextUtils.isEmpty(itf.a())) {
            itf.a(iub.a());
        }
        if (TextUtils.isEmpty(itf.b())) {
            itf.b(iub.a());
        }
        if (itf.p() == null) {
            itf.k(context.getPackageName());
        }
        if (itf.q() == null) {
            itf.l(iub.a());
        }
        Object d = itf.d();
        iil.b("RtcClient must be specified for all calls.", d);
        if (d.a == null) {
            int i;
            if (gwb.az(context)) {
                i = 3;
            } else {
                i = 2;
            }
            d.a = Integer.valueOf(i);
        }
        d.c = Integer.valueOf(2);
    }

    private static void a(String str, String str2, boolean z, String str3) {
        String str4;
        String valueOf;
        if (str != null) {
            str4 = "Field cannot be changed after initCall: ";
            valueOf = String.valueOf(str3);
            iil.a(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), (Object) str, (Object) str2);
        } else if (!z) {
            str4 = "Field cannot be set after initCall: ";
            valueOf = String.valueOf(str3);
            iil.a(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), (Object) str2);
        }
    }

    public void a(itf itf) {
        boolean z = false;
        if (this.n != 0) {
            itx.a(5, "vclib", "Attempted to join a call that has already been joined.");
            return;
        }
        if (this.l == null) {
            ijn.a(this.a, itf);
        } else {
            itf itf2 = this.l;
            ijn.a(itf2.o(), itf.o(), false, "accountName");
            ijn.a(itf2.a(), itf.a(), false, "sessionId");
            ijn.a(itf2.b(), itf.b(), false, "participantLogId");
            ijn.a(itf2.p(), itf.p(), false, "clientId");
            ijn.a(itf2.q(), itf.q(), false, "gcmRegistration");
            ijn.a(itf2.r(), itf.r(), false, "compressedLogFile");
            ijn.a(itf2.f(), itf.f(), true, "resolvedHangoutId");
            if (itf2.z() != null) {
                String str = "VideoCallOptions can not be modified after initCall.";
                nzf z2 = itf2.z();
                nzf z3 = itf.z();
                if (z2 == z3) {
                    z = true;
                } else if (!(z2 == null || z3 == null || z2.getClass() != z3.getClass())) {
                    int c = z2.c();
                    if (z3.c() == c) {
                        byte[] bArr = new byte[c];
                        byte[] bArr2 = new byte[c];
                        nzf.a(z2, bArr, 0, c);
                        nzf.a(z3, bArr2, 0, c);
                        z = Arrays.equals(bArr, bArr2);
                    }
                }
                iil.a(str, z);
            }
        }
        this.l = itf;
        itx.a(4, "vclib", itf.toString());
        this.k.a(2689);
        this.n = 1;
        gwb.a(new ijo(this, itf));
    }

    public void a(int i) {
        itx.a("vclib", "Leaving call, callStateCode=%d.", Integer.valueOf(this.n));
        if (this.n != 4 && this.n != 3) {
            this.n = 3;
            gwb.a(new ijp(this, i));
        }
    }

    public void a(ito ito) {
        if (this.u != null) {
            this.u.a(this);
        }
        this.u = ito;
        if (this.u == null) {
            this.s.b(true);
            return;
        }
        this.s.d();
        this.u.a(this, this.s);
    }

    public ito p() {
        return this.u;
    }

    public void a(itc itc) {
        if (this.v != null) {
            this.v.a();
        }
        this.v = itc;
        if (this.v == null) {
            a(true);
        } else {
            this.v.a((ite) this);
        }
    }

    public itc q() {
        return this.v;
    }

    public void a(itd itd) {
        if (this.w != null) {
            this.w.a();
        }
        this.w = itd;
        if (this.w != null) {
            this.w.a(this);
        }
    }

    public itd r() {
        return this.w;
    }

    public Map<String, itl> s() {
        Map<String, itl> hashMap = new HashMap();
        for (ind ind : this.f.b()) {
            hashMap.put(ind.a(), ind.b());
        }
        return hashMap;
    }

    public void a(itg itg) {
        gwb.aJ();
        this.d.a(itg);
        if (this.n == 2) {
            itg.a(this.q);
            ind c = this.f.c();
            if (c != null) {
                itg.a(c.b());
            }
        }
        ikd a = this.c.a();
        if (!(this.n >= 3 || a == null || a.f() == null)) {
            itg.c(a.f());
        }
        if (this.n == 4) {
            int i;
            if (a == null) {
                i = 10030;
            } else {
                i = a.l();
            }
            gwb.a(new ijq(this, itg, i));
        }
    }

    public void b(itg itg) {
        this.d.b(itg);
    }

    public ijk t() {
        return this.c.f();
    }

    public itu a(SurfaceTexture surfaceTexture, String str) {
        itx.a("vclib", "Creating video renderer for surfaceTexture %s participant %s", surfaceTexture, str);
        return new itu(this, surfaceTexture, str);
    }

    public void a(boolean z) {
        this.o = z;
        u();
        ind d = this.f.d();
        iqo c = d.c();
        if (c != null) {
            c.a(z);
        }
        d.e();
    }

    public void b(boolean z) {
        this.c.c(z);
    }

    public void a(String str) {
        if (this.n != 2) {
            itx.a(5, "vclib", "Attempted to mute participant while not in a call.");
        } else {
            this.c.a(str);
        }
    }

    public void b(String str) {
        if (this.n != 2) {
            itx.a(5, "vclib", "Attempted to kick participant while not in a call.");
        } else {
            this.c.b(str);
        }
    }

    void a(ikd ikd) {
        if (this.n != 0 && ikd != null && this.l != null) {
            List<mav> a = ikd.a(this.a, this.l.c(), this.l.e(), this.c.b());
            itx.a(3, "vclib", "Number of logData entries to upload: " + a.size());
            ils ils = new ils(this.a, this.b);
            for (mav mav : a) {
                this.d.a(mav);
                ils.a(this.l, mav);
            }
        }
    }

    void u() {
        if (this.m) {
            ind d = this.f.d();
            if (d.c() != null) {
                this.c.b(this.o);
            } else {
                this.f.a(new ijr(this, d));
            }
        }
    }
}
