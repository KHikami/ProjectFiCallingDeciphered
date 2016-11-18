package p000;

import java.util.ArrayList;
import java.util.List;

public final class exl extends evz {
    private static final long serialVersionUID = 1;
    public byte[] f12441g;
    public List<String> f12442h = new ArrayList();

    exl(lrh lrh) {
        super(lrh, lrh.responseHeader, -1);
        this.f12441g = lrh.f26214b;
        for (lqv lqv : lrh.f26213a) {
            this.f12442h.add(lqv.f26178a.f26403b);
        }
        if (glk.m17973a("Babel", 3)) {
            String str = "Babel";
            String str2 = "GetFavoritesResponse debugUrl: ";
            String valueOf = String.valueOf(lrh.responseHeader.f26517c);
            glk.m17976b(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        List arrayList = new ArrayList(this.f12442h.size());
        blo.m5958a();
        try {
            for (String L : this.f12442h) {
                edk L2 = blo.m5920L(L);
                if (L2 != null) {
                    arrayList.add(L2);
                }
            }
            blo.m6022b(arrayList, 3);
            blo.m6015b();
            bkq.m5676b(gwb.m1400H(), blo.m6056g().m5638g(), "hash_pinned");
        } finally {
            blo.m6028c();
        }
    }
}
