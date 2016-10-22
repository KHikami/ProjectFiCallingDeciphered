import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class mkp<K, V> extends mis<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final transient mjx<K, ? extends mjk<V>> b;
    final transient int c;

    public abstract mjk<V> d(K k);

    public /* synthetic */ Collection b(Object obj) {
        return d(obj);
    }

    public /* synthetic */ Map b() {
        return d();
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    public /* synthetic */ Set k() {
        return c();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    mkp(mjx<K, ? extends mjk<V>> mjx_K___extends_mjk_V, int i) {
        this.b = mjx_K___extends_mjk_V;
        this.c = i;
    }

    @Deprecated
    public boolean a(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public boolean a(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    boolean a() {
        return this.b.d();
    }

    public boolean c(Object obj) {
        return this.b.containsKey(obj);
    }

    public int f() {
        return this.c;
    }

    public mks<K> c() {
        return this.b.g();
    }

    public mjx<K, Collection<V>> d() {
        return this.b;
    }

    Map<K, Collection<V>> i() {
        throw new AssertionError("should never be called");
    }
}
