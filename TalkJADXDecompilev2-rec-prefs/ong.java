package p000;

public final class ong extends nyx<ong> {
    public Long f28799a;
    public Boolean f28800b;
    public Integer f28801c;
    public String f28802d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33516b(nyt);
    }

    public ong() {
        this.f28799a = null;
        this.f28800b = null;
        this.f28801c = null;
        this.f28802d = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28799a != null) {
            nyu.b(1, this.f28799a.longValue());
        }
        if (this.f28800b != null) {
            nyu.a(2, this.f28800b.booleanValue());
        }
        if (this.f28801c != null) {
            nyu.a(3, this.f28801c.intValue());
        }
        if (this.f28802d != null) {
            nyu.a(4, this.f28802d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28799a != null) {
            b += nyu.f(1, this.f28799a.longValue());
        }
        if (this.f28800b != null) {
            this.f28800b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f28801c != null) {
            b += nyu.f(3, this.f28801c.intValue());
        }
        if (this.f28802d != null) {
            return b + nyu.b(4, this.f28802d);
        }
        return b;
    }

    private ong m33516b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f28799a = Long.valueOf(nyt.e());
                    continue;
                case 16:
                    this.f28800b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.f28801c = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    this.f28802d = nyt.j();
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
