package p000;

import java.io.File;
import java.util.List;

final class aqs implements aof<Object>, apd {
    private final ape f2159a;
    private final apf<?> f2160b;
    private int f2161c = 0;
    private int f2162d = -1;
    private anv f2163e;
    private List<auh<File, ?>> f2164f;
    private int f2165g;
    private volatile aui<?> f2166h;
    private File f2167i;
    private aqt f2168j;

    public aqs(apf<?> apf_, ape ape) {
        this.f2160b = apf_;
        this.f2159a = ape;
    }

    public boolean mo327a() {
        List k = this.f2160b.m3634k();
        if (k.isEmpty()) {
            return false;
        }
        List i = this.f2160b.m3632i();
        while (true) {
            if (this.f2164f != null && m3760c()) {
                break;
            }
            this.f2162d++;
            if (this.f2162d >= i.size()) {
                this.f2161c++;
                if (this.f2161c >= k.size()) {
                    return false;
                }
                this.f2162d = 0;
            }
            anv anv = (anv) k.get(this.f2161c);
            Class cls = (Class) i.get(this.f2162d);
            this.f2168j = new aqt(anv, this.f2160b.m3629f(), this.f2160b.m3630g(), this.f2160b.m3631h(), this.f2160b.m3625c(cls), cls, this.f2160b.m3628e());
            this.f2167i = this.f2160b.m3624b().mo368a(this.f2168j);
            if (this.f2167i != null) {
                this.f2163e = anv;
                this.f2164f = this.f2160b.m3617a(this.f2167i);
                this.f2165g = 0;
            }
        }
        this.f2166h = null;
        boolean z = false;
        while (!z && m3760c()) {
            boolean z2;
            List list = this.f2164f;
            int i2 = this.f2165g;
            this.f2165g = i2 + 1;
            this.f2166h = ((auh) list.get(i2)).mo377a(this.f2167i, this.f2160b.m3630g(), this.f2160b.m3631h(), this.f2160b.m3628e());
            if (this.f2166h == null || !this.f2160b.m3621a(this.f2166h.f2358c.mo321d())) {
                z2 = z;
            } else {
                z2 = true;
                this.f2166h.f2358c.mo312a(this.f2160b.m3627d(), this);
            }
            z = z2;
        }
        return z;
    }

    private boolean m3760c() {
        return this.f2165g < this.f2164f.size();
    }

    public void mo328b() {
        aui aui = this.f2166h;
        if (aui != null) {
            aui.f2358c.mo313b();
        }
    }

    public void mo326a(Object obj) {
        this.f2159a.mo330a(this.f2163e, obj, this.f2166h.f2358c, anq.RESOURCE_DISK_CACHE, this.f2168j);
    }

    public void mo325a(Exception exception) {
        this.f2159a.mo329a(this.f2168j, exception, this.f2166h.f2358c, anq.RESOURCE_DISK_CACHE);
    }
}
