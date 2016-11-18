package p000;

public final class kpp extends nyx<kpp> {
    public kqd f22681a;
    public kpo[] f22682b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26947b(nyt);
    }

    public kpp() {
        m26948d();
    }

    private kpp m26948d() {
        this.f22681a = null;
        this.f22682b = kpo.m26942d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22681a != null) {
            nyu.b(1, this.f22681a);
        }
        if (this.f22682b != null && this.f22682b.length > 0) {
            for (nzf nzf : this.f22682b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22681a != null) {
            b += nyu.d(1, this.f22681a);
        }
        if (this.f22682b == null || this.f22682b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f22682b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private kpp m26947b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22681a == null) {
                        this.f22681a = new kqd();
                    }
                    nyt.a(this.f22681a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f22682b == null) {
                        a = 0;
                    } else {
                        a = this.f22682b.length;
                    }
                    Object obj = new kpo[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22682b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kpo();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kpo();
                    nyt.a(obj[a]);
                    this.f22682b = obj;
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
