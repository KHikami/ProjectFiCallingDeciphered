package p000;

import android.os.Build.VERSION;

public final class ka {
    private boolean f21334a;
    private Object f21335b;
    private boolean f21336c;

    private boolean m25493d() {
        boolean z;
        synchronized (this) {
            z = this.f21334a;
        }
        return z;
    }

    public void m25494a() {
        if (m25493d()) {
            throw new kb();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m25495b() {
        synchronized (this) {
            if (this.f21334a) {
                return;
            }
            this.f21334a = true;
            this.f21336c = true;
            Object obj = this.f21335b;
        }
    }

    public Object m25496c() {
        if (VERSION.SDK_INT < 16) {
            return null;
        }
        Object obj;
        synchronized (this) {
            if (this.f21335b == null) {
                this.f21335b = gwb.m2132d();
                if (this.f21334a) {
                    gwb.m2098c(this.f21335b);
                }
            }
            obj = this.f21335b;
        }
        return obj;
    }
}
