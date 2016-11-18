package p000;

public final class neu extends nyx<neu> {
    public Boolean f29637a;
    public ngg f29638b;
    public neq f29639c;
    public nfh f29640d;
    public ngg f29641e;
    public net f29642f;

    public /* synthetic */ nzf m34608a(nyt nyt) {
        return m34606b(nyt);
    }

    public neu() {
        m34607d();
    }

    private neu m34607d() {
        this.f29637a = null;
        this.f29638b = null;
        this.f29639c = null;
        this.f29640d = null;
        this.f29641e = null;
        this.f29642f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34609a(nyu nyu) {
        if (this.f29638b != null) {
            nyu.m37182b(1, this.f29638b);
        }
        if (this.f29639c != null) {
            nyu.m37182b(2, this.f29639c);
        }
        if (this.f29637a != null) {
            nyu.m37172a(3, this.f29637a.booleanValue());
        }
        if (this.f29640d != null) {
            nyu.m37182b(4, this.f29640d);
        }
        if (this.f29641e != null) {
            nyu.m37182b(5, this.f29641e);
        }
        if (this.f29642f != null) {
            nyu.m37182b(6, this.f29642f);
        }
        super.a(nyu);
    }

    protected int m34610b() {
        int b = super.b();
        if (this.f29638b != null) {
            b += nyu.m37145d(1, this.f29638b);
        }
        if (this.f29639c != null) {
            b += nyu.m37145d(2, this.f29639c);
        }
        if (this.f29637a != null) {
            this.f29637a.booleanValue();
            b += nyu.m37154h(3) + 1;
        }
        if (this.f29640d != null) {
            b += nyu.m37145d(4, this.f29640d);
        }
        if (this.f29641e != null) {
            b += nyu.m37145d(5, this.f29641e);
        }
        if (this.f29642f != null) {
            return b + nyu.m37145d(6, this.f29642f);
        }
        return b;
    }

    private neu m34606b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29638b == null) {
                        this.f29638b = new ngg();
                    }
                    nyt.m37101a(this.f29638b);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29639c == null) {
                        this.f29639c = new neq();
                    }
                    nyt.m37101a(this.f29639c);
                    continue;
                case wi.dA /*24*/:
                    this.f29637a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 34:
                    if (this.f29640d == null) {
                        this.f29640d = new nfh();
                    }
                    nyt.m37101a(this.f29640d);
                    continue;
                case 42:
                    if (this.f29641e == null) {
                        this.f29641e = new ngg();
                    }
                    nyt.m37101a(this.f29641e);
                    continue;
                case 50:
                    if (this.f29642f == null) {
                        this.f29642f = new net();
                    }
                    nyt.m37101a(this.f29642f);
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
