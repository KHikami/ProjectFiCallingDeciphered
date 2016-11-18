package p000;

import java.util.Collection;
import java.util.Map;

public abstract class mjh<K, V> extends mjx<K, V> implements Map<K, V> {
    public abstract mjh<V, K> mo3889a();

    public /* synthetic */ mjk mo3833c() {
        return m32340b();
    }

    public /* synthetic */ Collection values() {
        return m32340b();
    }

    public static <K, V> mjh<K, V> m32338a(K k, V v) {
        return new mni(k, v);
    }

    mjh() {
    }

    public mks<V> m32340b() {
        return mo3889a().mo3874g();
    }

    Object writeReplace() {
        return new mjj(this);
    }
}
