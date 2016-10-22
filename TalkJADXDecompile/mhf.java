import com.google.common.cache.LocalCache.ReferenceEntry;
import java.lang.ref.ReferenceQueue;

public class mhf<K, V> implements mhi<K, V> {
    final V a;

    mhf(V v) {
        this.a = v;
    }

    public V get() {
        return this.a;
    }

    public int a() {
        return 1;
    }

    public ReferenceEntry<K, V> b() {
        return null;
    }

    public mhi<K, V> a(ReferenceQueue<V> referenceQueue, V v, ReferenceEntry<K, V> referenceEntry) {
        return this;
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return true;
    }

    public void a(V v) {
    }
}
