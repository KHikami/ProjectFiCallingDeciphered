package defpackage;

import java.util.List;

final class fqv implements Runnable {
    final /* synthetic */ fbt a;
    final /* synthetic */ edk b;
    final /* synthetic */ fqu c;

    fqv(fqu fqu, fbt fbt, edk edk) {
        this.c = fqu;
        this.a = fbt;
        this.b = edk;
    }

    public void run() {
        fqu fqu = this.c;
        fbt fbt = this.a;
        edk edk = this.b;
        List<frj> c = fqu.c(fbt.c());
        if (c != null && c.size() != 0) {
            String str = edk.e;
            String str2 = edk.h;
            String str3 = edk.f;
            for (frj frj : c) {
                if (frj instanceof bol) {
                    bol bol = (bol) frj;
                    ((fqy) bol.a()).a(str, str2, edk.w, bol, fqu.b);
                } else if (frj instanceof bke) {
                    bke bke = (bke) frj;
                    bke.a().a(str, str2, bke, str3, fqu.b);
                }
            }
            if (fqu.a) {
                fqu.b();
            }
        }
    }
}
