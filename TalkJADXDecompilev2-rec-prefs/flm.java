package p000;

public class flm implements Runnable {
    private final Object f13118a = new Object();
    final Thread f13119b = new Thread(this);
    private final Object f13120c = new Object();
    private final Object f13121d = new Object();
    private Object f13122e;
    private boolean f13123f;
    private boolean f13124g;
    private boolean f13125h;
    private final long f13126i;
    private final long f13127j;
    private volatile boolean f13128k;

    public flm(String str, long j, long j2) {
        this.f13126i = j;
        this.f13127j = j2;
        this.f13119b.setName(str);
        this.f13119b.start();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        while (!this.f13128k) {
            synchronized (this.f13118a) {
                if (!this.f13123f) {
                    try {
                        this.f13118a.wait();
                        if (this.f13128k) {
                            return;
                        }
                    } catch (InterruptedException e) {
                    }
                }
                this.f13123f = false;
            }
        }
    }

    public void m15344b(Object obj) {
        if (!this.f13128k) {
            synchronized (this.f13118a) {
                this.f13123f = true;
                this.f13122e = obj;
                this.f13118a.notify();
            }
        }
    }

    public void m15342a() {
        if (!this.f13128k) {
            synchronized (this.f13120c) {
                this.f13124g = true;
                this.f13120c.notify();
            }
            synchronized (this.f13121d) {
                if (!this.f13125h) {
                    try {
                        this.f13121d.wait();
                    } catch (InterruptedException e) {
                    }
                }
                this.f13125h = false;
            }
        }
    }

    public String mo2000a(Object obj) {
        if (obj == null) {
            return "NULL";
        }
        return obj.toString();
    }

    public void m15343b() {
        this.f13128k = true;
        synchronized (this.f13118a) {
            this.f13118a.notify();
        }
        synchronized (this.f13120c) {
            this.f13120c.notify();
        }
        synchronized (this.f13121d) {
            this.f13125h = true;
            this.f13121d.notify();
        }
        try {
            this.f13119b.join(1000);
            if (this.f13119b.isAlive()) {
                glk.m17982e("Babel", "failed to stop watchdog thread in 1000 ms", new Object[0]);
            }
        } catch (InterruptedException e) {
        }
    }
}
