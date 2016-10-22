package defpackage;

/* compiled from: PG */
/* renamed from: alk */
final class alk implements auh {
    final /* synthetic */ alj a;
    private /* synthetic */ String b;
    private /* synthetic */ String c;
    private /* synthetic */ int d;

    alk(alj alj, String str, String str2, int i) {
        this.a = alj;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final void a(boolean z) {
        if (z && buf.J(this.a.a).a()) {
            buf.H(this.a.a).a(1011);
            buf.J(this.a.a).a(this.b, this.c, this.d, 1);
        }
        this.a.c.a(new all(this), this.b, this.c);
    }
}
