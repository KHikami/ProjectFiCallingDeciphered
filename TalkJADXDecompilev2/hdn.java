package defpackage;

import java.util.concurrent.TimeUnit;

public final class hdn {
    private int a = 0;

    hdn() {
    }

    public synchronized void a() {
        this.a++;
    }

    public boolean a(long j, TimeUnit timeUnit) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        long convert = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        synchronized (this) {
            while (this.a != 0) {
                if (convert <= 0) {
                    z = false;
                    break;
                }
                wait(convert);
                convert -= System.currentTimeMillis() - currentTimeMillis;
            }
            z = true;
        }
        return z;
    }

    public synchronized void b() {
        if (this.a == 0) {
            throw new RuntimeException("too many decrements");
        }
        this.a--;
        if (this.a == 0) {
            notifyAll();
        }
    }

    public synchronized boolean c() {
        return this.a == 0;
    }
}
