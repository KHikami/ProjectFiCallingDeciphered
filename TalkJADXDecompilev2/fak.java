package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class fak extends evz {
    private static final long serialVersionUID = 1;
    public int g;
    public byte[] h;
    public Map<String, Integer> i;

    fak(lwy lwy) {
        super(lwy, lwy.responseHeader, -1);
        if (lwy.a != null) {
            switch (gwb.a(lwy.a)) {
                case 0:
                    this.g = fal.a;
                    break;
                case 1:
                    this.g = fal.b;
                    break;
                default:
                    String valueOf = String.valueOf(lwy.a);
                    glk.e("Babel", new StringBuilder(String.valueOf(valueOf).length() + 57).append("Unexpected error code for UpdateFavoriteContactResponse: ").append(valueOf).toString(), new Object[0]);
                    break;
            }
        }
        this.h = lwy.c;
        this.i = new HashMap();
        for (lqv lqv : lwy.b) {
            this.i.put(lqv.a.b, lqv.c);
        }
        if (glk.a("Babel", 3)) {
            valueOf = "Babel";
            String str = "UpdateFavoriteContactResponse debugUrl: ";
            String valueOf2 = String.valueOf(lwy.responseHeader.c);
            if (valueOf2.length() != 0) {
                valueOf2 = str.concat(valueOf2);
            } else {
                valueOf2 = new String(str);
            }
            glk.b(valueOf, valueOf2, new Object[0]);
        }
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        blo.a();
        try {
            List b = blo.b(3);
            evv evv = (evv) this.b;
            for (String L : evv.o()) {
                edk L2 = blo.L(L);
                if (L2 != null) {
                    if (evv.n()) {
                        b.remove(L2);
                    } else if (!b.contains(L2)) {
                        b.add(0, L2);
                    }
                }
            }
            blo.b(b, 3);
            blo.b();
            bkq.b(gwb.H(), blo.g().g(), "hash_pinned");
        } finally {
            blo.c();
        }
    }
}
