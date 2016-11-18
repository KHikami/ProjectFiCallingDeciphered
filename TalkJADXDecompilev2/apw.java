package defpackage;

import android.os.Looper;
import android.util.Log;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class apw implements aqh, aql, asf {
    private final Map<anv, aqe<?>> a;
    private final aqj b;
    private final ase c;
    private final apz d;
    private final Map<anv, WeakReference<aqk<?>>> e;
    private final aqu f;
    private final apk g;
    private final apx h;
    private ReferenceQueue<aqk<?>> i;

    public apw(ase ase, aru aru, asm asm, asm asm2, asm asm3) {
        this(ase, aru, asm, asm2, asm3, null, null, null, null, null, null);
    }

    private apw(ase ase, aru aru, asm asm, asm asm2, asm asm3, Map<anv, aqe<?>> map, aqj aqj, Map<anv, WeakReference<aqk<?>>> map2, apz apz, apx apx, aqu aqu) {
        this.c = ase;
        this.g = new apk(aru);
        this.e = new HashMap();
        this.b = new aqj();
        this.a = new HashMap();
        this.d = new apz(asm, asm2, asm3, this);
        this.h = new apx(this.g);
        this.f = new aqu();
        ase.a((asf) this);
    }

    public <R> aqb a(amk amk, Object obj, anv anv, int i, int i2, Class<?> cls, Class<R> cls2, amq amq, apq apq, Map<Class<?>, aoc<?>> map, boolean z, anz anz, boolean z2, boolean z3, azm azm) {
        aqr a;
        baq.a();
        long a2 = bam.a();
        anv aqi = new aqi(obj, anv, i, i2, map, cls, cls2, anz);
        if (z2) {
            a = this.c.a(aqi);
            if (a == null) {
                a = null;
            } else if (a instanceof aqk) {
                aqk aqk = (aqk) a;
            } else {
                Object aqk2 = new aqk(a, true);
            }
            if (a != null) {
                a.f();
                this.e.put(aqi, new aqd(aqi, a, a()));
            }
        } else {
            a = null;
        }
        if (a != null) {
            azm.a(a, anq.MEMORY_CACHE);
            if (Log.isLoggable("Engine", 2)) {
                apw.a("Loaded resource from cache", a2, aqi);
            }
            return null;
        }
        if (z2) {
            WeakReference weakReference = (WeakReference) this.e.get(aqi);
            if (weakReference != null) {
                aqk = (aqk) weakReference.get();
                if (aqk != null) {
                    aqk.f();
                } else {
                    this.e.remove(aqi);
                }
            } else {
                a = null;
            }
        } else {
            a = null;
        }
        if (a != null) {
            azm.a(a, anq.MEMORY_CACHE);
            if (Log.isLoggable("Engine", 2)) {
                apw.a("Loaded resource from active resources", a2, aqi);
            }
            return null;
        }
        aqe aqe = (aqe) this.a.get(aqi);
        if (aqe != null) {
            aqe.a(azm);
            if (Log.isLoggable("Engine", 2)) {
                apw.a("Added to existing load", a2, aqi);
            }
            return new aqb(azm, aqe);
        }
        api a3 = this.d.a(aqi, z2, z3);
        apg a4 = this.h.a(amk, obj, aqi, anv, i, i2, cls, cls2, amq, apq, map, z, anz, a3);
        this.a.put(aqi, a3);
        a3.a(azm);
        a3.b(a4);
        if (Log.isLoggable("Engine", 2)) {
            apw.a("Started new load", a2, aqi);
        }
        return new aqb(azm, a3);
    }

    private static void a(String str, long j, anv anv) {
        double a = bam.a(j);
        String valueOf = String.valueOf(anv);
        new StringBuilder((String.valueOf(str).length() + 37) + String.valueOf(valueOf).length()).append(str).append(" in ").append(a).append("ms, key: ").append(valueOf);
    }

    public void a(anv anv, aqk<?> aqk_) {
        baq.a();
        if (aqk_ != null) {
            aqk_.a(anv, this);
            if (aqk_.a()) {
                this.e.put(anv, new aqd(anv, aqk_, a()));
            }
        }
        this.a.remove(anv);
    }

    public void a(aqe aqe, anv anv) {
        baq.a();
        if (aqe.equals((aqe) this.a.get(anv))) {
            this.a.remove(anv);
        }
    }

    public void a(aqr<?> aqr_) {
        baq.a();
        this.f.a(aqr_);
    }

    public void b(anv anv, aqk aqk) {
        baq.a();
        this.e.remove(anv);
        if (aqk.a()) {
            this.c.a(anv, aqk);
        } else {
            this.f.a(aqk);
        }
    }

    private ReferenceQueue<aqk<?>> a() {
        if (this.i == null) {
            this.i = new ReferenceQueue();
            Looper.myQueue().addIdleHandler(new aqc(this.e, this.i));
        }
        return this.i;
    }
}
