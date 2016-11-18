package p000;

public final class lzg extends nyx<lzg> {
    private static volatile lzg[] f26992c;
    public String f26993a;
    public String f26994b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31260b(nyt);
    }

    public static lzg[] m31261d() {
        if (f26992c == null) {
            synchronized (nzc.c) {
                if (f26992c == null) {
                    f26992c = new lzg[0];
                }
            }
        }
        return f26992c;
    }

    public lzg() {
        m31262g();
    }

    private lzg m31262g() {
        this.f26993a = null;
        this.f26994b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26993a != null) {
            nyu.a(1, this.f26993a);
        }
        if (this.f26994b != null) {
            nyu.a(2, this.f26994b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26993a != null) {
            b += nyu.b(1, this.f26993a);
        }
        if (this.f26994b != null) {
            return b + nyu.b(2, this.f26994b);
        }
        return b;
    }

    private lzg m31260b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26993a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f26994b = nyt.j();
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
