package p000;

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

public final class did extends fip implements gia<fln> {
    private static final boolean f9819c = false;
    private boolean f9820A;
    private boolean f9821B;
    private int f9822C = 10000;
    private String f9823D;
    private String f9824E;
    private boolean f9825F;
    private final Random f9826G = new Random();
    private muo f9827H;
    private int f9828I = 0;
    private final edk f9829J;
    private final dkt f9830K;
    private String f9831L;
    private boolean f9832M;
    private itf f9833N;
    private gic f9834O;
    private final Runnable f9835P = new die(this);
    private final Runnable f9836Q = new dif(this);
    private final Runnable f9837R = new dig(this);
    private final Runnable f9838S = new dih(this);
    public final dgg f9839a = dgg.m11692a();
    boolean f9840b;
    private final boolean f9841d;
    private boolean f9842e;
    private int f9843f = -1;
    private final Handler f9844g = new Handler();
    private final dhz f9845h;
    private dhz f9846i;
    private final String f9847j;
    private final String f9848k;
    private final int f9849l;
    private final int f9850m;
    private final boolean f9851n;
    private boolean f9852o;
    private String f9853p;
    private boolean f9854q;
    private boolean f9855r;
    private final ArrayList<djs> f9856s = new ArrayList();
    private final boolean f9857t;
    private final glg f9858u;
    private int f9859v;
    private boolean f9860w;
    private boolean f9861x;
    private boolean f9862y;
    private int f9863z;

    static {
        kae kae = glk.f15560g;
    }

