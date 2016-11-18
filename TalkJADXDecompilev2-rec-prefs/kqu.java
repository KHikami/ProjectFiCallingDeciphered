package p000;

public final class kqu extends nyx<kqu> {
    public lcn f22811a;
    public lcy[] f22812b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27111b(nyt);
    }

    public kqu() {
        m27112d();
    }

    private kqu m27112d() {
        this.f22811a = null;
        this.f22812b = lcy.m28681d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22811a != null) {
            nyu.b(1, this.f22811a);
        }
        if (this.f22812b != null && this.f22812b.length > 0) {
            for (nzf nzf : this.f22812b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22811a != null) {
            b += nyu.d(1, this.f22811a);
        }
        if (this.f22812b == null || this.f22812b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f22812b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private kqu m27111b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22811a == null) {
                        this.f22811a = new lcn();
                    }
                    nyt.a(this.f22811a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f22812b == null) {
                        a = 0;
                    } else {
                        a = this.f22812b.length;
                    }
                    Object obj = new lcy[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22812b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lcy();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lcy();
                    nyt.a(obj[a]);
                    this.f22812b = obj;
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
