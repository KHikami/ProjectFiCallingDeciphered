package p000;

import java.util.List;

final class fqw implements Runnable {
    final /* synthetic */ fbt f13788a;
    final /* synthetic */ fqu f13789b;

    fqw(fqu fqu, fbt fbt) {
        this.f13789b = fqu;
        this.f13788a = fbt;
    }

    public void run() {
        fqu fqu = this.f13789b;
        List<frj> c = fqu.m12716c(this.f13788a.m14924c());
        if (c != null && c.size() != 0) {
            for (frj frj : c) {
                bke bke = (bke) frj;
                bke.m5574a().mo1114a(bke);
            }
            if (fqu.f13780a) {
                fqu.m12713b();
            }
        }
    }
}
