package p000;

public final class lem extends nyx<lem> {
    private static volatile lem[] f24839c;
    public ldz f24840a;
    public String f24841b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28887b(nyt);
    }

    public static lem[] m28888d() {
        if (f24839c == null) {
            synchronized (nzc.c) {
                if (f24839c == null) {
                    f24839c = new lem[0];
                }
            }
        }
        return f24839c;
    }

    public lem() {
        m28889g();
    }

    private lem m28889g() {
        this.f24840a = null;
        this.f24841b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24840a != null) {
            nyu.b(1, this.f24840a);
        }
        if (this.f24841b != null) {
            nyu.a(2, this.f24841b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24840a != null) {
            b += nyu.d(1, this.f24840a);
        }
        if (this.f24841b != null) {
            return b + nyu.b(2, this.f24841b);
        }
        return b;
    }

    private lem m28887b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24840a == null) {
                        this.f24840a = new ldz();
                    }
                    nyt.a(this.f24840a);
                    continue;
                case wi.dH /*18*/:
                    this.f24841b = nyt.j();
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
