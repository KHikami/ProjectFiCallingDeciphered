import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class apf<Transcode> {
    private final List<aui<?>> a;
    private final List<anv> b;
    private amk c;
    private Object d;
    private int e;
    private int f;
    private Class<?> g;
    private apk h;
    private anz i;
    private Map<Class<?>, aoc<?>> j;
    private Class<Transcode> k;
    private boolean l;
    private boolean m;
    private anv n;
    private amq o;
    private apq p;
    private boolean q;

    apf() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    <R> apf<R> a(amk amk, Object obj, anv anv, int i, int i2, apq apq, Class<?> cls, Class<R> cls2, amq amq, anz anz, Map<Class<?>, aoc<?>> map, boolean z, apk apk) {
        this.c = amk;
        this.d = obj;
        this.n = anv;
        this.e = i;
        this.f = i2;
        this.p = apq;
        this.g = cls;
        this.h = apk;
        this.k = cls2;
        this.o = amq;
        this.i = anz;
        this.j = map;
        this.q = z;
        return this;
    }

    void a() {
        this.c = null;
        this.d = null;
        this.n = null;
        this.g = null;
        this.k = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.p = null;
        this.a.clear();
        this.l = false;
        this.b.clear();
        this.m = false;
    }

    art b() {
        return this.h.a();
    }

    apq c() {
        return this.p;
    }

    amq d() {
        return this.o;
    }

    anz e() {
        return this.i;
    }

    anv f() {
        return this.n;
    }

    int g() {
        return this.e;
    }

    int h() {
        return this.f;
    }

    List<Class<?>> i() {
        return this.c.c().b(this.d.getClass(), this.g, this.k);
    }

    boolean a(Class<?> cls) {
        return b((Class) cls) != null;
    }

    <Data> aqo<Data, ?, Transcode> b(Class<Data> cls) {
        return this.c.c().a((Class) cls, this.g, this.k);
    }

    <Z> aoc<Z> c(Class<Z> cls) {
        aoc<Z> aoc_Z = (aoc) this.j.get(cls);
        if (aoc_Z != null) {
            return aoc_Z;
        }
        if (!this.j.isEmpty() || !this.q) {
            return (avu) avu.b;
        }
        String valueOf = String.valueOf(cls);
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 115).append("Missing transformation for ").append(valueOf).append(". If you wish to ignore unknown resource types, use the optional transformation methods.").toString());
    }

    boolean a(aqr<?> aqr_) {
        return this.c.c().a((aqr) aqr_);
    }

    <Z> aob<Z> b(aqr<Z> aqr_Z) {
        return this.c.c().b((aqr) aqr_Z);
    }

    List<auh<File, ?>> a(File file) {
        return this.c.c().c(file);
    }

    boolean a(anv anv) {
        List j = j();
        int size = j.size();
        for (int i = 0; i < size; i++) {
            if (((aui) j.get(i)).a.equals(anv)) {
                return true;
            }
        }
        return false;
    }

    List<aui<?>> j() {
        if (!this.l) {
            this.l = true;
            this.a.clear();
            List c = this.c.c().c(this.d);
            int size = c.size();
            for (int i = 0; i < size; i++) {
                aui a = ((auh) c.get(i)).a(this.d, this.e, this.f, this.i);
                if (a != null) {
                    this.a.add(a);
                }
            }
        }
        return this.a;
    }

    List<anv> k() {
        if (!this.m) {
            this.m = true;
            this.b.clear();
            List j = j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                aui aui = (aui) j.get(i);
                this.b.add(aui.a);
                this.b.addAll(aui.b);
            }
        }
        return this.b;
    }

    <X> ant<X> a(X x) {
        return this.c.c().a((Object) x);
    }
}
