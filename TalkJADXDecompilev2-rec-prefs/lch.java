package p000;

public final class lch extends nyx<lch> {
    private static volatile lch[] f24571c;
    public lcg[] f24572a;
    public lck f24573b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28594b(nyt);
    }

    public static lch[] m28595d() {
        if (f24571c == null) {
            synchronized (nzc.c) {
                if (f24571c == null) {
                    f24571c = new lch[0];
                }
            }
        }
        return f24571c;
    }

    public lch() {
        this.f24572a = lcg.m28590d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24572a != null && this.f24572a.length > 0) {
            for (nzf nzf : this.f24572a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f24573b != null) {
            nyu.b(2, this.f24573b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24572a != null && this.f24572a.length > 0) {
            for (nzf nzf : this.f24572a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.f24573b != null) {
            return b + nyu.d(2, this.f24573b);
        }
        return b;
    }

    private lch m28594b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f24572a == null) {
                        a = 0;
                    } else {
                        a = this.f24572a.length;
                    }
                    Object obj = new lcg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24572a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lcg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lcg();
                    nyt.a(obj[a]);
                    this.f24572a = obj;
                    continue;
                case wi.dH /*18*/:
                    if (this.f24573b == null) {
                        this.f24573b = new lck();
                    }
                    nyt.a(this.f24573b);
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
