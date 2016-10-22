package defpackage;

import android.util.Log;
import com.google.api.client.http.HttpStatusCodes;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: izk */
final class izk extends Thread {
    final Deque<Object> a;
    private final ReferenceQueue<Object> b;
    private final izi c;
    private File d;
    private final izh e;
    private final izl f;
    private final Deque<izh> g;
    private final izh h;

    izk(ReferenceQueue<Object> referenceQueue, izl izl, izi izi) {
        int i = 0;
        this.a = new ArrayDeque(20);
        this.g = new ArrayDeque(3);
        setName("Primes-Watcher");
        this.b = referenceQueue;
        this.c = izi;
        this.f = izl;
        this.e = new izh("Sentinel", "Sentinel", referenceQueue);
        this.h = new izh("Sentinel", "Sentinel", referenceQueue);
        for (int i2 = 0; i2 < 20; i2++) {
            this.a.add(new Object());
        }
        while (i < 3) {
            this.g.add(new izh("Sentinel", "Sentinel", referenceQueue));
            i++;
        }
    }

    public void run() {
        while (!isInterrupted()) {
            try {
                Thread.sleep(5000);
                a();
            } catch (InterruptedException e) {
                interrupt();
                if (this.d != null) {
                    izk.interrupted();
                    c();
                }
            }
        }
        synchronized (this.e) {
            this.e.c = null;
        }
        this.a.clear();
        this.g.clear();
    }

