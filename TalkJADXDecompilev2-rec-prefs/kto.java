package p000;

public final class kto extends nyx<kto> {
    private static volatile kto[] f23250b;
    public String f23251a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27476b(nyt);
    }

    public static kto[] m27477d() {
        if (f23250b == null) {
            synchronized (nzc.c) {
                if (f23250b == null) {
                    f23250b = new kto[0];
                }
            }
        }
        return f23250b;
    }

    public kto() {
        m27478g();
    }

    private kto m27478g() {
        this.f23251a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23251a != null) {
            nyu.a(1, this.f23251a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23251a != null) {
            return b + nyu.b(1, this.f23251a);
        }
        return b;
    }

    private kto m27476b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23251a = nyt.j();
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
