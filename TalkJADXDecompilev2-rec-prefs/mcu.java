package p000;

public final class mcu extends nyx<mcu> {
    public String f27374a;
    public String f27375b;
    public String f27376c;
    public String f27377d;
    public String f27378e;
    public mds f27379f;
    public String f27380g;
    public String f27381h;
    public String f27382i;
    public String f27383j;
    public String f27384k;
    public String f27385l;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31769b(nyt);
    }

    public mcu() {
        m31770d();
    }

    private mcu m31770d() {
        this.f27374a = null;
        this.f27375b = null;
        this.f27376c = null;
        this.f27377d = null;
        this.f27378e = null;
        this.f27379f = null;
        this.f27380g = null;
        this.f27381h = null;
        this.f27382i = null;
        this.f27383j = null;
        this.f27384k = null;
        this.f27385l = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27374a != null) {
            nyu.a(1, this.f27374a);
        }
        if (this.f27375b != null) {
            nyu.a(2, this.f27375b);
        }
        if (this.f27376c != null) {
            nyu.a(3, this.f27376c);
        }
        if (this.f27377d != null) {
            nyu.a(4, this.f27377d);
        }
        if (this.f27378e != null) {
            nyu.a(5, this.f27378e);
        }
        if (this.f27379f != null) {
            nyu.b(6, this.f27379f);
        }
        if (this.f27380g != null) {
            nyu.a(7, this.f27380g);
        }
        if (this.f27381h != null) {
            nyu.a(8, this.f27381h);
        }
        if (this.f27382i != null) {
            nyu.a(9, this.f27382i);
        }
        if (this.f27384k != null) {
            nyu.a(10, this.f27384k);
        }
        if (this.f27385l != null) {
            nyu.a(11, this.f27385l);
        }
        if (this.f27383j != null) {
            nyu.a(12, this.f27383j);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27374a != null) {
            b += nyu.b(1, this.f27374a);
        }
        if (this.f27375b != null) {
            b += nyu.b(2, this.f27375b);
        }
        if (this.f27376c != null) {
            b += nyu.b(3, this.f27376c);
        }
        if (this.f27377d != null) {
            b += nyu.b(4, this.f27377d);
        }
        if (this.f27378e != null) {
            b += nyu.b(5, this.f27378e);
        }
        if (this.f27379f != null) {
            b += nyu.d(6, this.f27379f);
        }
        if (this.f27380g != null) {
            b += nyu.b(7, this.f27380g);
        }
        if (this.f27381h != null) {
            b += nyu.b(8, this.f27381h);
        }
        if (this.f27382i != null) {
            b += nyu.b(9, this.f27382i);
        }
        if (this.f27384k != null) {
            b += nyu.b(10, this.f27384k);
        }
        if (this.f27385l != null) {
            b += nyu.b(11, this.f27385l);
        }
        if (this.f27383j != null) {
            return b + nyu.b(12, this.f27383j);
        }
        return b;
    }

    private mcu m31769b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27374a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f27375b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f27376c = nyt.j();
                    continue;
                case 34:
                    this.f27377d = nyt.j();
                    continue;
                case 42:
                    this.f27378e = nyt.j();
                    continue;
                case 50:
                    if (this.f27379f == null) {
                        this.f27379f = new mds();
                    }
                    nyt.a(this.f27379f);
                    continue;
                case 58:
                    this.f27380g = nyt.j();
                    continue;
                case 66:
                    this.f27381h = nyt.j();
                    continue;
                case 74:
                    this.f27382i = nyt.j();
                    continue;
                case 82:
                    this.f27384k = nyt.j();
                    continue;
                case 90:
                    this.f27385l = nyt.j();
                    continue;
                case 98:
                    this.f27383j = nyt.j();
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
