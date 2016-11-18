package p000;

import java.io.FileOutputStream;
import java.io.OutputStream;

public final class dzk {
    final dzm f10916a;
    boolean f10917b;
    final /* synthetic */ dzi f10918c;

    dzk(dzi dzi, dzm dzm) {
        this.f10918c = dzi;
        this.f10916a = dzm;
    }

    public OutputStream m13169a(int i) {
        OutputStream dzl;
        synchronized (this.f10918c) {
            if (this.f10916a.f10923d != this) {
                throw new IllegalStateException();
            }
            dzl = new dzl(this, new FileOutputStream(this.f10916a.m13176b(0)));
        }
        return dzl;
    }

    public void m13170a() {
        if (this.f10917b) {
            this.f10918c.m13163a(this, false);
            this.f10918c.m13167c(this.f10916a.f10920a);
            return;
        }
        this.f10918c.m13163a(this, true);
    }

    public void m13171b() {
        this.f10918c.m13163a(this, false);
    }
}
