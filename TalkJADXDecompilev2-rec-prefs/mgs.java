package p000;

import com.google.common.cache.LocalCache;
import com.google.common.cache.LocalCache.ReferenceEntry;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.TimeUnit;

public final class mgs<K, V> implements mhi<K, V> {
    volatile mhi<K, V> f27684a;
    final mtt<V> f27685b;
    final mft f27686c;

    public mgs(mhi<K, V> mhi_K__V) {
        this.f27685b = new mtt();
        this.f27686c = new mft();
        this.f27684a = mhi_K__V;
    }

    public boolean mo3750c() {
        return true;
    }

    public boolean mo3751d() {
        return this.f27684a.mo3751d();
    }

    public int mo3746a() {
        return this.f27684a.mo3746a();
    }

    public boolean m32061b(V v) {
        return this.f27685b.mo3943b(v);
    }

    public boolean m32059a(Throwable th) {
        return this.f27685b.mo3941a(th);
    }

    public void mo3748a(V v) {
        if (v != null) {
            m32061b(v);
        } else {
            this.f27684a = LocalCache.f8695r;
        }
    }

    public mti<V> m32057a(K k, u uVar) {
        mti<V> mti_V;
        try {
            this.f27686c.m32006a();
            Object obj = this.f27684a.get();
            if (obj == null) {
                obj = uVar.k();
                if (m32061b(obj)) {
                    return this.f27685b;
                }
                return msy.m32868T(obj);
            }
            mti b = uVar.b(k, obj);
            if (b == null) {
                return msy.m32868T(null);
            }
            return msy.m32870a(b, new mgt(this));
        } catch (Throwable th) {
            Throwable th2 = th;
            if (m32059a(th2)) {
                mti_V = this.f27685b;
            } else {
                mti_V = msy.m32873b(th2);
            }
            if (!(th2 instanceof InterruptedException)) {
                return mti_V;
            }
            Thread.currentThread().interrupt();
            return mti_V;
        }
    }

    public long m32064e() {
        return this.f27686c.m32005a(TimeUnit.NANOSECONDS);
    }

    public V get() {
        return this.f27684a.get();
    }

    public mhi<K, V> m32065f() {
        return this.f27684a;
    }

    public ReferenceEntry<K, V> mo3749b() {
        return null;
    }

    public mhi<K, V> mo3747a(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
        return this;
    }

    public mgs() {
        this(LocalCache.f8695r);
    }
}
