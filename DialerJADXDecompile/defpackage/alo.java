package defpackage;

/* compiled from: PG */
/* renamed from: alo */
final class alo implements aug {
    final /* synthetic */ alj a;
    private /* synthetic */ boolean b;
    private /* synthetic */ String c;
    private /* synthetic */ String d;
    private /* synthetic */ int e;
    private /* synthetic */ Integer f;

    alo(alj alj, boolean z, String str, String str2, int i, Integer num) {
        this.a = alj;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = num;
    }

    public final void a() {
        if (this.b && buf.J(this.a.a).a()) {
            buf.H(this.a.a).a(1009);
            buf.J(this.a.a).b(this.c, this.d, this.e, 1);
        }
        this.a.c.a(new alp(this), this.f);
    }
}
