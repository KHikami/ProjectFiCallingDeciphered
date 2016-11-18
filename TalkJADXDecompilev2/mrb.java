package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public final class mrb implements Closeable {
    static final mre a;
    final mre b;
    private final Deque<Closeable> c = new ArrayDeque(4);
    private Throwable d;

    mrb(mre mre) {
        this.b = (mre) bm.a((Object) mre);
    }

    public <C extends Closeable> C a(C c) {
        if (c != null) {
            this.c.addFirst(c);
        }
        return c;
    }

    public RuntimeException a(Throwable th) {
        bm.a((Object) th);
        this.d = th;
        mfw.a(th, IOException.class);
        throw new RuntimeException(th);
    }

    public void close() {
        Throwable th = this.d;
        while (!this.c.isEmpty()) {
            Closeable closeable = (Closeable) this.c.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.b.a(closeable, th, th2);
                }
            }
        }
        if (this.d == null && th != null) {
            mfw.a(th, IOException.class);
            throw new AssertionError(th);
        }
    }

    static {
        Object obj;
        mre mre;
        if (mrd.b != null) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            mre = mrd.a;
        } else {
            mre = mrc.a;
        }
        a = mre;
    }
}
