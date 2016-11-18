package p000;

import java.util.Iterator;
import java.util.Map.Entry;

final class mki<K, V> extends mkg<K, V> {
    private final transient mjx<K, V> f27849a;
    private final transient Entry<K, V>[] f27850b;

    public /* synthetic */ Iterator iterator() {
        return mo3806a();
    }

    mki(mjx<K, V> mjx_K__V, Entry<K, V>[] entryArr) {
        this.f27849a = mjx_K__V;
        this.f27850b = entryArr;
    }

    mjx<K, V> mo3864b() {
        return this.f27849a;
    }

    public mny<Entry<K, V>> mo3806a() {
        return mo3807f().mo3806a();
    }

    mjq<Entry<K, V>> mo3868d() {
        return new mmu((mjk) this, this.f27850b);
    }
}
