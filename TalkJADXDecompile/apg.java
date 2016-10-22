import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class apg<R> implements ape, bay, Comparable<apg<?>>, Runnable {
    private volatile apd A;
    private volatile boolean B;
    private volatile boolean C;
    final apf<R> a;
    final apj<?> b;
    anv c;
    int d;
    int e;
    apq f;
    anz g;
    anv h;
    private final List<Exception> i;
    private final bba j;
    private final apk k;
    private final ll<apg<?>> l;
    private final apl m;
    private amk n;
    private amq o;
    private aqi p;
    private api<R> q;
    private int r;
    private apn s;
    private apm t;
    private long u;
    private Thread v;
    private anv w;
    private Object x;
    private anq y;
    private aoe<?> z;

    public /* synthetic */ int compareTo(Object obj) {
        return a((apg) obj);
    }

    apg(apk apk, ll<apg<?>> llVar) {
        this.a = new apf();
        this.i = new ArrayList();
        this.j = bba.a();
        this.b = new apj();
        this.m = new apl();
        this.k = apk;
        this.l = llVar;
    }

    apg<R> a(amk amk, Object obj, aqi aqi, anv anv, int i, int i2, Class<?> cls, Class<R> cls2, amq amq, apq apq, Map<Class<?>, aoc<?>> map, boolean z, anz anz, api<R> api_R, int i3) {
        this.a.a(amk, obj, anv, i, i2, apq, cls, cls2, amq, anz, map, z, this.k);
        this.n = amk;
        this.c = anv;
        this.o = amq;
        this.p = aqi;
        this.d = i;
        this.e = i2;
        this.f = apq;
        this.g = anz;
        this.q = api_R;
        this.r = i3;
        this.t = apm.INITIALIZE;
        return this;
    }

    boolean a() {
        apn a = a(apn.INITIALIZE);
        return a == apn.RESOURCE_CACHE || a == apn.DATA_CACHE;
    }

    void a(boolean z) {
        if (this.m.a(z)) {
            f();
        }
    }

    private void e() {
        if (this.m.a()) {
            f();
        }
    }

    private void f() {
        this.m.c();
        this.b.b();
        this.a.a();
        this.B = false;
        this.n = null;
        this.c = null;
        this.g = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.s = null;
        this.A = null;
        this.v = null;
        this.h = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.u = 0;
        this.C = false;
        this.i.clear();
        this.l.a(this);
    }

    public void b() {
        this.C = true;
        apd apd = this.A;
        if (apd != null) {
            apd.b();
        }
    }

    public void run() {
        boolean z;
        String valueOf;
        try {
            if (this.C) {
                i();
                return;
            }
            switch (aph.a[this.t.ordinal()]) {
                case wi.j /*1*/:
                    this.s = a(apn.INITIALIZE);
                    this.A = g();
                    h();
                    return;
                case wi.l /*2*/:
                    h();
                    return;
                case wi.z /*3*/:
                    k();
                    return;
                default:
                    String valueOf2 = String.valueOf(this.t);
                    throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf2).length() + 25).append("Unrecognized run reason: ").append(valueOf2).toString());
            }
            if (Log.isLoggable("DecodeJob", 3)) {
                z = this.C;
                valueOf = String.valueOf(this.s);
                new StringBuilder(String.valueOf(valueOf).length() + 57).append("DecodeJob threw unexpectedly, isCancelled: ").append(z).append(", stage: ").append(valueOf);
            }
            if (this.s != apn.ENCODE) {
                i();
            }
            if (!this.C) {
                throw e;
            }
        } catch (RuntimeException e) {
            if (Log.isLoggable("DecodeJob", 3)) {
                z = this.C;
                valueOf = String.valueOf(this.s);
                new StringBuilder(String.valueOf(valueOf).length() + 57).append("DecodeJob threw unexpectedly, isCancelled: ").append(z).append(", stage: ").append(valueOf);
            }
            if (this.s != apn.ENCODE) {
                i();
            }
            if (!this.C) {
                throw e;
            }
        }
    }

    private apd g() {
        switch (aph.b[this.s.ordinal()]) {
            case wi.j /*1*/:
                return new aqs(this.a, this);
            case wi.l /*2*/:
                return new apb(this.a, this);
            case wi.z /*3*/:
                return new aqw(this.a, this);
            case wi.h /*4*/:
                return null;
            default:
                String valueOf = String.valueOf(this.s);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 20).append("Unrecognized stage: ").append(valueOf).toString());
        }
    }

    private void h() {
        this.v = Thread.currentThread();
        this.u = bam.a();
        boolean z = false;
        while (!this.C && this.A != null) {
            z = this.A.a();
            if (z) {
                break;
            }
            this.s = a(this.s);
            this.A = g();
            if (this.s == apn.SOURCE) {
                c();
                return;
            }
        }
        if ((this.s == apn.FINISHED || this.C) && !r0) {
            i();
        }
    }

    private void i() {
        j();
        this.q.a(new aqm("Failed to load resource", new ArrayList(this.i)));
        if (this.m.b()) {
            f();
        }
    }

    private void j() {
        this.j.b();
        if (this.B) {
            throw new IllegalStateException("Already notified");
        }
        this.B = true;
    }

    private apn a(apn apn) {
        while (true) {
            switch (aph.b[apn.ordinal()]) {
                case wi.j /*1*/:
                    if (!this.f.b()) {
                        apn = apn.DATA_CACHE;
                        break;
                    }
                    return apn.DATA_CACHE;
                case wi.l /*2*/:
                    return apn.SOURCE;
                case wi.z /*3*/:
                case wi.h /*4*/:
                    return apn.FINISHED;
                case wi.p /*5*/:
                    if (!this.f.a()) {
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

    public void c() {
        this.t = apm.SWITCH_TO_SOURCE_SERVICE;
        this.q.a(this);
    }

    public void a(anv anv, Object obj, aoe<?> aoe_, anq anq, anv anv2) {
        this.h = anv;
        this.x = obj;
        this.z = aoe_;
        this.y = anq;
        this.w = anv2;
        if (Thread.currentThread() != this.v) {
            this.t = apm.DECODE_DATA;
            this.q.a(this);
            return;
        }
        k();
    }

    public void a(anv anv, Exception exception, aoe<?> aoe_, anq anq) {
        aqm aqm = new aqm("Fetching data failed", exception);
        aqm.a(anv, anq, aoe_.d());
        this.i.add(aqm);
        if (Thread.currentThread() != this.v) {
            this.t = apm.SWITCH_TO_SOURCE_SERVICE;
            this.q.a(this);
            return;
        }
        h();
    }

    private void k() {
        aqr a;
        aqp aqp = null;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.u;
            String valueOf = String.valueOf(this.x);
            String valueOf2 = String.valueOf(this.h);
            String valueOf3 = String.valueOf(this.z);
            a("Retrieved data", j, new StringBuilder(((String.valueOf(valueOf).length() + 30) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("data: ").append(valueOf).append(", cache key: ").append(valueOf2).append(", fetcher: ").append(valueOf3).toString());
        }
        try {
            a = a(this.z, this.x, this.y);
        } catch (aqm e) {
            e.a(this.w, this.y);
            this.i.add(e);
            a = null;
        }
        if (a != null) {
            anq anq = this.y;
            if (this.b.a()) {
                aqp = aqp.a(a);
                a = aqp;
            }
            j();
            this.q.a(a, anq);
            this.s = apn.ENCODE;
            try {
                if (this.b.a()) {
                    this.b.a(this.k, this.g);
                }
                if (aqp != null) {
                    aqp.a();
                }
                e();
            } catch (Throwable th) {
                if (aqp != null) {
                    aqp.a();
                }
                e();
            }
        } else {
            h();
        }
    }

    private <Data> aqr<R> a(aoe<?> aoe_, Data data, anq anq) {
        aqr<R> aqr_R = null;
        if (data == null) {
            aoe_.a();
        } else {
            try {
                long a = bam.a();
                aqr_R = a((Object) data, anq, this.a.b(data.getClass()));
                if (Log.isLoggable("DecodeJob", 2)) {
                    String valueOf = String.valueOf(aqr_R);
                    a(new StringBuilder(String.valueOf(valueOf).length() + 15).append("Decoded result ").append(valueOf).toString(), a, null);
                }
                aoe_.a();
            } catch (Throwable th) {
                aoe_.a();
            }
        }
        return aqr_R;
    }

    private <Data, ResourceType> aqr<R> a(Data data, anq anq, aqo<Data, ResourceType, R> aqo_Data__ResourceType__R) {
        aog b = this.n.c().b((Object) data);
        try {
            aqr<R> a = aqo_Data__ResourceType__R.a(b, this.g, this.d, this.e, new app(this, anq));
            return a;
        } finally {
            b.b();
        }
    }

    private void a(String str, long j, String str2) {
        String str3;
        String valueOf;
        double a = bam.a(j);
        String valueOf2 = String.valueOf(this.p);
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
        return this.j;
    }

    private int a(apg<?> apg_) {
        int ordinal = this.o.ordinal() - apg_.o.ordinal();
        if (ordinal == 0) {
            return this.r - apg_.r;
        }
        return ordinal;
    }
}
