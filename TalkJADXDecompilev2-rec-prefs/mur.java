package p000;

public final class mur extends nyx<mur> {
    public String f28401a;
    public Integer f28402b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32993b(nyt);
    }

    public mur() {
        m32994d();
    }

    private mur m32994d() {
        this.f28401a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28401a != null) {
            nyu.a(1, this.f28401a);
        }
        if (this.f28402b != null) {
            nyu.a(2, this.f28402b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28401a != null) {
            b += nyu.b(1, this.f28401a);
        }
        if (this.f28402b != null) {
            return b + nyu.f(2, this.f28402b.intValue());
        }
        return b;
    }

    private mur m32993b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28401a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f28402b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
