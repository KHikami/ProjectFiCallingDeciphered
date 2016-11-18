package p000;

import java.util.Collection;
import java.util.List;
import java.util.Map;

abstract class mib<K, V> extends mic<K, V> implements mmc<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    abstract List<V> mo3885a();

    public /* synthetic */ Collection mo3780b(Object obj) {
        return m32184a(obj);
    }

    /* synthetic */ Collection mo3785c() {
        return mo3885a();
    }

    protected mib(Map<K, Collection<V>> map) {
        super(map);
    }

    public List<V> m32184a(K k) {
        return (List) super.mo3780b((Object) k);
    }

    public boolean mo3776a(K k, V v) {
        return super.mo3776a((Object) k, (Object) v);
    }

    public Map<K, Collection<V>> mo3777b() {
        return super.mo3777b();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
