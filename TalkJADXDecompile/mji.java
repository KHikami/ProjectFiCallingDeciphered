import java.util.Arrays;

public final class mji<K, V> extends mjz<K, V> {
    public /* synthetic */ mjx a() {
        return b();
    }

    public /* synthetic */ mjz a(Object obj, Object obj2) {
        return b(obj, obj2);
    }

    private mji<K, V> b(K k, V v) {
        super.a(k, v);
        return this;
    }

    private mjh<K, V> b() {
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
                return mmv.a(this.c, this.b);
        }
    }
}
