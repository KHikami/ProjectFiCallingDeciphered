package p000;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class fak extends evz {
    private static final long serialVersionUID = 1;
    public int f12577g;
    public byte[] f12578h;
    public Map<String, Integer> f12579i;

    fak(lwy lwy) {
        super(lwy, lwy.responseHeader, -1);
        if (lwy.f26735a != null) {
            switch (gwb.m1507a(lwy.f26735a)) {
                case 0:
                    this.f12577g = fal.f12580a;
                    break;
                case 1:
                    this.f12577g = fal.f12581b;
                    break;
                default:
                    String valueOf = String.valueOf(lwy.f26735a);
                    glk.m17982e("Babel", new StringBuilder(String.valueOf(valueOf).length() + 57).append("Unexpected error code for UpdateFavoriteContactResponse: ").append(valueOf).toString(), new Object[0]);
                    break;
            }
        }
        this.f12578h = lwy.f26737c;
        this.f12579i = new HashMap();
        for (lqv lqv : lwy.f26736b) {
            this.f12579i.put(lqv.f26178a.f26403b, lqv.f26180c);
        }
        if (glk.m17973a("Babel", 3)) {
            valueOf = "Babel";
            String str = "UpdateFavoriteContactResponse debugUrl: ";
            String valueOf2 = String.valueOf(lwy.responseHeader.f26517c);
            if (valueOf2.length() != 0) {
                valueOf2 = str.concat(valueOf2);
            } else {
                valueOf2 = new String(str);
            }
            glk.m17976b(valueOf, valueOf2, new Object[0]);
        }
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        blo.m5958a();
        try {
            List b = blo.m6013b(3);
            evv evv = (evv) this.b;
            for (String L : evv.m14687o()) {
                edk L2 = blo.m5920L(L);
                if (L2 != null) {
                    if (evv.m14686n()) {
                        b.remove(L2);
                    } else if (!b.contains(L2)) {
                        b.add(0, L2);
                    }
                }
            }
            blo.m6022b(b, 3);
            blo.m6015b();
            bkq.m5676b(gwb.m1400H(), blo.m6056g().m5638g(), "hash_pinned");
        } finally {
            blo.m6028c();
        }
    }
}
