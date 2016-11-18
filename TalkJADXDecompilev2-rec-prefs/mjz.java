package p000;

import java.util.Arrays;
import java.util.Comparator;

public class mjz<K, V> {
    Comparator<? super V> f27825a;
    mkd<K, V>[] f27826b;
    int f27827c;
    boolean f27828d;

    public mjz() {
        this(4);
    }

    mjz(int i) {
        this.f27826b = new mkd[i];
        this.f27827c = 0;
        this.f27828d = false;
    }

    public mjz<K, V> mo3837a(K k, V v) {
        int i = this.f27827c + 1;
        if (i > this.f27826b.length) {
            this.f27826b = (mkd[]) mmr.m32523a(this.f27826b, mjm.m32349a(this.f27826b.length, i));
            this.f27828d = false;
        }
        mkd b = mjx.m32330b(k, v);
        mkd[] mkdArr = this.f27826b;
        int i2 = this.f27827c;
        this.f27827c = i2 + 1;
        mkdArr[i2] = b;
        return this;
    }

    public mjx<K, V> mo3836a() {
        switch (this.f27827c) {
            case 0:
                return mmv.f27916b;
            case 1:
                return mjh.m32338a(this.f27826b[0].getKey(), this.f27826b[0].getValue());
            default:
                if (this.f27825a != null) {
                    if (this.f27828d) {
                        this.f27826b = (mkd[]) mmr.m32523a(this.f27826b, this.f27827c);
                    }
                    Arrays.sort(this.f27826b, 0, this.f27827c, mms.m32221a(this.f27825a).m32224a(mls.m32486b()));
                }
                this.f27828d = this.f27827c == this.f27826b.length;
                return mnb.m32543a(this.f27827c, this.f27826b);
        }
    }
}
