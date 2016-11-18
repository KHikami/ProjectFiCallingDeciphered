package p000;

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
    final Context f17763a;
    final iti f17764b;
    final ijt f17765c;
    final itw f17766d = new itw();
    final ild f17767e;
    final ine f17768f;
    final RendererManager f17769g;
    final EncoderManager f17770h;
    final DecoderManager f17771i;
    final iom f17772j;
    final ire f17773k;
    itf f17774l;
    boolean f17775m = false;
    int f17776n = 0;
    boolean f17777o = true;
    boolean f17778p;
    itk f17779q = null;
    private final ijs f17780r;
    private final iny f17781s;
    private final iim f17782t;
    private ito f17783u;
    private itc f17784v;
    private itd f17785w;

    public ijn(Context context, iti iti, itf itf) {
        this.f17763a = context;
        this.f17764b = iti;
        this.f17774l = itf;
        this.f17773k = new ire(context, this);
        if (ikp.f17924a == null) {
            ikp.f17924a = new ikp();
        }
        this.f17765c = new ijt(this);
        this.f17767e = new ild(context);
        this.f17780r = new ijs(this);
        this.f17768f = new ine(this);
        this.f17770h = new EncoderManager(context);
        this.f17771i = new DecoderManager(context);
        this.f17769g = new RendererManager(this);
        this.f17772j = new iom(this);
        this.f17781s = this.f17772j.m22772b();
        this.f17765c.m22037a(this.f17780r);
        inx.m22408a().m22411a(this.f17765c);
        if (this.f17774l != null) {
            ijn.m21947a(context, this.f17774l);
            this.f17765c.m22057b(this.f17774l);
        }
        this.f17782t = new iim(context);
    }

    public Context m21949a() {
        return this.f17763a;
    }

    public iti m21961b() {
        return this.f17764b;
    }

    public ire m21965c() {
        return this.f17773k;
    }

    public ine m21966d() {
        return this.f17768f;
    }

    public ijt m21967e() {
        return this.f17765c;
    }

    public ild m21968f() {
        return this.f17767e;
    }

    public RendererManager m21969g() {
        return this.f17769g;
    }

    public EncoderManager m21970h() {
        return this.f17770h;
    }

    public DecoderManager m21971i() {
        return this.f17771i;
    }

    public iom m21972j() {
        return this.f17772j;
    }

    public itg m21973k() {
        return this.f17766d;
    }

    public void m21958a(PrintWriter printWriter) {
        printWriter.println(String.valueOf(mo3224o()));
        printWriter.println("Call is connected: " + mo3221l());
        this.f17765c.m22038a(printWriter);
    }

    public boolean mo3221l() {
        return this.f17776n == 2;
    }

    public boolean mo3222m() {
        return this.f17776n == 0;
    }

    public boolean mo3223n() {
        return this.f17776n == 4;
    }

    public ith mo3224o() {
        String str;
        String str2 = null;
        ikd a = this.f17765c.m22029a();
        ith a2 = new ith().m23204a(this.f17764b).m23203a(this.f17774l).m23205a(this.f17779q);
        if (this.f17774l == null) {
            str = null;
        } else {
            str = this.f17774l.m23163b();
        }
        a2 = a2.m23210c(str);
        if (a == null) {
            str = null;
        } else {
            str = a.m22132e();
        }
        ith a3 = a2.m23206a(str);
        if (a != null) {
            str2 = a.m22134f();
        }
        ith b = a3.m23208b(str2);
        int i = (a == null || !a.m22143o()) ? 1 : 2;
        return b.m23202a(i).m23207b(this.f17782t.m21884a());
    }

    private static void m21947a(Context context, itf itf) {
        iil.m21879b("accountName not specified in CallInfo!", TextUtils.isEmpty(itf.m23189o()));
        iub iub = new iub();
        if (TextUtils.isEmpty(itf.m23159a())) {
            itf.m23154a(iub.m23296a());
        }
        if (TextUtils.isEmpty(itf.m23163b())) {
            itf.m23161b(iub.m23296a());
        }
        if (itf.m23190p() == null) {
            itf.m23182k(context.getPackageName());
        }
        if (itf.m23191q() == null) {
            itf.m23184l(iub.m23296a());
        }
        Object d = itf.m23169d();
        iil.m21875b("RtcClient must be specified for all calls.", d);
        if (d.f28727a == null) {
            int i;
            if (gwb.az(context)) {
                i = 3;
            } else {
                i = 2;
            }
            d.f28727a = Integer.valueOf(i);
        }
        d.f28729c = Integer.valueOf(2);
    }

    private static void m21948a(String str, String str2, boolean z, String str3) {
        String str4;
        String valueOf;
        if (str != null) {
            str4 = "Field cannot be changed after initCall: ";
            valueOf = String.valueOf(str3);
            iil.m21873a(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), (Object) str, (Object) str2);
        } else if (!z) {
            str4 = "Field cannot be set after initCall: ";
            valueOf = String.valueOf(str3);
            iil.m21872a(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), (Object) str2);
        }
    }

    public void mo3216a(itf itf) {
        boolean z = false;
        if (this.f17776n != 0) {
            itx.m23277a(5, "vclib", "Attempted to join a call that has already been joined.");
            return;
        }
        if (this.f17774l == null) {
            ijn.m21947a(this.f17763a, itf);
        } else {
            itf itf2 = this.f17774l;
            ijn.m21948a(itf2.m23189o(), itf.m23189o(), false, "accountName");
            ijn.m21948a(itf2.m23159a(), itf.m23159a(), false, "sessionId");
            ijn.m21948a(itf2.m23163b(), itf.m23163b(), false, "participantLogId");
            ijn.m21948a(itf2.m23190p(), itf.m23190p(), false, "clientId");
            ijn.m21948a(itf2.m23191q(), itf.m23191q(), false, "gcmRegistration");
            ijn.m21948a(itf2.m23192r(), itf.m23192r(), false, "compressedLogFile");
            ijn.m21948a(itf2.m23173f(), itf.m23173f(), true, "resolvedHangoutId");
            if (itf2.m23200z() != null) {
                String str = "VideoCallOptions can not be modified after initCall.";
                nzf z2 = itf2.m23200z();
                nzf z3 = itf.m23200z();
                if (z2 == z3) {
                    z = true;
                } else if (!(z2 == null || z3 == null || z2.getClass() != z3.getClass())) {
                    int c = z2.mo1951c();
                    if (z3.mo1951c() == c) {
                        byte[] bArr = new byte[c];
                        byte[] bArr2 = new byte[c];
                        nzf.m1028a(z2, bArr, 0, c);
                        nzf.m1028a(z3, bArr2, 0, c);
                        z = Arrays.equals(bArr, bArr2);
                    }
                }
                iil.m21874a(str, z);
            }
        }
        this.f17774l = itf;
        itx.m23277a(4, "vclib", itf.toString());
        this.f17773k.m23011a(2689);
        this.f17776n = 1;
        gwb.m1863a(new ijo(this, itf));
    }

    public void mo3213a(int i) {
        itx.m23282a("vclib", "Leaving call, callStateCode=%d.", Integer.valueOf(this.f17776n));
        if (this.f17776n != 4 && this.f17776n != 3) {
            this.f17776n = 3;
            gwb.m1863a(new ijp(this, i));
        }
    }

    public void mo3218a(ito ito) {
        if (this.f17783u != null) {
            this.f17783u.mo1320a(this);
        }
        this.f17783u = ito;
        if (this.f17783u == null) {
            this.f17781s.mo3286b(true);
            return;
        }
        this.f17781s.m22437d();
        this.f17783u.mo1321a(this, this.f17781s);
    }

    public ito mo3225p() {
        return this.f17783u;
    }

    public void mo3214a(itc itc) {
        if (this.f17784v != null) {
            this.f17784v.mo3394a();
        }
        this.f17784v = itc;
        if (this.f17784v == null) {
            m21960a(true);
        } else {
            this.f17784v.mo3395a((ite) this);
        }
    }

    public itc mo3226q() {
        return this.f17784v;
    }

    public void mo3215a(itd itd) {
        if (this.f17785w != null) {
            this.f17785w.mo3384a();
        }
        this.f17785w = itd;
        if (this.f17785w != null) {
            this.f17785w.mo3385a(this);
        }
    }

    public itd mo3227r() {
        return this.f17785w;
    }

    public Map<String, itl> mo3228s() {
        Map<String, itl> hashMap = new HashMap();
        for (ind ind : this.f17768f.m22342b()) {
            hashMap.put(ind.m22332a(), ind.m22334b());
        }
        return hashMap;
    }

    public void mo3217a(itg itg) {
        gwb.aJ();
        this.f17766d.m11744a(itg);
        if (this.f17776n == 2) {
            itg.mo1386a(this.f17779q);
            ind c = this.f17768f.m22345c();
            if (c != null) {
                itg.mo1427a(c.m22334b());
            }
        }
        ikd a = this.f17765c.m22029a();
        if (!(this.f17776n >= 3 || a == null || a.m22134f() == null)) {
            itg.mo1548c(a.m22134f());
        }
        if (this.f17776n == 4) {
            int i;
            if (a == null) {
                i = 10030;
            } else {
                i = a.m22140l();
            }
            gwb.m1863a(new ijq(this, itg, i));
        }
    }

    public void mo3219b(itg itg) {
        this.f17766d.m11753b(itg);
    }

    public ijk mo3229t() {
        return this.f17765c.m22077f();
    }

    public itu mo3212a(SurfaceTexture surfaceTexture, String str) {
        itx.m23282a("vclib", "Creating video renderer for surfaceTexture %s participant %s", surfaceTexture, str);
        return new itu(this, surfaceTexture, str);
    }

    public void m21960a(boolean z) {
        this.f17777o = z;
        m21983u();
        ind d = this.f17768f.m22346d();
        iqo c = d.m22335c();
        if (c != null) {
            c.m22951a(z);
        }
        d.m22337e();
    }

    public void mo3220b(boolean z) {
        this.f17765c.m22065c(z);
    }

    public void m21959a(String str) {
        if (this.f17776n != 2) {
            itx.m23277a(5, "vclib", "Attempted to mute participant while not in a call.");
        } else {
            this.f17765c.m22039a(str);
        }
    }

    public void m21963b(String str) {
        if (this.f17776n != 2) {
            itx.m23277a(5, "vclib", "Attempted to kick participant while not in a call.");
        } else {
            this.f17765c.m22058b(str);
        }
    }

    void m21952a(ikd ikd) {
        if (this.f17776n != 0 && ikd != null && this.f17774l != null) {
            List<mav> a = ikd.m22111a(this.f17763a, this.f17774l.m23164c(), this.f17774l.m23170e(), this.f17765c.m22052b());
            itx.m23277a(3, "vclib", "Number of logData entries to upload: " + a.size());
            ils ils = new ils(this.f17763a, this.f17764b);
            for (mav mav : a) {
                this.f17766d.mo1543a(mav);
                ils.m22260a(this.f17774l, mav);
            }
        }
    }

    void m21983u() {
        if (this.f17775m) {
            ind d = this.f17768f.m22346d();
            if (d.m22335c() != null) {
                this.f17765c.m22060b(this.f17777o);
            } else {
                this.f17768f.m22341a(new ijr(this, d));
            }
        }
    }
}
