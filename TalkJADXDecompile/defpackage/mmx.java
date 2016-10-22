package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: mmx */
final class mmx extends mkg<V, K> {
    final /* synthetic */ mmw a;

    public /* synthetic */ Iterator iterator() {
        return a();
    }

    mmx(mmw mmw) {
        this.a = mmw;
    }

    mjx<V, K> b() {
        return this.a;
    }

    boolean V_() {
        return true;
    }

    public int hashCode() {
        return this.a.b.f;
    }

    public mny<Entry<V, K>> a() {
        return f().a();
    }

    mjq<Entry<V, K>> d() {
        return new mmy(this);
    }
}
