package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: eyr */
public class eyr extends evz {
    private static final long serialVersionUID = 1;
    private final Map<String, bka> g;

    public eyr(kne kne) {
        super(kne, kne.apiHeader);
        this.g = new HashMap();
        for (led led : kne.a.a) {
            lea lea = led.c;
            String str = led.a.c;
            this.g.put(str, new bka(str, lea.a, lea.e));
        }
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        if (!this.g.isEmpty()) {
            blo.a(this.g);
        }
        blo.a();
        try {
            blo.q();
            for (bka bka : this.g.values()) {
                blo.c(bka.a, bka.b, bka.c, bka.d);
            }
            blo.b();
        } finally {
            blo.c();
        }
    }
}
