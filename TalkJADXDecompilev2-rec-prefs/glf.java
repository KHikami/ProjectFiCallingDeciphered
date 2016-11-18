package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class glf<KeyType> {
    private final ConcurrentHashMap<KeyType, AtomicInteger> f15539a = new ConcurrentHashMap();

    public synchronized void m17950a(KeyType keyType) {
        this.f15539a.putIfAbsent(keyType, new AtomicInteger(0));
        ((AtomicInteger) this.f15539a.get(keyType)).incrementAndGet();
    }

    public void m17951b(KeyType keyType) {
        this.f15539a.putIfAbsent(keyType, new AtomicInteger(1));
    }

    public synchronized boolean m17952c(KeyType keyType) {
        boolean z;
        if (!this.f15539a.containsKey(keyType)) {
            String valueOf = String.valueOf(keyType);
            glk.m17982e("Babel", new StringBuilder(String.valueOf(valueOf).length() + 35).append("Tried to decrement nonexistent key ").append(valueOf).toString(), new Object[0]);
            z = true;
        } else if (((AtomicInteger) this.f15539a.get(keyType)).decrementAndGet() == 0) {
            this.f15539a.remove(keyType);
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
