package p000;

public final class kur extends nyx<kur> {
    public String f23490a;
    public String f23491b;
    public String f23492c;
    public String f23493d;
    public String f23494e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27605b(nyt);
    }

    public kur() {
        m27606d();
    }

    private kur m27606d() {
        this.f23490a = null;
        this.f23491b = null;
        this.f23492c = null;
        this.f23493d = null;
        this.f23494e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23490a != null) {
            nyu.a(1, this.f23490a);
        }
        if (this.f23491b != null) {
            nyu.a(2, this.f23491b);
        }
        if (this.f23492c != null) {
            nyu.a(3, this.f23492c);
        }
        if (this.f23493d != null) {
            nyu.a(4, this.f23493d);
        }
        if (this.f23494e != null) {
            nyu.a(5, this.f23494e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23490a != null) {
            b += nyu.b(1, this.f23490a);
        }
        if (this.f23491b != null) {
            b += nyu.b(2, this.f23491b);
        }
        if (this.f23492c != null) {
            b += nyu.b(3, this.f23492c);
        }
        if (this.f23493d != null) {
            b += nyu.b(4, this.f23493d);
        }
        if (this.f23494e != null) {
            return b + nyu.b(5, this.f23494e);
        }
        return b;
    }

    private kur m27605b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23490a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23491b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f23492c = nyt.j();
                    continue;
                case 34:
                    this.f23493d = nyt.j();
                    continue;
                case 42:
                    this.f23494e = nyt.j();
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
