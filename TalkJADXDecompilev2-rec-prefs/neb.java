package p000;

public final class neb extends nyx<neb> {
    public nea f29591a;
    public nec f29592b;

    public /* synthetic */ nzf m34512a(nyt nyt) {
        return m34510b(nyt);
    }

    public neb() {
        m34511d();
    }

    private neb m34511d() {
        this.f29591a = null;
        this.f29592b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34513a(nyu nyu) {
        if (this.f29591a != null) {
            nyu.m37182b(1, this.f29591a);
        }
        if (this.f29592b != null) {
            nyu.m37182b(2, this.f29592b);
        }
        super.a(nyu);
    }

    protected int m34514b() {
        int b = super.b();
        if (this.f29591a != null) {
            b += nyu.m37145d(1, this.f29591a);
        }
        if (this.f29592b != null) {
            return b + nyu.m37145d(2, this.f29592b);
        }
        return b;
    }

    private neb m34510b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29591a == null) {
                        this.f29591a = new nea();
                    }
                    nyt.m37101a(this.f29591a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29592b == null) {
                        this.f29592b = new nec();
                    }
                    nyt.m37101a(this.f29592b);
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