    did(Context context, dhz dhz, boolean z, List<edk> list, boolean z2, edk edk, int i, boolean z3, int i2, boolean z4, long j, muo muo, String str) {
        Object obj;
        int[] iArr;
        this.f9845h = dhz.m11908r();
        this.f9846i = dhz;
        this.f9849l = i;
        this.f9850m = i2;
        this.f9841d = z;
        this.f9851n = z4;
        this.f9857t = z2;
        if (muo == null) {
            this.f9827H = new muo();
        } else {
            this.f9827H = muo;
        }
        this.f9848k = str;
        this.f9829J = edk;
        this.f9830K = new dkt(context, this, edk);
        this.f9831L = "";
        if (list == null || list.size() <= 0) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj != null) {
            iil.m21879b("Expected condition to be false", z2);
            this.f9856s.add(new djs(this, true, list));
            this.f9830K.m12154a((List) list);
        }
        this.f9840b = false;
        m11936d(dhz.m11902l() == 2);
        iub iub = new iub();
        this.f9847j = iub.m23296a();
        this.f9832M = false;
        String str2 = "type_null";
        switch (i2) {
            case 0:
                str2 = "type_unk";
                break;
            case 1:
                if (!this.f9851n) {
                    str2 = "type_pstn";
                    break;
                } else {
                    str2 = "type_tycho";
                    break;
                }
            case 2:
                str2 = "type_audio";
                break;
            case 3:
                str2 = "type_video";
                break;
            default:
                glk.m17982e("Babel", "HangoutState initialized with a CallType outside the known range: " + i2, new Object[0]);
                break;
        }
        String[] strArr = new String[]{"source_" + i, str2};
        Context H = gwb.m1400H();
        if (obj != null) {
            iArr = new int[]{1, 3};
        } else if (z3) {
            iArr = new int[]{1, 2, 17};
        } else {
            iArr = new int[]{1, 2};
        }
        glk.m17970a("Babel_CallMarkReporter", "Creating startup reporter", new Object[0]);
        obj = new ArrayList();
        Collections.addAll(obj, strArr);
        this.f9858u = new glg(H, iArr, obj);
        this.f9858u.mo1402a(1, j);
    }

    public dhz m11979d() {
        return this.f9845h;
    }

    public dhz m11981e() {
        return this.f9846i;
    }

    public String m11983f() {
        if (this.f9845h.m11907q()) {
            String b = gwb.m1998b(gwb.m1400H(), "babel_hangout_named_shortlink_base_url", "http://g.co/hangouts");
            String f = this.f9845h.m11896f();
            String g = this.f9845h.m11897g();
            return String.format("%s/%s/%s", new Object[]{b, f, g});
        }
        f = gwb.m1998b(gwb.m1400H(), "babel_hangout_base_url", "https://hangouts.google.com/call");
        boolean a = gwb.m1906a(gwb.m1400H(), "babel_hangout_underscore_after_base_url", false);
        iil.m21875b("Expected non-null", this.f9846i.m11897g());
        return String.format(a ? "%s/_/%s" : "%s/%s", new Object[]{f, this.f9846i.m11897g()});
    }

    int m11985g() {
        return this.f9850m;
    }

    public boolean m11971a(HangoutActivity hangoutActivity) {
        dhz m = hangoutActivity.m8567m();
        if (hangoutActivity.mo1085j()) {
            return this.f9845h.equals(m) || this.f9846i.equals(m);
        } else {
            return this.f9846i.equals(m);
        }
    }

    public void m11965a(String str) {
        this.f9846i = this.f9846i.m11892d(str);
        if (f9819c) {
            String valueOf = String.valueOf(this.f9846i);
            new StringBuilder(String.valueOf(valueOf).length() + 11).append("Updated to ").append(valueOf);
        }
    }

    public void m11975b(String str) {
        this.f9846i = this.f9846i.m11894e(str);
        if (f9819c) {
            String valueOf = String.valueOf(this.f9846i);
            new StringBuilder(String.valueOf(valueOf).length() + 11).append("Updated to ").append(valueOf);
        }
    }

    public void m11970a(boolean z) {
        this.f9855r = z;
    }

    public boolean m11986h() {
        return this.f9855r;
    }

    public boolean m11972a(boolean z, int i) {
        boolean z2 = i == -1 ? m11929W() || m11930X() : i == 0 || i == 1 || i == 3;
        if (z2 && z) {
            return true;
        }
        return false;
    }

    public void m11976b(boolean z) {
        boolean z2 = true;
        this.f9852o = true;
        if (this.f9852o && this.f9854q) {
            z2 = false;
        }
        iil.m21874a("Expected condition to be true", z2);
    }

    private boolean m11928V() {
        return this.f9852o;
    }

    public void m11977c(String str) {
        this.f9853p = str;
    }

    public void m11978c(boolean z) {
        boolean z2;
        this.f9854q = z;
        if (this.f9852o && this.f9854q) {
            z2 = false;
        } else {
            z2 = true;
        }
        iil.m21874a("Expected condition to be true", z2);
    }

    private boolean m11929W() {
        return this.f9854q;
    }

    public boolean m11987i() {
        return (this.f9852o || this.f9854q) ? false : true;
    }

    public boolean m11988j() {
        return this.f9851n;
    }

    public bko m11989k() {
        return fde.m14994a(this.f9846i.m11885a());
    }

    public String m11990l() {
        return this.f9847j;
    }

    private boolean m11930X() {
        return this.f9841d;
    }

    public boolean m11991m() {
        return this.f9842e;
    }

    public int m11992n() {
        return this.f9843f;
    }

    public boolean m11993o() {
        if (this.f9843f == -1) {
            return m11929W();
        }
        return this.f9843f != 0;
    }

    private ArrayList<djs> m11931Y() {
        return (ArrayList) this.f9856s.clone();
    }

    public ikd m11994p() {
        boolean z;
        ikd b = inx.m22408a().m22417b();
        if (b == null || b.m22132e().equals(this.f9847j)) {
            z = true;
        } else {
            z = false;
        }
        iil.m21874a("Expected condition to be true", z);
        return b;
    }

    public void m11995q() {
        this.f9858u.mo1403a(7);
    }

    public void m11996r() {
        this.f9858u.mo1403a(3);
        this.f9825F = false;
        if (this.f9824E != null) {
            if (Math.abs(this.f9826G.nextInt(10000)) < gwb.m1492a(gwb.m1400H(), "babel_hangout_upload_rate_2", 10)) {
                inx.m22409b("Triggering sampled debug log");
                this.f9825F = true;
            }
            if (gwb.m1906a(gwb.m1400H(), "babel_hangout_upload_logs_2", false)) {
                inx.m22409b("Triggering log upload for auto_plugin_log_upload experiment");
                this.f9825F = true;
            }
        }
    }

    private djs m11932Z() {
        if (this.f9856s.size() == 0 || !((djs) this.f9856s.get(0)).m12070a()) {
            return null;
        }
        return (djs) this.f9856s.get(0);
    }

    List<djs> m11997s() {
        return this.f9856s;
    }

    List<edk> m11998t() {
        djs Z = m11932Z();
        return Z == null ? null : Z.m12072b();
    }

    public boolean m11999u() {
        djs Z = m11932Z();
        return Z != null && Z.m12074c() == 0;
    }

    void m12000v() {
        this.f9844g.removeCallbacks(this.f9835P);
        this.f9858u.mo1403a(5);
    }

    public void m12001w() {
        if (!this.f9862y) {
            this.f9858u.mo1403a(6);
            this.f9862y = true;
        }
        m12002x();
    }

    public void m12002x() {
        if (this.f9840b) {
            if (!this.f9839a.m11718j()) {
                ism k = this.f9839a.m11719k();
                if (k.m23129c().equals(isr.EARPIECE_ON) && k.m23130d().contains(isq.SPEAKERPHONE)) {
                    k.m23124a(isq.SPEAKERPHONE);
                }
            }
            m11936d(false);
        }
    }

    private void m11936d(boolean z) {
        if (this.f9840b != z) {
            this.f9840b = z;
            this.f9838S.run();
        }
    }

    private void m11933a(fln fln) {
        this.f9844g.removeCallbacks(this.f9836Q);
        if (!this.f9821B) {
            String str = fln.f13413a;
            String str2 = fln.f13414b;
            iil.m21879b("Expected condition to be false", this.f9821B);
            if (!"conversation".equals(this.f9846i.m11889b()) || !blo.m5871a(str)) {
                iil.m21874a("Expected condition to be true", this.f9846i.m11906p());
            } else if (this.f9846i.m11893d().equals(str)) {
                m11937g(str2);
                this.f9839a.m11733y();
            }
        }
    }

    public void mo1572d(String str) {
        iil.m21874a("Expected condition to be true", this.f9846i.m11906p());
        if (this.f9863z != -1) {
            RealTimeChatService.m9077b((fip) this);
            if (this.f9834O != null) {
                ((gie) jyn.m25426a(gwb.m1400H(), gie.class)).mo2278a(this.f9834O);
            }
            this.f9844g.removeCallbacks(this.f9837R);
            this.f9863z = -1;
            if (str == null) {
                m11973b(10015);
                return;
            }
            m11965a(str);
            this.f9839a.m11733y();
            ab();
        }
    }

    public void mo640a(int i, bko bko, fok fok, fdo fdo) {
        if (i == this.f9863z && (fok instanceof eud)) {
            glk.m17982e("Babel", "Create hangout id request failed", new Object[0]);
            this.f9863z = -1;
            mo1572d(null);
        }
    }

    private void m11937g(String str) {
        RealTimeChatService.m9077b((fip) this);
        if (this.f9834O != null) {
            ((gie) jyn.m25426a(gwb.m1400H(), gie.class)).mo2278a(this.f9834O);
        }
        this.f9846i.m11887a(str);
        ab();
    }

    void m12003y() {
        iil.m21879b("Expected condition to be false", this.f9832M);
        Context H = gwb.m1400H();
        String a = this.f9846i.m11885a();
        int b = ((jcf) jyn.m25426a(H, jcf.class)).mo3461b(a);
        String g = fde.m15023g(b);
        String str = "";
        if (gwb.m1906a(H, "babel_hangout_write_logs_2", true) && gwb.m2155d(m11989k())) {
            String q = gwb.m2331q(a);
            gwb.m2342r(a);
            gwb.m2348s();
            gwb.m1866a(this.f9846i.m11885a(), 6, 7);
            str = this.f9847j;
            str = new StringBuilder((String.valueOf(q).length() + 5) + String.valueOf(str).length()).append(q).append("/").append(str).append(".log").toString();
            this.f9824E = String.valueOf(str).concat(".bz2");
        }
        this.f9833N = new itf().m23156a(euc.m14534a(this.f9851n)).m23154a(this.f9847j).m23180j(a).m23182k(Long.toString(ffh.m15192a().m15201b())).m23184l(g).m23155a(aa()).m23186m(this.f9824E).m23161b(this.f9848k).m23160b(this.f9850m).m23151a(this.f9849l).m23157a(this.f9850m == 3).m23162b(!this.f9851n).m23166c(m11989k().m5639h()).m23168d(this.f9841d).m23158a(nzf.m1029a(this.f9827H));
        if (!(TextUtils.isEmpty(this.f9846i.m11897g()) || this.f9846i.m11907q())) {
            this.f9833N.m23165c(this.f9846i.m11897g());
        }
        this.f9839a.m11700a(this.f9833N, m11989k().m5638g());
        ((ful) jyn.m25426a(H, ful.class)).m16262a(b, this.f9847j, str, glj.m17956a());
        this.f9839a.m11703a(false);
        this.f9839a.m11708b(false);
        this.f9832M = true;
        this.f9820A = false;
    }

    void m12004z() {
        this.f9858u.mo1403a(2);
        this.f9844g.postDelayed(this.f9835P, gwb.m1519a(gwb.m1400H(), "babel_hangout_enter_master_timeout", 60000));
        String d = this.f9846i.m11893d();
        long E = did.m11926E();
        if (this.f9846i.m11906p()) {
            this.f9844g.postDelayed(this.f9837R, E);
            RealTimeChatService.m9040a((fip) this);
            this.f9834O = ((gie) jyn.m25426a(gwb.m1400H(), gie.class)).mo2279b(fln.class, this, fln.m15647a(d));
            fme a = ((fmf) jyn.m25426a(gwb.m1400H(), fmf.class)).mo2035a();
            this.f9863z = a.m15674a();
            RealTimeChatService.m9050a(a, m11989k(), this.f9846i.m11903m(), null, this.f9846i.m11902l());
        } else if ("conversation".equals(this.f9846i.m11889b()) && blo.m5871a(d)) {
            RealTimeChatService.m9040a((fip) this);
            this.f9834O = ((gie) jyn.m25426a(gwb.m1400H(), gie.class)).mo2279b(fln.class, this, fln.m15647a(d));
            String a2 = RealTimeChatService.m8987a(this.f9846i.m11893d());
            if (a2 != null) {
                m11937g(a2);
            } else {
                this.f9844g.postDelayed(this.f9836Q, E);
            }
        } else {
            if ("conversation".equals(this.f9846i.m11889b())) {
                RealTimeChatService.m9082b(((fmf) jyn.m25426a(gwb.m1400H(), fmf.class)).mo2036a(-1), m11989k().m5638g(), d);
            }
            ab();
        }
        this.f9839a.m11733y();
    }

    private lkm aa() {
        List<dlc> c = jyn.m25438c(gwb.m1400H(), dlc.class);
        Bundle bundle = new Bundle();
        bundle.putInt("account_id", m11989k().m5638g());
        bundle.putBoolean("is_pstn_only", this.f9851n);
        lkm lkm = new lkm();
        lkm lkm2 = lkm;
        for (dlc a : c) {
            lkm2 = a.mo1596a(lkm2, bundle);
        }
        return lkm2;
    }

    private void ab() {
        if (!this.f9846i.m11907q() && !this.f9846i.m11891c() && this.f9846i.m11898h() == null && this.f9846i.m11899i() == null && this.f9846i.m11901k() == null) {
            this.f9833N.m23165c(this.f9846i.m11897g());
        } else {
            this.f9833N.m23174g(this.f9846i.m11897g()).m23172f(this.f9846i.m11896f()).m23176h(this.f9846i.m11898h()).m23178i(this.f9846i.m11899i()).m23167d(this.f9846i.m11889b()).m23171e(this.f9846i.m11893d()).m23153a(this.f9846i.m11901k());
        }
        if (!this.f9851n) {
            this.f9833N.m23152a(new dhy(gwb.m1400H(), this).m11882a());
        }
        this.f9839a.m11699a(this.f9833N);
        this.f9820A = true;
    }

    void m11962a(ikd ikd) {
        this.f9844g.removeCallbacks(this.f9835P);
        if (ikd != null) {
            m11934b(ikd.m22140l(), ikd.m22141m());
        } else {
            m11934b(10030, null);
        }
        ArrayList arrayList = this.f9856s;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((djs) obj).m12078g();
        }
        this.f9830K.m12156d();
    }

    boolean m11938A() {
        ikd p = m11994p();
        itl d = this.f9839a.m11711d();
        return (p == null || d == null || !d.m23252m()) ? false : true;
    }

    void m11939B() {
        m11932Z().m12076e();
    }

    void m11967a(List<edk> list) {
        djs djs = new djs(this, false, list);
        this.f9856s.add(djs);
        djs.m12076e();
        this.f9830K.m12154a((List) list);
    }

    public boolean m11940C() {
        return this.f9856s.size() != 0;
    }

    private boolean m11935c(iqo iqo) {
        ArrayList arrayList = this.f9856s;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((djs) obj).m12071a(iqo)) {
                return true;
            }
        }
        return false;
    }

    static long m11925D() {
        return gwb.m1519a(gwb.m1400H(), "babel_hangout_outgoing_invite_max_duration_ms", 30000);
    }

    public static final long m11926E() {
        return gwb.m1519a(gwb.m1400H(), "babel_hangout_enter_step_timeout", 12000);
    }

    public List<edk> m11941F() {
        List arrayList = new ArrayList();
        ArrayList arrayList2 = this.f9856s;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.addAll(((djs) obj).m12075d());
        }
        return arrayList;
    }

    public boolean m11942G() {
        return this.f9857t;
    }

    public int m11943H() {
        return this.f9859v;
    }

    void m11963a(iqo iqo) {
        boolean z;
        if (iqo.m22969k() || iqo.m22963e()) {
            z = true;
        } else {
            z = false;
        }
        iil.m21879b("Expected condition to be false", z);
        this.f9859v++;
        if (!this.f9860w) {
            this.f9860w = true;
            this.f9858u.mo1403a(9);
        }
        ArrayList Y = m11931Y();
        int size = Y.size();
        int i = 0;
        while (i < size) {
            Object obj = Y.get(i);
            i++;
            ((djs) obj).m12073b(iqo);
        }
        this.f9830K.m12151a(iqo);
        ad();
    }

    void m11974b(iqo iqo) {
        ArrayList Y = m11931Y();
        int size = Y.size();
        int i = 0;
        while (i < size) {
            Object obj = Y.get(i);
            i++;
            ((djs) obj).m12080i();
        }
        if (this.f9859v == 0) {
            for (itg a : this.f9839a.m11731w()) {
                a.mo1571a(iqo);
            }
        }
        ac();
    }

    void m11944I() {
        ArrayList Y = m11931Y();
        int size = Y.size();
        int i = 0;
        while (i < size) {
            Object obj = Y.get(i);
            i++;
            ((djs) obj).m12079h();
        }
        ac();
    }

    private void ac() {
        if (!this.f9861x) {
            this.f9861x = true;
            this.f9858u.mo1403a(8);
        }
    }

    void m11964a(iqo iqo, Integer num) {
        int i;
        boolean z;
        iil.m21879b("Expected condition to be false", iqo.m22969k());
        if (iqo.m22964f()) {
            i = 0;
        } else {
            if (this.f9859v > 0) {
                z = true;
            } else {
                z = false;
            }
            iil.m21874a("Expected condition to be true", z);
            this.f9859v--;
            i = 1;
        }
        boolean c = m11935c(iqo);
        if (this.f9856s.size() != 0) {
            ArrayList Y = m11931Y();
            int size = Y.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = Y.get(i2);
                i2++;
                ((djs) obj).m12068a(iqo, num);
            }
        } else if (this.f9859v == 0 && !this.f9852o) {
            int i3;
            if ((iqo instanceof iqu) && gwb.m1507a(num) == 7) {
                i3 = 11014;
            } else {
                i3 = 11005;
            }
            m11973b(i3);
            i = 0;
        }
        if (!(i == 0 || this.f9851n)) {
            gld.m17931a(gwb.iu);
        }
        this.f9830K.m12155b(iqo);
        ad();
        if (num != null && c && (iqo instanceof iqu)) {
            iqu iqu = (iqu) iqo;
            int a = gwb.m1507a(num);
            z = false;
            for (itg c2 : this.f9839a.m11731w()) {
                z = c2.mo1569c(a);
                if (z) {
                    break;
                }
            }
            if (!z) {
                Context H = gwb.m1400H();
                switch (a) {
                    case 7:
                        Toast.makeText(H, bc.dI, 0).show();
                        return;
                    case 8:
                        Toast.makeText(H, bc.dG, 0).show();
                        return;
                    case 10:
                        Toast.makeText(H, H.getString(bc.dH, new Object[]{iqu.m22953b()}), 0).show();
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public void m11968a(lxh lxh) {
        boolean z = true;
        int a = gwb.m1508a(lxh.f26770m, -1);
        if (a == 0) {
            if (lxh.f26768k == null || lxh.f26768k.f26784a == null) {
                glk.m17981d("Babel", "No live stream status, ignore the update.", new Object[0]);
                return;
            } else if (gwb.m1507a(lxh.f26768k.f26784a) != 4) {
                z = false;
            }
        } else if (lxh.f26769l == null || lxh.f26769l.f26794a == null) {
            glk.m17981d("Babel", "No recording status, ignore the update.", new Object[0]);
            return;
        } else if (gwb.m1507a(lxh.f26769l.f26794a) != 2) {
            z = false;
        }
        boolean a2 = m11972a(this.f9842e, this.f9843f);
        boolean a3 = m11972a(z, a);
        this.f9842e = z;
        this.f9843f = a;
        if (a2 != a3) {
            CharSequence string;
            Context H;
            int i;
            if (m11993o()) {
                H = gwb.m1400H();
                if (a3) {
                    i = bc.fd;
                } else {
                    i = bc.eM;
                }
                string = H.getString(i);
            } else {
                H = gwb.m1400H();
                if (a3) {
                    i = bc.eX;
                } else {
                    i = bc.eY;
                }
                string = H.getString(i);
            }
            Toast.makeText(gwb.m1400H(), string, 0).show();
        }
        for (itg a4 : this.f9839a.m11731w()) {
            a4.mo1537a();
        }
    }

    public int m11945J() {
        return this.f9828I;
    }

    public void m11957a(int i) {
        this.f9828I = i;
    }

    private void ad() {
        ikd p = m11994p();
        if (p != null && p.m22138j().size() != 0) {
            int i = 0;
            int i2 = 0;
            for (iqo iqo : p.m22138j()) {
                int i3;
                if (iqo instanceof iqu) {
                    i2 |= 1;
                } else if (iqo instanceof iqs) {
                    i2 |= 2;
                }
                if (iqo.m22968j()) {
                    i3 = i + 1;
                } else {
                    i3 = i;
                }
                i = i3;
            }
            if (i > 1) {
                m12002x();
            }
            if (this.f9828I != i2) {
                this.f9828I = i2;
                for (itg b : this.f9839a.m11731w()) {
                    b.mo1565b(i2);
                }
            }
        }
    }

    public boolean m11946K() {
        return this.f9840b;
    }

    public void m11966a(String str, char c) {
        if (f9819c) {
            new StringBuilder(String.valueOf(str).length() + 35).append("HangoutState - sending dtmf: ").append(c).append(" to: ").append(str);
        }
        inx.m22408a().m22410a(c, did.m11927L(), str);
        String valueOf = String.valueOf(this.f9831L);
        this.f9831L = new StringBuilder(String.valueOf(valueOf).length() + 1).append(valueOf).append(c).toString();
    }

    public void m11956a(char c) {
        if (m11994p() != null) {
            for (iqo iqo : m11994p().m22138j()) {
                if (iqo instanceof iqu) {
                    if (f9819c) {
                        String valueOf = String.valueOf(iqo);
                        new StringBuilder(String.valueOf(valueOf).length() + 35).append("HangoutState - sending dtmf: ").append(c).append(" to: ").append(valueOf);
                    }
                    inx.m22408a().m22410a(c, did.m11927L(), iqo.m22949a());
                }
            }
            String valueOf2 = String.valueOf(this.f9831L);
            this.f9831L = new StringBuilder(String.valueOf(valueOf2).length() + 1).append(valueOf2).append(c).toString();
        }
    }

    public static int m11927L() {
        return gwb.m1492a(gwb.m1400H(), "babel_dtmf_code_duration_ms", 350);
    }

    public String m11947M() {
        return this.f9831L;
    }

    public boolean m11948N() {
        return this.f9821B;
    }

    public void m11973b(int i) {
        glk.m17979c("Babel", "HangoutState exiting due to reason %d; exiting: %s; callJoined: %s", Integer.valueOf(i), Boolean.valueOf(this.f9821B), Boolean.valueOf(this.f9820A));
        if (!this.f9821B) {
            boolean z;
            this.f9821B = true;
            this.f9832M = false;
            m11934b(i, null);
            this.f9858u.mo1401a();
            this.f9844g.removeCallbacks(this.f9835P);
            this.f9844g.removeCallbacks(this.f9836Q);
            this.f9844g.removeCallbacks(this.f9837R);
            this.f9863z = -1;
            RealTimeChatService.m9077b((fip) this);
            if (this.f9834O != null) {
                ((gie) jyn.m25426a(gwb.m1400H(), gie.class)).mo2278a(this.f9834O);
            }
            ArrayList Y = m11931Y();
            int size = Y.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = Y.get(i2);
                i2++;
                ((djs) obj).m12077f();
            }
            for (itg f : this.f9839a.m11731w()) {
                f.mo1561f();
            }
            if (this.f9820A) {
                this.f9839a.m11695a(i);
            }
            if (this.f9859v != 0 || this.f9846i.m11895e() == null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                RealTimeChatService.m9018a(m11989k(), this.f9846i.m11895e(), 0);
            }
            if (!this.f9820A) {
                this.f9839a.m11714f();
            }
        }
    }

    public int m11949O() {
        iil.m21877b(Integer.valueOf(this.f9822C), Integer.valueOf(10000));
        return this.f9822C;
    }

    String m11950P() {
        iil.m21877b(Integer.valueOf(this.f9822C), Integer.valueOf(10000));
        return this.f9823D;
    }

    private void m11934b(int i, String str) {
        if (this.f9822C == 10000) {
            this.f9822C = i;
            this.f9823D = str;
        }
    }

    public boolean m11951Q() {
        return this.f9825F;
    }

    public void m11959a(Bundle bundle) {
        String str;
        bundle.putString("allow_on_air", String.valueOf(m11930X()));
        bundle.putString("broadcast_session_state", m11991m() ? "STARTED" : "STOPPED");
        String str2 = "broadcast_use_case";
        switch (this.f9843f) {
            case 0:
                str = "HANGOUTS_ON_AIR";
                break;
            case 1:
                str = "CONSUMER_RECORDING";
                break;
            case 3:
                str = "ENTERPRISE_RECORDING";
                break;
            default:
                str = "";
                break;
        }
        bundle.putString(str2, str);
        bundle.putString("connected_remote_endpoint_count", String.valueOf(m11943H()));
        bundle.putString("is_audio_only_mode", String.valueOf(m11946K()));
        bundle.putString("is_awaiting", String.valueOf(m11940C()));
        bundle.putString("is_broadcast", String.valueOf(m11928V()));
        bundle.putString("is_exiting", String.valueOf(m11948N()));
        bundle.putString("is_initial_outgoing_invite_pending", String.valueOf(m11999u()));
        bundle.putString("is_recordable", String.valueOf(m11929W()));
        bundle.putString("is_recording", String.valueOf(m11993o()));
        bundle.putString("local_session_id", m11990l());
        bundle.putString("participant_composition", String.valueOf(m11945J()));
        bundle.putString("should_upload_log", String.valueOf(m11951Q()));
    }

    public void m11969a(mcu mcu) {
        mcu.f27374a = fde.m15023g(m11989k().m5638g());
        mcu.f27384k = m11990l();
        if (this.f9846i != null) {
            mcu.f27376c = this.f9846i.m11897g();
            mcu.f27379f = new mds();
            mcu.f27379f.f27528a = this.f9846i.m11895e();
        }
        Object obj = this.f9848k;
        ikd p = m11994p();
        if (p != null) {
            mcu.f27375b = p.m22134f();
            if (TextUtils.isEmpty(obj)) {
                obj = p.m22135g();
            }
        }
        if (!TextUtils.isEmpty(obj)) {
            mcu.f27378e = obj;
        }
    }

    public String m11952R() {
        return this.f9824E;
    }

    public void m11982e(String str) {
        if (this.f9824E != null) {
            inx.m22409b(str);
            this.f9825F = true;
        }
    }

    public edk m11953S() {
        return this.f9829J;
    }

    public List<dii> m11954T() {
        return this.f9830K.m12157e();
    }

    Handler m11955U() {
        return this.f9844g;
    }

    public void m11984f(String str) {
        this.f9858u.m17953a(str);
    }
}
