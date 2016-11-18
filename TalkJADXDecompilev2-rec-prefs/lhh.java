package p000;

final class lhh implements Runnable {
    final /* synthetic */ lhg f25006a;

    lhh(lhg lhg) {
        this.f25006a = lhg;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        boolean interrupted;
        while (true) {
            try {
                interrupted = Thread.interrupted();
                Runnable runnable = null;
                try {
                    synchronized (this.f25006a.f25004e) {
                        if (this.f25006a.f25003d == 0) {
                            runnable = (Runnable) this.f25006a.f25001b.poll();
                        }
                        if (runnable == null) {
                            break;
                        }
                    }
                } catch (Throwable th) {
                    if (interrupted) {
                        Thread.currentThread().interrupt();
                    }
                }
            } catch (Error e) {
                synchronized (this.f25006a.f25004e) {
                    this.f25006a.f25002c = false;
                    throw e;
                }
            }
        }
        this.f25006a.f25002c = false;
        if (interrupted) {
            Thread.currentThread().interrupt();
            return;
        }
        return;
        if (interrupted) {
            Thread.currentThread().interrupt();
        }
    }
}
