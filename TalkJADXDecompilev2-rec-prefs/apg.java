package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class apg<R> implements ape, bay, Comparable<apg<?>>, Runnable {
    private volatile apd f2018A;
    private volatile boolean f2019B;
    private volatile boolean f2020C;
    final apf<R> f2021a = new apf();
    final apj<?> f2022b = new apj();
    anv f2023c;
    int f2024d;
    int f2025e;
    apq f2026f;
    anz f2027g;
    anv f2028h;
    private final List<Exception> f2029i = new ArrayList();
    private final bba f2030j = bba.m4705a();
    private final apk f2031k;
    private final ll<apg<?>> f2032l;
    private final apl f2033m = new apl();
    private amk f2034n;
    private amq f2035o;
    private aqi f2036p;
    private api<R> f2037q;
    private int f2038r;
    private apn f2039s;
    private apm f2040t;
    private long f2041u;
    private Thread f2042v;
    private anv f2043w;
    private Object f2044x;
    private anq f2045y;
    private aoe<?> f2046z;

    public /* synthetic */ int compareTo(Object obj) {
        return m3635a((apg) obj);
    }

    apg(apk apk, ll<apg<?>> llVar) {
        this.f2031k = apk;
        this.f2032l = llVar;
    }

    apg<R> m3647a(amk amk, Object obj, aqi aqi, anv anv, int i, int i2, Class<?> cls, Class<R> cls2, amq amq, apq apq, Map<Class<?>, aoc<?>> map, boolean z, anz anz, api<R> api_R, int i3) {
        this.f2021a.m3616a(amk, obj, anv, i, i2, apq, cls, cls2, amq, anz, map, z, this.f2031k);
        this.f2034n = amk;
        this.f2023c = anv;
        this.f2035o = amq;
        this.f2036p = aqi;
        this.f2024d = i;
        this.f2025e = i2;
        this.f2026f = apq;
        this.f2027g = anz;
        this.f2037q = api_R;
        this.f2038r = i3;
        this.f2040t = apm.INITIALIZE;
        return this;
    }

    boolean m3651a() {
        apn a = m3636a(apn.INITIALIZE);
        return a == apn.RESOURCE_CACHE || a == apn.DATA_CACHE;
    }

    void m3650a(boolean z) {
        if (this.f2033m.m3664a(z)) {
            m3641f();
        }
    }

    private void m3640e() {
        if (this.f2033m.m3663a()) {
            m3641f();
        }
    }

    private void m3641f() {
        this.f2033m.m3666c();
        this.f2022b.m3660b();
        this.f2021a.m3618a();
        this.f2019B = false;
        this.f2034n = null;
        this.f2023c = null;
        this.f2027g = null;
        this.f2035o = null;
        this.f2036p = null;
        this.f2037q = null;
        this.f2039s = null;
        this.f2018A = null;
        this.f2042v = null;
        this.f2028h = null;
        this.f2044x = null;
        this.f2045y = null;
        this.f2046z = null;
        this.f2041u = 0;
        this.f2020C = false;
        this.f2029i.clear();
        this.f2032l.mo437a(this);
    }

    public void m3652b() {
        this.f2020C = true;
        apd apd = this.f2018A;
        if (apd != null) {
            apd.mo328b();
        }
    }

    public void run() {
        boolean z;
        String valueOf;
        try {
            if (this.f2020C) {
                m3644i();
                return;
            }
            switch (aph.f2047a[this.f2040t.ordinal()]) {
                case 1:
                    this.f2039s = m3636a(apn.INITIALIZE);
                    this.f2018A = m3642g();
                    m3643h();
                    return;
                case 2:
                    m3643h();
                    return;
                case 3:
                    m3646k();
                    return;
                default:
                    String valueOf2 = String.valueOf(this.f2040t);
                    throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf2).length() + 25).append("Unrecognized run reason: ").append(valueOf2).toString());
            }
            if (Log.isLoggable("DecodeJob", 3)) {
                z = this.f2020C;
                valueOf = String.valueOf(this.f2039s);
                new StringBuilder(String.valueOf(valueOf).length() + 57).append("DecodeJob threw unexpectedly, isCancelled: ").append(z).append(", stage: ").append(valueOf);
            }
            if (this.f2039s != apn.ENCODE) {
                m3644i();
            }
            if (!this.f2020C) {
                throw e;
            }
        } catch (RuntimeException e) {
            if (Log.isLoggable("DecodeJob", 3)) {
                z = this.f2020C;
                valueOf = String.valueOf(this.f2039s);
                new StringBuilder(String.valueOf(valueOf).length() + 57).append("DecodeJob threw unexpectedly, isCancelled: ").append(z).append(", stage: ").append(valueOf);
            }
            if (this.f2039s != apn.ENCODE) {
                m3644i();
            }
            if (!this.f2020C) {
                throw e;
            }
        }
    }

    private apd m3642g() {
        switch (aph.f2048b[this.f2039s.ordinal()]) {
            case 1:
                return new aqs(this.f2021a, this);
            case 2:
                return new apb(this.f2021a, this);
            case 3:
                return new aqw(this.f2021a, this);
            case 4:
                return null;
            default:
                String valueOf = String.valueOf(this.f2039s);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 20).append("Unrecognized stage: ").append(valueOf).toString());
        }
    }

    private void m3643h() {
        this.f2042v = Thread.currentThread();
        this.f2041u = bam.m4675a();
        boolean z = false;
        while (!this.f2020C && this.f2018A != null) {
            z = this.f2018A.mo327a();
            if (z) {
                break;
            }
            this.f2039s = m3636a(this.f2039s);
            this.f2018A = m3642g();
            if (this.f2039s == apn.SOURCE) {
                mo331c();
                return;
            }
        }
        if ((this.f2039s == apn.FINISHED || this.f2020C) && !r0) {
            m3644i();
        }
    }

    private void m3644i() {
        m3645j();
        this.f2037q.mo343a(new aqm("Failed to load resource", new ArrayList(this.f2029i)));
        if (this.f2033m.m3665b()) {
            m3641f();
        }
    }

    private void m3645j() {
        this.f2030j.mo439b();
        if (this.f2019B) {
            throw new IllegalStateException("Already notified");
        }
        this.f2019B = true;
    }

    private apn m3636a(apn apn) {
        while (true) {
            switch (aph.f2048b[apn.ordinal()]) {
                case 1:
                    if (!this.f2026f.mo336b()) {
                        apn = apn.DATA_CACHE;
                        break;
                    }
                    return apn.DATA_CACHE;
                case 2:
                    return apn.SOURCE;
                case 3:
                case 4:
                    return apn.FINISHED;
                case 5:
                    if (!this.f2026f.mo333a()) {
                        apn = apn.RESOURCE_CACHE;
                        break;
                    }
                    return apn.RESOURCE_CACHE;
                default:
                    String valueOf = String.valueOf(apn);
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 20).append("Unrecognized stage: ").append(valueOf).toString());
            }
        }
    }

    public void mo331c() {
        this.f2040t = apm.SWITCH_TO_SOURCE_SERVICE;
        this.f2037q.mo342a(this);
    }

    public void mo330a(anv anv, Object obj, aoe<?> aoe_, anq anq, anv anv2) {
        this.f2028h = anv;
        this.f2044x = obj;
        this.f2046z = aoe_;
        this.f2045y = anq;
        this.f2043w = anv2;
        if (Thread.currentThread() != this.f2042v) {
            this.f2040t = apm.DECODE_DATA;
            this.f2037q.mo342a(this);
            return;
        }
        m3646k();
    }

    public void mo329a(anv anv, Exception exception, aoe<?> aoe_, anq anq) {
        aqm aqm = new aqm("Fetching data failed", exception);
        aqm.m3748a(anv, anq, aoe_.mo321d());
        this.f2029i.add(aqm);
        if (Thread.currentThread() != this.f2042v) {
            this.f2040t = apm.SWITCH_TO_SOURCE_SERVICE;
            this.f2037q.mo342a(this);
            return;
        }
        m3643h();
    }

    private void m3646k() {
        aqr a;
        aqp aqp = null;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f2041u;
            String valueOf = String.valueOf(this.f2044x);
            String valueOf2 = String.valueOf(this.f2028h);
            String valueOf3 = String.valueOf(this.f2046z);
            m3639a("Retrieved data", j, new StringBuilder(((String.valueOf(valueOf).length() + 30) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("data: ").append(valueOf).append(", cache key: ").append(valueOf2).append(", fetcher: ").append(valueOf3).toString());
        }
        try {
            a = m3637a(this.f2046z, this.f2044x, this.f2045y);
        } catch (aqm e) {
            e.m3747a(this.f2043w, this.f2045y);
            this.f2029i.add(e);
            a = null;
        }
        if (a != null) {
            anq anq = this.f2045y;
            if (this.f2022b.m3659a()) {
                aqp = aqp.m3753a(a);
                a = aqp;
            }
            m3645j();
            this.f2037q.mo344a(a, anq);
            this.f2039s = apn.ENCODE;
            try {
                if (this.f2022b.m3659a()) {
                    this.f2022b.m3658a(this.f2031k, this.f2027g);
                }
                if (aqp != null) {
                    aqp.m3754a();
                }
                m3640e();
            } catch (Throwable th) {
                if (aqp != null) {
                    aqp.m3754a();
                }
                m3640e();
            }
        } else {
            m3643h();
        }
    }

    private <Data> aqr<R> m3637a(aoe<?> aoe_, Data data, anq anq) {
        aqr<R> aqr_R = null;
        if (data == null) {
            aoe_.mo311a();
        } else {
            try {
                long a = bam.m4675a();
                aqr_R = m3638a((Object) data, anq, this.f2021a.m3623b(data.getClass()));
                if (Log.isLoggable("DecodeJob", 2)) {
                    String valueOf = String.valueOf(aqr_R);
                    m3639a(new StringBuilder(String.valueOf(valueOf).length() + 15).append("Decoded result ").append(valueOf).toString(), a, null);
                }
                aoe_.mo311a();
            } catch (Throwable th) {
                aoe_.mo311a();
            }
        }
        return aqr_R;
    }

    private <Data, ResourceType> aqr<R> m3638a(Data data, anq anq, aqo<Data, ResourceType, R> aqo_Data__ResourceType__R) {
        aog b = this.f2034n.m2917c().m2953b((Object) data);
        try {
            aqr<R> a = aqo_Data__ResourceType__R.m3752a(b, this.f2027g, this.f2024d, this.f2025e, new app(this, anq));
            return a;
        } finally {
            b.mo318b();
        }
    }

    private void m3639a(String str, long j, String str2) {
        String str3;
        String valueOf;
        double a = bam.m4674a(j);
        String valueOf2 = String.valueOf(this.f2036p);
        if (str2 != null) {
            str3 = ", ";
            valueOf = String.valueOf(str2);
            valueOf = valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3);
        } else {
            valueOf = "";
        }
        str3 = String.valueOf(Thread.currentThread().getName());
        new StringBuilder((((String.valueOf(str).length() + 50) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf).length()) + String.valueOf(str3).length()).append(str).append(" in ").append(a).append(", load key: ").append(valueOf2).append(valueOf).append(", thread: ").append(str3);
    }

    public bba j_() {
        return this.f2030j;
    }

    private int m3635a(apg<?> apg_) {
        int ordinal = this.f2035o.ordinal() - apg_.f2035o.ordinal();
        if (ordinal == 0) {
            return this.f2038r - apg_.f2038r;
        }
        return ordinal;
    }
}
