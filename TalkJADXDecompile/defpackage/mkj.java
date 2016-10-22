package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: mkj */
final class mkj<K, V> extends mku<K> {
    private final mjx<K, V> a;

    public /* synthetic */ Iterator iterator() {
        return a();
    }

    mkj(mjx<K, V> mjx_K__V) {
        this.a = mjx_K__V;
    }

    public int size() {
        return this.a.size();
    }

    public mny<K> a() {
        return this.a.W_();
    }

    public boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    K a(int i) {
        return ((Entry) this.a.e().f().get(i)).getKey();
    }

    boolean e() {
        return true;
    }

    Object writeReplace() {
        return new mkk(this.a);
    }
}
