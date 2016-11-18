package p000;

public final class nln extends nyx<nln> {
    public nmd[] f30147a;

    public /* synthetic */ nzf m35521a(nyt nyt) {
        return m35519b(nyt);
    }

    public nln() {
        m35520d();
    }

    private nln m35520d() {
        this.f30147a = nmd.m35604d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35522a(nyu nyu) {
        if (this.f30147a != null && this.f30147a.length > 0) {
            for (nzf nzf : this.f30147a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m35523b() {
        int b = super.b();
        if (this.f30147a != null && this.f30147a.length > 0) {
            for (nzf nzf : this.f30147a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private nln m35519b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f30147a == null) {
                        a = 0;
                    } else {
                        a = this.f30147a.length;
                    }
                    Object obj = new nmd[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30147a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nmd();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nmd();
                    nyt.m37101a(obj[a]);
                    this.f30147a = obj;
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
