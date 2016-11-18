package p000;

public final class lwm extends nyx<lwm> {
    public lwk[] f26693a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30883b(nyt);
    }

    public lwm() {
        m30884d();
    }

    private lwm m30884d() {
        this.f26693a = lwk.m30873d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26693a != null && this.f26693a.length > 0) {
            for (nzf nzf : this.f26693a) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26693a != null && this.f26693a.length > 0) {
            for (nzf nzf : this.f26693a) {
                if (nzf != null) {
                    b += nyu.d(2, nzf);
                }
            }
        }
        return b;
    }

    private lwm m30883b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f26693a == null) {
                        a = 0;
                    } else {
                        a = this.f26693a.length;
                    }
                    Object obj = new lwk[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26693a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lwk();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lwk();
                    nyt.a(obj[a]);
                    this.f26693a = obj;
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
