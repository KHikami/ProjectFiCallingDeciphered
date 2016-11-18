package p000;

import java.util.Iterator;
import java.util.List;

final class frx implements Runnable {
    boolean f13858a;
    final List<C0000a> f13859b;
    final hwl f13860c;
    final hwq f13861d;
    final hwl f13862e;
    final hwq f13863f;

    public frx(List<C0000a> list, hwl hwl, hwq hwq, hwl hwl2, hwq hwq2) {
        this.f13859b = list;
        this.f13860c = hwl;
        this.f13861d = hwq;
        this.f13862e = hwl2;
        this.f13863f = hwq2;
    }

    public void run() {
        iil.m21867a();
        long a = glj.m17956a();
        Iterator it = this.f13859b.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (frq.f13826a) {
            new StringBuilder(57).append("GmsPeopleCache: onDataBufferReady ").append(glj.m17956a() - a).append(" ms");
        }
        if (this.f13862e != null) {
            this.f13862e.mo2073b();
        }
        if (this.f13863f != null) {
            this.f13863f.mo2073b();
        }
        this.f13858a = true;
    }
}
