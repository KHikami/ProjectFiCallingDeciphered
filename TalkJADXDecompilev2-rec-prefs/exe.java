package p000;

import java.util.ArrayList;
import java.util.List;

public final class exe extends evz {
    private static final long serialVersionUID = 1;
    private int f12431g;
    private int f12432h;
    private int f12433i;
    private final List<exf> f12434j;

    public exe(kmy kmy) {
        super(kmy, kmy.apiHeader);
        knp knp = kmy.f22410a.f22441a;
        if (evz.f5798a) {
            String valueOf = String.valueOf(kmy.f22410a.f22441a);
            new StringBuilder(String.valueOf(valueOf).length() + 64).append("GetChatAclSettingsResponse.processResponse: retrieved chat ACLs ").append(valueOf);
        }
        if (knp != null) {
            this.f12431g = gwb.m1507a(knp.f22429a);
            this.f12432h = gwb.m1507a(knp.f22434f);
            this.f12433i = gwb.m1507a(knp.f22433e);
            if (knp.f22431c.length > 0) {
                this.f12434j = new ArrayList();
                for (knq knq : knp.f22431c) {
                    exf exf = new exf();
                    exf.f12436b = knq.f22438b;
                    exf.f12435a = knq.f22437a;
                    exf.f12437c = gwb.m1507a(knq.f22439c);
                    this.f12434j.add(exf);
                }
                return;
            }
            this.f12434j = null;
            return;
        }
        this.f12434j = null;
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        bnz.m6272a(blo.m6056g().m5638g(), this.f12431g, this.f12432h, this.f12433i, this.f12434j);
    }
}
