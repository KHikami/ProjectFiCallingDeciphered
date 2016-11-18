package p000;

public final class kvp extends nyx<kvp> {
    public kwz[] f23656a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27716b(nyt);
    }

    public kvp() {
        this.f23656a = kwz.m27876d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23656a != null && this.f23656a.length > 0) {
            for (nzf nzf : this.f23656a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23656a != null && this.f23656a.length > 0) {
            for (nzf nzf : this.f23656a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private kvp m27716b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f23656a == null) {
                        a = 0;
                    } else {
                        a = this.f23656a.length;
                    }
                    Object obj = new kwz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23656a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kwz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kwz();
                    nyt.a(obj[a]);
                    this.f23656a = obj;
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
