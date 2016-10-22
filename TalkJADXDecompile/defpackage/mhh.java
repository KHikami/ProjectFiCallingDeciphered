package defpackage;

import com.google.common.cache.LocalCache;

/* renamed from: mhh */
public final class mhh extends mgp<V> {
    final /* synthetic */ LocalCache a;

    mhh(LocalCache localCache) {
        this.a = localCache;
        super(localCache);
    }

    public V next() {
        return c().getValue();
    }
}
