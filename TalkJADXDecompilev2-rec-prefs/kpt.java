package p000;

public final class kpt extends nyx<kpt> {
    private static volatile kpt[] f22694c;
    public String f22695a;
    public kpu f22696b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26968b(nyt);
    }

    public static kpt[] m26969d() {
        if (f22694c == null) {
            synchronized (nzc.c) {
                if (f22694c == null) {
                    f22694c = new kpt[0];
                }
            }
        }
        return f22694c;
    }

    public kpt() {
        m26970g();
    }

    private kpt m26970g() {
        this.f22695a = null;
        this.f22696b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22695a != null) {
            nyu.a(1, this.f22695a);
        }
        if (this.f22696b != null) {
            nyu.b(2, this.f22696b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22695a != null) {
            b += nyu.b(1, this.f22695a);
        }
        if (this.f22696b != null) {
            return b + nyu.d(2, this.f22696b);
        }
        return b;
    }

    private kpt m26968b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22695a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f22696b == null) {
                        this.f22696b = new kpu();
                    }
                    nyt.a(this.f22696b);
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
