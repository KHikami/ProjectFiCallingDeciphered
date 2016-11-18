package p000;

public final class kmb extends nyx<kmb> {
    private static volatile kmb[] f22337d;
    public klk f22338a;
    public String f22339b;
    public String f22340c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26494b(nyt);
    }

    public static kmb[] m26495d() {
        if (f22337d == null) {
            synchronized (nzc.c) {
                if (f22337d == null) {
                    f22337d = new kmb[0];
                }
            }
        }
        return f22337d;
    }

    public kmb() {
        m26496g();
    }

    private kmb m26496g() {
        this.f22338a = null;
        this.f22339b = null;
        this.f22340c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22338a != null) {
            nyu.b(1, this.f22338a);
        }
        if (this.f22339b != null) {
            nyu.a(2, this.f22339b);
        }
        if (this.f22340c != null) {
            nyu.a(3, this.f22340c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22338a != null) {
            b += nyu.d(1, this.f22338a);
        }
        if (this.f22339b != null) {
            b += nyu.b(2, this.f22339b);
        }
        if (this.f22340c != null) {
            return b + nyu.b(3, this.f22340c);
        }
        return b;
    }

    private kmb m26494b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22338a == null) {
                        this.f22338a = new klk();
                    }
                    nyt.a(this.f22338a);
                    continue;
                case wi.dH /*18*/:
                    this.f22339b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f22340c = nyt.j();
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
