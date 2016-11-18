package p000;

public final class kuj extends nyx<kuj> {
    public String f23443a;
    public kuk[] f23444b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27569b(nyt);
    }

    public kuj() {
        this.f23443a = null;
        this.f23444b = kuk.m27574d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23443a != null) {
            nyu.a(1, this.f23443a);
        }
        if (this.f23444b != null && this.f23444b.length > 0) {
            for (nzf nzf : this.f23444b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23443a != null) {
            b += nyu.b(1, this.f23443a);
        }
        if (this.f23444b == null || this.f23444b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f23444b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private kuj m27569b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23443a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f23444b == null) {
                        a = 0;
                    } else {
                        a = this.f23444b.length;
                    }
                    Object obj = new kuk[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23444b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kuk();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kuk();
                    nyt.a(obj[a]);
                    this.f23444b = obj;
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
