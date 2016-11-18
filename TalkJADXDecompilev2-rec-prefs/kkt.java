package p000;

public final class kkt extends nyx<kkt> {
    private static volatile kkt[] f22092c;
    public klk f22093a;
    public String f22094b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26297b(nyt);
    }

    public static kkt[] m26298d() {
        if (f22092c == null) {
            synchronized (nzc.c) {
                if (f22092c == null) {
                    f22092c = new kkt[0];
                }
            }
        }
        return f22092c;
    }

    public kkt() {
        m26299g();
    }

    private kkt m26299g() {
        this.f22093a = null;
        this.f22094b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22093a != null) {
            nyu.b(1, this.f22093a);
        }
        if (this.f22094b != null) {
            nyu.a(2, this.f22094b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22093a != null) {
            b += nyu.d(1, this.f22093a);
        }
        if (this.f22094b != null) {
            return b + nyu.b(2, this.f22094b);
        }
        return b;
    }

    private kkt m26297b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22093a == null) {
                        this.f22093a = new klk();
                    }
                    nyt.a(this.f22093a);
                    continue;
                case wi.dH /*18*/:
                    this.f22094b = nyt.j();
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
