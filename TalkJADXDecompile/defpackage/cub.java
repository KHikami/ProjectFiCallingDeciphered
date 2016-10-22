package defpackage;

/* renamed from: cub */
final class cub implements ijl<lyy> {
    final /* synthetic */ String a;
    final /* synthetic */ dli b;
    final /* synthetic */ cty c;

    cub(cty cty, String str, dli dli) {
        this.c = cty;
        this.a = str;
        this.b = dli;
    }

    public /* synthetic */ void b(nzf nzf) {
        a();
    }

    private void a() {
        String str = "Babel_explane";
        String str2 = "HangoutQuery failed for hangoutId ";
        String valueOf = String.valueOf(this.a);
        glk.a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        if (this.b != null) {
            this.b.a(true);
        }
        this.c.d.a(new cui(this.c.d.a, ba.jE));
    }

    private void a(lyy lyy) {
        String str = "Babel_explane";
        String str2 = "HangoutQuery successful for hangoutId ";
        String valueOf = String.valueOf(this.a);
        glk.a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        this.c.a(gwb.a(lyy.a.b), this.b);
    }
}
