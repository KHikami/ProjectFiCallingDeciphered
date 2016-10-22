package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: lji */
public final class lji implements Runnable {
    private static final kad b;
    final Throwable a;
    private final AtomicReference<ljk> c;
    private final String d;
    private ljo e;

    static {
        b = new kad("SpanEndSignal");
    }

    lji(ljo ljo) {
        this.c = new AtomicReference(ljk.OPEN);
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
