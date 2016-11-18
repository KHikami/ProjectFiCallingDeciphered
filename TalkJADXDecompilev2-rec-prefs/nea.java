package p000;

public final class nea extends nyx<nea> {
    public ndy f29588a;
    public ndx f29589b;
    public ned f29590c;

    public /* synthetic */ nzf m34507a(nyt nyt) {
        return m34505b(nyt);
    }

    public nea() {
        m34506d();
    }

    private nea m34506d() {
        this.f29588a = null;
        this.f29589b = null;
        this.f29590c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34508a(nyu nyu) {
        if (this.f29588a != null) {
            nyu.m37182b(1, this.f29588a);
        }
        if (this.f29589b != null) {
            nyu.m37182b(2, this.f29589b);
        }
        if (this.f29590c != null) {
            nyu.m37182b(3, this.f29590c);
        }
        super.a(nyu);
    }

    protected int m34509b() {
        int b = super.b();
        if (this.f29588a != null) {
            b += nyu.m37145d(1, this.f29588a);
        }
        if (this.f29589b != null) {
            b += nyu.m37145d(2, this.f29589b);
        }
        if (this.f29590c != null) {
            return b + nyu.m37145d(3, this.f29590c);
        }
        return b;
    }

    private nea m34505b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29588a == null) {
                        this.f29588a = new ndy();
                    }
                    nyt.m37101a(this.f29588a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29589b == null) {
                        this.f29589b = new ndx();
                    }
                    nyt.m37101a(this.f29589b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f29590c == null) {
                        this.f29590c = new ned();
                    }
                    nyt.m37101a(this.f29590c);
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
