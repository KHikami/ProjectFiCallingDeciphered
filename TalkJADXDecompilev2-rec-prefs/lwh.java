package p000;

public final class lwh extends nyx<lwh> {
    public loc[] f26678a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30857b(nyt);
    }

    public lwh() {
        m30858d();
    }

    private lwh m30858d() {
        this.f26678a = loc.m29712d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26678a != null && this.f26678a.length > 0) {
            for (nzf nzf : this.f26678a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26678a != null && this.f26678a.length > 0) {
            for (nzf nzf : this.f26678a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private lwh m30857b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f26678a == null) {
                        a = 0;
                    } else {
                        a = this.f26678a.length;
                    }
                    Object obj = new loc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26678a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new loc();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new loc();
                    nyt.a(obj[a]);
                    this.f26678a = obj;
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
