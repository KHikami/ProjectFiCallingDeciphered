package defpackage;

import android.util.LruCache;

/* compiled from: PG */
/* renamed from: abg */
final class abg extends LruCache {
    abg(abe abe, int i) {
        super(i);
    }

    protected final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
    }

    protected final /* synthetic */ int sizeOf(Object obj, Object obj2) {
        abh abh = (abh) obj2;
        return abh.a != null ? abh.a.length : 0;
    }
}
