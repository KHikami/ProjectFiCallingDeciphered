import java.util.ArrayList;
import java.util.List;

public final class exl extends evz {
    private static final long serialVersionUID = 1;
    public byte[] g;
    public List<String> h;

    exl(lrh lrh) {
        super(lrh, lrh.responseHeader, -1);
        this.h = new ArrayList();
        this.g = lrh.b;
        for (lqv lqv : lrh.a) {
            this.h.add(lqv.a.b);
        }
        if (glk.a("Babel", 3)) {
            String str = "Babel";
            String str2 = "GetFavoritesResponse debugUrl: ";
            String valueOf = String.valueOf(lrh.responseHeader.c);
            glk.b(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        List arrayList = new ArrayList(this.h.size());
        blo.a();
        try {
            for (String L : this.h) {
                edk L2 = blo.L(L);
                if (L2 != null) {
                    arrayList.add(L2);
                }
            }
            blo.b(arrayList, 3);
            blo.b();
            bkq.b(gwb.H(), blo.g().g(), "hash_pinned");
        } finally {
            blo.c();
        }
    }
}
