package defpackage;

import android.os.Looper;

/* renamed from: frj */
public abstract class frj {
    frf d;

    public abstract String c();

    public void b() {
        if (this.d == null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.d.d(this);
        } else {
            this.d.b(this);
        }
    }

    public boolean k() {
        return this.d == null;
    }
}
