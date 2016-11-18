package p000;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

final class mmg<V> implements iyr, Serializable {
    private final int f27903a;

    public /* synthetic */ Object mo3325a() {
        return m32504b();
    }

    mmg(int i) {
        this.f27903a = gwb.m2121d(i, "expectedValuesPerKey");
    }

    private List<V> m32504b() {
        return new ArrayList(this.f27903a);
    }
}
