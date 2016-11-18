package p000;

public final class npe extends nyx<npe> {
    public Integer f30426a;
    public noz[] f30427b;
    public String f30428c;

    public /* synthetic */ nzf m36012a(nyt nyt) {
        return m36011b(nyt);
    }

    public npe() {
        this.f30426a = null;
        this.f30427b = noz.m35975d();
        this.f30428c = null;
        this.cachedSize = -1;
    }

    public void m36013a(nyu nyu) {
        if (this.f30426a != null) {
            nyu.m37168a(1, this.f30426a.intValue());
        }
        if (this.f30427b != null && this.f30427b.length > 0) {
            for (nzf nzf : this.f30427b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f30428c != null) {
            nyu.m37170a(3, this.f30428c);
        }
        super.a(nyu);
    }

    protected int m36014b() {
        int b = super.b();
        if (this.f30426a != null) {
            b += nyu.m37147f(1, this.f30426a.intValue());
        }
        if (this.f30427b != null && this.f30427b.length > 0) {
            int i = b;
            for (nzf nzf : this.f30427b) {
                if (nzf != null) {
                    i += nyu.m37145d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f30428c != null) {
            return b + nyu.m37137b(3, this.f30428c);
        }
        return b;
    }

    private npe m36011b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30426a = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f30427b == null) {
                        a = 0;
                    } else {
                        a = this.f30427b.length;
                    }
                    Object obj = new noz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30427b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new noz();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new noz();
                    nyt.m37101a(obj[a]);
                    this.f30427b = obj;
                    continue;
                case wi.dx /*26*/:
                    this.f30428c = nyt.m37117j();
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
