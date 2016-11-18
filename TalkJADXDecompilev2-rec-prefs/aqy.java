package p000;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class aqy {
    final arg<arj, Object> f2186a;
    final ark f2187b;
    final Map<Class<?>, NavigableMap<Integer, Integer>> f2188c;
    final Map<Class<?>, aqx<?>> f2189d;
    final int f2190e;
    int f2191f;

    public synchronized <T> void m3785a(T t, Class<T> cls) {
        aqx b = m3787b((Class) cls);
        int a = b.mo363a((Object) t);
        int b2 = a * b.mo366b();
        if (m3790b(b2)) {
            arj a2 = this.f2187b.m3857a(a, cls);
            this.f2186a.m3845a(a2, t);
            NavigableMap a3 = m3782a((Class) cls);
            Integer num = (Integer) a3.get(Integer.valueOf(a2.f2216a));
            a3.put(Integer.valueOf(a2.f2216a), Integer.valueOf(num == null ? 1 : num.intValue() + 1));
            this.f2191f += b2;
            m3791c();
        }
    }

    public <T> T m3780a(int i, Class<T> cls) {
        aqx b = m3787b((Class) cls);
        synchronized (this) {
            arj a;
            Integer num = (Integer) m3782a((Class) cls).ceilingKey(Integer.valueOf(i));
            if (m3786a(i, num)) {
                a = this.f2187b.m3857a(num.intValue(), cls);
            } else {
                a = this.f2187b.m3857a(i, cls);
            }
            Object a2 = m3781a(a);
            if (a2 != null) {
                this.f2191f -= b.mo363a(a2) * b.mo366b();
                m3788b(b.mo363a(a2), cls);
            }
        }
        if (a2 != null) {
            b.mo367b(a2);
            return a2;
        }
        if (Log.isLoggable(b.mo365a(), 2)) {
            new StringBuilder(27).append("Allocated ").append(i).append(" bytes");
        }
        return b.mo364a(i);
    }

    public synchronized void m3783a() {
        m3792c(0);
    }

    public synchronized void m3784a(int i) {
        if (i >= 40) {
            m3783a();
        } else if (i >= 20) {
            m3792c(this.f2190e / 2);
        }
    }

    public aqy() {
        this.f2186a = new arg();
        this.f2187b = new ark();
        this.f2188c = new HashMap();
        this.f2189d = new HashMap();
        this.f2190e = 4194304;
    }

    public aqy(int i) {
        this.f2186a = new arg();
        this.f2187b = new ark();
        this.f2188c = new HashMap();
        this.f2189d = new HashMap();
        this.f2190e = i;
    }

    <T> T m3781a(arj arj) {
        return this.f2186a.m3844a((aro) arj);
    }

    boolean m3790b(int i) {
        return i <= this.f2190e / 2;
    }

    boolean m3786a(int i, Integer num) {
        return num != null && (m3789b() || num.intValue() <= i * 8);
    }

    boolean m3789b() {
        return this.f2191f == 0 || this.f2190e / this.f2191f >= 2;
    }

    void m3791c() {
        m3792c(this.f2190e);
    }

    void m3792c(int i) {
        while (this.f2191f > i) {
            Object a = this.f2186a.m3843a();
            gwb.m1404I(a);
            aqx a2 = m3779a(a);
            this.f2191f -= a2.mo363a(a) * a2.mo366b();
            m3788b(a2.mo363a(a), a.getClass());
            if (Log.isLoggable(a2.mo365a(), 2)) {
                new StringBuilder(20).append("evicted: ").append(a2.mo363a(a));
            }
        }
    }

    void m3788b(int i, Class<?> cls) {
        NavigableMap a = m3782a((Class) cls);
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

    NavigableMap<Integer, Integer> m3782a(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f2188c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        NavigableMap treeMap = new TreeMap();
        this.f2188c.put(cls, treeMap);
        return treeMap;
    }

    <T> aqx<T> m3779a(T t) {
        return m3787b(t.getClass());
    }

    <T> aqx<T> m3787b(Class<T> cls) {
        aqx<T> aqx_T = (aqx) this.f2189d.get(cls);
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
            this.f2189d.put(cls, aqx_T);
        }
        return aqx_T;
    }
}
