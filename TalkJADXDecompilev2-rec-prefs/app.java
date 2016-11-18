package p000;

class app<ResourceType> {
    final anq f2073a;
    final /* synthetic */ apg f2074b;

    public aqr<Z> m3671a(aqr<Z> aqr_Z) {
        aoc c;
        ans a;
        aob aob;
        Class b = app.m3670b(aqr_Z);
        if (this.f2073a != anq.RESOURCE_DISK_CACHE) {
            c = this.f2074b.f2021a.m3625c(b);
            aqr a2 = c.mo393a(aqr_Z, this.f2074b.f2024d, this.f2074b.f2025e);
        } else {
            aqr<Z> aqr_Z2 = aqr_Z;
            c = null;
        }
        if (!aqr_Z.equals(a2)) {
            aqr_Z.mo348e();
        }
        if (this.f2074b.f2021a.m3620a(a2)) {
            aob b2 = this.f2074b.f2021a.m3622b(a2);
            a = b2.mo396a(this.f2074b.f2027g);
            aob = b2;
        } else {
            a = ans.NONE;
            aob = null;
        }
        if (!this.f2074b.f2026f.mo335a(!this.f2074b.f2021a.m3619a(this.f2074b.f2028h), this.f2073a, a)) {
            return a2;
        }
        if (aob == null) {
            throw new dt(a2.mo346c().getClass());
        }
        anv apc;
        if (a == ans.SOURCE) {
            apc = new apc(this.f2074b.f2028h, this.f2074b.f2023c);
        } else if (a == ans.TRANSFORMED) {
            apc = new aqt(this.f2074b.f2028h, this.f2074b.f2023c, this.f2074b.f2024d, this.f2074b.f2025e, c, b, this.f2074b.f2027g);
        } else {
            String valueOf = String.valueOf(a);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unknown strategy: ").append(valueOf).toString());
        }
        a2 = aqp.m3753a(a2);
        this.f2074b.f2022b.m3657a(apc, aob, a2);
        return a2;
    }

    public app(apg apg, anq anq) {
        this.f2074b = apg;
        this.f2073a = anq;
    }

    static Class<Z> m3670b(aqr<Z> aqr_Z) {
        return aqr_Z.mo346c().getClass();
    }
}
