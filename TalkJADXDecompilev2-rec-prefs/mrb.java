package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public final class mrb implements Closeable {
    static final mre f28140a;
    final mre f28141b;
    private final Deque<Closeable> f28142c = new ArrayDeque(4);
    private Throwable f28143d;

    mrb(mre mre) {
        this.f28141b = (mre) bm.m6122a((Object) mre);
    }

    public <C extends Closeable> C m32747a(C c) {
        if (c != null) {
            this.f28142c.addFirst(c);
        }
        return c;
    }

    public RuntimeException m32748a(Throwable th) {
        bm.m6122a((Object) th);
        this.f28143d = th;
        mfw.m32012a(th, IOException.class);
        throw new RuntimeException(th);
    }

    public void close() {
        Throwable th = this.f28143d;
        while (!this.f28142c.isEmpty()) {
            Closeable closeable = (Closeable) this.f28142c.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.f28141b.mo3920a(closeable, th, th2);
                }
            }
        }
        if (this.f28143d == null && th != null) {
            mfw.m32012a(th, IOException.class);
            throw new AssertionError(th);
        }
    }

    static {
        Object obj;
        mre mre;
        if (mrd.f28146b != null) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            mre = mrd.f28145a;
        } else {
            mre = mrc.f28144a;
        }
        f28140a = mre;
    }
}
