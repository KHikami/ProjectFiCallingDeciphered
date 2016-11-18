package p000;

import java.util.Comparator;

public final class mlc<K, V> extends mjz<K, V> {
    private final Comparator<? super K> f27877e;

    public /* synthetic */ mjx mo3836a() {
        return m32444b();
    }

    public /* synthetic */ mjz mo3837a(Object obj, Object obj2) {
        return m32445b(obj, obj2);
    }

    public mlc(Comparator<? super K> comparator) {
        this.f27877e = (Comparator) bm.m6122a((Object) comparator);
    }

    private mlc<K, V> m32445b(K k, V v) {
        super.mo3837a(k, v);
        return this;
    }

    private mkz<K, V> m32444b() {
        switch (this.c) {
            case 0:
                return mkz.m32423a(this.f27877e);
            case 1:
                return mkz.m32424a(this.f27877e, this.b[0].getKey(), this.b[0].getValue());
            default:
                return mkz.m32425a(this.f27877e, false, this.b, this.c);
        }
    }
}
