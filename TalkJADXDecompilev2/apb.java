package defpackage;

import java.io.File;
import java.util.List;

final class apb implements aof<Object>, apd {
    private List<anv> a;
    private final apf<?> b;
    private final ape c;
    private int d;
    private anv e;
    private List<auh<File, ?>> f;
    private int g;
    private volatile aui<?> h;
    private File i;

    apb(apf<?> apf_, ape ape) {
        this(apf_.k(), apf_, ape);
    }

    apb(List<anv> list, apf<?> apf_, ape ape) {
        this.d = -1;
        this.a = list;
        this.b = apf_;
        this.c = ape;
    }

    public boolean a() {
        boolean z = false;
        while (true) {
            if (this.f != null && c()) {
                break;
            }
            this.d++;
            if (this.d >= this.a.size()) {
                break;
            }
            anv anv = (anv) this.a.get(this.d);
            this.i = this.b.b().a(new apc(anv, this.b.f()));
            if (this.i != null) {
                this.e = anv;
                this.f = this.b.a(this.i);
                this.g = 0;
            }
        }
        this.h = null;
        while (!z && c()) {
            boolean z2;
            List list = this.f;
            int i = this.g;
            this.g = i + 1;
            this.h = ((auh) list.get(i)).a(this.i, this.b.g(), this.b.h(), this.b.e());
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
        this.c.a(this.e, obj, this.h.c, anq.DATA_DISK_CACHE, this.e);
    }

    public void a(Exception exception) {
        this.c.a(this.e, exception, this.h.c, anq.DATA_DISK_CACHE);
    }
}
