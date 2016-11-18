package p000;

public final class nze extends nyx<nze> {
    public nzk[] f31310a;

    public /* synthetic */ nzf m37240a(nyt nyt) {
        return m37239b(nyt);
    }

    public nze() {
        this.f31310a = nzk.m37260d();
        this.cachedSize = -1;
    }

    public void m37241a(nyu nyu) {
        if (this.f31310a != null && this.f31310a.length > 0) {
            for (nzf nzf : this.f31310a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m37242b() {
        int b = super.b();
        if (this.f31310a != null && this.f31310a.length > 0) {
            for (nzf nzf : this.f31310a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private nze m37239b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f31310a == null) {
                        a = 0;
                    } else {
                        a = this.f31310a.length;
                    }
                    Object obj = new nzk[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f31310a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nzk();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nzk();
                    nyt.m37101a(obj[a]);
                    this.f31310a = obj;
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
