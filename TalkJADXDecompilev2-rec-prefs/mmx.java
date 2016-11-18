package p000;

import java.util.Iterator;
import java.util.Map.Entry;

final class mmx extends mkg<V, K> {
    final /* synthetic */ mmw f27924a;

    public /* synthetic */ Iterator iterator() {
        return mo3806a();
    }

    mmx(mmw mmw) {
        this.f27924a = mmw;
    }

    mjx<V, K> mo3864b() {
        return this.f27924a;
    }

    boolean V_() {
        return true;
    }

    public int hashCode() {
        return this.f27924a.f27923b.f27920f;
    }

    public mny<Entry<V, K>> mo3806a() {
        return mo3807f().mo3806a();
    }

    mjq<Entry<V, K>> mo3868d() {
        return new mmy(this);
    }
}