    void a(Object obj, String str) {
        ba.a((Object) str);
        ba.a(obj);
        if (Log.isLoggable("LeakWatcherThread", 3)) {
            String str2 = "Watching ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        izh a = this.f.a(obj, str, this.b);
        synchronized (this.e) {
            a.a(this.e);
        }
    }

    private void b() {
        int i = 0;
        izh izh = (izh) this.g.poll();
        boolean z = izh.c != null;
        if (Log.isLoggable("LeakWatcherThread", 3)) {
            String str = z ? "" : "no";
            new StringBuilder(String.valueOf(str).length() + 27).append("Check for leak: ").append(str).append(" leak found");
        }
        izh izh2 = izh.c;
        while (izh2 != null) {
            int i2 = i + 1;
            izh2 = izh2.c;
            i = i2;
        }
        while (izh.c != null) {
            izh2 = izh.c.a();
            this.c.b(izh2.a);
            if (i < HttpStatusCodes.STATUS_CODE_SERVER_ERROR) {
                izh2.a(this.h);
                i++;
            }
        }
        this.g.offer(izh);
        synchronized (this.e) {
            if (this.e.c != null) {
                izh.c = this.e.c;
                izh.c.b = izh;
                this.e.c = null;
            }
        }
        this.c.a(z);
    }

    private String a(izh izh) {
        if (izh.b == this.e) {
            synchronized (this.e) {
                izh.a();
            }
        } else {
            izh.a();
        }
        return izh.a;
    }

    boolean a(File file) {
        if (this.h.c == null) {
            return false;
        }
        this.d = (File) ba.a((Object) file);
        interrupt();
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
        r9 = this;
        r8 = 0;
        r0 = r9.d;
        if (r0 == 0) goto L_0x00c5;
    L_0x0005:
        r0 = 1;
    L_0x0006:
        defpackage.ba.b(r0);
        r1 = new izh;
        r0 = "Sentinel";
        r2 = "Sentinel";
        r3 = r9.b;
        r1.<init>(r0, r2, r3);
        r2 = r9.e;
        monitor-enter(r2);
        r0 = r9.e;	 Catch:{ all -> 0x00c8 }
        r1.a(r0);	 Catch:{ all -> 0x00c8 }
        r0 = r9.e;	 Catch:{ all -> 0x00c8 }
        r3 = 0;
        r0.c = r3;	 Catch:{ all -> 0x00c8 }
        r0 = 0;
        r1.b = r0;	 Catch:{ all -> 0x00c8 }
        monitor-exit(r2);	 Catch:{ all -> 0x00c8 }
        r2 = java.lang.System.nanoTime();	 Catch:{ Throwable -> 0x00a5 }
        r0 = r9.d;	 Catch:{ Throwable -> 0x00a5 }
        r0 = r0.getAbsolutePath();	 Catch:{ Throwable -> 0x00a5 }
        android.os.Debug.dumpHprofData(r0);	 Catch:{ Throwable -> 0x00a5 }
        r0 = "LeakWatcherThread";
        r4 = 3;
        r0 = android.util.Log.isLoggable(r0, r4);	 Catch:{ Throwable -> 0x00a5 }
        if (r0 == 0) goto L_0x006f;
    L_0x003b:
        r0 = r9.d;	 Catch:{ Throwable -> 0x00a5 }
        r4 = r0.length();	 Catch:{ Throwable -> 0x00a5 }
        r6 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r4 = r4 / r6;
        r6 = java.lang.System.nanoTime();	 Catch:{ Throwable -> 0x00a5 }
        r2 = r6 - r2;
        r6 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r2 = r2 / r6;
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00a5 }
        r6 = 79;
        r0.<init>(r6);	 Catch:{ Throwable -> 0x00a5 }
        r6 = "Hprof dumped. File size: ";
        r0 = r0.append(r6);	 Catch:{ Throwable -> 0x00a5 }
        r0 = r0.append(r4);	 Catch:{ Throwable -> 0x00a5 }
        r4 = " MB. Took ";
        r0 = r0.append(r4);	 Catch:{ Throwable -> 0x00a5 }
        r0 = r0.append(r2);	 Catch:{ Throwable -> 0x00a5 }
        r2 = " ms.";
        r0.append(r2);	 Catch:{ Throwable -> 0x00a5 }
    L_0x006f:
        r2 = java.lang.System.nanoTime();	 Catch:{ Throwable -> 0x00a5 }
        r0 = new iys;	 Catch:{ Throwable -> 0x00a5 }
        r4 = r9.d;	 Catch:{ Throwable -> 0x00a5 }
        r0.<init>(r4);	 Catch:{ Throwable -> 0x00a5 }
        r4 = defpackage.izh.class;
        r4 = r4.getName();	 Catch:{ Throwable -> 0x00a5 }
        r4 = r0.a(r4);	 Catch:{ Throwable -> 0x00a5 }
        r0 = r4.isEmpty();	 Catch:{ Throwable -> 0x00a5 }
        if (r0 != 0) goto L_0x008f;
    L_0x008a:
        r0 = r9.c;	 Catch:{ Throwable -> 0x00a5 }
        r0.a(r4);	 Catch:{ Throwable -> 0x00a5 }
    L_0x008f:
        r0 = r9.g;	 Catch:{ Throwable -> 0x00a5 }
        r5 = r0.iterator();	 Catch:{ Throwable -> 0x00a5 }
    L_0x0095:
        r0 = r5.hasNext();	 Catch:{ Throwable -> 0x00a5 }
        if (r0 == 0) goto L_0x00cb;
    L_0x009b:
        r0 = r5.next();	 Catch:{ Throwable -> 0x00a5 }
        r0 = (defpackage.izh) r0;	 Catch:{ Throwable -> 0x00a5 }
        r0.a();	 Catch:{ Throwable -> 0x00a5 }
        goto L_0x0095;
    L_0x00a5:
        r0 = move-exception;
        r2 = r9.e;	 Catch:{ all -> 0x00bc }
        monitor-enter(r2);	 Catch:{ all -> 0x00bc }
    L_0x00a9:
        r0 = r1.c;	 Catch:{ all -> 0x00b9 }
        if (r0 == 0) goto L_0x010f;
    L_0x00ad:
        r0 = r1.c;	 Catch:{ all -> 0x00b9 }
        r0 = r0.a();	 Catch:{ all -> 0x00b9 }
        r3 = r9.e;	 Catch:{ all -> 0x00b9 }
        r0.a(r3);	 Catch:{ all -> 0x00b9 }
        goto L_0x00a9;
    L_0x00b9:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00b9 }
        throw r0;	 Catch:{ all -> 0x00bc }
    L_0x00bc:
        r0 = move-exception;
        r1 = r9.d;
        r9.d = r8;
        r1.delete();
        throw r0;
    L_0x00c5:
        r0 = 0;
        goto L_0x0006;
    L_0x00c8:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00c8 }
        throw r0;
    L_0x00cb:
        r0 = r9.h;	 Catch:{ Throwable -> 0x00a5 }
        r0.a();	 Catch:{ Throwable -> 0x00a5 }
        r0 = "LeakWatcherThread";
        r5 = 3;
        r0 = android.util.Log.isLoggable(r0, r5);	 Catch:{ Throwable -> 0x00a5 }
        if (r0 == 0) goto L_0x0107;
    L_0x00d9:
        r0 = r4.size();	 Catch:{ Throwable -> 0x00a5 }
        r4 = java.lang.System.nanoTime();	 Catch:{ Throwable -> 0x00a5 }
        r2 = r4 - r2;
        r4 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r2 = r2 / r4;
        r4 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00a5 }
        r5 = 69;
        r4.<init>(r5);	 Catch:{ Throwable -> 0x00a5 }
        r5 = "Found ";
        r4 = r4.append(r5);	 Catch:{ Throwable -> 0x00a5 }
        r0 = r4.append(r0);	 Catch:{ Throwable -> 0x00a5 }
        r4 = " leak(s). The analysis took ";
        r0 = r0.append(r4);	 Catch:{ Throwable -> 0x00a5 }
        r0 = r0.append(r2);	 Catch:{ Throwable -> 0x00a5 }
        r2 = " ms.";
        r0.append(r2);	 Catch:{ Throwable -> 0x00a5 }
    L_0x0107:
        r0 = r9.d;
        r9.d = r8;
        r0.delete();
    L_0x010e:
        return;
    L_0x010f:
        monitor-exit(r2);	 Catch:{ all -> 0x00b9 }
        r0 = r9.d;
        r9.d = r8;
        r0.delete();
        goto L_0x010e;
        */
        throw new UnsupportedOperationException("Method not decompiled: izk.c():void");
    }

    private void a() {
        Object poll = this.a.poll();
        this.a.offer(new Object());
        izh a = this.f.a(poll, "", this.b);
        boolean z = false;
        while (!z) {
            Reference reference = null;
            while (reference == null) {
                try {
                    reference = this.b.remove();
                } catch (InterruptedException e) {
                    if (this.d != null) {
                        c();
                    } else {
                        throw e;
                    }
                }
            }
            Reference reference2 = reference;
            boolean z2 = z;
            while (r0 != null) {
                boolean z3;
                if (r0 == a) {
                    ba.b(!z2, (Object) "Only one dummy released at a time.");
                    z3 = true;
                } else {
                    this.c.a(a(r0));
                    z3 = z2;
                }
                z2 = z3;
                reference2 = this.b.poll();
            }
            if (!z2) {
                this.c.a(false);
            }
            z = z2;
        }
        b();
    }
}
