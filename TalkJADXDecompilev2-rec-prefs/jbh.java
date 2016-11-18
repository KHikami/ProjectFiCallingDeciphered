package p000;

public final class jbh extends nzf {
    public jbg[] f19716a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m23783b(nyt);
    }

    public jbh() {
        m23779d();
    }

    private jbh m23779d() {
        this.f19716a = jbg.m23774d();
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f19716a != null && this.f19716a.length > 0) {
            for (nzf nzf : this.f19716a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f19716a != null && this.f19716a.length > 0) {
            for (nzf nzf : this.f19716a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    public jbh m23783b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f19716a == null) {
                        a = 0;
                    } else {
                        a = this.f19716a.length;
                    }
                    Object obj = new jbg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f19716a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new jbg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new jbg();
                    nyt.a(obj[a]);
                    this.f19716a = obj;
                    continue;
                default:
                    if (!nzl.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
