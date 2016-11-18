package p000;

import java.util.concurrent.CountDownLatch;

final class hw extends io<Void, Void, D> implements Runnable {
    boolean f17409a;
    final /* synthetic */ hv f17410b;
    private final CountDownLatch f17411h = new CountDownLatch(1);

    hw(hv hvVar) {
        this.f17410b = hvVar;
    }

    protected /* synthetic */ Object mo3026a(Object[] objArr) {
        return m21129b();
    }

    private D m21129b() {
        try {
            return this.f17410b.m1306e();
        } catch (kb e) {
            if (this.f17406e.isCancelled()) {
                return null;
            }
            throw e;
        }
    }

    protected void mo3027a(D d) {
        try {
            this.f17410b.m1302b(this, d);
        } finally {
            this.f17411h.countDown();
        }
    }

    protected void mo3028b(D d) {
        try {
            this.f17410b.m1299a(this, d);
        } finally {
            this.f17411h.countDown();
        }
    }

    public void run() {
        this.f17409a = false;
        this.f17410b.m1304c();
    }
}
