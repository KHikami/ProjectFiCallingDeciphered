package defpackage;

import java.io.FileOutputStream;
import java.io.OutputStream;

public final class dzk {
    final dzm a;
    boolean b;
    final /* synthetic */ dzi c;

    dzk(dzi dzi, dzm dzm) {
        this.c = dzi;
        this.a = dzm;
    }

    public OutputStream a(int i) {
        OutputStream dzl;
        synchronized (this.c) {
            if (this.a.d != this) {
                throw new IllegalStateException();
            }
            dzl = new dzl(this, new FileOutputStream(this.a.b(0)));
        }
        return dzl;
    }

    public void a() {
        if (this.b) {
            this.c.a(this, false);
            this.c.c(this.a.a);
            return;
        }
        this.c.a(this, true);
    }

    public void b() {
        this.c.a(this, false);
    }
}
