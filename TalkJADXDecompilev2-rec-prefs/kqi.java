package p000;

public final class kqi extends nyx<kqi> {
    public kqd f22762a;
    public kqh[] f22763b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27049b(nyt);
    }

    public kqi() {
        m27050d();
    }

    private kqi m27050d() {
        this.f22762a = null;
        this.f22763b = kqh.m27044d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22762a != null) {
            nyu.b(1, this.f22762a);
        }
        if (this.f22763b != null && this.f22763b.length > 0) {
            for (nzf nzf : this.f22763b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22762a != null) {
            b += nyu.d(1, this.f22762a);
        }
        if (this.f22763b == null || this.f22763b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f22763b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private kqi m27049b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22762a == null) {
                        this.f22762a = new kqd();
                    }
                    nyt.a(this.f22762a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f22763b == null) {
                        a = 0;
                    } else {
                        a = this.f22763b.length;
                    }
                    Object obj = new kqh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22763b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kqh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kqh();
                    nyt.a(obj[a]);
                    this.f22763b = obj;
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
