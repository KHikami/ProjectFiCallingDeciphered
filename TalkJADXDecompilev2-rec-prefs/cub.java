package p000;

final class cub implements ijl<lyy> {
    final /* synthetic */ String f9093a;
    final /* synthetic */ dli f9094b;
    final /* synthetic */ cty f9095c;

    cub(cty cty, String str, dli dli) {
        this.f9095c = cty;
        this.f9093a = str;
        this.f9094b = dli;
    }

    public /* synthetic */ void mo1432b(nzf nzf) {
        m11016a();
    }

    private void m11016a() {
        String str = "Babel_explane";
        String str2 = "HangoutQuery failed for hangoutId ";
        String valueOf = String.valueOf(this.f9093a);
        glk.m17970a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        if (this.f9094b != null) {
            this.f9094b.m12187a(true);
        }
        this.f9095c.f9086d.m10963a(new cui(this.f9095c.f9086d.f9043a, ba.jE));
    }

    private void m11017a(lyy lyy) {
        String str = "Babel_explane";
        String str2 = "HangoutQuery successful for hangoutId ";
        String valueOf = String.valueOf(this.f9093a);
        glk.m17970a(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        this.f9095c.m10997a(gwb.m1507a(lyy.f26965a.f26867b), this.f9094b);
    }
}
