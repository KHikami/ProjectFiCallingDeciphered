package p000;

import java.util.Arrays;

public final class mji<K, V> extends mjz<K, V> {
    public /* synthetic */ mjx mo3836a() {
        return m32344b();
    }

    public /* synthetic */ mjz mo3837a(Object obj, Object obj2) {
        return m32345b(obj, obj2);
    }

    private mji<K, V> m32345b(K k, V v) {
        super.mo3837a(k, v);
        return this;
    }

    private mjh<K, V> m32344b() {
        switch (this.c) {
            case 0:
                return mmv.f27916b;
            case 1:
                return mjh.m32338a(this.b[0].getKey(), this.b[0].getValue());
            default:
                if (this.a != null) {
                    if (this.d) {
                        this.b = (mkd[]) mmr.m32523a(this.b, this.c);
                    }
                    Arrays.sort(this.b, 0, this.c, mms.m32221a(this.a).m32224a(mls.m32486b()));
                }
                this.d = this.c == this.b.length;
                return mmv.m32525a(this.c, this.b);
        }
    }
}
