package p000;

public class aiw<K, V> {
    private final lo<K, aix<V>> f971a = new lo();

    protected aiw() {
    }

    public boolean mo227a(K k, V v) {
        if (this.f971a.size() >= 500 || k == null) {
            return false;
        }
        aix aix = new aix();
        aix.f973b = v;
        this.f971a.put(k, aix);
        return true;
    }

    public V m2578a(K k) {
        if (k != null) {
            aix aix = (aix) this.f971a.get(k);
            if (aix != null) {
                aix.f972a++;
                return aix.f973b;
            }
        }
        return null;
    }

    public V mo228b(K k) {
        aix aix = (aix) this.f971a.remove(k);
        return aix != null ? aix.f973b : null;
    }

    public void mo226a() {
        this.f971a.clear();
    }
}
