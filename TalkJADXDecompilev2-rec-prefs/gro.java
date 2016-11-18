package p000;

import java.util.Iterator;

final class gro implements guq<hxy> {
    final /* synthetic */ grn f15979a;

    gro(grn grn) {
        this.f15979a = grn;
    }

    private void m18356a(hxy hxy) {
        try {
            if (hxy.mo1279k().m9663d()) {
                int i = 0;
                Iterator it = hxy.iterator();
                while (it.hasNext()) {
                    int a = this.f15979a.f15978a.m18344a((hxw) it.next());
                    if (a <= i) {
                        a = i;
                    }
                    i = a;
                }
                if (i > 0) {
                    this.f15979a.f15978a.m18347a(i);
                }
            }
            hxy.mo2073b();
        } catch (Throwable th) {
            hxy.mo2073b();
        }
    }
}
