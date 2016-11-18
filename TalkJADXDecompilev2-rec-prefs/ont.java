package p000;

public final class ont extends nyx<ont> {
    public ooa[] f33328a;

    public /* synthetic */ nzf m38840a(nyt nyt) {
        return m38839b(nyt);
    }

    public ont() {
        this.f33328a = ooa.m38870d();
        this.cachedSize = -1;
    }

    public void m38841a(nyu nyu) {
        if (this.f33328a != null && this.f33328a.length > 0) {
            for (nzf nzf : this.f33328a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m38842b() {
        int b = super.b();
        if (this.f33328a != null && this.f33328a.length > 0) {
            for (nzf nzf : this.f33328a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private ont m38839b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f33328a == null) {
                        a = 0;
                    } else {
                        a = this.f33328a.length;
                    }
                    Object obj = new ooa[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33328a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ooa();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ooa();
                    nyt.m37101a(obj[a]);
                    this.f33328a = obj;
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
