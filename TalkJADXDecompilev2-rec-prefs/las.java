package p000;

public final class las extends nyx<las> {
    private static volatile las[] f24414c;
    public String f24415a;
    public String f24416b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28400b(nyt);
    }

    public static las[] m28401d() {
        if (f24414c == null) {
            synchronized (nzc.c) {
                if (f24414c == null) {
                    f24414c = new las[0];
                }
            }
        }
        return f24414c;
    }

    public las() {
        this.f24415a = null;
        this.f24416b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24415a != null) {
            nyu.a(1, this.f24415a);
        }
        if (this.f24416b != null) {
            nyu.a(2, this.f24416b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24415a != null) {
            b += nyu.b(1, this.f24415a);
        }
        if (this.f24416b != null) {
            return b + nyu.b(2, this.f24416b);
        }
        return b;
    }

    private las m28400b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24415a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24416b = nyt.j();
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
