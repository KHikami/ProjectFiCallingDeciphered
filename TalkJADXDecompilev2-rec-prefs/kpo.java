package p000;

public final class kpo extends nyx<kpo> {
    private static volatile kpo[] f22675f;
    public String f22676a;
    public String f22677b;
    public kpk f22678c;
    public String f22679d;
    public String f22680e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26941b(nyt);
    }

    public static kpo[] m26942d() {
        if (f22675f == null) {
            synchronized (nzc.c) {
                if (f22675f == null) {
                    f22675f = new kpo[0];
                }
            }
        }
        return f22675f;
    }

    public kpo() {
        m26943g();
    }

    private kpo m26943g() {
        this.f22676a = null;
        this.f22677b = null;
        this.f22678c = null;
        this.f22679d = null;
        this.f22680e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22676a != null) {
            nyu.a(1, this.f22676a);
        }
        if (this.f22677b != null) {
            nyu.a(2, this.f22677b);
        }
        if (this.f22678c != null) {
            nyu.b(3, this.f22678c);
        }
        if (this.f22679d != null) {
            nyu.a(4, this.f22679d);
        }
        if (this.f22680e != null) {
            nyu.a(5, this.f22680e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22676a != null) {
            b += nyu.b(1, this.f22676a);
        }
        if (this.f22677b != null) {
            b += nyu.b(2, this.f22677b);
        }
        if (this.f22678c != null) {
            b += nyu.d(3, this.f22678c);
        }
        if (this.f22679d != null) {
            b += nyu.b(4, this.f22679d);
        }
        if (this.f22680e != null) {
            return b + nyu.b(5, this.f22680e);
        }
        return b;
    }

    private kpo m26941b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22676a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f22677b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f22678c == null) {
                        this.f22678c = new kpk();
                    }
                    nyt.a(this.f22678c);
                    continue;
                case 34:
                    this.f22679d = nyt.j();
                    continue;
                case 42:
                    this.f22680e = nyt.j();
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
