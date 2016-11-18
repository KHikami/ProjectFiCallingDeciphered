package p000;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

final class jbb extends LinkedHashMap<K, V> {
    final /* synthetic */ jba f19670a;

    jbb(jba jba, int i, float f, boolean z) {
        this.f19670a = jba;
        super(i, 0.75f, true);
    }

    protected boolean removeEldestEntry(Entry<K, V> entry) {
        return size() > this.f19670a.f19668a;
    }
}
