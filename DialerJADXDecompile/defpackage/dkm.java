package defpackage;

/* compiled from: PG */
/* renamed from: dkm */
final class dkm extends dfi {
    private final dfh a;
    private final dko b;
    private final boolean c;
    private boolean d;

    public dkm(dfh dfh, dko dko, boolean z) {
        this.a = dfh;
        this.b = dko;
        this.c = z;
    }

    public final void a(Object obj) {
        if (!this.d || this.c) {
            this.d = true;
            this.b.a(obj);
            if (this.c) {
                this.a.a(1);
                return;
            }
            return;
        }
        throw dhn.i.a("More than one responses received for unary or client-streaming call").b();
    }

    public final void a(dhn dhn, dgr dgr) {
        if (dhn.a()) {
            this.b.a();
        } else {
            this.b.a(new dhs(dhn, dgr));
        }
    }
}
