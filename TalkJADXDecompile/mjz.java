import java.util.Arrays;
import java.util.Comparator;

public class mjz<K, V> {
    Comparator<? super V> a;
    mkd<K, V>[] b;
    int c;
    boolean d;

    public mjz() {
        this(4);
    }

    mjz(int i) {
        this.b = new mkd[i];
        this.c = 0;
        this.d = false;
    }

    public mjz<K, V> a(K k, V v) {
        int i = this.c + 1;
        if (i > this.b.length) {
            this.b = (mkd[]) mmr.a(this.b, mjm.a(this.b.length, i));
            this.d = false;
        }
        mkd b = mjx.b(k, v);
        mkd[] mkdArr = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        mkdArr[i2] = b;
        return this;
    }

    public mjx<K, V> a() {
        switch (this.c) {
            case wi.w /*0*/:
                return mmv.b;
            case wi.j /*1*/:
                return mjh.a(this.b[0].getKey(), this.b[0].getValue());
            default:
                if (this.a != null) {
                    if (this.d) {
                        this.b = (mkd[]) mmr.a(this.b, this.c);
                    }
                    Arrays.sort(this.b, 0, this.c, mms.a(this.a).a(mls.b()));
                }
                this.d = this.c == this.b.length;
                return mnb.a(this.c, this.b);
        }
    }
}
