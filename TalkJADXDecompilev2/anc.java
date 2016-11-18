package defpackage;

import java.io.File;
import java.io.IOException;

public final class anc {
    final and a;
    final boolean[] b;
    final /* synthetic */ amz c;
    private boolean d;

    anc(amz amz, and and) {
        this.c = amz;
        this.a = and;
        this.b = and.e ? null : new boolean[amz.b];
    }

    public File a(int i) {
        File b;
        synchronized (this.c) {
            if (this.a.f != this) {
                throw new IllegalStateException();
            }
            if (!this.a.e) {
                this.b[0] = true;
            }
            b = this.a.b(0);
            if (!this.c.a.exists()) {
                this.c.a.mkdirs();
            }
        }
        return b;
    }

    public void a() {
        this.c.a(this, true);
        this.d = true;
    }

    public void b() {
        this.c.a(this, false);
    }

    public void c() {
        if (!this.d) {
            try {
                b();
            } catch (IOException e) {
            }
        }
    }
}
