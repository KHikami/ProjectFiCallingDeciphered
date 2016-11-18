package p000;

public final class kyu extends nyx<kyu> {
    public String f24108a;
    public kyv[] f24109b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28128b(nyt);
    }

    public kyu() {
        m28129d();
    }

    private kyu m28129d() {
        this.f24108a = null;
        this.f24109b = kyv.m28134d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24108a != null) {
            nyu.a(1, this.f24108a);
        }
        if (this.f24109b != null && this.f24109b.length > 0) {
            for (nzf nzf : this.f24109b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24108a != null) {
            b += nyu.b(1, this.f24108a);
        }
        if (this.f24109b == null || this.f24109b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f24109b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private kyu m28128b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24108a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f24109b == null) {
                        a = 0;
                    } else {
                        a = this.f24109b.length;
                    }
                    Object obj = new kyv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24109b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kyv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kyv();
                    nyt.a(obj[a]);
                    this.f24109b = obj;
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
