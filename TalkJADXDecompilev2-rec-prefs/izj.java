package p000;

import java.io.File;
import java.lang.ref.ReferenceQueue;

public final class izj {
    private final izm f19480a;
    private izk f19481b;
    private boolean f19482c;
    private izi f19483d;

    public izj() {
        this(new izm());
    }

    public void m23584a(izi izi) {
        this.f19483d = izi;
    }

    private izj(izm izm) {
        this.f19482c = false;
        this.f19480a = (izm) ba.m4536a((Object) izm);
    }

    public synchronized void m23585a(Object obj, String str) {
        if (this.f19482c) {
            if (this.f19481b == null) {
                this.f19481b = new izk(new ReferenceQueue(), new izl(), this.f19483d);
                this.f19481b.start();
            }
            this.f19481b.m23593a(obj, str);
        }
    }

    public synchronized void m23583a() {
        this.f19482c = true;
    }

    public boolean m23587b() {
        return this.f19482c;
    }

    public synchronized void m23588c() {
        if (this.f19482c) {
            this.f19482c = false;
            if (this.f19481b != null) {
                this.f19481b.interrupt();
                this.f19481b = null;
            }
        }
    }

    public boolean m23586a(File file) {
        if (this.f19481b != null) {
            return this.f19481b.m23594a(file);
        }
        return false;
    }
}
