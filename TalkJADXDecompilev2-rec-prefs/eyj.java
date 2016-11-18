package p000;

import java.util.HashSet;
import java.util.Set;

public class eyj extends evz {
    private static final long serialVersionUID = 1;
    private final Set<String> f12417g;
    private final boolean f12418h;
    private final boolean f12419i;
    private final boolean f12420j;
    private final boolean f12421k;
    private final String f12422l;

    eyj(ohp ohp) {
        Set hashSet = new HashSet(ohp.j.length);
        for (ohu ohu : ohp.j) {
            if (ohu.a != null) {
                hashSet.add(ohu.a);
            }
        }
        this.f12417g = hashSet;
        this.f12418h = gwb.m2061b(ohp.b);
        this.f12419i = gwb.m2061b(ohp.c);
        this.f12420j = gwb.m2061b(ohp.g);
        this.f12421k = gwb.m2061b(ohp.k);
        if (ohp.a != null) {
            this.f12422l = ohp.a.c;
        } else {
            this.f12422l = null;
        }
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        fde.m14999a(blo.m6056g(), m14724k(), m14725l(), m14726m(), m14728o(), m14727n());
        jci b = ((jcf) jyn.m25426a(gwb.m1400H(), jcf.class)).mo3464b(blo.m6056g().m5638g());
        b.m23881b("use_tycho_branding", m14727n());
        b.m23891d();
    }

    public boolean m14724k() {
        return this.f12418h;
    }

    public boolean m14725l() {
        return this.f12419i;
    }

    public boolean m14726m() {
        return this.f12420j;
    }

    public boolean m14727n() {
        return this.f12421k;
    }

    public String m14728o() {
        return this.f12422l;
    }
}
