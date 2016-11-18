package p000;

import java.util.concurrent.ScheduledFuture;

public final class okb extends ojz {
    private boolean f33115c;
    private Throwable f33116d;
    private final ojz f33117e;
    private ScheduledFuture<?> f33118f;

    public ojz m38619b() {
        return this.f33117e.b();
    }

    public void m38617a(ojz ojz) {
        this.f33117e.a(ojz);
    }

    public boolean m38618a(Throwable th) {
        boolean z = true;
        synchronized (this) {
            if (this.f33115c) {
                z = false;
            } else {
                this.f33115c = true;
                if (this.f33118f != null) {
                    this.f33118f.cancel(false);
                    this.f33118f = null;
                }
                this.f33116d = th;
            }
        }
        if (z) {
            f();
        }
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m38620c() {
        synchronized (this) {
            if (this.f33115c) {
                return true;
            }
        }
    }

    public Throwable m38621d() {
        if (m38620c()) {
            return this.f33116d;
        }
        return null;
    }
}
