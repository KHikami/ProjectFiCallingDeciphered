package p000;

public final class lll extends nyx<lll> {
    public Integer f25374a;
    public Integer f25375b;
    public llm[] f25376c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29361b(nyt);
    }

    public lll() {
        m29362d();
    }

    private lll m29362d() {
        this.f25374a = null;
        this.f25375b = null;
        this.f25376c = llm.m29367d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25374a != null) {
            nyu.a(1, this.f25374a.intValue());
        }
        if (this.f25375b != null) {
            nyu.a(2, this.f25375b.intValue());
        }
        if (this.f25376c != null && this.f25376c.length > 0) {
            for (nzf nzf : this.f25376c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25374a != null) {
            b += nyu.f(1, this.f25374a.intValue());
        }
        if (this.f25375b != null) {
            b += nyu.f(2, this.f25375b.intValue());
        }
        if (this.f25376c == null || this.f25376c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f25376c) {
            if (nzf != null) {
                i += nyu.d(3, nzf);
            }
        }
        return i;
    }

    private lll m29361b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25374a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f25375b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    if (this.f25376c == null) {
                        a = 0;
                    } else {
                        a = this.f25376c.length;
                    }
                    Object obj = new llm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25376c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new llm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new llm();
                    nyt.a(obj[a]);
                    this.f25376c = obj;
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
