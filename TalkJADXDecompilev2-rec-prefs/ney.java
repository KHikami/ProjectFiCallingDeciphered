package p000;

public final class ney extends nyx<ney> {
    public nho f29646a;
    public ngt f29647b;
    public nhh f29648c;

    public /* synthetic */ nzf m34628a(nyt nyt) {
        return m34626b(nyt);
    }

    public ney() {
        m34627d();
    }

    private ney m34627d() {
        this.f29646a = null;
        this.f29647b = null;
        this.f29648c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34629a(nyu nyu) {
        if (this.f29646a != null) {
            nyu.m37182b(1, this.f29646a);
        }
        if (this.f29647b != null) {
            nyu.m37182b(2, this.f29647b);
        }
        if (this.f29648c != null) {
            nyu.m37182b(3, this.f29648c);
        }
        super.a(nyu);
    }

    protected int m34630b() {
        int b = super.b();
        if (this.f29646a != null) {
            b += nyu.m37145d(1, this.f29646a);
        }
        if (this.f29647b != null) {
            b += nyu.m37145d(2, this.f29647b);
        }
        if (this.f29648c != null) {
            return b + nyu.m37145d(3, this.f29648c);
        }
        return b;
    }

    private ney m34626b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29646a == null) {
                        this.f29646a = new nho();
                    }
                    nyt.m37101a(this.f29646a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29647b == null) {
                        this.f29647b = new ngt();
                    }
                    nyt.m37101a(this.f29647b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f29648c == null) {
                        this.f29648c = new nhh();
                    }
                    nyt.m37101a(this.f29648c);
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
