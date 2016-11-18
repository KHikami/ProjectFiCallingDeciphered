package defpackage;

class app<ResourceType> {
    final anq a;
    final /* synthetic */ apg b;

    public aqr<Z> a(aqr<Z> aqr_Z) {
        aoc c;
        ans a;
        aob aob;
        Class b = app.b(aqr_Z);
        if (this.a != anq.RESOURCE_DISK_CACHE) {
            c = this.b.a.c(b);
            aqr a2 = c.a(aqr_Z, this.b.d, this.b.e);
        } else {
            aqr<Z> aqr_Z2 = aqr_Z;
            c = null;
        }
        if (!aqr_Z.equals(a2)) {
            aqr_Z.e();
        }
        if (this.b.a.a(a2)) {
            aob b2 = this.b.a.b(a2);
            a = b2.a(this.b.g);
            aob = b2;
        } else {
            a = ans.NONE;
            aob = null;
        }
        if (!this.b.f.a(!this.b.a.a(this.b.h), this.a, a)) {
            return a2;
        }
        if (aob == null) {
            throw new dt(a2.c().getClass());
        }
        anv apc;
        if (a == ans.SOURCE) {
            apc = new apc(this.b.h, this.b.c);
        } else if (a == ans.TRANSFORMED) {
            apc = new aqt(this.b.h, this.b.c, this.b.d, this.b.e, c, b, this.b.g);
        } else {
            String valueOf = String.valueOf(a);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unknown strategy: ").append(valueOf).toString());
        }
        a2 = aqp.a(a2);
        this.b.b.a(apc, aob, a2);
        return a2;
    }

    public app(apg apg, anq anq) {
        this.b = apg;
        this.a = anq;
    }

    static Class<Z> b(aqr<Z> aqr_Z) {
        return aqr_Z.c().getClass();
    }
}
