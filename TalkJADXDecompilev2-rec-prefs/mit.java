package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

abstract class mit<K, V> extends mic<K, V> implements mmc<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    abstract Set<V> mo3829a();

    public /* synthetic */ Collection mo3780b(Object obj) {
        return mo3830a(obj);
    }

    /* synthetic */ Collection mo3785c() {
        return mo3829a();
    }

    protected mit(Map<K, Collection<V>> map) {
        super(map);
    }

    public Set<V> mo3830a(K k) {
        return (Set) super.mo3780b((Object) k);
    }

    public Map<K, Collection<V>> mo3777b() {
        return super.mo3777b();
    }

    public boolean mo3776a(K k, V v) {
        return super.mo3776a((Object) k, (Object) v);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
