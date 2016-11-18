package p000;

public final class lqs extends nyx<lqs> {
    public lqu[] f26166a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30087b(nyt);
    }

    public lqs() {
        m30088d();
    }

    private lqs m30088d() {
        this.f26166a = lqu.m30098d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26166a != null && this.f26166a.length > 0) {
            for (nzf nzf : this.f26166a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26166a != null && this.f26166a.length > 0) {
            for (nzf nzf : this.f26166a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private lqs m30087b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f26166a == null) {
                        a = 0;
                    } else {
                        a = this.f26166a.length;
                    }
                    Object obj = new lqu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26166a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqu();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqu();
                    nyt.a(obj[a]);
                    this.f26166a = obj;
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
