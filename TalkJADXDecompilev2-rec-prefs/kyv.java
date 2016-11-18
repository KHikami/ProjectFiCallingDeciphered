package p000;

public final class kyv extends nyx<kyv> {
    private static volatile kyv[] f24110c;
    public String f24111a;
    public String f24112b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28133b(nyt);
    }

    public static kyv[] m28134d() {
        if (f24110c == null) {
            synchronized (nzc.c) {
                if (f24110c == null) {
                    f24110c = new kyv[0];
                }
            }
        }
        return f24110c;
    }

    public kyv() {
        m28135g();
    }

    private kyv m28135g() {
        this.f24111a = null;
        this.f24112b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24111a != null) {
            nyu.a(1, this.f24111a);
        }
        if (this.f24112b != null) {
            nyu.a(2, this.f24112b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24111a != null) {
            b += nyu.b(1, this.f24111a);
        }
        if (this.f24112b != null) {
            return b + nyu.b(2, this.f24112b);
        }
        return b;
    }

    private kyv m28133b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24111a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24112b = nyt.j();
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
