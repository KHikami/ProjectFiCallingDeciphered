package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.apps.hangouts.hangout.HangoutActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* renamed from: did */
public final class did extends fip implements gia<fln> {
    private static final boolean c;
    private boolean A;
    private boolean B;
    private int C;
    private String D;
    private String E;
    private boolean F;
    private final Random G;
    private muo H;
    private int I;
    private final edk J;
    private final dkt K;
    private String L;
    private boolean M;
    private itf N;
    private gic O;
    private final Runnable P;
    private final Runnable Q;
    private final Runnable R;
    private final Runnable S;
    public final dgg a;
    boolean b;
    private final boolean d;
    private boolean e;
    private int f;
    private final Handler g;
    private final dhz h;
    private dhz i;
    private final String j;
    private final String k;
    private final int l;
    private final int m;
    private final boolean n;
    private boolean o;
    private String p;
    private boolean q;
    private boolean r;
    private final ArrayList<djs> s;
    private final boolean t;
    private final glg u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

    static {
        kae kae = glk.g;
        c = false;
    }

    did(Context context, dhz dhz, boolean z, List<edk> list, boolean z2, edk edk, int i, boolean z3, int i2, boolean z4, long j, muo muo, String str) {
        Object obj;
        int[] iArr;
        this.a = dgg.a();
        this.f = -1;
        this.g = new Handler();
        this.s = new ArrayList();
        this.C = 10000;
        this.G = new Random();
        this.I = 0;
        this.P = new die(this);
        this.Q = new dif(this);
        this.R = new dig(this);
        this.S = new dih(this);
        this.h = dhz.r();
        this.i = dhz;
        this.l = i;
        this.m = i2;
        this.d = z;
        this.n = z4;
        this.t = z2;
        if (muo == null) {
            this.H = new muo();
        } else {
            this.H = muo;
        }
        this.k = str;
        this.J = edk;
        this.K = new dkt(context, this, edk);
        this.L = "";
        if (list == null || list.size() <= 0) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj != null) {
            iil.b("Expected condition to be false", z2);
            this.s.add(new djs(this, true, list));
            this.K.a((List) list);
        }
        this.b = false;
        d(dhz.l() == 2);
        iub iub = new iub();
        this.j = iub.a();
        this.M = false;
        String str2 = "type_null";
        switch (i2) {
            case wi.w /*0*/:
                str2 = "type_unk";
                break;
            case wi.j /*1*/:
                if (!this.n) {
                    str2 = "type_pstn";
                    break;
                } else {
                    str2 = "type_tycho";
                    break;
                }
            case wi.l /*2*/:
                str2 = "type_audio";
                break;
            case wi.z /*3*/:
                str2 = "type_video";
                break;
            default:
                glk.e("Babel", "HangoutState initialized with a CallType outside the known range: " + i2, new Object[0]);
                break;
        }
        String[] strArr = new String[]{"source_" + i, str2};
        Context H = gwb.H();
        if (obj != null) {
            iArr = new int[]{1, 3};
        } else if (z3) {
            iArr = new int[]{1, 2, 17};
        } else {
            iArr = new int[]{1, 2};
        }
        glk.a("Babel_CallMarkReporter", "Creating startup reporter", new Object[0]);
        obj = new ArrayList();
        Collections.addAll(obj, strArr);
        this.u = new glg(H, iArr, obj);
        this.u.a(1, j);
    }

    public dhz d() {
        return this.h;
    }

    public dhz e() {
        return this.i;
    }

    public String f() {
        if (this.h.q()) {
            String b = gwb.b(gwb.H(), "babel_hangout_named_shortlink_base_url", "http://g.co/hangouts");
            String f = this.h.f();
            String g = this.h.g();
            return String.format("%s/%s/%s", new Object[]{b, f, g});
        }
        f = gwb.b(gwb.H(), "babel_hangout_base_url", "https://hangouts.google.com/call");
        boolean a = gwb.a(gwb.H(), "babel_hangout_underscore_after_base_url", false);
        iil.b("Expected non-null", this.i.g());
        return String.format(a ? "%s/_/%s" : "%s/%s", new Object[]{f, this.i.g()});
    }

    int g() {
        return this.m;
    }

    public boolean a(HangoutActivity hangoutActivity) {
        dhz m = hangoutActivity.m();
        if (hangoutActivity.j()) {
            return this.h.equals(m) || this.i.equals(m);
        } else {
            return this.i.equals(m);
        }
    }

    public void a(String str) {
        this.i = this.i.d(str);
        if (c) {
            String valueOf = String.valueOf(this.i);
            new StringBuilder(String.valueOf(valueOf).length() + 11).append("Updated to ").append(valueOf);
        }
    }

    public void b(String str) {
        this.i = this.i.e(str);
        if (c) {
            String valueOf = String.valueOf(this.i);
            new StringBuilder(String.valueOf(valueOf).length() + 11).append("Updated to ").append(valueOf);
        }
    }

    public void a(boolean z) {
        this.r = z;
    }

    public boolean h() {
        return this.r;
    }

    public boolean a(boolean z, int i) {
        boolean z2 = i == -1 ? W() || X() : i == 0 || i == 1 || i == 3;
        if (z2 && z) {
            return true;
        }
        return false;
    }

    public void b(boolean z) {
        boolean z2 = true;
        this.o = true;
        if (this.o && this.q) {
            z2 = false;
        }
        iil.a("Expected condition to be true", z2);
    }

    private boolean V() {
        return this.o;
    }

    public void c(String str) {
        this.p = str;
    }

    public void c(boolean z) {
        boolean z2;
        this.q = z;
        if (this.o && this.q) {
            z2 = false;
        } else {
            z2 = true;
        }
        iil.a("Expected condition to be true", z2);
    }

    private boolean W() {
        return this.q;
    }

    public boolean i() {
        return (this.o || this.q) ? false : true;
    }

    public boolean j() {
        return this.n;
    }

    public bko k() {
        return fde.a(this.i.a());
    }

    public String l() {
        return this.j;
    }

    private boolean X() {
        return this.d;
    }

    public boolean m() {
        return this.e;
    }

    public int n() {
        return this.f;
    }

    public boolean o() {
        if (this.f == -1) {
            return W();
        }
        return this.f != 0;
    }

    private ArrayList<djs> Y() {
        return (ArrayList) this.s.clone();
    }

    // expects either the ikd instance is null, or it has some string value
    // equal to the one for this class (perhaps state?)
    // either way, it returns null or the ikd instance
    public ikd p() {
        boolean z;
        ikd b = inx.a().b();
        if (b == null || b.e().equals(this.j)) {  // compares 2 strings for equality
            z = true;
        } else {            
            z = false;
        }
        iil.a("Expected condition to be true", z);
        return b;
    }

    public void q() {
        this.u.a(7);
    }

    public void r() {
        this.u.a(3);
        this.F = false;
        if (this.E != null) {
            if (Math.abs(this.G.nextInt(10000)) < gwb.a(gwb.H(), "babel_hangout_upload_rate_2", 10)) {
                inx.b("Triggering sampled debug log");
                this.F = true;
            }
            if (gwb.a(gwb.H(), "babel_hangout_upload_logs_2", false)) {
                inx.b("Triggering log upload for auto_plugin_log_upload experiment");
                this.F = true;
            }
        }
    }

    private djs Z() {
        if (this.s.size() == 0 || !((djs) this.s.get(0)).a()) {
            return null;
        }
        return (djs) this.s.get(0);
    }

    List<djs> s() {
        return this.s;
    }

    List<edk> t() {
        djs Z = Z();
        return Z == null ? null : Z.b();
    }

    public boolean u() {
        djs Z = Z();
        return Z != null && Z.c() == 0;
    }

    void v() {
        this.g.removeCallbacks(this.P);
        this.u.a(5);
    }

    public void w() {
        if (!this.y) {
            this.u.a(6);
            this.y = true;
        }
        x();
    }

    public void x() {
        if (this.b) {
            if (!this.a.j()) {
                ism k = this.a.k();
                if (k.c().equals(isr.EARPIECE_ON) && k.d().contains(isq.SPEAKERPHONE)) {
                    k.a(isq.SPEAKERPHONE);
                }
            }
            d(false);
        }
    }

    private void d(boolean z) {
        if (this.b != z) {
            this.b = z;
            this.S.run();
        }
    }

    private void a(fln fln) {
        this.g.removeCallbacks(this.Q);
        if (!this.B) {
            String str = fln.a;
            String str2 = fln.b;
            iil.b("Expected condition to be false", this.B);
            if (!"conversation".equals(this.i.b()) || !blo.a(str)) {
                iil.a("Expected condition to be true", this.i.p());
            } else if (this.i.d().equals(str)) {
                g(str2);
                this.a.y();
            }
        }
    }

    public void d(String str) {
        iil.a("Expected condition to be true", this.i.p());
        if (this.z != -1) {
            RealTimeChatService.b((fip) this);
            if (this.O != null) {
                ((gie) jyn.a(gwb.H(), gie.class)).a(this.O);
            }
            this.g.removeCallbacks(this.R);
            this.z = -1;
            if (str == null) {
                b(10015);
                return;
            }
            a(str);
            this.a.y();
            ab();
        }
    }

    public void a(int i, bko bko, fok fok, fdo fdo) {
        if (i == this.z && (fok instanceof eud)) {
            glk.e("Babel", "Create hangout id request failed", new Object[0]);
            this.z = -1;
            d(null);
        }
    }

    private void g(String str) {
        RealTimeChatService.b((fip) this);
        if (this.O != null) {
            ((gie) jyn.a(gwb.H(), gie.class)).a(this.O);
        }
        this.i.a(str);
        ab();
    }

    void y() {
        iil.b("Expected condition to be false", this.M);
        Context H = gwb.H();
        String a = this.i.a();
        int b = ((jcf) jyn.a(H, jcf.class)).b(a);
        String g = fde.g(b);
        String str = "";
        if (gwb.a(H, "babel_hangout_write_logs_2", true) && gwb.d(k())) {
            String q = gwb.q(a);
            gwb.r(a);
            gwb.s();
            gwb.a(this.i.a(), 6, 7);
            str = this.j;
            str = new StringBuilder((String.valueOf(q).length() + 5) + String.valueOf(str).length()).append(q).append("/").append(str).append(".log").toString();
            this.E = String.valueOf(str).concat(".bz2");
        }
        this.N = new itf().a(euc.a(this.n)).a(this.j).j(a).k(Long.toString(ffh.a().b())).l(g).a(aa()).m(this.E).b(this.k).b(this.m).a(this.l).a(this.m == 3).b(!this.n).c(k().h()).d(this.d).a(nzf.a(this.H));
        if (!(TextUtils.isEmpty(this.i.g()) || this.i.q())) {
            this.N.c(this.i.g());
        }
        this.a.a(this.N, k().g());
        ((ful) jyn.a(H, ful.class)).a(b, this.j, str, glj.a());
        this.a.a(false);
        this.a.b(false);
        this.M = true;
        this.A = false;
    }

    void z() {
        this.u.a(2);
        this.g.postDelayed(this.P, gwb.a(gwb.H(), "babel_hangout_enter_master_timeout", 60000));
        String d = this.i.d();
        long E = did.E();
        if (this.i.p()) {
            this.g.postDelayed(this.R, E);
            RealTimeChatService.a((fip) this);
            this.O = ((gie) jyn.a(gwb.H(), gie.class)).b(fln.class, this, fln.a(d));
            fme a = ((fmf) jyn.a(gwb.H(), fmf.class)).a();
            this.z = a.a();
            RealTimeChatService.a(a, k(), this.i.m(), null, this.i.l());
        } else if ("conversation".equals(this.i.b()) && blo.a(d)) {
            RealTimeChatService.a((fip) this);
            this.O = ((gie) jyn.a(gwb.H(), gie.class)).b(fln.class, this, fln.a(d));
            String a2 = RealTimeChatService.a(this.i.d());
            if (a2 != null) {
                g(a2);
            } else {
                this.g.postDelayed(this.Q, E);
            }
        } else {
            if ("conversation".equals(this.i.b())) {
                RealTimeChatService.b(((fmf) jyn.a(gwb.H(), fmf.class)).a(-1), k().g(), d);
            }
            ab();
        }
        this.a.y();
    }

    private lkm aa() {
        List<dlc> c = jyn.c(gwb.H(), dlc.class);
        Bundle bundle = new Bundle();
        bundle.putInt("account_id", k().g());
        bundle.putBoolean("is_pstn_only", this.n);
        lkm lkm = new lkm();
        lkm lkm2 = lkm;
        for (dlc a : c) {
            lkm2 = a.a(lkm2, bundle);
        }
        return lkm2;
    }

    private void ab() {
        if (!this.i.q() && !this.i.c() && this.i.h() == null && this.i.i() == null && this.i.k() == null) {
            this.N.c(this.i.g());
        } else {
            this.N.g(this.i.g()).f(this.i.f()).h(this.i.h()).i(this.i.i()).d(this.i.b()).e(this.i.d()).a(this.i.k());
        }
        if (!this.n) {
            this.N.a(new dhy(gwb.H(), this).a());
        }
        this.a.a(this.N);
        this.A = true;
    }

    void a(ikd ikd) {
        this.g.removeCallbacks(this.P);
        if (ikd != null) {
            b(ikd.l(), ikd.m());
        } else {
            b(10030, null);
        }
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((djs) obj).g();
        }
        this.K.d();
    }

    boolean A() {
        ikd p = p();
        itl d = this.a.d();
        return (p == null || d == null || !d.m()) ? false : true;
    }

    void B() {
        Z().e();
    }

    void a(List<edk> list) {
        djs djs = new djs(this, false, list);
        this.s.add(djs);
        djs.e();
        this.K.a((List) list);
    }

    public boolean C() {
        return this.s.size() != 0;
    }

    private boolean c(iqo iqo) {
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((djs) obj).a(iqo)) {
                return true;
            }
        }
        return false;
    }

    static long D() {
        return gwb.a(gwb.H(), "babel_hangout_outgoing_invite_max_duration_ms", 30000);
    }

    public static final long E() {
        return gwb.a(gwb.H(), "babel_hangout_enter_step_timeout", 12000);
    }

    public List<edk> F() {
        List arrayList = new ArrayList();
        ArrayList arrayList2 = this.s;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.addAll(((djs) obj).d());
        }
        return arrayList;
    }

    public boolean G() {
        return this.t;
    }

    public int H() {
        return this.v;
    }

    void a(iqo iqo) {
        boolean z;
        if (iqo.k() || iqo.e()) {
            z = true;
        } else {
            z = false;
        }
        iil.b("Expected condition to be false", z);
        this.v++;
        if (!this.w) {
            this.w = true;
            this.u.a(9);
        }
        ArrayList Y = Y();
        int size = Y.size();
        int i = 0;
        while (i < size) {
            Object obj = Y.get(i);
            i++;
            ((djs) obj).b(iqo);
        }
        this.K.a(iqo);
        ad();
    }

    void b(iqo iqo) {
        ArrayList Y = Y();
        int size = Y.size();
        int i = 0;
        while (i < size) {
            Object obj = Y.get(i);
            i++;
            ((djs) obj).i();
        }
        if (this.v == 0) {
            for (itg a : this.a.w()) {
                a.a(iqo);
            }
        }
        ac();
    }

    void I() {
        ArrayList Y = Y();
        int size = Y.size();
        int i = 0;
        while (i < size) {
            Object obj = Y.get(i);
            i++;
            ((djs) obj).h();
        }
        ac();
    }

    private void ac() {
        if (!this.x) {
            this.x = true;
            this.u.a(8);
        }
    }

    void a(iqo iqo, Integer num) {
        int i;
        boolean z;
        iil.b("Expected condition to be false", iqo.k());
        if (iqo.f()) {
            i = 0;
        } else {
            if (this.v > 0) {
                z = true;
            } else {
                z = false;
            }
            iil.a("Expected condition to be true", z);
            this.v--;
            i = 1;
        }
        boolean c = c(iqo);
        if (this.s.size() != 0) {
            ArrayList Y = Y();
            int size = Y.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = Y.get(i2);
                i2++;
                ((djs) obj).a(iqo, num);
            }
        } else if (this.v == 0 && !this.o) {
            int i3;
            if ((iqo instanceof iqu) && gwb.a(num) == 7) {
                i3 = 11014;
            } else {
                i3 = 11005;
            }
            b(i3);
            i = 0;
        }
        if (!(i == 0 || this.n)) {
            gld.a(gwb.iu);
        }
        this.K.b(iqo);
        ad();
        if (num != null && c && (iqo instanceof iqu)) {
            iqu iqu = (iqu) iqo;
            int a = gwb.a(num);
            z = false;
            for (itg c2 : this.a.w()) {
                z = c2.c(a);
                if (z) {
                    break;
                }
            }
            if (!z) {
                Context H = gwb.H();
                switch (a) {
                    case wi.q /*7*/:
                        Toast.makeText(H, bc.dI, 0).show();
                    case wi.m /*8*/:
                        Toast.makeText(H, bc.dG, 0).show();
                    case wi.dr /*10*/:
                        Toast.makeText(H, H.getString(bc.dH, new Object[]{iqu.b()}), 0).show();
                    default:
                }
            }
        }
    }

    public void a(lxh lxh) {
        boolean z = true;
        int a = gwb.a(lxh.m, -1);
        if (a == 0) {
            if (lxh.k == null || lxh.k.a == null) {
                glk.d("Babel", "No live stream status, ignore the update.", new Object[0]);
                return;
            } else if (gwb.a(lxh.k.a) != 4) {
                z = false;
            }
        } else if (lxh.l == null || lxh.l.a == null) {
            glk.d("Babel", "No recording status, ignore the update.", new Object[0]);
            return;
        } else if (gwb.a(lxh.l.a) != 2) {
            z = false;
        }
        boolean a2 = a(this.e, this.f);
        boolean a3 = a(z, a);
        this.e = z;
        this.f = a;
        if (a2 != a3) {
            CharSequence string;
            Context H;
            int i;
            if (o()) {
                H = gwb.H();
                if (a3) {
                    i = bc.fd;
                } else {
                    i = bc.eM;
                }
                string = H.getString(i);
            } else {
                H = gwb.H();
                if (a3) {
                    i = bc.eX;
                } else {
                    i = bc.eY;
                }
                string = H.getString(i);
            }
            Toast.makeText(gwb.H(), string, 0).show();
        }
        for (itg a4 : this.a.w()) {
            a4.a();
        }
    }

    public int J() {
        return this.I;
    }

    public void a(int i) {
        this.I = i;
    }

    private void ad() {
        ikd p = p();
        if (p != null && p.j().size() != 0) {
            int i = 0;
            int i2 = 0;
            for (iqo iqo : p.j()) {
                int i3;
                if (iqo instanceof iqu) {
                    i2 |= 1;
                } else if (iqo instanceof iqs) {
                    i2 |= 2;
                }
                if (iqo.j()) {
                    i3 = i + 1;
                } else {
                    i3 = i;
                }
                i = i3;
            }
            if (i > 1) {
                x();
            }
            if (this.I != i2) {
                this.I = i2;
                for (itg b : this.a.w()) {
                    b.b(i2);
                }
            }
        }
    }

    public boolean K() {
        return this.b;
    }

    public void a(String str, char c) {
        if (c) {
            new StringBuilder(String.valueOf(str).length() + 35).append("HangoutState - sending dtmf: ").append(c).append(" to: ").append(str);
        }
        inx.a().a(c, did.L(), str);
        String valueOf = String.valueOf(this.L);
        this.L = new StringBuilder(String.valueOf(valueOf).length() + 1).append(valueOf).append(c).toString();
    }

    public void a(char c) {
        if (p() != null) {
            for (iqo iqo : p().j()) {
                if (iqo instanceof iqu) {
                    if (c) {
                        String valueOf = String.valueOf(iqo);
                        new StringBuilder(String.valueOf(valueOf).length() + 35).append("HangoutState - sending dtmf: ").append(c).append(" to: ").append(valueOf);
                    }
                    inx.a().a(c, did.L(), iqo.a());
                }
            }
            String valueOf2 = String.valueOf(this.L);
            this.L = new StringBuilder(String.valueOf(valueOf2).length() + 1).append(valueOf2).append(c).toString();
        }
    }

    public static int L() {
        return gwb.a(gwb.H(), "babel_dtmf_code_duration_ms", 350);
    }

    public String M() {
        return this.L;
    }

    public boolean N() {
        return this.B;
    }

    public void b(int i) {
        glk.c("Babel", "HangoutState exiting due to reason %d; exiting: %s; callJoined: %s", Integer.valueOf(i), Boolean.valueOf(this.B), Boolean.valueOf(this.A));
        if (!this.B) {
            boolean z;
            this.B = true;
            this.M = false;
            b(i, null);
            this.u.a();
            this.g.removeCallbacks(this.P);
            this.g.removeCallbacks(this.Q);
            this.g.removeCallbacks(this.R);
            this.z = -1;
            RealTimeChatService.b((fip) this);
            if (this.O != null) {
                ((gie) jyn.a(gwb.H(), gie.class)).a(this.O);
            }
            ArrayList Y = Y();
            int size = Y.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = Y.get(i2);
                i2++;
                ((djs) obj).f();
            }
            for (itg f : this.a.w()) {
                f.f();
            }
            if (this.A) {
                this.a.a(i);
            }
            if (this.v != 0 || this.i.e() == null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                RealTimeChatService.a(k(), this.i.e(), 0);
            }
            if (!this.A) {
                this.a.f();
            }
        }
    }

    public int O() {
        iil.b(Integer.valueOf(this.C), Integer.valueOf(10000));
        return this.C;
    }

    String P() {
        iil.b(Integer.valueOf(this.C), Integer.valueOf(10000));
        return this.D;
    }

    private void b(int i, String str) {
        if (this.C == 10000) {
            this.C = i;
            this.D = str;
        }
    }

    public boolean Q() {
        return this.F;
    }

    public void a(Bundle bundle) {
        String str;
        bundle.putString("allow_on_air", String.valueOf(X()));
        bundle.putString("broadcast_session_state", m() ? "STARTED" : "STOPPED");
        String str2 = "broadcast_use_case";
        switch (this.f) {
            case wi.w /*0*/:
                str = "HANGOUTS_ON_AIR";
                break;
            case wi.j /*1*/:
                str = "CONSUMER_RECORDING";
                break;
            case wi.z /*3*/:
                str = "ENTERPRISE_RECORDING";
                break;
            default:
                str = "";
                break;
        }
        bundle.putString(str2, str);
        bundle.putString("connected_remote_endpoint_count", String.valueOf(H()));
        bundle.putString("is_audio_only_mode", String.valueOf(K()));
        bundle.putString("is_awaiting", String.valueOf(C()));
        bundle.putString("is_broadcast", String.valueOf(V()));
        bundle.putString("is_exiting", String.valueOf(N()));
        bundle.putString("is_initial_outgoing_invite_pending", String.valueOf(u()));
        bundle.putString("is_recordable", String.valueOf(W()));
        bundle.putString("is_recording", String.valueOf(o()));
        bundle.putString("local_session_id", l());
        bundle.putString("participant_composition", String.valueOf(J()));
        bundle.putString("should_upload_log", String.valueOf(Q()));
    }

    public void a(mcu mcu) {
        mcu.a = fde.g(k().g());
        mcu.k = l();
        if (this.i != null) {
            mcu.c = this.i.g();
            mcu.f = new mds();
            mcu.f.a = this.i.e();
        }
        Object obj = this.k;
        ikd p = p();
        if (p != null) {
            mcu.b = p.f();
            if (TextUtils.isEmpty(obj)) {
                obj = p.g();
            }
        }
        if (!TextUtils.isEmpty(obj)) {
            mcu.e = obj;
        }
    }

    public String R() {
        return this.E;
    }

    public void e(String str) {
        if (this.E != null) {
            inx.b(str);
            this.F = true;
        }
    }

    public edk S() {
        return this.J;
    }

    public List<dii> T() {
        return this.K.e();
    }

    Handler U() {
        return this.g;
    }

    public void f(String str) {
        this.u.a(str);
    }
}
