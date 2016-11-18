package p000;

public final class kyo extends nyx<kyo> {
    public kzh[] f24094a;
    public Integer f24095b;
    public Boolean f24096c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28098b(nyt);
    }

    public kyo() {
        m28099d();
    }

    public void mo146a(nyu nyu) {
        if (this.f24094a != null && this.f24094a.length > 0) {
            for (nzf nzf : this.f24094a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        nyu.a(2, this.f24095b.intValue());
        if (this.f24096c != null) {
            nyu.a(3, this.f24096c.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24094a != null && this.f24094a.length > 0) {
            for (nzf nzf : this.f24094a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        int f = nyu.f(2, this.f24095b.intValue()) + b;
        if (this.f24096c == null) {
            return f;
        }
        this.f24096c.booleanValue();
        return f + (nyu.h(3) + 1);
    }

    private kyo m28098b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f24094a == null) {
                        a = 0;
                    } else {
                        a = this.f24094a.length;
                    }
                    Object obj = new kzh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24094a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kzh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kzh();
                    nyt.a(obj[a]);
                    this.f24094a = obj;
                    continue;
                case 16:
                    this.f24095b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f24096c = Boolean.valueOf(nyt.i());
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

    private kyo m28099d() {
        this.f24094a = kzh.f24195c;
        this.f24095b = null;
        this.f24096c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }
}
