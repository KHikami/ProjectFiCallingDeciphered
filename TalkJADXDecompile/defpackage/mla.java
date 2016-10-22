package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: mla */
final class mla extends mkg<K, V> {
    final /* synthetic */ mkz a;

    public /* synthetic */ Iterator iterator() {
        return a();
    }

    mla(mkz mkz) {
        this.a = mkz;
    }

    public mny<Entry<K, V>> a() {
        return f().a();
    }

    mjq<Entry<K, V>> d() {
        return new mlb(this);
    }

    mjx<K, V> b() {
        return this.a;
    }
}
