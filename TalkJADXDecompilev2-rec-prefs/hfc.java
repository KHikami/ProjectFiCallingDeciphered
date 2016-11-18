package p000;

abstract class hfc implements Runnable {
    final /* synthetic */ hes f16785b;

    hfc(hes hes) {
        this.f16785b = hes;
    }

    protected abstract void mo2501a();

    public void run() {
        this.f16785b.f16761b.lock();
        try {
            if (!Thread.interrupted()) {
                mo2501a();
                this.f16785b.f16761b.unlock();
            }
        } catch (RuntimeException e) {
            this.f16785b.f16760a.m19640a(e);
        } finally {
            this.f16785b.f16761b.unlock();
        }
    }
}
