package p000;

import android.os.Debug;
import android.util.Log;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

final class izk extends Thread {
    final Deque<Object> f19484a = new ArrayDeque(20);
    private final ReferenceQueue<Object> f19485b;
    private final izi f19486c;
    private File f19487d;
    private final izh f19488e;
    private final izl f19489f;
    private final Deque<izh> f19490g = new ArrayDeque(3);
    private final izh f19491h;

    izk(ReferenceQueue<Object> referenceQueue, izl izl, izi izi) {
        int i = 0;
        setName("Primes-Watcher");
        this.f19485b = referenceQueue;
        this.f19486c = izi;
        this.f19489f = izl;
        this.f19488e = new izh("Sentinel", "Sentinel", referenceQueue);
        this.f19491h = new izh("Sentinel", "Sentinel", referenceQueue);
        for (int i2 = 0; i2 < 20; i2++) {
            this.f19484a.add(new Object());
        }
        while (i < 3) {
            this.f19490g.add(new izh("Sentinel", "Sentinel", referenceQueue));
            i++;
        }
    }

    public void run() {
        while (!isInterrupted()) {
            try {
                Thread.sleep(5000);
                m23590a();
            } catch (InterruptedException e) {
                interrupt();
                if (this.f19487d != null) {
                    izk.interrupted();
                    m23592c();
                }
            }
        }
        synchronized (this.f19488e) {
            this.f19488e.f19476c = null;
        }
        this.f19484a.clear();
        this.f19490g.clear();
    }

    void m23593a(Object obj, String str) {
        ba.m4536a((Object) str);
        ba.m4536a(obj);
        if (Log.isLoggable("LeakWatcherThread", 3)) {
            String str2 = "Watching ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        izh a = this.f19489f.m23595a(obj, str, this.f19485b);
        synchronized (this.f19488e) {
            a.m23576a(this.f19488e);
        }
    }

    private void m23591b() {
        int i = 0;
        izh izh = (izh) this.f19490g.poll();
        boolean z = izh.f19476c != null;
        if (Log.isLoggable("LeakWatcherThread", 3)) {
            String str = z ? "" : "no";
            new StringBuilder(String.valueOf(str).length() + 27).append("Check for leak: ").append(str).append(" leak found");
        }
        izh izh2 = izh.f19476c;
        while (izh2 != null) {
            int i2 = i + 1;
            izh2 = izh2.f19476c;
            i = i2;
        }
        while (izh.f19476c != null) {
            izh2 = izh.f19476c.m23575a();
            this.f19486c.m23582b(izh2.f19474a);
            if (i < 500) {
                izh2.m23576a(this.f19491h);
                i++;
            }
        }
        this.f19490g.offer(izh);
        synchronized (this.f19488e) {
            if (this.f19488e.f19476c != null) {
                izh.f19476c = this.f19488e.f19476c;
                izh.f19476c.f19475b = izh;
                this.f19488e.f19476c = null;
            }
        }
        this.f19486c.m23579a(z);
    }

    private String m23589a(izh izh) {
        if (izh.f19475b == this.f19488e) {
            synchronized (this.f19488e) {
                izh.m23575a();
            }
        } else {
            izh.m23575a();
        }
        return izh.f19474a;
    }

    boolean m23594a(File file) {
        if (this.f19491h.f19476c == null) {
            return false;
        }
        this.f19487d = (File) ba.m4536a((Object) file);
        interrupt();
        return true;
    }

    private void m23592c() {
        File file;
        ba.m4609b(this.f19487d != null);
        izh izh = new izh("Sentinel", "Sentinel", this.f19485b);
        synchronized (this.f19488e) {
            izh.m23576a(this.f19488e);
            this.f19488e.f19476c = null;
            izh.f19475b = null;
        }
        try {
            long nanoTime = System.nanoTime();
            Debug.dumpHprofData(this.f19487d.getAbsolutePath());
            if (Log.isLoggable("LeakWatcherThread", 3)) {
                new StringBuilder(79).append("Hprof dumped. File size: ").append(this.f19487d.length() / 1048576).append(" MB. Took ").append((System.nanoTime() - nanoTime) / 1000000).append(" ms.");
            }
            nanoTime = System.nanoTime();
            List a = new iys(this.f19487d).m23507a(izh.class.getName());
            if (!a.isEmpty()) {
                this.f19486c.m23578a(a);
            }
            for (izh a2 : this.f19490g) {
                a2.m23575a();
            }
            this.f19491h.m23575a();
            if (Log.isLoggable("LeakWatcherThread", 3)) {
                new StringBuilder(69).append("Found ").append(a.size()).append(" leak(s). The analysis took ").append((System.nanoTime() - nanoTime) / 1000000).append(" ms.");
            }
            file = this.f19487d;
            this.f19487d = null;
            file.delete();
        } catch (Throwable th) {
            File file2 = this.f19487d;
            this.f19487d = null;
            file2.delete();
        }
    }

    private void m23590a() {
        Object poll = this.f19484a.poll();
        this.f19484a.offer(new Object());
        izh a = this.f19489f.m23595a(poll, "", this.f19485b);
        boolean z = false;
        while (!z) {
            Reference reference = null;
            while (reference == null) {
                try {
                    reference = this.f19485b.remove();
                } catch (InterruptedException e) {
                    if (this.f19487d != null) {
                        m23592c();
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
                    ba.m4610b(!z2, (Object) "Only one dummy released at a time.");
                    z3 = true;
                } else {
                    this.f19486c.m23577a(m23589a(r0));
                    z3 = z2;
                }
                z2 = z3;
                reference2 = this.f19485b.poll();
            }
            if (!z2) {
                this.f19486c.m23579a(false);
            }
            z = z2;
        }
        m23591b();
    }
}
