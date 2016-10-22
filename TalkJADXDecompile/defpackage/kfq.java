package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: kfq */
final class kfq extends AbstractSet<Entry<String, Object>> {
    final /* synthetic */ kfn a;

    kfq(kfn kfn) {
        this.a = kfn;
    }

    public /* synthetic */ Iterator iterator() {
        return a();
    }

    public kfp a() {
        return new kfp(this.a);
    }

    public int size() {
        int i = 0;
        for (String a : this.a.b.b) {
            int i2;
            if (this.a.b.a(a).a(this.a.a) != null) {
                i2 = i + 1;
            } else {
                i2 = i;
            }
            i = i2;
        }
        return i;
    }

    public void clear() {
        for (String a : this.a.b.b) {
            this.a.b.a(a).a(this.a.a, null);
        }
    }

    public boolean isEmpty() {
        for (String a : this.a.b.b) {
            if (this.a.b.a(a).a(this.a.a) != null) {
                return false;
            }
        }
        return true;
    }
}
