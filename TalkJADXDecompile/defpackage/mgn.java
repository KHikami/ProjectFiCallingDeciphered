package defpackage;

import com.google.common.cache.LocalCache;
import java.util.Map.Entry;

/* renamed from: mgn */
public final class mgn extends mgp<Entry<K, V>> {
    final /* synthetic */ LocalCache a;

    mgn(LocalCache localCache) {
        this.a = localCache;
        super(localCache);
    }

    public /* synthetic */ Object next() {
        return d();
    }

    private Entry<K, V> d() {
        return c();
    }
}
