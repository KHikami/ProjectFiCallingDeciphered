package p000;

import java.util.concurrent.TimeUnit;

public final class hdn {
    private int f16703a = 0;

    hdn() {
    }

    public synchronized void m19426a() {
        this.f16703a++;
    }

    public boolean m19427a(long j, TimeUnit timeUnit) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        long convert = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        synchronized (this) {
            while (this.f16703a != 0) {
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

    public synchronized void m19428b() {
        if (this.f16703a == 0) {
            throw new RuntimeException("too many decrements");
        }
        this.f16703a--;
        if (this.f16703a == 0) {
            notifyAll();
        }
    }

    public synchronized boolean m19429c() {
        return this.f16703a == 0;
    }
}
