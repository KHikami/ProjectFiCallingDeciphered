package p000;

import java.util.Iterator;
import java.util.Map.Entry;

final class mkj<K, V> extends mku<K> {
    private final mjx<K, V> f27851a;

    public /* synthetic */ Iterator iterator() {
        return mo3806a();
    }

    mkj(mjx<K, V> mjx_K__V) {
        this.f27851a = mjx_K__V;
    }

    public int size() {
        return this.f27851a.size();
    }

    public mny<K> mo3806a() {
        return this.f27851a.W_();
    }

    public boolean contains(Object obj) {
        return this.f27851a.containsKey(obj);
    }

    K mo3869a(int i) {
        return ((Entry) this.f27851a.mo3873e().mo3807f().get(i)).getKey();
    }

    boolean mo3822e() {
        return true;
    }

    Object writeReplace() {
        return new mkk(this.f27851a);
    }
}
