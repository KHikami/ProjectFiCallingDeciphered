package defpackage;

import java.util.Map;

/* renamed from: kz */
final class kz extends le<K, V> {
    final /* synthetic */ ky a;

    kz(ky kyVar) {
        this.a = kyVar;
    }

    protected int a() {
        return this.a.h;
    }

    protected Object a(int i, int i2) {
        return this.a.g[(i << 1) + i2];
    }

    protected int a(Object obj) {
        return this.a.a(obj);
    }

    protected int b(Object obj) {
        return this.a.b(obj);
    }

    protected Map<K, V> b() {
        return this.a;
    }

    protected void a(K k, V v) {
        this.a.put(k, v);
    }

    protected V a(int i, V v) {
        return this.a.a(i, (Object) v);
    }

    protected void a(int i) {
        this.a.d(i);
    }

    protected void c() {
        this.a.clear();
    }
}
