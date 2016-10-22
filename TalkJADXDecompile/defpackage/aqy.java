package defpackage;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: aqy */
public class aqy {
    final arg<arj, Object> a;
    final ark b;
    final Map<Class<?>, NavigableMap<Integer, Integer>> c;
    final Map<Class<?>, aqx<?>> d;
    final int e;
    int f;

    public synchronized <T> void a(T t, Class<T> cls) {
        aqx b = b((Class) cls);
        int a = b.a((Object) t);
        int b2 = a * b.b();
        if (b(b2)) {
            arj a2 = this.b.a(a, cls);
            this.a.a(a2, t);
            NavigableMap a3 = a((Class) cls);
            Integer num = (Integer) a3.get(Integer.valueOf(a2.a));
            a3.put(Integer.valueOf(a2.a), Integer.valueOf(num == null ? 1 : num.intValue() + 1));
            this.f += b2;
            c();
        }
    }

    public <T> T a(int i, Class<T> cls) {
        aqx b = b((Class) cls);
        synchronized (this) {
            arj a;
            Integer num = (Integer) a((Class) cls).ceilingKey(Integer.valueOf(i));
            if (a(i, num)) {
                a = this.b.a(num.intValue(), cls);
            } else {
                a = this.b.a(i, cls);
            }
            Object a2 = a(a);
            if (a2 != null) {
                this.f -= b.a(a2) * b.b();
                b(b.a(a2), cls);
            }
        }
        if (a2 != null) {
            b.b(a2);
            return a2;
        }
        if (Log.isLoggable(b.a(), 2)) {
            new StringBuilder(27).append("Allocated ").append(i).append(" bytes");
        }
        return b.a(i);
    }

    public synchronized void a() {
        c(0);
    }

    public synchronized void a(int i) {
        if (i >= 40) {
            a();
        } else if (i >= 20) {
            c(this.e / 2);
        }
    }

    public aqy() {
        this.a = new arg();
        this.b = new ark();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = 4194304;
    }

    public aqy(int i) {
        this.a = new arg();
        this.b = new ark();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = i;
    }

    <T> T a(arj arj) {
        return this.a.a((aro) arj);
    }

    boolean b(int i) {
        return i <= this.e / 2;
    }

    boolean a(int i, Integer num) {
        return num != null && (b() || num.intValue() <= i * 8);
    }

    boolean b() {
        return this.f == 0 || this.e / this.f >= 2;
    }

    void c() {
        c(this.e);
    }

    void c(int i) {
        while (this.f > i) {
            Object a = this.a.a();
            gwb.I(a);
            aqx a2 = a(a);
            this.f -= a2.a(a) * a2.b();
            b(a2.a(a), a.getClass());
            if (Log.isLoggable(a2.a(), 2)) {
                new StringBuilder(20).append("evicted: ").append(a2.a(a));
            }
        }
    }

    void b(int i, Class<?> cls) {
        NavigableMap a = a((Class) cls);
        Integer num = (Integer) a.get(Integer.valueOf(i));
        if (num == null) {
            String valueOf = String.valueOf(this);
            throw new NullPointerException(new StringBuilder(String.valueOf(valueOf).length() + 56).append("Tried to decrement empty size, size: ").append(i).append(", this: ").append(valueOf).toString());
        } else if (num.intValue() == 1) {
            a.remove(Integer.valueOf(i));
        } else {
            a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    NavigableMap<Integer, Integer> a(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        NavigableMap treeMap = new TreeMap();
        this.c.put(cls, treeMap);
        return treeMap;
    }

    <T> aqx<T> a(T t) {
        return b(t.getClass());
    }

    <T> aqx<T> b(Class<T> cls) {
        aqx<T> aqx_T = (aqx) this.d.get(cls);
        if (aqx_T == null) {
            if (cls.equals(int[].class)) {
                aqx_T = new ari();
            } else if (cls.equals(byte[].class)) {
                aqx_T = new arf();
            } else {
                String str = "No array pool found for: ";
                String valueOf = String.valueOf(cls.getSimpleName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
            this.d.put(cls, aqx_T);
        }
        return aqx_T;
    }
}
