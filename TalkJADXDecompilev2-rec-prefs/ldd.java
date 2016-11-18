package p000;

public final class ldd extends nyx<ldd> {
    private static volatile ldd[] f24651c;
    public ldh[] f24652a;
    public Integer f24653b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28706b(nyt);
    }

    public static ldd[] m28707d() {
        if (f24651c == null) {
            synchronized (nzc.c) {
                if (f24651c == null) {
                    f24651c = new ldd[0];
                }
            }
        }
        return f24651c;
    }

    public ldd() {
        m28708g();
    }

    private ldd m28708g() {
        this.f24652a = ldh.m28730d();
        this.f24653b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24652a != null && this.f24652a.length > 0) {
            for (nzf nzf : this.f24652a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f24653b != null) {
            nyu.a(2, this.f24653b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24652a != null && this.f24652a.length > 0) {
            for (nzf nzf : this.f24652a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.f24653b != null) {
            return b + nyu.f(2, this.f24653b.intValue());
        }
        return b;
    }

    private ldd m28706b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f24652a == null) {
                        a = 0;
                    } else {
                        a = this.f24652a.length;
                    }
                    Object obj = new ldh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24652a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ldh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ldh();
                    nyt.a(obj[a]);
                    this.f24652a = obj;
                    continue;
                case 16:
                    this.f24653b = Integer.valueOf(nyt.f());
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
