package p000;

public final class lwg extends nyx<lwg> {
    public ltb[] f26677a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30852b(nyt);
    }

    public lwg() {
        m30853d();
    }

    private lwg m30853d() {
        this.f26677a = ltb.m30409d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26677a != null && this.f26677a.length > 0) {
            for (nzf nzf : this.f26677a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26677a != null && this.f26677a.length > 0) {
            for (nzf nzf : this.f26677a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private lwg m30852b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f26677a == null) {
                        a = 0;
                    } else {
                        a = this.f26677a.length;
                    }
                    Object obj = new ltb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26677a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ltb();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ltb();
                    nyt.a(obj[a]);
                    this.f26677a = obj;
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
