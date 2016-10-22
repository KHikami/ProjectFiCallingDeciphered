package defpackage;

import java.util.Iterator;

/* renamed from: gro */
final class gro implements guq<hxy> {
    final /* synthetic */ grn a;

    gro(grn grn) {
        this.a = grn;
    }

    private void a(hxy hxy) {
        try {
            if (hxy.k().d()) {
                int i = 0;
                Iterator it = hxy.iterator();
                while (it.hasNext()) {
                    int a = this.a.a.a((hxw) it.next());
                    if (a <= i) {
                        a = i;
                    }
                    i = a;
                }
                if (i > 0) {
                    this.a.a.a(i);
                }
            }
            hxy.b();
        } catch (Throwable th) {
            hxy.b();
        }
    }
}
