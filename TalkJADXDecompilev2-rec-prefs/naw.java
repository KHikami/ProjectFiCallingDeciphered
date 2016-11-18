package p000;

public final class naw extends nyx<naw> {
    private static volatile naw[] f29396c;
    public String f29397a;
    public Integer f29398b;

    public /* synthetic */ nzf m34120a(nyt nyt) {
        return m34117b(nyt);
    }

    public static naw[] m34118d() {
        if (f29396c == null) {
            synchronized (nzc.f31309c) {
                if (f29396c == null) {
                    f29396c = new naw[0];
                }
            }
        }
        return f29396c;
    }

    public naw() {
        m34119g();
    }

    private naw m34119g() {
        this.f29397a = null;
        this.f29398b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34121a(nyu nyu) {
        if (this.f29397a != null) {
            nyu.m37170a(1, this.f29397a);
        }
        if (this.f29398b != null) {
            nyu.m37168a(2, this.f29398b.intValue());
        }
        super.a(nyu);
    }

    protected int m34122b() {
        int b = super.b();
        if (this.f29397a != null) {
            b += nyu.m37137b(1, this.f29397a);
        }
        if (this.f29398b != null) {
            return b + nyu.m37147f(2, this.f29398b.intValue());
        }
        return b;
    }

    private naw m34117b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29397a = nyt.m37117j();
                    continue;
                case 16:
                    this.f29398b = Integer.valueOf(nyt.m37112f());
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
