package p000;

import java.util.HashMap;
import java.util.Map;

public class eyr extends evz {
    private static final long serialVersionUID = 1;
    private final Map<String, bka> f12524g = new HashMap();

    public eyr(kne kne) {
        super(kne, kne.apiHeader);
        for (led led : kne.f22418a.f24891a) {
            lea lea = led.f24796c;
            String str = led.f24794a.f24738c;
            this.f12524g.put(str, new bka(str, lea.f24752a, lea.f24756e));
        }
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        if (!this.f12524g.isEmpty()) {
            blo.m6000a(this.f12524g);
        }
        blo.m5958a();
        try {
            blo.m6099q();
            for (bka bka : this.f12524g.values()) {
                blo.m6031c(bka.f3605a, bka.f3606b, bka.f3607c, bka.f3608d);
            }
            blo.m6015b();
        } finally {
            blo.m6028c();
        }
    }
}
