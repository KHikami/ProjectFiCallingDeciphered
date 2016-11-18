package p000;

import java.util.concurrent.CountDownLatch;

final class bcz implements bcs {
    final CountDownLatch f3068a;
    final long f3069b;

    public bcz() {
        this(15);
    }

    private bcz(long j) {
        this.f3068a = new CountDownLatch(1);
        this.f3069b = 15;
    }

    public void mo469a(Runnable runnable) {
        gwb.aJ();
        new bda(this, runnable).m4950b(new Void[0]);
    }

    void m4938a() {
        this.f3068a.countDown();
    }
}
