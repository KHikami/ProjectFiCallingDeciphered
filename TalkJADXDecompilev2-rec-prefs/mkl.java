package p000;

import java.util.Iterator;

final class mkl<K, V> extends mjk<V> {
    final mjx<K, V> f27853a;

    public /* synthetic */ Iterator iterator() {
        return mo3806a();
    }

    mkl(mjx<K, V> mjx_K__V) {
        this.f27853a = mjx_K__V;
    }

    public int size() {
        return this.f27853a.size();
    }

    public mny<V> mo3806a() {
        return new mkm(this);
    }

    public boolean contains(Object obj) {
        return obj != null && mlj.m32463a(mo3806a(), obj);
    }

    boolean mo3822e() {
        return true;
    }

    public mjq<V> mo3807f() {
        return new mkn(this, this.f27853a.mo3873e().mo3807f());
    }

    Object writeReplace() {
        return new mko(this.f27853a);
    }
}
