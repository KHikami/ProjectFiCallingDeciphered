package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.herrevad.PredictedNetworkQuality;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class dgg {
    private static volatile dgg f9676s;
    private static iko f9677v;
    public final List<itg> f9678a = new CopyOnWriteArrayList();
    Runnable f9679b = new dgh(this);
    final Context f9680c = gwb.m1400H();
    final gui f9681d = new guj(this.f9680c).m18639a(hat.f16480b).m18645b();
    itk f9682e;
    boolean f9683f;
    itf f9684g;
    PredictedNetworkQuality f9685h;
    ism f9686i;
    public final Map<String, itl> f9687j = new HashMap();
    itl f9688k;
    boolean f9689l = true;
    boolean f9690m = true;
    itl f9691n = null;
    dgb f9692o;
    Handler f9693p = gwb.aL();
    did f9694q;
    private final itw f9695r = new dgl(this);
    private iri f9696t;
    private boolean f9697u;
    private PhoneStateListener f9698w;

    public static dgg m11692a() {
        if (f9676s == null) {
            synchronized (dgg.class) {
                if (f9676s == null) {
                    f9676s = new dgg();
                }
            }
        }
        return f9676s;
    }

    private dgg() {
        gwb.m1863a(new dgn(this));
        iiq.m4948a(new dgo(this));
    }

    public void m11704b() {
        if (!this.f9697u) {
            m11701a(new dkr(this.f9680c));
            this.f9697u = true;
        }
    }

    public boolean m11710c() {
        if (f9677v == null) {
            iko iko = new iko();
            f9677v = iko;
            iko.m22189a(gwb.m1400H());
        }
        return f9677v.m22188a();
    }

    public itl m11711d() {
        return this.f9691n;
    }

    public dgb m11713e() {
        return this.f9692o;
    }

    public void m11701a(itg itg) {
        this.f9695r.m11744a(itg);
        this.f9678a.add(itg);
        if (this.f9682e != null) {
            itg.mo1386a(this.f9682e);
        }
    }

    public void m11705b(itg itg) {
        this.f9695r.m11753b(itg);
        iil.m21874a("Expected condition to be true", this.f9678a.remove(itg));
    }

    public void m11700a(itf itf, int i) {
        m11693z();
        if (fdq.f12775Q.m14370b(i)) {
            iti iti = new iti(this.f9680c);
            iti.m23218b().m23219a(true);
            this.f9696t.m23043a(iti);
        }
        ite a = this.f9696t.m23041a(itf);
        a.mo3217a(this.f9695r);
        if (this.f9694q.m11988j()) {
            a.mo3214a(new isl());
            itd irh = new irh();
            irh.c_(true);
            a.mo3215a(irh);
            return;
        }
        this.f9686i = new ism(this.f9680c, this.f9694q.m11985g() == 3);
        this.f9686i.m23125a(new dgp(this));
        this.f9686i.mo3396a(false);
        this.f9686i.c_(true);
        a.mo3214a(this.f9686i);
        a.mo3215a(this.f9686i);
        for (itg a2 : this.f9678a) {
            a2.mo1568a(this.f9686i.m23129c(), this.f9686i.m23130d());
        }
        this.f9692o = new dgb(this.f9680c);
        this.f9692o.m11686a(new dge(this));
        this.f9692o.m11685a();
    }

    public void m11714f() {
        m11693z();
        ite b = this.f9696t.m23045b();
        if (b != null) {
            iil.m21879b("Expected condition to be false", b.mo3221l());
            b.mo3213a(10030);
        }
    }

    public void m11699a(itf itf) {
        m11693z();
        ite b = this.f9696t.m23045b();
        iil.m21879b("Expected condition to be false", b.mo3221l());
        this.f9684g = itf;
        b.mo3216a(itf);
    }

    public void m11695a(int i) {
        m11693z();
        this.f9696t.m23045b().mo3213a(i);
    }

    public ite m11715g() {
        if (this.f9696t == null) {
            return null;
        }
        return this.f9696t.m23045b();
    }

    public ith m11716h() {
        if (this.f9696t == null) {
            return null;
        }
        ite g = m11715g();
        if (g != null) {
            return g.mo3224o();
        }
        return null;
    }

    public itl m11694a(String str) {
        return (itl) this.f9687j.get(str);
    }

    public boolean m11717i() {
        return this.f9689l;
    }

    public boolean m11718j() {
        iry l = m11720l();
        return l == null || !l.mo1322g();
    }

    public ism m11719k() {
        return this.f9686i;
    }

    public iry m11720l() {
        ite g = f9676s.m11715g();
        if (g == null) {
            return null;
        }
        return (iry) g.mo3225p();
    }

    public void m11703a(boolean z) {
        boolean z2 = false;
        if (this.f9689l != z) {
            this.f9689l = z;
            m11693z();
            ite b = this.f9696t.m23045b();
            if (b == null) {
                glk.m17981d("Babel_calls", "Attempted to change audio mute state without an active call.", new Object[0]);
                return;
            }
            itc q = b.mo3226q();
            if (q != null) {
                if (!z) {
                    z2 = true;
                }
                q.mo3396a(z2);
            }
        }
    }

    public void m11708b(boolean z) {
        boolean z2 = false;
        if (this.f9690m != z) {
            this.f9690m = z;
            m11693z();
            ite b = this.f9696t.m23045b();
            if (b == null) {
                glk.m17981d("Babel_calls", "Attempted to change audio playback mute state without an active call.", new Object[0]);
                return;
            }
            itd r = b.mo3227r();
            if (!this.f9690m) {
                z2 = true;
            }
            r.c_(z2);
        }
    }

    public void m11706b(String str) {
        m11693z();
        ite b = this.f9696t.m23045b();
        if (b instanceof ijn) {
            ((ijn) b).m21959a(str);
        } else {
            glk.m17981d("Babel_calls", "Attempted to mute remote participant without an active call.", new Object[0]);
        }
    }

    public void m11709c(String str) {
        m11693z();
        ite b = this.f9696t.m23045b();
        if (b instanceof ijn) {
            ((ijn) b).m21963b(str);
        } else {
            glk.m17981d("Babel_calls", "Attempted to mute remote participant without an active call.", new Object[0]);
        }
    }

    public boolean m11721m() {
        return this.f9682e != null;
    }

    public boolean m11722n() {
        return this.f9694q != null;
    }

    public boolean m11723o() {
        return this.f9683f;
    }

    public ijk m11724p() {
        if (this.f9696t == null) {
            glk.m17981d("Babel_calls", "Attempted to get mesi collections without an a call client.", new Object[0]);
            return null;
        }
        ite b = this.f9696t.m23045b();
        if (b != null) {
            return b.mo3229t();
        }
        glk.m17981d("Babel_calls", "Attempted to get mesi collections without an active call.", new Object[0]);
        return null;
    }

    public List<itl> m11725q() {
        return new ArrayList(this.f9687j.values());
    }

    public itl m11726r() {
        List q = m11725q();
        int size = q.size();
        itl itl;
        if (size == 1) {
            itl = (itl) q.get(0);
            if (!itl.m23242f() && itl.m23250k()) {
                return itl;
            }
        } else if (size == 2) {
            itl = (itl) q.get(0);
            itl itl2 = (itl) q.get(1);
            if (itl.m23242f() && itl2.m23250k()) {
                return itl2;
            }
            if (itl2.m23242f() && itl.m23250k()) {
                return itl;
            }
        }
        return null;
    }

    public did m11727s() {
        return this.f9694q;
    }

    public boolean m11728t() {
        return (this.f9694q == null || this.f9694q.m11943H() == 0) ? false : true;
    }

    public boolean m11729u() {
        return this.f9694q != null && this.f9694q.m11946K();
    }

    public void m11697a(dhz dhz, boolean z, List<edk> list, boolean z2, edk edk, int i, boolean z3, int i2, boolean z4, long j, muo muo, String str) {
        iil.m21872a("Expected null", this.f9694q);
        this.f9694q = new did(this.f9680c, dhz, z, list, z2, edk, i, z3, i2, z4, j, muo, str);
        Context context = this.f9680c;
        String l = this.f9694q.m11990l();
        SharedPreferences sharedPreferences = context.getSharedPreferences(dhe.class.getName(), 0);
        if (!TextUtils.isEmpty(sharedPreferences.getString("ONGOING_CALL_SESSION", ""))) {
            gwb.m2198f(2723);
        }
        sharedPreferences.edit().putString("ONGOING_CALL_SESSION", l).apply();
        this.f9694q.m12003y();
        this.f9681d.mo2518b();
        hat.f16481c.m19113a(this.f9681d).mo2419a(new dgj(this));
    }

    public void m11730v() {
        this.f9694q.m12004z();
    }

    void m11702a(List<edk> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            edk edk = (edk) list.get(i);
            if (edk.f11213b.f11244a != null) {
                arrayList.add(edk.f11213b.f11244a);
            } else if (edk.f11212a == edq.PHONE) {
                inx.m22408a().m22414a(edk.f11230s, glq.m18021e(this.f9680c, edk.m13596f()), false, glq.m18007a(this.f9680c, edk.m13596f()), glq.m18020d(glq.m18021e(this.f9680c, edk.m13596f()), glq.m18037i(this.f9680c)), edk.m13594d());
            }
        }
        if (arrayList.size() == 0) {
            glk.m17970a("Babel_calls", "Nobody to invite.", new Object[0]);
            return;
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        inx.m22408a().m22416a(strArr, 1, true, false, null);
    }

    public void m11707b(List<edk> list) {
        if (this.f9694q != null && this.f9694q.m11938A()) {
            m11702a((List) list);
            this.f9694q.m11967a((List) list);
        }
    }

    @Deprecated
    public void m11696a(Intent intent) {
        if (this.f9694q != null) {
            this.f9694q.m11955U().post(new dgq(this, intent));
        }
    }

    public void m11712d(String str) {
        if (this.f9694q != null) {
            this.f9694q.m11955U().post(new dgr(this, str));
        }
    }

    List<itg> m11731w() {
        return this.f9678a;
    }

    void m11698a(ikd ikd) {
        glk.m17979c("Babel_calls", "CallServiceHost.handleHangoutExited", new Object[0]);
        if (this.f9694q != null) {
            m11733y();
            if (!this.f9694q.m11988j()) {
                gwb.aJ();
                if (this.f9698w != null) {
                    ((TelephonyManager) gwb.m1400H().getSystemService("phone")).listen(this.f9698w, 0);
                }
            }
            this.f9694q.m11962a(ikd);
            for (itg a : this.f9678a) {
                a.mo1567a(this.f9694q);
            }
            this.f9694q.m11981e().m11909s();
            if (!(this.f9694q.m11988j() || this.f9694q.m11946K())) {
                gld.m17931a(gwb.iu);
            }
            Context context = this.f9680c;
            String l = this.f9694q.m11990l();
            SharedPreferences sharedPreferences = context.getSharedPreferences(dhe.class.getName(), 0);
            if (!sharedPreferences.getString("ONGOING_CALL_SESSION", "").equals(l)) {
                gwb.m2198f(2715);
            }
            sharedPreferences.edit().remove("ONGOING_CALL_SESSION").apply();
            this.f9694q = null;
            this.f9681d.mo2523d();
        }
    }

    public void m11732x() {
        gwb.aJ();
        if (this.f9698w == null) {
            this.f9698w = new dgi(this);
        }
        ((TelephonyManager) gwb.m1400H().getSystemService("phone")).listen(this.f9698w, 32);
    }

    void m11733y() {
        if (this.f9694q != null) {
            blf.m5757a(fde.m14994a(this.f9694q.m11981e().m11885a()).m5638g());
        }
    }

    private void m11693z() {
        gwb.aJ();
        if (this.f9696t == null) {
            this.f9696t = new iri(this.f9680c);
        }
    }
}
