package defpackage;

import android.os.Debug;
import android.util.Log;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

final class izk extends Thread {
    final Deque<Object> a = new ArrayDeque(20);
    private final ReferenceQueue<Object> b;
    private final izi c;
    private File d;
    private final izh e;
    private final izl f;
    private final Deque<izh> g = new ArrayDeque(3);
    private final izh h;

    izk(ReferenceQueue<Object> referenceQueue, izl izl, izi izi) {
        int i = 0;
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
            if (i < 500) {
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

    private void c() {
        ba.b(this.d != null);
        izh izh = new izh("Sentinel", "Sentinel", this.b);
        synchronized (this.e) {
            izh.a(this.e);
            this.e.c = null;
            izh.b = null;
        }
        File file;
        try {
            long nanoTime = System.nanoTime();
            Debug.dumpHprofData(this.d.getAbsolutePath());
            if (Log.isLoggable("LeakWatcherThread", 3)) {
                new StringBuilder(79).append("Hprof dumped. File size: ").append(this.d.length() / 1048576).append(" MB. Took ").append((System.nanoTime() - nanoTime) / 1000000).append(" ms.");
            }
            nanoTime = System.nanoTime();
            List a = new iys(this.d).a(izh.class.getName());
            if (!a.isEmpty()) {
                this.c.a(a);
            }
            for (izh a2 : this.g) {
                a2.a();
            }
            this.h.a();
            if (Log.isLoggable("LeakWatcherThread", 3)) {
                new StringBuilder(69).append("Found ").append(a.size()).append(" leak(s). The analysis took ").append((System.nanoTime() - nanoTime) / 1000000).append(" ms.");
            }
            file = this.d;
            this.d = null;
            file.delete();
        } catch (Throwable th) {
            File file2 = this.d;
            this.d = null;
            file2.delete();
        }
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
