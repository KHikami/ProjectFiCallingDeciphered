package p000;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class cus {
    int f9124a;
    boolean f9125b;
    boolean f9126c;
    float f9127d = 1.0f;
    int f9128e;
    int f9129f;
    boolean f9130g;
    boolean f9131h;
    boolean f9132i;
    final ite f9133j;
    final Handler f9134k = new Handler();
    final List<cuz> f9135l = new ArrayList();
    final Runnable f9136m = new cut(this);
    final Runnable f9137n = new cuu(this);
    final Runnable f9138o = new cuv(this);
    private final boolean f9139p;
    private iry f9140q;
    private ism f9141r;
    private final Context f9142s;

    cus(Context context, ite ite, int i) {
        boolean z = true;
        this.f9142s = context;
        this.f9133j = ite;
        if (i != 1) {
            z = false;
        }
        this.f9139p = z;
    }

    public void m11052a(cuz cuz) {
        if (!this.f9135l.contains(cuz)) {
            this.f9135l.add(cuz);
        }
    }

    public void m11055b(cuz cuz) {
        this.f9135l.remove(cuz);
    }

    public void m11051a(int i) {
        if (m11054b() != i) {
            m11074s().m23055a(i);
            for (cuz a : this.f9135l) {
                a.mo1382a(i);
            }
        }
    }

    public float m11050a() {
        return this.f9127d;
    }

    public int m11054b() {
        return m11074s().m23070h();
    }

    public boolean m11057b(int i) {
        switch (i) {
            case 1:
                return m11074s().mo3387a();
            case 2:
                return m11074s().mo3388b();
            default:
                return false;
        }
    }

    public boolean m11058c() {
        return this.f9126c;
    }

    public void m11053a(boolean z) {
        this.f9125b = z;
        this.f9136m.run();
    }

    public void m11059d() {
        m11053a(!m11058c());
    }

    public void m11060e() {
        this.f9124a++;
        if (this.f9124a == 1) {
            this.f9136m.run();
        }
    }

    public void m11061f() {
        this.f9124a--;
        if (this.f9124a == 0) {
            this.f9134k.postDelayed(this.f9136m, 100);
        }
    }

    public boolean m11062g() {
        return ((ehz) jyn.m25426a(this.f9142s, ehz.class)).mo1882a("android.permission.CAMERA");
    }

    public void m11063h() {
        this.f9136m.run();
    }

    public boolean m11064i() {
        return this.f9131h;
    }

    public void m11056b(boolean z) {
        if (z != this.f9130g) {
            this.f9130g = z;
            this.f9137n.run();
        }
    }

    public void m11065j() {
        m11056b(!m11064i());
    }

    public void m11066k() {
        this.f9128e++;
        if (this.f9128e == 1) {
            this.f9137n.run();
        }
    }

    public void m11067l() {
        this.f9128e--;
        if (this.f9128e == 0) {
            this.f9134k.postDelayed(this.f9137n, 100);
        }
    }

    public boolean m11068m() {
        return ((ehz) jyn.m25426a(this.f9142s, ehz.class)).mo1882a("android.permission.RECORD_AUDIO");
    }

    private void m11049a(isq isq) {
        m11075t().m23124a(isq);
        switch (cuy.f9148a[isq.ordinal()]) {
            case 1:
                gwb.m2251i(this.f9142s, 2062);
                return;
            case 2:
                gwb.m2251i(this.f9142s, 2063);
                return;
            case 3:
                gwb.m2251i(this.f9142s, 2065);
                return;
            case 4:
                gwb.m2251i(this.f9142s, 2064);
                return;
            default:
                return;
        }
    }

    public Set<isq> m11069n() {
        return m11075t().m23130d();
    }

    public isr m11070o() {
        return m11075t().m23129c();
    }

    public void m11071p() {
        Set n = m11069n();
        switch (cuy.f9149b[m11070o().ordinal()]) {
            case 1:
                if (n.contains(isq.SPEAKERPHONE)) {
                    m11049a(isq.SPEAKERPHONE);
                    return;
                }
                break;
            case 2:
                break;
        }
        if (n.contains(isq.BLUETOOTH_HEADSET)) {
            m11049a(isq.BLUETOOTH_HEADSET);
            return;
        }
        if (n.contains(isq.EARPIECE)) {
            m11049a(isq.EARPIECE);
        } else if (n.contains(isq.SPEAKERPHONE)) {
            m11049a(isq.SPEAKERPHONE);
        } else if (n.contains(isq.BLUETOOTH_HEADSET)) {
            m11049a(isq.BLUETOOTH_HEADSET);
        }
    }

    public void m11072q() {
        this.f9129f++;
        if (this.f9129f == 1) {
            this.f9138o.run();
        }
    }

    public void m11073r() {
        this.f9129f--;
        if (this.f9129f == 0) {
            this.f9134k.postDelayed(this.f9138o, 100);
        }
    }

    iry m11074s() {
        if (this.f9140q == null) {
            this.f9140q = ((cva) jyn.m25426a(this.f9142s, cva.class)).mo1436a(this.f9142s);
            this.f9140q.m23056a(new cuw(this));
            this.f9133j.mo3218a(this.f9140q);
        }
        return this.f9140q;
    }

    ism m11075t() {
        if (this.f9141r == null) {
            this.f9141r = ((cva) jyn.m25426a(this.f9142s, cva.class)).mo1437a(this.f9142s, this.f9139p);
            this.f9141r.m23125a(new cux(this));
            this.f9133j.mo3214a(this.f9141r);
        }
        return this.f9141r;
    }
}
