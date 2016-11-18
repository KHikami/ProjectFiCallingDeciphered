package p000;

public final class lnh extends nyx<lnh> {
    public String f25765a;
    public lni[] f25766b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29602b(nyt);
    }

    public lnh() {
        m29603d();
    }

    private lnh m29603d() {
        this.f25765a = "";
        this.f25766b = lni.m29608d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (!(this.f25765a == null || this.f25765a.equals(""))) {
            nyu.a(1, this.f25765a);
        }
        if (this.f25766b != null && this.f25766b.length > 0) {
            for (nzf nzf : this.f25766b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (!(this.f25765a == null || this.f25765a.equals(""))) {
            b += nyu.b(1, this.f25765a);
        }
        if (this.f25766b == null || this.f25766b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f25766b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private lnh m29602b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25765a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f25766b == null) {
                        a = 0;
                    } else {
                        a = this.f25766b.length;
                    }
                    Object obj = new lni[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25766b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lni();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lni();
                    nyt.a(obj[a]);
                    this.f25766b = obj;
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
