package p000;

public final class ksj extends nyx<ksj> {
    private static volatile ksj[] f23057c;
    public String f23058a;
    public String f23059b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27313b(nyt);
    }

    public static ksj[] m27314d() {
        if (f23057c == null) {
            synchronized (nzc.c) {
                if (f23057c == null) {
                    f23057c = new ksj[0];
                }
            }
        }
        return f23057c;
    }

    public ksj() {
        m27315g();
    }

    private ksj m27315g() {
        this.f23058a = null;
        this.f23059b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23058a != null) {
            nyu.a(1, this.f23058a);
        }
        if (this.f23059b != null) {
            nyu.a(2, this.f23059b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23058a != null) {
            b += nyu.b(1, this.f23058a);
        }
        if (this.f23059b != null) {
            return b + nyu.b(2, this.f23059b);
        }
        return b;
    }

    private ksj m27313b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23058a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23059b = nyt.j();
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
