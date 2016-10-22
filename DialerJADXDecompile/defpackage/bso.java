package defpackage;

/* renamed from: bso */
abstract class bso implements Runnable {
    private /* synthetic */ bsf a;

    bso(bsf bsf) {
        this.a = bsf;
    }

    protected abstract void a();

    public void run() {
        this.a.b.lock();
        try {
            if (!Thread.interrupted()) {
                a();
                this.a.b.unlock();
            }
        } catch (RuntimeException e) {
            bsz bsz = this.a.a;
            bsz.e.sendMessage(bsz.e.obtainMessage(2, e));
        } finally {
            this.a.b.unlock();
        }
    }
}
