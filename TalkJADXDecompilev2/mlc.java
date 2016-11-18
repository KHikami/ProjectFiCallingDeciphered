package defpackage;

import java.util.Comparator;

public final class mlc<K, V> extends mjz<K, V> {
    private final Comparator<? super K> e;

    public /* synthetic */ mjx a() {
        return b();
    }

    public /* synthetic */ mjz a(Object obj, Object obj2) {
        return b(obj, obj2);
    }

    public mlc(Comparator<? super K> comparator) {
        this.e = (Comparator) bm.a((Object) comparator);
    }

    private mlc<K, V> b(K k, V v) {
        super.a(k, v);
        return this;
    }

    private mkz<K, V> b() {
        switch (this.c) {
            case 0:
                return mkz.a(this.e);
            case 1:
                return mkz.a(this.e, this.b[0].getKey(), this.b[0].getValue());
            default:
                return mkz.a(this.e, false, this.b, this.c);
        }
    }
}
