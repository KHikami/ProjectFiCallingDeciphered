package p000;

import java.util.Map.Entry;

final class mmw extends mjh<V, K> {
    final /* synthetic */ mmv f27923b;

    mmw(mmv mmv) {
        this.f27923b = mmv;
    }

    public int size() {
        return mo3889a().size();
    }

    public mjh<K, V> mo3889a() {
        return this.f27923b;
    }

    public K get(Object obj) {
        if (obj == null || this.f27923b.f27917c == null) {
            return null;
        }
        for (mkd mkd = this.f27923b.f27917c[gwb.m1394G(obj.hashCode()) & this.f27923b.f27919e]; mkd != null; mkd = mkd.mo3867b()) {
            if (obj.equals(mkd.getValue())) {
                return mkd.getKey();
            }
        }
        return null;
    }

    mks<Entry<V, K>> mo3845f() {
        return new mmx(this);
    }

    boolean mo3850d() {
        return false;
    }

    Object writeReplace() {
        return new mmz(this.f27923b);
    }
}
