package p000;

public final class kmu extends nyx<kmu> {
    public ojd f22401a;
    public oje f22402b;
    public String f22403c;
    public oxw f22404d;
    public kgx f22405e;
    public kha f22406f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26590b(nyt);
    }

    public kmu() {
        m26591d();
    }

    private kmu m26591d() {
        this.f22401a = null;
        this.f22402b = null;
        this.f22403c = null;
        this.f22404d = null;
        this.f22405e = null;
        this.f22406f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22401a != null) {
            nyu.b(1, this.f22401a);
        }
        if (this.f22402b != null) {
            nyu.b(2, this.f22402b);
        }
        if (this.f22403c != null) {
            nyu.a(3, this.f22403c);
        }
        if (this.f22404d != null) {
            nyu.b(4, this.f22404d);
        }
        if (this.f22405e != null) {
            nyu.b(5, this.f22405e);
        }
        if (this.f22406f != null) {
            nyu.b(6, this.f22406f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22401a != null) {
            b += nyu.d(1, this.f22401a);
        }
        if (this.f22402b != null) {
            b += nyu.d(2, this.f22402b);
        }
        if (this.f22403c != null) {
            b += nyu.b(3, this.f22403c);
        }
        if (this.f22404d != null) {
            b += nyu.d(4, this.f22404d);
        }
        if (this.f22405e != null) {
            b += nyu.d(5, this.f22405e);
        }
        if (this.f22406f != null) {
            return b + nyu.d(6, this.f22406f);
        }
        return b;
    }

    private kmu m26590b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22401a == null) {
                        this.f22401a = new ojd();
                    }
                    nyt.a(this.f22401a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f22402b == null) {
                        this.f22402b = new oje();
                    }
                    nyt.a(this.f22402b);
                    continue;
                case wi.dx /*26*/:
                    this.f22403c = nyt.j();
                    continue;
                case 34:
                    if (this.f22404d == null) {
                        this.f22404d = new oxw();
                    }
                    nyt.a(this.f22404d);
                    continue;
                case 42:
                    if (this.f22405e == null) {
                        this.f22405e = new kgx();
                    }
                    nyt.a(this.f22405e);
                    continue;
                case 50:
                    if (this.f22406f == null) {
                        this.f22406f = new kha();
                    }
                    nyt.a(this.f22406f);
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
