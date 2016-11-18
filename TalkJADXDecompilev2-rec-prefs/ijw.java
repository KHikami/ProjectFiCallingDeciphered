package p000;

final class ijw implements ijl<lyu> {
    final /* synthetic */ String f17831a;
    final /* synthetic */ ijt f17832b;

    ijw(ijt ijt, String str) {
        this.f17832b = ijt;
        this.f17831a = str;
    }

    public /* synthetic */ void mo1431a(nzf nzf) {
        m22084b();
    }

    public /* synthetic */ void mo1432b(nzf nzf) {
        m22083a();
    }

    private void m22083a() {
        ijt ijt = this.f17832b;
        ijt.m22019a("Failed to kick participant: %s", this.f17831a);
    }

    private void m22084b() {
        iqo b = this.f17832b.f17804c.m22120b(this.f17831a);
        if (b == null) {
            itx.m23287b("vclib", "Got an ENDPOINT_EXITED event for %s, which doesn't exist in our endpoints", this.f17831a);
            return;
        }
        this.f17832b.f17804c.m22122b(b);
        this.f17832b.m22018a(b, new iqr(Integer.valueOf(43)));
    }
}
