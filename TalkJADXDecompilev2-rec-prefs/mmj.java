package p000;

import java.util.Collection;
import java.util.Map;

public abstract class mmj<K0> {
    abstract <K extends K0, V> Map<K, Collection<V>> mo3883a();

    mmj() {
    }

    public mmi<K0, Object> m32500b() {
        return m32499a(2);
    }

    public mmi<K0, Object> m32499a(int i) {
        gwb.m2121d(2, "expectedValuesPerKey");
        return new mmk(this, 2);
    }

    public mmi<K0, Object> m32501c() {
        return new mml(this);
    }
}
