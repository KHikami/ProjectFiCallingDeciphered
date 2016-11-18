package p000;

public final class nzg extends nyx<nzg> {
    public nzh[] f31311a;

    public /* synthetic */ nzf m37244a(nyt nyt) {
        return m37243b(nyt);
    }

    public nzg() {
        this.f31311a = nzh.m37248d();
        this.cachedSize = -1;
    }

    public void m37245a(nyu nyu) {
        if (this.f31311a != null && this.f31311a.length > 0) {
            for (nzf nzf : this.f31311a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m37246b() {
        int b = super.b();
        if (this.f31311a != null && this.f31311a.length > 0) {
            for (nzf nzf : this.f31311a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private nzg m37243b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f31311a == null) {
                        a = 0;
                    } else {
                        a = this.f31311a.length;
                    }
                    Object obj = new nzh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f31311a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nzh();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nzh();
                    nyt.m37101a(obj[a]);
                    this.f31311a = obj;
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
