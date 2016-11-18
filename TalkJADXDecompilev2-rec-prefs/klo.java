package p000;

public final class klo extends nyx<klo> {
    private static volatile klo[] f22275e;
    public klk f22276a;
    public kle f22277b;
    public kkv f22278c;
    public String f22279d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26417b(nyt);
    }

    public static klo[] m26418d() {
        if (f22275e == null) {
            synchronized (nzc.c) {
                if (f22275e == null) {
                    f22275e = new klo[0];
                }
            }
        }
        return f22275e;
    }

    public klo() {
        m26419g();
    }

    private klo m26419g() {
        this.f22276a = null;
        this.f22277b = null;
        this.f22278c = null;
        this.f22279d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22276a != null) {
            nyu.b(1, this.f22276a);
        }
        if (this.f22277b != null) {
            nyu.b(2, this.f22277b);
        }
        if (this.f22278c != null) {
            nyu.b(3, this.f22278c);
        }
        if (this.f22279d != null) {
            nyu.a(4, this.f22279d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22276a != null) {
            b += nyu.d(1, this.f22276a);
        }
        if (this.f22277b != null) {
            b += nyu.d(2, this.f22277b);
        }
        if (this.f22278c != null) {
            b += nyu.d(3, this.f22278c);
        }
        if (this.f22279d != null) {
            return b + nyu.b(4, this.f22279d);
        }
        return b;
    }

    private klo m26417b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22276a == null) {
                        this.f22276a = new klk();
                    }
                    nyt.a(this.f22276a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f22277b == null) {
                        this.f22277b = new kle();
                    }
                    nyt.a(this.f22277b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f22278c == null) {
                        this.f22278c = new kkv();
                    }
                    nyt.a(this.f22278c);
                    continue;
                case 34:
                    this.f22279d = nyt.j();
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
