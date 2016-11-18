package p000;

public final class kre extends nyx<kre> {
    private static volatile kre[] f22864d;
    public krd f22865a;
    public krd f22866b;
    public Boolean f22867c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27166b(nyt);
    }

    public static kre[] m27167d() {
        if (f22864d == null) {
            synchronized (nzc.c) {
                if (f22864d == null) {
                    f22864d = new kre[0];
                }
            }
        }
        return f22864d;
    }

    public kre() {
        m27168g();
    }

    private kre m27168g() {
        this.f22865a = null;
        this.f22866b = null;
        this.f22867c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22865a != null) {
            nyu.b(1, this.f22865a);
        }
        if (this.f22866b != null) {
            nyu.b(2, this.f22866b);
        }
        if (this.f22867c != null) {
            nyu.a(3, this.f22867c.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22865a != null) {
            b += nyu.d(1, this.f22865a);
        }
        if (this.f22866b != null) {
            b += nyu.d(2, this.f22866b);
        }
        if (this.f22867c == null) {
            return b;
        }
        this.f22867c.booleanValue();
        return b + (nyu.h(3) + 1);
    }

    private kre m27166b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22865a == null) {
                        this.f22865a = new krd();
                    }
                    nyt.a(this.f22865a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f22866b == null) {
                        this.f22866b = new krd();
                    }
                    nyt.a(this.f22866b);
                    continue;
                case wi.dA /*24*/:
                    this.f22867c = Boolean.valueOf(nyt.i());
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
