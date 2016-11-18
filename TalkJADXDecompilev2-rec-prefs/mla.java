package p000;

import java.util.Iterator;
import java.util.Map.Entry;

final class mla extends mkg<K, V> {
    final /* synthetic */ mkz f27875a;

    public /* synthetic */ Iterator iterator() {
        return mo3806a();
    }

    mla(mkz mkz) {
        this.f27875a = mkz;
    }

    public mny<Entry<K, V>> mo3806a() {
        return mo3807f().mo3806a();
    }

    mjq<Entry<K, V>> mo3868d() {
        return new mlb(this);
    }

    mjx<K, V> mo3864b() {
        return this.f27875a;
    }
}
