package defpackage;

import java.util.concurrent.atomic.AtomicReference;

public final class lji implements Runnable {
    private static final kad b = new kad("SpanEndSignal");
    final Throwable a;
    private final AtomicReference<ljk> c = new AtomicReference(ljk.OPEN);
    private final String d;
    private ljo e;

    lji(ljo ljo) {
        this.e = ljo;
        this.d = ljo.c();
        this.a = null;
    }

    public void finalize() {
        super.finalize();
    }

    public void run() {
        if (((ljk) this.c.getAndSet(ljk.CLOSED_BY_FUTURE)).equals(ljk.ATTACHED)) {
            c();
        } else {
            gwb.a(new ljj(this));
        }
    }

    void a() {
        if (this.c.compareAndSet(ljk.OPEN, ljk.CLOSED)) {
            c();
        } else if (((ljk) this.c.get()).equals(ljk.CLOSED)) {
            throw new IllegalStateException("Span was already closed!");
        }
    }

    private void c() {
        this.e.e();
        this.e = null;
    }

    String b() {
        return this.d;
    }
}
