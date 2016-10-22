import com.google.api.client.http.HttpStatusCodes;

public class aiw<K, V> {
    private final lo<K, aix<V>> a;

    protected aiw() {
        this.a = new lo();
    }

    public boolean a(K k, V v) {
        if (this.a.size() >= HttpStatusCodes.STATUS_CODE_SERVER_ERROR || k == null) {
            return false;
        }
        aix aix = new aix();
        aix.b = v;
        this.a.put(k, aix);
        return true;
    }

    public V a(K k) {
        if (k != null) {
            aix aix = (aix) this.a.get(k);
            if (aix != null) {
                aix.a++;
                return aix.b;
            }
        }
        return null;
    }

    public V b(K k) {
        aix aix = (aix) this.a.remove(k);
        return aix != null ? aix.b : null;
    }

    public void a() {
        this.a.clear();
    }
}
