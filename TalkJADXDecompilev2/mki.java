package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

final class mki<K, V> extends mkg<K, V> {
    private final transient mjx<K, V> a;
    private final transient Entry<K, V>[] b;

    public /* synthetic */ Iterator iterator() {
        return a();
    }

    mki(mjx<K, V> mjx_K__V, Entry<K, V>[] entryArr) {
        this.a = mjx_K__V;
        this.b = entryArr;
    }

    mjx<K, V> b() {
        return this.a;
    }

    public mny<Entry<K, V>> a() {
        return f().a();
    }

    mjq<Entry<K, V>> d() {
        return new mmu((mjk) this, this.b);
    }
}
