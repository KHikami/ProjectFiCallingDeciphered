package p000;

public final class krt extends nyx<krt> {
    public klj[] f22932a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27240b(nyt);
    }

    public krt() {
        m27241d();
    }

    public void mo146a(nyu nyu) {
        if (this.f22932a != null && this.f22932a.length > 0) {
            for (nzf nzf : this.f22932a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22932a != null && this.f22932a.length > 0) {
            for (nzf nzf : this.f22932a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private krt m27240b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f22932a == null) {
                        a = 0;
                    } else {
                        a = this.f22932a.length;
                    }
                    Object obj = new klj[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22932a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new klj();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new klj();
                    nyt.a(obj[a]);
                    this.f22932a = obj;
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

    private krt m27241d() {
        this.f22932a = klj.f22171b;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }
}
