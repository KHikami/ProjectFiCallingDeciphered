package defpackage;

import com.google.common.cache.LocalCache;

/* renamed from: mgq */
public final class mgq extends mgp<K> {
    final /* synthetic */ LocalCache a;

    mgq(LocalCache localCache) {
        this.a = localCache;
        super(localCache);
    }

    public K next() {
        return c().getKey();
    }
}
