package p000;

public final class nuq extends nyx<nuq> {
    public String f30962a;
    public Boolean f30963b;
    public String f30964c;
    public Long f30965d;
    public Long f30966e;
    public Boolean f30967f;
    public Long f30968g;
    public String f30969h;

    public /* synthetic */ nzf m36630a(nyt nyt) {
        return m36629b(nyt);
    }

    public nuq() {
        this.f30962a = null;
        this.f30963b = null;
        this.f30964c = null;
        this.f30965d = null;
        this.f30966e = null;
        this.f30967f = null;
        this.f30968g = null;
        this.f30969h = null;
        this.cachedSize = -1;
    }

    public void m36631a(nyu nyu) {
        if (this.f30962a != null) {
            nyu.m37170a(1, this.f30962a);
        }
        if (this.f30964c != null) {
            nyu.m37170a(2, this.f30964c);
        }
        if (this.f30965d != null) {
            nyu.m37187c(3, this.f30965d.longValue());
        }
        if (this.f30966e != null) {
            nyu.m37187c(4, this.f30966e.longValue());
        }
        if (this.f30967f != null) {
            nyu.m37172a(5, this.f30967f.booleanValue());
        }
        if (this.f30963b != null) {
            nyu.m37172a(6, this.f30963b.booleanValue());
        }
        if (this.f30968g != null) {
            nyu.m37181b(7, this.f30968g.longValue());
        }
        if (this.f30969h != null) {
            nyu.m37170a(8, this.f30969h);
        }
        super.a(nyu);
    }

    protected int m36632b() {
        int b = super.b();
        if (this.f30962a != null) {
            b += nyu.m37137b(1, this.f30962a);
        }
        if (this.f30964c != null) {
            b += nyu.m37137b(2, this.f30964c);
        }
        if (this.f30965d != null) {
            this.f30965d.longValue();
            b += nyu.m37154h(3) + 8;
        }
        if (this.f30966e != null) {
            this.f30966e.longValue();
            b += nyu.m37154h(4) + 8;
        }
        if (this.f30967f != null) {
            this.f30967f.booleanValue();
            b += nyu.m37154h(5) + 1;
        }
        if (this.f30963b != null) {
            this.f30963b.booleanValue();
            b += nyu.m37154h(6) + 1;
        }
        if (this.f30968g != null) {
            b += nyu.m37148f(7, this.f30968g.longValue());
        }
        if (this.f30969h != null) {
            return b + nyu.m37137b(8, this.f30969h);
        }
        return b;
    }

    private nuq m36629b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30962a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f30964c = nyt.m37117j();
                    continue;
                case wi.dz /*25*/:
                    this.f30965d = Long.valueOf(nyt.m37114g());
                    continue;
                case 33:
                    this.f30966e = Long.valueOf(nyt.m37114g());
                    continue;
                case 40:
                    this.f30967f = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 48:
                    this.f30963b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 56:
                    this.f30968g = Long.valueOf(nyt.m37110e());
                    continue;
                case 66:
                    this.f30969h = nyt.m37117j();
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
