package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class kfq extends AbstractSet<Entry<String, Object>> {
    final /* synthetic */ kfn f21595a;

    kfq(kfn kfn) {
        this.f21595a = kfn;
    }

    public /* synthetic */ Iterator iterator() {
        return m25733a();
    }

    public kfp m25733a() {
        return new kfp(this.f21595a);
    }

    public int size() {
        int i = 0;
        for (String a : this.f21595a.f21584b.f21565b) {
            int i2;
            if (this.f21595a.f21584b.m25712a(a).m25751a(this.f21595a.f21583a) != null) {
                i2 = i + 1;
            } else {
                i2 = i;
            }
            i = i2;
        }
        return i;
    }

    public void clear() {
        for (String a : this.f21595a.f21584b.f21565b) {
            this.f21595a.f21584b.m25712a(a).m25753a(this.f21595a.f21583a, null);
        }
    }

    public boolean isEmpty() {
        for (String a : this.f21595a.f21584b.f21565b) {
            if (this.f21595a.f21584b.m25712a(a).m25751a(this.f21595a.f21583a) != null) {
                return false;
            }
        }
        return true;
    }
}
