import java.util.AbstractMap.SimpleImmutableEntry;

public final class mhz<K, V> extends SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;
    private final mht a;

    mhz(K k, V v, mht mht) {
        super(k, v);
        this.a = (mht) bm.a((Object) mht);
    }
}
