package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class mkp<K, V> extends mis<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final transient mjx<K, ? extends mjk<V>> f27813b;
    final transient int f27814c;

    public abstract mjk<V> mo3828d(K k);

    public /* synthetic */ Collection mo3780b(Object obj) {
        return mo3828d(obj);
    }

    public /* synthetic */ Map mo3777b() {
        return m32294d();
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean mo3778j() {
        return super.mo3778j();
    }

    public /* synthetic */ Set mo3779k() {
        return m32291c();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    mkp(mjx<K, ? extends mjk<V>> mjx_K___extends_mjk_V, int i) {
        this.f27813b = mjx_K___extends_mjk_V;
        this.f27814c = i;
    }

    @Deprecated
    public boolean mo3776a(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public boolean mo3775a(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    boolean m32286a() {
        return this.f27813b.mo3850d();
    }

    public boolean mo3781c(Object obj) {
        return this.f27813b.containsKey(obj);
    }

    public int mo3782f() {
        return this.f27814c;
    }

    public mks<K> m32291c() {
        return this.f27813b.mo3874g();
    }

    public mjx<K, Collection<V>> m32294d() {
        return this.f27813b;
    }

    Map<K, Collection<V>> mo3784i() {
        throw new AssertionError("should never be called");
    }
}
