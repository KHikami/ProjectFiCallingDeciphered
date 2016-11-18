package defpackage;

final class ijw implements ijl<lyu> {
    final /* synthetic */ String a;
    final /* synthetic */ ijt b;

    ijw(ijt ijt, String str) {
        this.b = ijt;
        this.a = str;
    }

    public /* synthetic */ void a(nzf nzf) {
        b();
    }

    public /* synthetic */ void b(nzf nzf) {
        a();
    }

    private void a() {
        ijt ijt = this.b;
        ijt.a("Failed to kick participant: %s", this.a);
    }

    private void b() {
        iqo b = this.b.c.b(this.a);
        if (b == null) {
            itx.b("vclib", "Got an ENDPOINT_EXITED event for %s, which doesn't exist in our endpoints", this.a);
            return;
        }
        this.b.c.b(b);
        this.b.a(b, new iqr(Integer.valueOf(43)));
    }
}
