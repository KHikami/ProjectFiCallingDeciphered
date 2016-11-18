package p000;

public final class lcv extends nyx<lcv> {
    private static volatile lcv[] f24621c;
    public lcu[] f24622a;
    public lcx f24623b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28664b(nyt);
    }

    public static lcv[] m28665d() {
        if (f24621c == null) {
            synchronized (nzc.c) {
                if (f24621c == null) {
                    f24621c = new lcv[0];
                }
            }
        }
        return f24621c;
    }

    public lcv() {
        m28666g();
    }

    private lcv m28666g() {
        this.f24622a = lcu.m28659d();
        this.f24623b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24622a != null && this.f24622a.length > 0) {
            for (nzf nzf : this.f24622a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f24623b != null) {
            nyu.b(2, this.f24623b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24622a != null && this.f24622a.length > 0) {
            for (nzf nzf : this.f24622a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.f24623b != null) {
            return b + nyu.d(2, this.f24623b);
        }
        return b;
    }

    private lcv m28664b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f24622a == null) {
                        a = 0;
                    } else {
                        a = this.f24622a.length;
                    }
                    Object obj = new lcu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24622a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lcu();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lcu();
                    nyt.a(obj[a]);
                    this.f24622a = obj;
                    continue;
                case wi.dH /*18*/:
                    if (this.f24623b == null) {
                        this.f24623b = new lcx();
                    }
                    nyt.a(this.f24623b);
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
