package p000;

public final class oyn extends nyx<oyn> {
    public oyo f34655a;
    public oyj f34656b;
    public oyu f34657c;

    public /* synthetic */ nzf m39932a(nyt nyt) {
        return m39930b(nyt);
    }

    public oyn() {
        m39931d();
    }

    private oyn m39931d() {
        this.f34655a = null;
        this.f34656b = null;
        this.f34657c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39933a(nyu nyu) {
        if (this.f34655a != null) {
            nyu.m37182b(1, this.f34655a);
        }
        if (this.f34656b != null) {
            nyu.m37182b(2, this.f34656b);
        }
        if (this.f34657c != null) {
            nyu.m37182b(3, this.f34657c);
        }
        super.a(nyu);
    }

    protected int m39934b() {
        int b = super.b();
        if (this.f34655a != null) {
            b += nyu.m37145d(1, this.f34655a);
        }
        if (this.f34656b != null) {
            b += nyu.m37145d(2, this.f34656b);
        }
        if (this.f34657c != null) {
            return b + nyu.m37145d(3, this.f34657c);
        }
        return b;
    }

    private oyn m39930b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34655a == null) {
                        this.f34655a = new oyo();
                    }
                    nyt.m37101a(this.f34655a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f34656b == null) {
                        this.f34656b = new oyj();
                    }
                    nyt.m37101a(this.f34656b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f34657c == null) {
                        this.f34657c = new oyu();
                    }
                    nyt.m37101a(this.f34657c);
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
