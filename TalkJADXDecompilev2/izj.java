package defpackage;

import java.io.File;
import java.lang.ref.ReferenceQueue;

public final class izj {
    private final izm a;
    private izk b;
    private boolean c;
    private izi d;

    public izj() {
        this(new izm());
    }

    public void a(izi izi) {
        this.d = izi;
    }

    private izj(izm izm) {
        this.c = false;
        this.a = (izm) ba.a((Object) izm);
    }

    public synchronized void a(Object obj, String str) {
        if (this.c) {
            if (this.b == null) {
                this.b = new izk(new ReferenceQueue(), new izl(), this.d);
                this.b.start();
            }
            this.b.a(obj, str);
        }
    }

    public synchronized void a() {
        this.c = true;
    }

    public boolean b() {
        return this.c;
    }

    public synchronized void c() {
        if (this.c) {
            this.c = false;
            if (this.b != null) {
                this.b.interrupt();
                this.b = null;
            }
        }
    }

    public boolean a(File file) {
        if (this.b != null) {
            return this.b.a(file);
        }
        return false;
    }
}
