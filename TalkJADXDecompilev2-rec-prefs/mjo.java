package p000;

import java.util.EnumMap;
import java.util.Map.Entry;

final class mjo<K extends Enum<K>, V> extends mka<K, V> {
    private final transient EnumMap<K, V> f27835b;

    mjo(EnumMap<K, V> enumMap) {
        this.f27835b = enumMap;
        bm.m6137a(!enumMap.isEmpty());
    }

    mny<K> W_() {
        return mlj.m32459a(this.f27835b.keySet().iterator());
    }

    public int size() {
        return this.f27835b.size();
    }

    public boolean containsKey(Object obj) {
        return this.f27835b.containsKey(obj);
    }

    public V get(Object obj) {
        return this.f27835b.get(obj);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mjo) {
            obj = ((mjo) obj).f27835b;
        }
        return this.f27835b.equals(obj);
    }

    mny<Entry<K, V>> mo3848b() {
        return mls.m32491c(this.f27835b.entrySet().iterator());
    }

    boolean mo3850d() {
        return false;
    }

    Object writeReplace() {
        return new mjp(this.f27835b);
    }
}
