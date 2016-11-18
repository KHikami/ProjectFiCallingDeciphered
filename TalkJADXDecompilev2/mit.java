package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

abstract class mit<K, V> extends mic<K, V> implements mmc<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    abstract Set<V> a();

    public /* synthetic */ Collection b(Object obj) {
        return a(obj);
    }

    /* synthetic */ Collection c() {
        return a();
    }

    protected mit(Map<K, Collection<V>> map) {
        super(map);
    }

    public Set<V> a(K k) {
        return (Set) super.b((Object) k);
    }

    public Map<K, Collection<V>> b() {
        return super.b();
    }

    public boolean a(K k, V v) {
        return super.a((Object) k, (Object) v);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
