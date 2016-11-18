package p000;

public final class lqr extends nyx<lqr> {
    public Long f26162a;
    public Double f26163b;
    public String f26164c;
    public Boolean f26165d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30082b(nyt);
    }

    public lqr() {
        m30083d();
    }

    private lqr m30083d() {
        this.f26162a = null;
        this.f26163b = null;
        this.f26164c = null;
        this.f26165d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26162a != null) {
            nyu.b(1, this.f26162a.longValue());
        }
        if (this.f26163b != null) {
            nyu.a(2, this.f26163b.doubleValue());
        }
        if (this.f26164c != null) {
            nyu.a(3, this.f26164c);
        }
        if (this.f26165d != null) {
            nyu.a(4, this.f26165d.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26162a != null) {
            b += nyu.f(1, this.f26162a.longValue());
        }
        if (this.f26163b != null) {
            this.f26163b.doubleValue();
            b += nyu.h(2) + 8;
        }
        if (this.f26164c != null) {
            b += nyu.b(3, this.f26164c);
        }
        if (this.f26165d == null) {
            return b;
        }
        this.f26165d.booleanValue();
        return b + (nyu.h(4) + 1);
    }

    private lqr m30082b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26162a = Long.valueOf(nyt.e());
                    continue;
                case wi.dK /*17*/:
                    this.f26163b = Double.valueOf(nyt.b());
                    continue;
                case wi.dx /*26*/:
                    this.f26164c = nyt.j();
                    continue;
                case 32:
                    this.f26165d = Boolean.valueOf(nyt.i());
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
