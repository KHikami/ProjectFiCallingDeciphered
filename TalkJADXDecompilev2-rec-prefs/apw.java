package p000;

import android.os.Looper;
import android.util.Log;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class apw implements aqh, aql, asf {
    private final Map<anv, aqe<?>> f2080a;
    private final aqj f2081b;
    private final ase f2082c;
    private final apz f2083d;
    private final Map<anv, WeakReference<aqk<?>>> f2084e;
    private final aqu f2085f;
    private final apk f2086g;
    private final apx f2087h;
    private ReferenceQueue<aqk<?>> f2088i;

    public apw(ase ase, aru aru, asm asm, asm asm2, asm asm3) {
        this(ase, aru, asm, asm2, asm3, null, null, null, null, null, null);
    }

    private apw(ase ase, aru aru, asm asm, asm asm2, asm asm3, Map<anv, aqe<?>> map, aqj aqj, Map<anv, WeakReference<aqk<?>>> map2, apz apz, apx apx, aqu aqu) {
        this.f2082c = ase;
        this.f2086g = new apk(aru);
        this.f2084e = new HashMap();
        this.f2081b = new aqj();
        this.f2080a = new HashMap();
        this.f2083d = new apz(asm, asm2, asm3, this);
        this.f2087h = new apx(this.f2086g);
        this.f2085f = new aqu();
        ase.mo374a((asf) this);
    }

    public <R> aqb m3702a(amk amk, Object obj, anv anv, int i, int i2, Class<?> cls, Class<R> cls2, amq amq, apq apq, Map<Class<?>, aoc<?>> map, boolean z, anz anz, boolean z2, boolean z3, azm azm) {
        aqr a;
        baq.m4685a();
        long a2 = bam.m4675a();
        anv aqi = new aqi(obj, anv, i, i2, map, cls, cls2, anz);
        if (z2) {
            a = this.f2082c.mo371a(aqi);
            if (a == null) {
                a = null;
            } else if (a instanceof aqk) {
                aqk aqk = (aqk) a;
            } else {
                Object aqk2 = new aqk(a, true);
            }
            if (a != null) {
                a.m3740f();
                this.f2084e.put(aqi, new aqd(aqi, a, m3700a()));
            }
        } else {
            a = null;
        }
        if (a != null) {
            azm.mo420a(a, anq.MEMORY_CACHE);
            if (Log.isLoggable("Engine", 2)) {
                apw.m3701a("Loaded resource from cache", a2, aqi);
            }
            return null;
        }
        if (z2) {
            WeakReference weakReference = (WeakReference) this.f2084e.get(aqi);
            if (weakReference != null) {
                aqk = (aqk) weakReference.get();
                if (aqk != null) {
                    aqk.m3740f();
                } else {
                    this.f2084e.remove(aqi);
                }
            } else {
                a = null;
            }
        } else {
            a = null;
        }
        if (a != null) {
            azm.mo420a(a, anq.MEMORY_CACHE);
            if (Log.isLoggable("Engine", 2)) {
                apw.m3701a("Loaded resource from active resources", a2, aqi);
            }
            return null;
        }
        aqe aqe = (aqe) this.f2080a.get(aqi);
        if (aqe != null) {
            aqe.m3724a(azm);
            if (Log.isLoggable("Engine", 2)) {
                apw.m3701a("Added to existing load", a2, aqi);
            }
            return new aqb(azm, aqe);
        }
        api a3 = this.f2083d.m3711a(aqi, z2, z3);
        apg a4 = this.f2087h.m3707a(amk, obj, aqi, anv, i, i2, cls, cls2, amq, apq, map, z, anz, a3);
        this.f2080a.put(aqi, a3);
        a3.m3724a(azm);
        a3.m3726b(a4);
        if (Log.isLoggable("Engine", 2)) {
            apw.m3701a("Started new load", a2, aqi);
        }
        return new aqb(azm, a3);
    }

    private static void m3701a(String str, long j, anv anv) {
        double a = bam.m4674a(j);
        String valueOf = String.valueOf(anv);
        new StringBuilder((String.valueOf(str).length() + 37) + String.valueOf(valueOf).length()).append(str).append(" in ").append(a).append("ms, key: ").append(valueOf);
    }

    public void mo337a(anv anv, aqk<?> aqk_) {
        baq.m4685a();
        if (aqk_ != null) {
            aqk_.m3734a(anv, this);
            if (aqk_.m3735a()) {
                this.f2084e.put(anv, new aqd(anv, aqk_, m3700a()));
            }
        }
        this.f2080a.remove(anv);
    }

    public void mo338a(aqe aqe, anv anv) {
        baq.m4685a();
        if (aqe.equals((aqe) this.f2080a.get(anv))) {
            this.f2080a.remove(anv);
        }
    }

    public void mo339a(aqr<?> aqr_) {
        baq.m4685a();
        this.f2085f.m3766a(aqr_);
    }

    public void mo340b(anv anv, aqk aqk) {
        baq.m4685a();
        this.f2084e.remove(anv);
        if (aqk.m3735a()) {
            this.f2082c.mo372a(anv, aqk);
        } else {
            this.f2085f.m3766a(aqk);
        }
    }

    private ReferenceQueue<aqk<?>> m3700a() {
        if (this.f2088i == null) {
            this.f2088i = new ReferenceQueue();
            Looper.myQueue().addIdleHandler(new aqc(this.f2084e, this.f2088i));
        }
        return this.f2088i;
    }
}
