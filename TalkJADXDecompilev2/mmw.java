package defpackage;

import java.util.Map.Entry;

final class mmw extends mjh<V, K> {
    final /* synthetic */ mmv b;

    mmw(mmv mmv) {
        this.b = mmv;
    }

    public int size() {
        return a().size();
    }

    public mjh<K, V> a() {
        return this.b;
    }

    public K get(Object obj) {
        if (obj == null || this.b.c == null) {
            return null;
        }
        for (mkd mkd = this.b.c[gwb.G(obj.hashCode()) & this.b.e]; mkd != null; mkd = mkd.b()) {
            if (obj.equals(mkd.getValue())) {
                return mkd.getKey();
            }
        }
        return null;
    }

    mks<Entry<V, K>> f() {
        return new mmx(this);
    }

    boolean d() {
        return false;
    }

    Object writeReplace() {
        return new mmz(this.b);
    }
}
