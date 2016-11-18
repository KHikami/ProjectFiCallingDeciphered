package defpackage;

import java.util.List;

final class fqw implements Runnable {
    final /* synthetic */ fbt a;
    final /* synthetic */ fqu b;

    fqw(fqu fqu, fbt fbt) {
        this.b = fqu;
        this.a = fbt;
    }

    public void run() {
        fqu fqu = this.b;
        List<frj> c = fqu.c(this.a.c());
        if (c != null && c.size() != 0) {
            for (frj frj : c) {
                bke bke = (bke) frj;
                bke.a().a(bke);
            }
            if (fqu.a) {
                fqu.b();
            }
        }
    }
}
