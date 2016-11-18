package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class as {
    private static as f2251d;
    final Object f2252a = new Object();
    oto f2253b;
    oto f2254c;
    private final Handler f2255e = new Handler(Looper.getMainLooper(), new at(this));

    public static as m3892a() {
        if (f2251d == null) {
            f2251d = new as();
        }
        return f2251d;
    }

    private as() {
    }

    public void m3897a(C0000a c0000a, int i) {
        synchronized (this.f2252a) {
            if (m3894f(c0000a)) {
                m3898a(this.f2253b, i);
            } else if (m3895g(c0000a)) {
                m3898a(this.f2254c, i);
            }
        }
    }

    public void m3896a(C0000a c0000a) {
        synchronized (this.f2252a) {
            if (m3894f(c0000a)) {
                this.f2253b = null;
                if (!(this.f2254c == null || this.f2254c == null)) {
                    this.f2253b = this.f2254c;
                    this.f2254c = null;
                    if (((C0000a) oto.a(this.f2253b).get()) == null) {
                        this.f2253b = null;
                    }
                }
            }
        }
    }

    public void m3899b(C0000a c0000a) {
        synchronized (this.f2252a) {
            if (m3894f(c0000a)) {
                m3893a(this.f2253b);
            }
        }
    }

    public void m3900c(C0000a c0000a) {
        synchronized (this.f2252a) {
            if (m3894f(c0000a)) {
                this.f2255e.removeCallbacksAndMessages(this.f2253b);
            }
        }
    }

    public void m3901d(C0000a c0000a) {
        synchronized (this.f2252a) {
            if (m3894f(c0000a)) {
                m3893a(this.f2253b);
            }
        }
    }

    public boolean m3902e(C0000a c0000a) {
        boolean z;
        synchronized (this.f2252a) {
            z = m3894f(c0000a) || m3895g(c0000a);
        }
        return z;
    }

    boolean m3898a(oto oto, int i) {
        if (((C0000a) oto.a(oto).get()) == null) {
            return false;
        }
        this.f2255e.removeCallbacksAndMessages(oto);
        return true;
    }

    private boolean m3894f(C0000a c0000a) {
        return this.f2253b != null && this.f2253b.a(c0000a);
    }

    private boolean m3895g(C0000a c0000a) {
        return this.f2254c != null && this.f2254c.a(c0000a);
    }

    private void m3893a(oto oto) {
        if (oto.b(oto) != -2) {
            int i = 2750;
            if (oto.b(oto) > 0) {
                i = oto.b(oto);
            } else if (oto.b(oto) == -1) {
                i = 1500;
            }
            this.f2255e.removeCallbacksAndMessages(oto);
            this.f2255e.sendMessageDelayed(Message.obtain(this.f2255e, 0, oto), (long) i);
        }
    }
}
