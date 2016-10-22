package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import oto;

/* renamed from: as */
public final class as {
    private static as d;
    final Object a;
    oto b;
    oto c;
    private final Handler e;

    public static as a() {
        if (d == null) {
            d = new as();
        }
        return d;
    }

    private as() {
        this.a = new Object();
        this.e = new Handler(Looper.getMainLooper(), new at(this));
    }

    public void a(a aVar, int i) {
        synchronized (this.a) {
            if (f(aVar)) {
                a(this.b, i);
            } else if (g(aVar)) {
                a(this.c, i);
            }
        }
    }

    public void a(a aVar) {
        synchronized (this.a) {
            if (f(aVar)) {
                this.b = null;
                if (!(this.c == null || this.c == null)) {
                    this.b = this.c;
                    this.c = null;
                    if (((a) oto.a(this.b).get()) == null) {
                        this.b = null;
                    }
                }
            }
        }
    }

    public void b(a aVar) {
        synchronized (this.a) {
            if (f(aVar)) {
                a(this.b);
            }
        }
    }

    public void c(a aVar) {
        synchronized (this.a) {
            if (f(aVar)) {
                this.e.removeCallbacksAndMessages(this.b);
            }
        }
    }

    public void d(a aVar) {
        synchronized (this.a) {
            if (f(aVar)) {
                a(this.b);
            }
        }
    }

    public boolean e(a aVar) {
        boolean z;
        synchronized (this.a) {
            z = f(aVar) || g(aVar);
        }
        return z;
    }

    boolean a(oto oto, int i) {
        if (((a) oto.a(oto).get()) == null) {
            return false;
        }
        this.e.removeCallbacksAndMessages(oto);
        return true;
    }

    private boolean f(a aVar) {
        return this.b != null && this.b.a(aVar);
    }

    private boolean g(a aVar) {
        return this.c != null && this.c.a(aVar);
    }

    private void a(oto oto) {
        if (oto.b(oto) != -2) {
            int i = 2750;
            if (oto.b(oto) > 0) {
                i = oto.b(oto);
            } else if (oto.b(oto) == -1) {
                i = 1500;
            }
            this.e.removeCallbacksAndMessages(oto);
            this.e.sendMessageDelayed(Message.obtain(this.e, 0, oto), (long) i);
        }
    }
}
