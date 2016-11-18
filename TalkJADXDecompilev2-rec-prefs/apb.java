package p000;

import java.io.File;
import java.util.List;

final class apb implements aof<Object>, apd {
    private List<anv> f1990a;
    private final apf<?> f1991b;
    private final ape f1992c;
    private int f1993d;
    private anv f1994e;
    private List<auh<File, ?>> f1995f;
    private int f1996g;
    private volatile aui<?> f1997h;
    private File f1998i;

    apb(apf<?> apf_, ape ape) {
        this(apf_.m3634k(), apf_, ape);
    }

    apb(List<anv> list, apf<?> apf_, ape ape) {
        this.f1993d = -1;
        this.f1990a = list;
        this.f1991b = apf_;
        this.f1992c = ape;
    }

    public boolean mo327a() {
        boolean z = false;
        while (true) {
            if (this.f1995f != null && m3606c()) {
                break;
            }
            this.f1993d++;
            if (this.f1993d >= this.f1990a.size()) {
                break;
            }
            anv anv = (anv) this.f1990a.get(this.f1993d);
            this.f1998i = this.f1991b.m3624b().mo368a(new apc(anv, this.f1991b.m3629f()));
            if (this.f1998i != null) {
                this.f1994e = anv;
                this.f1995f = this.f1991b.m3617a(this.f1998i);
                this.f1996g = 0;
            }
        }
        this.f1997h = null;
        while (!z && m3606c()) {
            boolean z2;
            List list = this.f1995f;
            int i = this.f1996g;
            this.f1996g = i + 1;
            this.f1997h = ((auh) list.get(i)).mo377a(this.f1998i, this.f1991b.m3630g(), this.f1991b.m3631h(), this.f1991b.m3628e());
            if (this.f1997h == null || !this.f1991b.m3621a(this.f1997h.f2358c.mo321d())) {
                z2 = z;
            } else {
                z2 = true;
                this.f1997h.f2358c.mo312a(this.f1991b.m3627d(), this);
            }
            z = z2;
        }
        return z;
    }

    private boolean m3606c() {
        return this.f1996g < this.f1995f.size();
    }

    public void mo328b() {
        aui aui = this.f1997h;
        if (aui != null) {
            aui.f2358c.mo313b();
        }
    }

    public void mo326a(Object obj) {
        this.f1992c.mo330a(this.f1994e, obj, this.f1997h.f2358c, anq.DATA_DISK_CACHE, this.f1994e);
    }

    public void mo325a(Exception exception) {
        this.f1992c.mo329a(this.f1994e, exception, this.f1997h.f2358c, anq.DATA_DISK_CACHE);
    }
}
