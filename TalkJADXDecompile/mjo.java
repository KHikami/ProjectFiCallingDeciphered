import java.util.EnumMap;
import java.util.Map.Entry;

final class mjo<K extends Enum<K>, V> extends mka<K, V> {
    private final transient EnumMap<K, V> b;

    mjo(EnumMap<K, V> enumMap) {
        this.b = enumMap;
        bm.a(!enumMap.isEmpty());
    }

    mny<K> W_() {
        return mlj.a(this.b.keySet().iterator());
    }

    public int size() {
        return this.b.size();
    }

    public boolean containsKey(Object obj) {
        return this.b.containsKey(obj);
    }

    public V get(Object obj) {
        return this.b.get(obj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mjo) {
            obj = ((mjo) obj).b;
        }
        return this.b.equals(obj);
    }

    mny<Entry<K, V>> b() {
        return mls.c(this.b.entrySet().iterator());
    }

    boolean d() {
        return false;
    }

    Object writeReplace() {
        return new mjp(this.b);
    }
}
