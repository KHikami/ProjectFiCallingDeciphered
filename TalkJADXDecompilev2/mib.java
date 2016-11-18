package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;

abstract class mib<K, V> extends mic<K, V> implements mmc<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    abstract List<V> a();

    public /* synthetic */ Collection b(Object obj) {
        return a(obj);
    }

    /* synthetic */ Collection c() {
        return a();
    }

    protected mib(Map<K, Collection<V>> map) {
        super(map);
    }

    public List<V> a(K k) {
        return (List) super.b((Object) k);
    }

    public boolean a(K k, V v) {
        return super.a((Object) k, (Object) v);
    }

    public Map<K, Collection<V>> b() {
        return super.b();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
