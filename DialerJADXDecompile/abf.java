import android.graphics.Bitmap;
import android.util.LruCache;

/* compiled from: PG */
final class abf extends LruCache {
    abf(abe abe, int i) {
        super(i);
    }

    protected final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
    }

    protected final /* synthetic */ int sizeOf(Object obj, Object obj2) {
        return ((Bitmap) obj2).getByteCount();
    }
}
