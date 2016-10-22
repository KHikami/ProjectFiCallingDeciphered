import java.util.Iterator;

final class mkl<K, V> extends mjk<V> {
    final mjx<K, V> a;

    public /* synthetic */ Iterator iterator() {
        return a();
    }

    mkl(mjx<K, V> mjx_K__V) {
        this.a = mjx_K__V;
    }

    public int size() {
        return this.a.size();
    }

    public mny<V> a() {
        return new mkm(this);
    }

    public boolean contains(Object obj) {
        return obj != null && mlj.a(a(), obj);
    }

    boolean e() {
        return true;
    }

    public mjq<V> f() {
        return new mkn(this, this.a.e().f());
    }

    Object writeReplace() {
        return new mko(this.a);
    }
}
