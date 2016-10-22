package defpackage;

import java.io.File;
import java.util.List;

/* renamed from: aqs */
final class aqs implements aof<Object>, apd {
    private final ape a;
    private final apf<?> b;
    private int c;
    private int d;
    private anv e;
    private List<auh<File, ?>> f;
    private int g;
    private volatile aui<?> h;
    private File i;
    private aqt j;

    public aqs(apf<?> apf_, ape ape) {
        this.c = 0;
        this.d = -1;
        this.b = apf_;
        this.a = ape;
    }

    public boolean a() {
        List k = this.b.k();
        if (k.isEmpty()) {
            return false;
        }
        List i = this.b.i();
        while (true) {
            if (this.f != null && c()) {
                break;
            }
            this.d++;
            if (this.d >= i.size()) {
                this.c++;
                if (this.c >= k.size()) {
                    return false;
                }
                this.d = 0;
            }
            anv anv = (anv) k.get(this.c);
            Class cls = (Class) i.get(this.d);
            this.j = new aqt(anv, this.b.f(), this.b.g(), this.b.h(), this.b.c(cls), cls, this.b.e());
            this.i = this.b.b().a(this.j);
            if (this.i != null) {
                this.e = anv;
                this.f = this.b.a(this.i);
                this.g = 0;
            }
        }
        this.h = null;
        boolean z = false;
        while (!z && c()) {
            boolean z2;
            List list = this.f;
            int i2 = this.g;
            this.g = i2 + 1;
            this.h = ((auh) list.get(i2)).a(this.i, this.b.g(), this.b.h(), this.b.e());
            if (this.h == null || !this.b.a(this.h.c.d())) {
                z2 = z;
            } else {
                z2 = true;
                this.h.c.a(this.b.d(), this);
            }
            z = z2;
        }
        return z;
    }

    private boolean c() {
        return this.g < this.f.size();
    }

    public void b() {
        aui aui = this.h;
        if (aui != null) {
            aui.c.b();
        }
    }

    public void a(Object obj) {
        this.a.a(this.e, obj, this.h.c, anq.RESOURCE_DISK_CACHE, this.j);
    }

    public void a(Exception exception) {
        this.a.a(this.j, exception, this.h.c, anq.RESOURCE_DISK_CACHE);
    }
}
