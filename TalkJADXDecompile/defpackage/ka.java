package defpackage;

import android.os.Build.VERSION;

/* renamed from: ka */
public final class ka {
    private boolean a;
    private Object b;
    private boolean c;

    private boolean d() {
        boolean z;
        synchronized (this) {
            z = this.a;
        }
        return z;
    }

    public void a() {
        if (d()) {
            throw new kb();
        }
    }

    public void b() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.c = true;
            Object obj = this.b;
            if (obj != null) {
                try {
                    gwb.c(obj);
                } catch (Throwable th) {
                    synchronized (this) {
                    }
                    this.c = false;
                    notifyAll();
                }
            }
            synchronized (this) {
                this.c = false;
                notifyAll();
            }
        }
    }

    public Object c() {
        if (VERSION.SDK_INT < 16) {
            return null;
        }
        Object obj;
        synchronized (this) {
            if (this.b == null) {
                this.b = gwb.d();
                if (this.a) {
                    gwb.c(this.b);
                }
            }
            obj = this.b;
        }
        return obj;
    }
}
