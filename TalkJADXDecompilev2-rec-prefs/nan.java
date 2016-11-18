package p000;

public final class nan extends nyx<nan> {
    public nca[] f29373a;

    public /* synthetic */ nzf m34071a(nyt nyt) {
        return m34070b(nyt);
    }

    public nan() {
        this.f29373a = nca.m34270d();
        this.cachedSize = -1;
    }

    public void m34072a(nyu nyu) {
        if (this.f29373a != null && this.f29373a.length > 0) {
            for (nzf nzf : this.f29373a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m34073b() {
        int b = super.b();
        if (this.f29373a != null && this.f29373a.length > 0) {
            for (nzf nzf : this.f29373a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private nan m34070b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f29373a == null) {
                        a = 0;
                    } else {
                        a = this.f29373a.length;
                    }
                    Object obj = new nca[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29373a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nca();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nca();
                    nyt.m37101a(obj[a]);
                    this.f29373a = obj;
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
