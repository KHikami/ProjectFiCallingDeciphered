package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: mmg */
final class mmg<V> implements iyr, Serializable {
    private final int a;

    public /* synthetic */ Object a() {
        return b();
    }

    mmg(int i) {
        this.a = gwb.d(i, "expectedValuesPerKey");
    }

    private List<V> b() {
        return new ArrayList(this.a);
    }
}
