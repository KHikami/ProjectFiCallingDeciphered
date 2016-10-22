import java.util.concurrent.CountDownLatch;

final class hw extends io<Void, Void, D> implements Runnable {
    boolean a;
    final /* synthetic */ hv b;
    private final CountDownLatch h;

    hw(hv hvVar) {
        this.b = hvVar;
        this.h = new CountDownLatch(1);
    }

    protected /* synthetic */ Object a(Object[] objArr) {
        return b();
    }

    private D b() {
        try {
            return this.b.e();
        } catch (kb e) {
            if (this.e.isCancelled()) {
                return null;
            }
            throw e;
        }
    }

    protected void a(D d) {
        try {
            this.b.b(this, d);
        } finally {
            this.h.countDown();
        }
    }

    protected void b(D d) {
        try {
            this.b.a(this, d);
        } finally {
            this.h.countDown();
        }
    }

    public void run() {
        this.a = false;
        this.b.c();
    }
}
