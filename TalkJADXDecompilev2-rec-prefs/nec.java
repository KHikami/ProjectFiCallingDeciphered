package p000;

public final class nec extends nyx<nec> {
    public ngg f29593a;
    public ngg f29594b;

    public /* synthetic */ nzf m34517a(nyt nyt) {
        return m34515b(nyt);
    }

    public nec() {
        m34516d();
    }

    private nec m34516d() {
        this.f29593a = null;
        this.f29594b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34518a(nyu nyu) {
        if (this.f29593a != null) {
            nyu.m37182b(1, this.f29593a);
        }
        if (this.f29594b != null) {
            nyu.m37182b(2, this.f29594b);
        }
        super.a(nyu);
    }

    protected int m34519b() {
        int b = super.b();
        if (this.f29593a != null) {
            b += nyu.m37145d(1, this.f29593a);
        }
        if (this.f29594b != null) {
            return b + nyu.m37145d(2, this.f29594b);
        }
        return b;
    }

    private nec m34515b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29593a == null) {
                        this.f29593a = new ngg();
                    }
                    nyt.m37101a(this.f29593a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29594b == null) {
                        this.f29594b = new ngg();
                    }
                    nyt.m37101a(this.f29594b);
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
