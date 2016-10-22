package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: eyf */
public final class eyf extends evz {
    private static final long serialVersionUID = 1;
    private final List<eyg> g;

    public eyf(knm knm) {
        super(knm, knm.apiHeader);
        this.g = new ArrayList();
        if (knm.a != null && knm.a.b != null) {
            for (kse kse : knm.a.b) {
                if (kse != null) {
                    Object obj;
                    eyg eyg = new eyg();
                    eyg.a = kse.i;
                    eyg.b = kse.f;
                    if (kse.b == null) {
                        obj = null;
                    } else {
                        obj = kse.b.h;
                    }
                    eyg.e = new ArrayList();
                    if (kse.p != null) {
                        for (ksn ksn : kse.p) {
                            if (!(ksn == null || ksn.c == null)) {
                                eyi eyi = new eyi();
                                eyi.a = ksn.h;
                                eyi.b = ksn.c.a;
                                if (eyi.b != null) {
                                    eyi.b = eyi.b.replace("s0-d/photo.jpg", "");
                                }
                                if (eyi.a.equals(obj)) {
                                    eyg.c = eyi;
                                }
                                eyg.e.add(eyi);
                            }
                        }
                    }
                    this.g.add(eyg);
                }
            }
        }
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        if (this.g.size() == 0) {
            glk.e("Babel", "Missing sticker response data.", new Object[0]);
            if (!gwb.a(gwb.H(), "babel_stickers_retry_on_fail", true)) {
                bkq.c(gwb.H(), blo.g(), glj.a());
                return;
            }
            return;
        }
        if (evz.a) {
            new StringBuilder(24).append("Albums found:").append(this.g.size());
            for (eyg eyg : this.g) {
                String str = eyg.b;
                new StringBuilder(String.valueOf(str).length() + 19).append("Album:").append(str).append(": ").append(eyg.e.size());
            }
        }
        blo.c(this.g);
        bkq.c(gwb.H(), blo.g(), glj.a());
    }
}
