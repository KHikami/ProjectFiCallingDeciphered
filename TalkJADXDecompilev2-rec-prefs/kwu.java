package p000;

public final class kwu extends nyx<kwu> {
    public Integer f23800a;
    public kwv[] f23801b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27852b(nyt);
    }

    public kwu() {
        m27853d();
    }

    private kwu m27853d() {
        this.f23801b = kwv.m27858d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23800a != null) {
            nyu.a(1, this.f23800a.intValue());
        }
        if (this.f23801b != null && this.f23801b.length > 0) {
            for (nzf nzf : this.f23801b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23800a != null) {
            b += nyu.f(1, this.f23800a.intValue());
        }
        if (this.f23801b == null || this.f23801b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f23801b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private kwu m27852b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f23800a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f23801b == null) {
                        a = 0;
                    } else {
                        a = this.f23801b.length;
                    }
                    Object obj = new kwv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23801b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kwv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kwv();
                    nyt.a(obj[a]);
                    this.f23801b = obj;
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
