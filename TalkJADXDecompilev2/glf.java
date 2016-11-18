package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class glf<KeyType> {
    private final ConcurrentHashMap<KeyType, AtomicInteger> a = new ConcurrentHashMap();

    public synchronized void a(KeyType keyType) {
        this.a.putIfAbsent(keyType, new AtomicInteger(0));
        ((AtomicInteger) this.a.get(keyType)).incrementAndGet();
    }

    public void b(KeyType keyType) {
        this.a.putIfAbsent(keyType, new AtomicInteger(1));
    }

    public synchronized boolean c(KeyType keyType) {
        boolean z;
        if (!this.a.containsKey(keyType)) {
            String valueOf = String.valueOf(keyType);
            glk.e("Babel", new StringBuilder(String.valueOf(valueOf).length() + 35).append("Tried to decrement nonexistent key ").append(valueOf).toString(), new Object[0]);
            z = true;
        } else if (((AtomicInteger) this.a.get(keyType)).decrementAndGet() == 0) {
            this.a.remove(keyType);
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
