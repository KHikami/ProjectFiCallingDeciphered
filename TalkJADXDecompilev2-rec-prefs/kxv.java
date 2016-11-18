package p000;

public final class kxv extends nyx<kxv> {
    private static volatile kxv[] f23962c;
    public kxw f23963a;
    public String f23964b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27982b(nyt);
    }

    public static kxv[] m27983d() {
        if (f23962c == null) {
            synchronized (nzc.c) {
                if (f23962c == null) {
                    f23962c = new kxv[0];
                }
            }
        }
        return f23962c;
    }

    public kxv() {
        m27984g();
    }

    private kxv m27984g() {
        this.f23963a = null;
        this.f23964b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23963a != null) {
            nyu.b(1, this.f23963a);
        }
        if (this.f23964b != null) {
            nyu.a(2, this.f23964b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23963a != null) {
            b += nyu.d(1, this.f23963a);
        }
        if (this.f23964b != null) {
            return b + nyu.b(2, this.f23964b);
        }
        return b;
    }

    private kxv m27982b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f23963a == null) {
                        this.f23963a = new kxw();
                    }
                    nyt.a(this.f23963a);
                    continue;
                case wi.dH /*18*/:
                    this.f23964b = nyt.j();
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
