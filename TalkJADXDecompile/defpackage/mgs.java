package defpackage;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache.ReferenceEntry;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.TimeUnit;
import u;

/* renamed from: mgs */
public final class mgs<K, V> implements mhi<K, V> {
    volatile mhi<K, V> a;
    final mtt<V> b;
    final mft c;

    public mgs(mhi<K, V> mhi_K__V) {
        this.b = new mtt();
        this.c = new mft();
        this.a = mhi_K__V;
    }

    public boolean c() {
        return true;
    }

    public boolean d() {
        return this.a.d();
    }

    public int a() {
        return this.a.a();
    }

    public boolean b(V v) {
        return this.b.b(v);
    }

    public boolean a(Throwable th) {
        return this.b.a(th);
    }

    public void a(V v) {
        if (v != null) {
            b(v);
        } else {
            this.a = LocalCache.r;
        }
    }

    public mti<V> a(K k, u uVar) {
        mti<V> mti_V;
        try {
            this.c.a();
            Object obj = this.a.get();
            if (obj == null) {
                obj = uVar.k();
                if (b(obj)) {
                    return this.b;
                }
                return msy.T(obj);
            }
            mti b = uVar.b(k, obj);
            if (b == null) {
                return msy.T(null);
            }
            return msy.a(b, new mgt(this));
        } catch (Throwable th) {
            Throwable th2 = th;
            if (a(th2)) {
                mti_V = this.b;
            } else {
                mti_V = msy.b(th2);
            }
            if (!(th2 instanceof InterruptedException)) {
                return mti_V;
            }
            Thread.currentThread().interrupt();
            return mti_V;
        }
    }

    public long e() {
        return this.c.a(TimeUnit.NANOSECONDS);
    }

    public V get() {
        return this.a.get();
    }

    public mhi<K, V> f() {
        return this.a;
    }

    public ReferenceEntry<K, V> b() {
        return null;
    }

    public mhi<K, V> a(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
        return this;
    }

    public mgs() {
        this(LocalCache.r);
    }
}
