package p000;

import java.util.ArrayList;
import java.util.List;

public final class eyf extends evz {
    private static final long serialVersionUID = 1;
    private final List<eyg> f12514g = new ArrayList();

    public eyf(knm knm) {
        super(knm, knm.apiHeader);
        if (knm.f22426a != null && knm.f22426a.f22586b != null) {
            for (kse kse : knm.f22426a.f22586b) {
                if (kse != null) {
                    Object obj;
                    eyg eyg = new eyg();
                    eyg.f12515a = kse.f22994i;
                    eyg.f12516b = kse.f22991f;
                    if (kse.f22987b == null) {
                        obj = null;
                    } else {
                        obj = kse.f22987b.f23102h;
                    }
                    eyg.f12519e = new ArrayList();
                    if (kse.f23001p != null) {
                        for (ksn ksn : kse.f23001p) {
                            if (!(ksn == null || ksn.f23097c == null)) {
                                eyi eyi = new eyi();
                                eyi.f12520a = ksn.f23102h;
                                eyi.f12521b = ksn.f23097c.f23064a;
                                if (eyi.f12521b != null) {
                                    eyi.f12521b = eyi.f12521b.replace("s0-d/photo.jpg", "");
                                }
                                if (eyi.f12520a.equals(obj)) {
                                    eyg.f12517c = eyi;
                                }
                                eyg.f12519e.add(eyi);
                            }
                        }
                    }
                    this.f12514g.add(eyg);
                }
            }
        }
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        if (this.f12514g.size() == 0) {
            glk.m17982e("Babel", "Missing sticker response data.", new Object[0]);
            if (!gwb.m1906a(gwb.m1400H(), "babel_stickers_retry_on_fail", true)) {
                bkq.m5687c(gwb.m1400H(), blo.m6056g(), glj.m17956a());
                return;
            }
            return;
        }
        if (evz.f5798a) {
            new StringBuilder(24).append("Albums found:").append(this.f12514g.size());
            for (eyg eyg : this.f12514g) {
                String str = eyg.f12516b;
                new StringBuilder(String.valueOf(str).length() + 19).append("Album:").append(str).append(": ").append(eyg.f12519e.size());
            }
        }
        blo.m6033c(this.f12514g);
        bkq.m5687c(gwb.m1400H(), blo.m6056g(), glj.m17956a());
    }
}
