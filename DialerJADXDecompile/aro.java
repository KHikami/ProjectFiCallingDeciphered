import android.util.LruCache;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
public final class aro {
    public final AtomicInteger a;
    private LruCache b;

    public aro(LruCache lruCache) {
        this.b = lruCache;
        this.a = new AtomicInteger(0);
    }

    public final arp a(Object obj) {
        return (arp) this.b.get(obj);
    }

    public final void a(Object obj, Object obj2) {
        this.b.put(obj, new arp(obj2, this.a));
    }
}
