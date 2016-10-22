package defpackage;

import java.util.LinkedHashMap;

/* renamed from: ban */
public class ban<T, Y> {
    private final LinkedHashMap<T, Y> a;
    private final int b;
    private int c;
    private int d;

    public ban(int i) {
        this.a = new LinkedHashMap(100, 0.75f, true);
        this.d = 0;
        this.b = i;
        this.c = i;
    }

    public int a(Y y) {
        return 1;
    }

    public void a(T t, Y y) {
    }

    public synchronized int b() {
        return this.d;
    }

    public synchronized Y b(T t) {
        return this.a.get(t);
    }

    public synchronized Y b(T t, Y y) {
        Y y2;
        if (a(y) >= this.c) {
            a(t, y);
            y2 = null;
        } else {
            y2 = this.a.put(t, y);
            if (y != null) {
                this.d += a(y);
            }
            if (y2 != null) {
                this.d -= a(y2);
            }
            b(this.c);
        }
        return y2;
    }

    public synchronized Y c(T t) {
        Y remove;
        remove = this.a.remove(t);
        if (remove != null) {
            this.d -= a(remove);
        }
        return remove;
    }

    public void a() {
        b(0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void b(int r5) {
        /*
        r4 = this;
        monitor-enter(r4);
    L_0x0001:
        r0 = r4.d;	 Catch:{ all -> 0x002f }
        if (r0 <= r5) goto L_0x0032;
    L_0x0005:
        r0 = r4.a;	 Catch:{ all -> 0x002f }
        r0 = r0.entrySet();	 Catch:{ all -> 0x002f }
        r0 = r0.iterator();	 Catch:{ all -> 0x002f }
        r0 = r0.next();	 Catch:{ all -> 0x002f }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x002f }
        r1 = r0.getValue();	 Catch:{ all -> 0x002f }
        r2 = r4.d;	 Catch:{ all -> 0x002f }
        r3 = r4.a(r1);	 Catch:{ all -> 0x002f }
        r2 = r2 - r3;
        r4.d = r2;	 Catch:{ all -> 0x002f }
        r0 = r0.getKey();	 Catch:{ all -> 0x002f }
        r2 = r4.a;	 Catch:{ all -> 0x002f }
        r2.remove(r0);	 Catch:{ all -> 0x002f }
        r4.a(r0, r1);	 Catch:{ all -> 0x002f }
        goto L_0x0001;
    L_0x002f:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
    L_0x0032:
        monitor-exit(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ban.b(int):void");
    }
}
