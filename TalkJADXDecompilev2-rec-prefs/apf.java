package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class apf<Transcode> {
    private final List<aui<?>> f2001a = new ArrayList();
    private final List<anv> f2002b = new ArrayList();
    private amk f2003c;
    private Object f2004d;
    private int f2005e;
    private int f2006f;
    private Class<?> f2007g;
    private apk f2008h;
    private anz f2009i;
    private Map<Class<?>, aoc<?>> f2010j;
    private Class<Transcode> f2011k;
    private boolean f2012l;
    private boolean f2013m;
    private anv f2014n;
    private amq f2015o;
    private apq f2016p;
    private boolean f2017q;

    apf() {
    }

    <R> apf<R> m3616a(amk amk, Object obj, anv anv, int i, int i2, apq apq, Class<?> cls, Class<R> cls2, amq amq, anz anz, Map<Class<?>, aoc<?>> map, boolean z, apk apk) {
        this.f2003c = amk;
        this.f2004d = obj;
        this.f2014n = anv;
        this.f2005e = i;
        this.f2006f = i2;
        this.f2016p = apq;
        this.f2007g = cls;
        this.f2008h = apk;
        this.f2011k = cls2;
        this.f2015o = amq;
        this.f2009i = anz;
        this.f2010j = map;
        this.f2017q = z;
        return this;
    }

    void m3618a() {
        this.f2003c = null;
        this.f2004d = null;
        this.f2014n = null;
        this.f2007g = null;
        this.f2011k = null;
        this.f2009i = null;
        this.f2015o = null;
        this.f2010j = null;
        this.f2016p = null;
        this.f2001a.clear();
        this.f2012l = false;
        this.f2002b.clear();
        this.f2013m = false;
    }

    art m3624b() {
        return this.f2008h.m3661a();
    }

    apq m3626c() {
        return this.f2016p;
    }

    amq m3627d() {
        return this.f2015o;
    }

    anz m3628e() {
        return this.f2009i;
    }

    anv m3629f() {
        return this.f2014n;
    }

    int m3630g() {
        return this.f2005e;
    }

    int m3631h() {
        return this.f2006f;
    }

    List<Class<?>> m3632i() {
        return this.f2003c.m2917c().m2954b(this.f2004d.getClass(), this.f2007g, this.f2011k);
    }

    boolean m3621a(Class<?> cls) {
        return m3623b((Class) cls) != null;
    }

    <Data> aqo<Data, ?, Transcode> m3623b(Class<Data> cls) {
        return this.f2003c.m2917c().m2948a((Class) cls, this.f2007g, this.f2011k);
    }

    <Z> aoc<Z> m3625c(Class<Z> cls) {
        aoc<Z> aoc_Z = (aoc) this.f2010j.get(cls);
        if (aoc_Z != null) {
            return aoc_Z;
        }
        if (!this.f2010j.isEmpty() || !this.f2017q) {
            return (avu) avu.f2407b;
        }
        String valueOf = String.valueOf(cls);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 115).append("Missing transformation for ").append(valueOf).append(". If you wish to ignore unknown resource types, use the optional transformation methods.").toString());
    }

    boolean m3620a(aqr<?> aqr_) {
        return this.f2003c.m2917c().m2949a((aqr) aqr_);
    }

    <Z> aob<Z> m3622b(aqr<Z> aqr_Z) {
        return this.f2003c.m2917c().m2952b((aqr) aqr_Z);
    }

    List<auh<File, ?>> m3617a(File file) {
        return this.f2003c.m2917c().m2956c(file);
    }

    boolean m3619a(anv anv) {
        List j = m3633j();
        int size = j.size();
        for (int i = 0; i < size; i++) {
            if (((aui) j.get(i)).f2356a.equals(anv)) {
                return true;
            }
        }
        return false;
    }

    List<aui<?>> m3633j() {
        if (!this.f2012l) {
            this.f2012l = true;
            this.f2001a.clear();
            List c = this.f2003c.m2917c().m2956c(this.f2004d);
            int size = c.size();
            for (int i = 0; i < size; i++) {
                aui a = ((auh) c.get(i)).mo377a(this.f2004d, this.f2005e, this.f2006f, this.f2009i);
                if (a != null) {
                    this.f2001a.add(a);
                }
            }
        }
        return this.f2001a;
    }

    List<anv> m3634k() {
        if (!this.f2013m) {
            this.f2013m = true;
            this.f2002b.clear();
            List j = m3633j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                aui aui = (aui) j.get(i);
                this.f2002b.add(aui.f2356a);
                this.f2002b.addAll(aui.f2357b);
            }
        }
        return this.f2002b;
    }

    <X> ant<X> m3615a(X x) {
        return this.f2003c.m2917c().m2947a((Object) x);
    }
}
