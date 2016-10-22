package defpackage;

import java.util.Collection;
import java.util.Map;

/* renamed from: mjh */
public abstract class mjh<K, V> extends mjx<K, V> implements Map<K, V> {
    public abstract mjh<V, K> a();

    public /* synthetic */ mjk c() {
        return b();
    }

    public /* synthetic */ Collection values() {
        return b();
    }

    public static <K, V> mjh<K, V> a(K k, V v) {
        return new mni(k, v);
    }

    mjh() {
    }

    public mks<V> b() {
        return a().g();
    }

    Object writeReplace() {
        return new mjj(this);
    }
}
