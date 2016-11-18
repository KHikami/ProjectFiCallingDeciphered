package defpackage;

import java.util.Collection;
import java.util.Map;

public abstract class mmj<K0> {
    abstract <K extends K0, V> Map<K, Collection<V>> a();

    mmj() {
    }

    public mmi<K0, Object> b() {
        return a(2);
    }

    public mmi<K0, Object> a(int i) {
        gwb.d(2, "expectedValuesPerKey");
        return new mmk(this, 2);
    }

    public mmi<K0, Object> c() {
        return new mml(this);
    }
}
