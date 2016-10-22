import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class cqk {
    public final cqm a;
    public final bwa b;
    public boolean c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    final Map h;
    public final List i;
    private long j;
    private long k;

    private cqk(cqk cqk) {
        this.a = cqk.a;
        this.b = cqk.b;
        this.d = cqk.d;
        this.e = cqk.e;
        this.f = cqk.f;
        this.j = cqk.j;
        this.k = cqk.k;
        this.i = new ArrayList(cqk.i);
        this.h = new HashMap(cqk.h.size());
        for (Entry entry : cqk.h.entrySet()) {
            cql c = c((Class) entry.getKey());
            ((cql) entry.getValue()).a(c);
            this.h.put(entry.getKey(), c);
        }
    }

    cqk(cqm cqm, bwa bwa) {
        buf.A((Object) cqm);
        buf.A((Object) bwa);
        this.a = cqm;
        this.b = bwa;
        this.j = 1800000;
        this.k = 3024000000L;
        this.h = new HashMap();
        this.i = new ArrayList();
    }

    private static cql c(Class cls) {
        try {
            return (cql) cls.newInstance();
        } catch (Throwable e) {
            throw new IllegalArgumentException("dataType doesn't have default constructor", e);
        } catch (Throwable e2) {
            throw new IllegalArgumentException("dataType default constructor is not accessible", e2);
        }
    }

    public final cqk a() {
        return new cqk(this);
    }

    public final cql a(Class cls) {
        return (cql) this.h.get(cls);
    }

    public final void a(cql cql) {
        buf.A((Object) cql);
        Class cls = cql.getClass();
        if (cls.getSuperclass() != cql.class) {
            throw new IllegalArgumentException();
        }
        cql.a(b(cls));
    }

    public final cql b(Class cls) {
        cql cql = (cql) this.h.get(cls);
        if (cql != null) {
            return cql;
        }
        cql = c(cls);
        this.h.put(cls, cql);
        return cql;
    }
}
