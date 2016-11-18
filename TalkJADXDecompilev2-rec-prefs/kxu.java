package p000;

public final class kxu extends nyx<kxu> {
    private static volatile kxu[] f23959c;
    public String f23960a;
    public String f23961b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27976b(nyt);
    }

    public static kxu[] m27977d() {
        if (f23959c == null) {
            synchronized (nzc.c) {
                if (f23959c == null) {
                    f23959c = new kxu[0];
                }
            }
        }
        return f23959c;
    }

    public kxu() {
        m27978g();
    }

    private kxu m27978g() {
        this.f23960a = null;
        this.f23961b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23960a);
        nyu.a(2, this.f23961b);
        super.mo146a(nyu);
    }

    protected int mo147b() {
        return (super.mo147b() + nyu.b(1, this.f23960a)) + nyu.b(2, this.f23961b);
    }

    private kxu m27976b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23960a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23961b = nyt.j();
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
