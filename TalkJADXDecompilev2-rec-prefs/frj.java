package p000;

import android.os.Looper;

public abstract class frj {
    frf f3553d;

    public abstract String mo594c();

    public void mo607b() {
        if (this.f3553d == null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f3553d.m12720d(this);
        } else {
            this.f3553d.m12714b(this);
        }
    }

    public boolean m5495k() {
        return this.f3553d == null;
    }
}
