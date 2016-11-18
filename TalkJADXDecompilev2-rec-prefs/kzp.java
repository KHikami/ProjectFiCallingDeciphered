package p000;

public final class kzp extends nyx<kzp> {
    private static volatile kzp[] f24285d;
    public String f24286a;
    public String f24287b;
    public String f24288c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28260b(nyt);
    }

    public static kzp[] m28261d() {
        if (f24285d == null) {
            synchronized (nzc.c) {
                if (f24285d == null) {
                    f24285d = new kzp[0];
                }
            }
        }
        return f24285d;
    }

    public kzp() {
        m28262g();
    }

    private kzp m28262g() {
        this.f24286a = null;
        this.f24287b = null;
        this.f24288c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f24286a);
        nyu.a(2, this.f24287b);
        if (this.f24288c != null) {
            nyu.a(3, this.f24288c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = (super.mo147b() + nyu.b(1, this.f24286a)) + nyu.b(2, this.f24287b);
        if (this.f24288c != null) {
            return b + nyu.b(3, this.f24288c);
        }
        return b;
    }

    private kzp m28260b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24286a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24287b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24288c = nyt.j();
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
