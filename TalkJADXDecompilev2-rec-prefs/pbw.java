package p000;

public final class pbw extends nyx<pbw> {
    public Long f34982a;
    public Long f34983b;

    public /* synthetic */ nzf m40245a(nyt nyt) {
        return m40244b(nyt);
    }

    public pbw() {
        this.f34982a = null;
        this.f34983b = null;
        this.cachedSize = -1;
    }

    public void m40246a(nyu nyu) {
        if (this.f34982a != null) {
            nyu.m37181b(1, this.f34982a.longValue());
        }
        if (this.f34983b != null) {
            nyu.m37187c(2, this.f34983b.longValue());
        }
        super.a(nyu);
    }

    protected int m40247b() {
        int b = super.b();
        if (this.f34982a != null) {
            b += nyu.m37148f(1, this.f34982a.longValue());
        }
        if (this.f34983b == null) {
            return b;
        }
        this.f34983b.longValue();
        return b + (nyu.m37154h(2) + 8);
    }

    private pbw m40244b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34982a = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dK /*17*/:
                    this.f34983b = Long.valueOf(nyt.m37114g());
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
