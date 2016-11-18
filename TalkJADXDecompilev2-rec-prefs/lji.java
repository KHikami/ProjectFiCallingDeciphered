package p000;

import java.util.concurrent.atomic.AtomicReference;

public final class lji implements Runnable {
    private static final kad f25087b = new kad("SpanEndSignal");
    final Throwable f25088a;
    private final AtomicReference<ljk> f25089c = new AtomicReference(ljk.OPEN);
    private final String f25090d;
    private ljo f25091e;

    lji(ljo ljo) {
        this.f25091e = ljo;
        this.f25090d = ljo.mo3715c();
        this.f25088a = null;
    }

    public void finalize() {
        super.finalize();
    }

    public void run() {
        if (((ljk) this.f25089c.getAndSet(ljk.CLOSED_BY_FUTURE)).equals(ljk.ATTACHED)) {
            m29174c();
        } else {
            gwb.m1863a(new ljj(this));
        }
    }

    void m29175a() {
        if (this.f25089c.compareAndSet(ljk.OPEN, ljk.CLOSED)) {
            m29174c();
        } else if (((ljk) this.f25089c.get()).equals(ljk.CLOSED)) {
            throw new IllegalStateException("Span was already closed!");
        }
    }

    private void m29174c() {
        this.f25091e.mo3718e();
        this.f25091e = null;
    }

    String m29176b() {
        return this.f25090d;
    }
}
