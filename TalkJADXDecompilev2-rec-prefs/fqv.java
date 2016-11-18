package p000;

import java.util.List;

final class fqv implements Runnable {
    final /* synthetic */ fbt f13785a;
    final /* synthetic */ edk f13786b;
    final /* synthetic */ fqu f13787c;

    fqv(fqu fqu, fbt fbt, edk edk) {
        this.f13787c = fqu;
        this.f13785a = fbt;
        this.f13786b = edk;
    }

    public void run() {
        fqu fqu = this.f13787c;
        fbt fbt = this.f13785a;
        edk edk = this.f13786b;
        List<frj> c = fqu.m12716c(fbt.m14924c());
        if (c != null && c.size() != 0) {
            String str = edk.f11216e;
            String str2 = edk.f11219h;
            String str3 = edk.f11217f;
            for (frj frj : c) {
                if (frj instanceof bol) {
                    bol bol = (bol) frj;
                    ((fqy) bol.m5574a()).mo1117a(str, str2, edk.f11234w, bol, fqu.f13782b);
                } else if (frj instanceof bke) {
                    bke bke = (bke) frj;
                    bke.m5574a().mo1118a(str, str2, bke, str3, fqu.f13782b);
                }
            }
            if (fqu.f13780a) {
                fqu.m12713b();
            }
        }
    }
}
