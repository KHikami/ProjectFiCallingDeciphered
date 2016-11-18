package p000;

import java.io.File;
import java.io.IOException;

public final class anc {
    final and f1393a;
    final boolean[] f1394b;
    final /* synthetic */ amz f1395c;
    private boolean f1396d;

    anc(amz amz, and and) {
        this.f1395c = amz;
        this.f1393a = and;
        this.f1394b = and.f1401e ? null : new boolean[amz.f1378b];
    }

    public File m3007a(int i) {
        File b;
        synchronized (this.f1395c) {
            if (this.f1393a.f1402f != this) {
                throw new IllegalStateException();
            }
            if (!this.f1393a.f1401e) {
                this.f1394b[0] = true;
            }
            b = this.f1393a.m3015b(0);
            if (!this.f1395c.f1377a.exists()) {
                this.f1395c.f1377a.mkdirs();
            }
        }
        return b;
    }

    public void m3008a() {
        this.f1395c.m3002a(this, true);
        this.f1396d = true;
    }

    public void m3009b() {
        this.f1395c.m3002a(this, false);
    }

    public void m3010c() {
        if (!this.f1396d) {
            try {
                m3009b();
            } catch (IOException e) {
            }
        }
    }
}
