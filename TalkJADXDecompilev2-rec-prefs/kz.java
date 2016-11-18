package p000;

import java.util.Map;

final class kz extends le<K, V> {
    final /* synthetic */ ky f24140a;

    kz(ky kyVar) {
        this.f24140a = kyVar;
    }

    protected int mo3681a() {
        return this.f24140a.h;
    }

    protected Object mo3683a(int i, int i2) {
        return this.f24140a.g[(i << 1) + i2];
    }

    protected int mo3682a(Object obj) {
        return this.f24140a.m28011a(obj);
    }

    protected int mo3687b(Object obj) {
        return this.f24140a.m28016b(obj);
    }

    protected Map<K, V> mo3688b() {
        return this.f24140a;
    }

    protected void mo3686a(K k, V v) {
        this.f24140a.put(k, v);
    }

    protected V mo3684a(int i, V v) {
        return this.f24140a.m28013a(i, (Object) v);
    }

    protected void mo3685a(int i) {
        this.f24140a.m28019d(i);
    }

    protected void mo3689c() {
        this.f24140a.clear();
    }
}
