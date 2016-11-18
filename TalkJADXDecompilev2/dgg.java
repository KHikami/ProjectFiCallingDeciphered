package defpackage;

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
    private static volatile dgg s;
    private static iko v;
    public final List<itg> a = new CopyOnWriteArrayList();
    Runnable b = new dgh(this);
    final Context c = gwb.H();
    final gui d = new guj(this.c).a(hat.b).b();
    itk e;
    boolean f;
    itf g;
    PredictedNetworkQuality h;
    ism i;
    public final Map<String, itl> j = new HashMap();
    itl k;
    boolean l = true;
    boolean m = true;
    itl n = null;
    dgb o;
    Handler p = gwb.aL();
    did q;
    private final itw r = new dgl(this);
    private iri t;
    private boolean u;
    private PhoneStateListener w;

    public static dgg a() {
        if (s == null) {
            synchronized (dgg.class) {
                if (s == null) {
                    s = new dgg();
                }
            }
        }
        return s;
    }

    private dgg() {
        gwb.a(new dgn(this));
        iiq.a(new dgo(this));
    }

    public void b() {
        if (!this.u) {
            a(new dkr(this.c));
            this.u = true;
        }
    }

    public boolean c() {
        if (v == null) {
            iko iko = new iko();
            v = iko;
            iko.a(gwb.H());
        }
        return v.a();
    }

    public itl d() {
        return this.n;
    }

    public dgb e() {
        return this.o;
    }

    public void a(itg itg) {
        this.r.a(itg);
        this.a.add(itg);
        if (this.e != null) {
            itg.a(this.e);
        }
    }

    public void b(itg itg) {
        this.r.b(itg);
        iil.a("Expected condition to be true", this.a.remove(itg));
    }

    public void a(itf itf, int i) {
        z();
        if (fdq.Q.b(i)) {
            iti iti = new iti(this.c);
            iti.b().a(true);
            this.t.a(iti);
        }
        ite a = this.t.a(itf);
        a.a(this.r);
        if (this.q.j()) {
            a.a(new isl());
            itd irh = new irh();
            irh.c_(true);
            a.a(irh);
            return;
        }
        this.i = new ism(this.c, this.q.g() == 3);
        this.i.a(new dgp(this));
        this.i.a(false);
        this.i.c_(true);
        a.a(this.i);
        a.a(this.i);
        for (itg a2 : this.a) {
            a2.a(this.i.c(), this.i.d());
        }
        this.o = new dgb(this.c);
        this.o.a(new dge(this));
        this.o.a();
    }

    public void f() {
        z();
        ite b = this.t.b();
        if (b != null) {
            iil.b("Expected condition to be false", b.l());
            b.a(10030);
        }
    }

    public void a(itf itf) {
        z();
        ite b = this.t.b();
        iil.b("Expected condition to be false", b.l());
        this.g = itf;
        b.a(itf);
    }

    public void a(int i) {
        z();
        this.t.b().a(i);
    }

    public ite g() {
        if (this.t == null) {
            return null;
        }
        return this.t.b();
    }

    public ith h() {
        if (this.t == null) {
            return null;
        }
        ite g = g();
        if (g != null) {
            return g.o();
        }
        return null;
    }

    public itl a(String str) {
        return (itl) this.j.get(str);
    }

    public boolean i() {
        return this.l;
    }

    public boolean j() {
        iry l = l();
        return l == null || !l.g();
    }

    public ism k() {
        return this.i;
    }

    public iry l() {
        ite g = s.g();
        if (g == null) {
            return null;
        }
        return (iry) g.p();
    }

    public void a(boolean z) {
        boolean z2 = false;
        if (this.l != z) {
            this.l = z;
            z();
            ite b = this.t.b();
            if (b == null) {
                glk.d("Babel_calls", "Attempted to change audio mute state without an active call.", new Object[0]);
                return;
            }
            itc q = b.q();
            if (q != null) {
                if (!z) {
                    z2 = true;
                }
                q.a(z2);
            }
        }
    }

    public void b(boolean z) {
        boolean z2 = false;
        if (this.m != z) {
            this.m = z;
            z();
            ite b = this.t.b();
            if (b == null) {
                glk.d("Babel_calls", "Attempted to change audio playback mute state without an active call.", new Object[0]);
                return;
            }
            itd r = b.r();
            if (!this.m) {
                z2 = true;
            }
            r.c_(z2);
        }
    }

    public void b(String str) {
        z();
        ite b = this.t.b();
        if (b instanceof ijn) {
            ((ijn) b).a(str);
        } else {
            glk.d("Babel_calls", "Attempted to mute remote participant without an active call.", new Object[0]);
        }
    }

    public void c(String str) {
        z();
        ite b = this.t.b();
        if (b instanceof ijn) {
            ((ijn) b).b(str);
        } else {
            glk.d("Babel_calls", "Attempted to mute remote participant without an active call.", new Object[0]);
        }
    }

    public boolean m() {
        return this.e != null;
    }

    public boolean n() {
        return this.q != null;
    }

    public boolean o() {
        return this.f;
    }

    public ijk p() {
        if (this.t == null) {
            glk.d("Babel_calls", "Attempted to get mesi collections without an a call client.", new Object[0]);
            return null;
        }
        ite b = this.t.b();
        if (b != null) {
            return b.t();
        }
        glk.d("Babel_calls", "Attempted to get mesi collections without an active call.", new Object[0]);
        return null;
    }

    public List<itl> q() {
        return new ArrayList(this.j.values());
    }

    public itl r() {
        List q = q();
        int size = q.size();
        itl itl;
        if (size == 1) {
            itl = (itl) q.get(0);
            if (!itl.f() && itl.k()) {
                return itl;
            }
        } else if (size == 2) {
            itl = (itl) q.get(0);
            itl itl2 = (itl) q.get(1);
            if (itl.f() && itl2.k()) {
                return itl2;
            }
            if (itl2.f() && itl.k()) {
                return itl;
            }
        }
        return null;
    }

    public did s() {
        return this.q;
    }

    public boolean t() {
        return (this.q == null || this.q.H() == 0) ? false : true;
    }

    public boolean u() {
        return this.q != null && this.q.K();
    }

    public void a(dhz dhz, boolean z, List<edk> list, boolean z2, edk edk, int i, boolean z3, int i2, boolean z4, long j, muo muo, String str) {
        iil.a("Expected null", this.q);
        this.q = new did(this.c, dhz, z, list, z2, edk, i, z3, i2, z4, j, muo, str);
        Context context = this.c;
        String l = this.q.l();
        SharedPreferences sharedPreferences = context.getSharedPreferences(dhe.class.getName(), 0);
        if (!TextUtils.isEmpty(sharedPreferences.getString("ONGOING_CALL_SESSION", ""))) {
            gwb.f(2723);
        }
        sharedPreferences.edit().putString("ONGOING_CALL_SESSION", l).apply();
        this.q.y();
        this.d.b();
        hat.c.a(this.d).a(new dgj(this));
    }

    public void v() {
        this.q.z();
    }

    void a(List<edk> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            edk edk = (edk) list.get(i);
            if (edk.b.a != null) {
                arrayList.add(edk.b.a);
            } else if (edk.a == edq.PHONE) {
                inx.a().a(edk.s, glq.e(this.c, edk.f()), false, glq.a(this.c, edk.f()), glq.d(glq.e(this.c, edk.f()), glq.i(this.c)), edk.d());
            }
        }
        if (arrayList.size() == 0) {
            glk.a("Babel_calls", "Nobody to invite.", new Object[0]);
            return;
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        inx.a().a(strArr, 1, true, false, null);
    }

    public void b(List<edk> list) {
        if (this.q != null && this.q.A()) {
            a((List) list);
            this.q.a((List) list);
        }
    }

    @Deprecated
    public void a(Intent intent) {
        if (this.q != null) {
            this.q.U().post(new dgq(this, intent));
        }
    }

    public void d(String str) {
        if (this.q != null) {
            this.q.U().post(new dgr(this, str));
        }
    }

    List<itg> w() {
        return this.a;
    }

    void a(ikd ikd) {
        glk.c("Babel_calls", "CallServiceHost.handleHangoutExited", new Object[0]);
        if (this.q != null) {
            y();
            if (!this.q.j()) {
                gwb.aJ();
                if (this.w != null) {
                    ((TelephonyManager) gwb.H().getSystemService("phone")).listen(this.w, 0);
                }
            }
            this.q.a(ikd);
            for (itg a : this.a) {
                a.a(this.q);
            }
            this.q.e().s();
            if (!(this.q.j() || this.q.K())) {
                gld.a(gwb.iu);
            }
            Context context = this.c;
            String l = this.q.l();
            SharedPreferences sharedPreferences = context.getSharedPreferences(dhe.class.getName(), 0);
            if (!sharedPreferences.getString("ONGOING_CALL_SESSION", "").equals(l)) {
                gwb.f(2715);
            }
            sharedPreferences.edit().remove("ONGOING_CALL_SESSION").apply();
            this.q = null;
            this.d.d();
        }
    }

    public void x() {
        gwb.aJ();
        if (this.w == null) {
            this.w = new dgi(this);
        }
        ((TelephonyManager) gwb.H().getSystemService("phone")).listen(this.w, 32);
    }

    void y() {
        if (this.q != null) {
            blf.a(fde.a(this.q.e().a()).g());
        }
    }

    private void z() {
        gwb.aJ();
        if (this.t == null) {
            this.t = new iri(this.c);
        }
    }
}
