package defpackage;

abstract class hfc implements Runnable {
    final /* synthetic */ hes b;

    hfc(hes hes) {
        this.b = hes;
    }

    protected abstract void a();

    public void run() {
        this.b.b.lock();
        try {
            if (!Thread.interrupted()) {
                a();
                this.b.b.unlock();
            }
        } catch (RuntimeException e) {
            this.b.a.a(e);
        } finally {
            this.b.b.unlock();
        }
    }
}
